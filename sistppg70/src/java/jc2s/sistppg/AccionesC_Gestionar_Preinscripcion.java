package jc2s.sistppg;

import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

import ve.usb.cohesion.runtime.CohesionAction;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ve.usb.cohesion.runtime.HibernateUtil;
import jc2s.sistppg.hibernate.*;


/**
 * 
 */
public class AccionesC_Gestionar_Preinscripcion extends CohesionAction {
    
/**
     * Called by Struts for the execution of action A_prep_gestionar_preinscripcion.
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
    public ActionForward A_prep_gestionar_preinscripcion(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_gestionar_preinscripcion", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors estudiante
            if (!CohesionActor.checkActor(request, 4)) {
                return mapping.findForward(CohesionActor.SALIDA_ACTOR);
            }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Estudiante est = (Estudiante)request.getSession().getAttribute("estudiante");
            List<Preinscripcion> preinscripciones = (List<Preinscripcion>) s.createQuery("from Preinscripcion where estudiante = :idEst order by created_at desc").setLong("idEst", est.getIdEstudiante()).list();
            request.setAttribute("L_preins", preinscripciones);
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
     * Called by Struts for the execution of action A_generar_preinscripcion_corta.
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
     public ActionForward A_generar_preinscripcion_corta(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"A_prep_gestionar_preinscripcion", "A_prep_gestionar_preinscripcion", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_1;
//Checking for actors estudiante
            if (!CohesionActor.checkActor(request, 4)) {
                return mapping.findForward(CohesionActor.SALIDA_ACTOR);
            }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_Etapa_PG fpreinscripcion = (F_Etapa_PG)form;
            Estudiante e = (Estudiante)request.getSession().getAttribute("estudiante");
            List<Preinscripcion> lp = (List<Preinscripcion>) s.createQuery("from Preinscripcion where estudiante = :idEst and tipo = 1").setLong("idEst",e.getIdEstudiante()).list();
            if(lp.isEmpty()){
                Preinscripcion p = new Preinscripcion();
                p.setEstudiante(e);
                
                p.setRegiones("");
                p.setEstatus(false);
                p.setTipo(1);
                p.setCreated_at(new Date());
                p.setPor_graduar(false);

                s.save(p);
                salida = SALIDA_0;
            }
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_generar_preinscripcion_larga.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_generar_preinscripcion_larga.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_generar_preinscripcion_intermedia.
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
 public ActionForward A_generar_preinscripcion_intermedia(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"A_prep_gestionar_preinscripcion", "A_prep_gestionar_preinscripcion", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_1;
//Checking for actors estudiante
            if (!CohesionActor.checkActor(request, 4)) {
                return mapping.findForward(CohesionActor.SALIDA_ACTOR);
            }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_Etapa_PG fpreinscripcion = (F_Etapa_PG)form;
            Estudiante e = (Estudiante)request.getSession().getAttribute("estudiante");
            List<Preinscripcion> lp = (List<Preinscripcion>) s.createQuery("from Preinscripcion where estudiante = :idEst and tipo = 2").setLong("idEst",e.getIdEstudiante()).list();
            if(lp.isEmpty()){
                Preinscripcion p = new Preinscripcion();
                p.setEstudiante(e);
                //generarCartaPostulacionCorta(e);
                p.setRegiones("");
                p.setEstatus(false);
                p.setTipo(2);
                p.setCreated_at(new Date());
                p.setPor_graduar(false);

                s.save(p);
                salida = SALIDA_0;
            }
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_generar_preinscripcion_larga.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_generar_preinscripcion_larga.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_generar_preinscripcion_larga.
     * 
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @return The Struts name of the following step.
     * @throws java.lang.Exception For untreated exceptions. 
     * These exceptions will normally be treated with
     * the default exception action.
     */
    public ActionForward A_generar_preinscripcion_larga(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"A_prep_gestionar_preinscripcion", "A_prep_gestionar_preinscripcion", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_1;
//Checking for actors estudiante
            if (!CohesionActor.checkActor(request, 4)) {
                return mapping.findForward(CohesionActor.SALIDA_ACTOR);
            }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_Etapa_PG fpreinscripcion = (F_Etapa_PG)form;
            Estudiante e = (Estudiante)request.getSession().getAttribute("estudiante");
            List<Preinscripcion> lp = (List<Preinscripcion>) s.createQuery("from Preinscripcion where estudiante = :idEst and tipo = 3").setLong("idEst",e.getIdEstudiante()).list();
            if(lp.isEmpty()){
                Preinscripcion p = new Preinscripcion();
                p.setEstudiante(e);
                //generarCartaPostulacionCorta(e);
                p.setRegiones("");
                p.setEstatus(false);
                p.setTipo(3);
                p.setCreated_at(new Date());
                p.setPor_graduar(false);

                s.save(p);
                salida = SALIDA_0;
            }
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_generar_preinscripcion_larga.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_generar_preinscripcion_larga.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

        /**
     * Called by Struts for the execution of action A_Preinscripcion.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @return The Struts name of the following step.
     * @throws java.lang.Exception For untreated exceptions.
     * These exceptions will normally be treated with
     * the default exception action.
     */
    public ActionForward A_Preinscripcion(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Gestion_Pasantias_Est", "V_gestionar_preinscripcion",};
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            //mi codigo
            F_Preinscripcion f_pre = (F_Preinscripcion) form;

            boolean bloque = f_pre.getBloque();
            boolean buscar = f_pre.getBuscar();
            String donde = f_pre.getDonde();
            int tipo = f_pre.getTipo();

            Estudiante e = (Estudiante)request.getSession().getAttribute("estudiante");
            List<Preinscripcion> lp = (List<Preinscripcion>) s.createQuery("from Preinscripcion where estudiante = :idEst and tipo = 1").setLong("idEst",e.getIdEstudiante()).list();

            if(lp.isEmpty()){
                Preinscripcion pre = new Preinscripcion();

                pre.setPor_graduar(bloque);
                pre.setTramitecctds(buscar);
                pre.setRegiones(donde);
                pre.setEstudiante(e);
                pre.setEstatus(false);
                pre.setTipo(tipo);
                pre.setCreated_at(new Date());

                f_pre.reset(mapping, request);
                s.save(pre);
                salida = SALIDA_0;
            } else {
                // ERROR YA UDS está preinscrito!!!!!!!!!!!
                salida = SALIDA_1;
            }            

            if (salida == 1) {
                request.setAttribute("msg",
                getResources(request).getMessage("A_Preinscipcion.msg1"));
            }

            //mi codigo
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
        if (salida == 0) {
            request.setAttribute("msg",
                    getResources(request).getMessage("A_Preinscripcion.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}