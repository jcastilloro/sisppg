package jc2s.sistppg;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import ve.usb.cohesion.runtime.CohesionAction;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import ve.usb.cohesion.runtime.HibernateUtil;
import jc2s.sistppg.hibernate.*;


/**
 * 
 */
public class AccionesC_Consultar_Proyectos extends CohesionAction {
    
/**
     * Called by Struts for the execution of action A_prep_consultar_proyectos.
     * 
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @return The Struts name of the following step.
     * @throws java.lang.Exception For untreated exceptions. 
     * These exceptios will normally be treated with 
     * the default exception action.
     */
    public ActionForward A_prep_consultar_proyectos(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_consulta_proyectos", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors profesor, coordinador_cctds, cordiacion_de_carrera
            if (!CohesionActor.checkActor(request, 11)) {
                return mapping.findForward(CohesionActor.SALIDA_ACTOR);
            }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            //micodigo

            // VALOR CABLIAO
            // Que debe ser el id de la carrera de la coordinación q se logueo
            long idCarrera = 2;

            // TODOS los proyectos, toca filtrarlos por carrera
            List<EstudianteRealizaProyecto> proyectos = s.createQuery("from EstudianteRealizaProyecto ").list();

            request.setAttribute("EstudianteRealizaProyecto", proyectos);

            if (!proyectos.isEmpty()) {

                Iterator it = proyectos.iterator();
                EstudianteRealizaProyecto proy = new EstudianteRealizaProyecto();
                List<ProyectoDeGrado> tesis = new LinkedList<ProyectoDeGrado>();
                List<Pasantia> pasantias = new LinkedList<Pasantia>();

                while (it.hasNext()) {
                    proy = (EstudianteRealizaProyecto) it.next();
                    ProyectoDeGrado pg = (ProyectoDeGrado) s.createQuery("from ProyectoDeGrado where proyecto= :var").setLong("var", proy.getProyecto().getId()).uniqueResult();

                    if (pg != null) { // Es proyecto de grado
                        tesis.add(pg);
                    } else {
                        Pasantia pasantia = (Pasantia) s.createQuery("from Pasantia where proyecto= :var").setLong("var", proy.getProyecto().getId()).uniqueResult();
                        if (pasantia != null) {
                            pasantias.add(pasantia);
                        }
                    }
                }

                request.setAttribute("ProyectoDeGrado", tesis);
                request.setAttribute("Pasantias", pasantias);

            }

            //micodigo
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_consultar_PG.
     * 
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @return The Struts name of the following step.
     * @throws java.lang.Exception For untreated exceptions. 
     * These exceptios will normally be treated with 
     * the default exception action.
     */
    public ActionForward A_consultar_PG(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_consulta_pg", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        //Checking for actors cordiacion_de_carrera, coordinador_cctds, profesor
        if (!CohesionActor.checkActor(request, 11)) {
            return mapping.findForward(CohesionActor.SALIDA_ACTOR);
        }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {            
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_mostrar_pg.
     * 
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @return The Struts name of the following step.
     * @throws java.lang.Exception For untreated exceptions. 
     * These exceptios will normally be treated with 
     * the default exception action.
     */
    public ActionForward A_mostrar_pg(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_mostrar_pg", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        //Checking for actors cordiacion_de_carrera, profesor, coordinador_cctds
        if (!CohesionActor.checkActor(request, 11)) {
            return mapping.findForward(CohesionActor.SALIDA_ACTOR);
        }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try {
                s.close();
            } catch (Exception ex2) {
            }
        }
        return mapping.findForward(SALIDAS[salida]);
    }

    /**
     * Called by Struts for the execution of action A_consultar_pasantias.
     * 
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @return The Struts name of the following step.
     * @throws java.lang.Exception For untreated exceptions. 
     * These exceptios will normally be treated with 
     * the default exception action.
     */
    public ActionForward A_consultar_pasantias(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_consulta_pasantia",};
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        //Checking for actors coordinador_cctds, profesor, cordiacion_de_carrera
        if (!CohesionActor.checkActor(request, 11)) {
            return mapping.findForward(CohesionActor.SALIDA_ACTOR);
        }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            //micodigo

            // VALOR CABLIAO
            // Debe mostrar las pasantias de la carrera, no todas!
            List<Pasantia> pas = s.createQuery("from Pasantia as p join fetch p.proyecto").list();
            
            request.setAttribute("Pasantias", pas);       

            //micodigo
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_mostrar_pasantia.
     * 
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @return The Struts name of the following step.
     * @throws java.lang.Exception For untreated exceptions. 
     * These exceptios will normally be treated with 
     * the default exception action.
     */
    public ActionForward A_mostrar_pasantia(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_mostrar_pasantia", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        //Checking for actors cordiacion_de_carrera, profesor, coordinador_cctds
        if (!CohesionActor.checkActor(request, 11)) {
            return mapping.findForward(CohesionActor.SALIDA_ACTOR);
        }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
           //mi codigo
            
            String pas = request.getParameter("idPasantia");
            long idPasantia = Long.valueOf(pas).longValue();

            Pasantia pasantia = (Pasantia) s.createQuery("from Pasantia as p join fetch p.estatus join fetch p.proyecto join fetch p.tutor_academico join fetch p.tutor_industrial where idpasantia= :var").setLong("var", idPasantia).uniqueResult();
            request.setAttribute("Pasantia", pasantia);
            request.setAttribute("Estatus", pasantia.getEstatus());
            request.setAttribute("Profesor", pasantia.getTutor_academico());
            request.setAttribute("TutorIndustrial", pasantia.getTutor_industrial());
            request.setAttribute( "Ano", getDateTime( pasantia.getProyecto().getCreated_at() ) );

            // Tipo de Pasantía //
            PasantiaLarga larga = (PasantiaLarga) s.createQuery("from PasantiaLarga where pasantia= :var").setLong("var", idPasantia).uniqueResult();
            if (larga != null){
                PeriodoPasantiaLarga periodoL = (PeriodoPasantiaLarga) s.createQuery("from PeriodoPasantiaLarga where idPeriodoPasantiaLarga= :var").setLong("var", larga.getPeriodo().getId() ).uniqueResult();
                request.setAttribute("PasantiaLarga", larga);
                request.setAttribute("Periodo", periodoL);
            } else {
                PasantiaCorta corta = (PasantiaCorta) s.createQuery("from PasantiaCorta where pasantia= :var").setLong("var", idPasantia).uniqueResult();

                if (corta != null){
                    request.setAttribute("PasantiaCorta", corta);
                } else {
                    PasantiaIntermedia media = (PasantiaIntermedia) s.createQuery("from PasantiaIntermedia where pasantia= :var").setLong("var", idPasantia).uniqueResult();
                    request.setAttribute("PasantiaIntermedia", media);
                    // Por si acaso...
                    if( media != null ){
                        PeriodoPasantiaIntermedia periodoI = (PeriodoPasantiaIntermedia) s.createQuery("from PeriodoPasantiaIntermedia where idPeriodoPasantiaIntermedia= :var").setLong("var", media.getPeriodo().getId() ).uniqueResult();
                        request.setAttribute("Periodo", periodoI);
                    }
                }
            }

            // FASES
            List<Fase> fases = s.createQuery("from Fase as fase join fetch fase.actividades as actividades where fase.pasantia= :var").setLong("var", idPasantia ).list();
            request.setAttribute("Fases", fases);

            Iterator it = fases.iterator();
            Fase fase = new Fase();
            List<Fase> fases2 = new LinkedList<Fase>();

            while(it.hasNext()){
                fase = (Fase) it.next();
                if(!fases2.contains(fase))
                    fases2.add(fase);
            }

            request.setAttribute("Fases", fases2);

            //mi codigo
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        return mapping.findForward(SALIDAS[salida]);
    }

    private String getDateTime(Date fecha) {
       DateFormat dateFormat = new SimpleDateFormat("yyyy");
       Date date = fecha;
       return dateFormat.format(date);
   }



}