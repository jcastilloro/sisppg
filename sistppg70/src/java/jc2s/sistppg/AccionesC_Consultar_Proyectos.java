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

            Usuario user = (Usuario) request.getSession().getAttribute("usuario");

            List<EstudianteRealizaProyecto> proyectos = new LinkedList<EstudianteRealizaProyecto>();

            if (user.getUsbid().equals("coord-comp")){
                //VALOR CABLIAO
                long idCarrera = 2;
                // TODOS los proyectos, toca filtrarlos por carrera
                proyectos = s.createQuery("from EstudianteRealizaProyecto where estudiante IN (select idEstudiante from Estudiante where carrera= :var)").setLong("var", idCarrera).list();

            } else {
                List<Carrera> c = s.createQuery("from Carrera").list();
                request.setAttribute("L_Carreras", c);
                proyectos = s.createQuery("from EstudianteRealizaProyecto where estudiante IN (select idEstudiante from Estudiante)").list();
            }

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
            //Mi Codigo

            List<EstudianteRealizaProyecto> proye = s.createQuery("from EstudianteRealizaProyecto").list();
            List<ProyectoDeGrado> lpg = s.createQuery("from ProyectoDeGrado").list();
            lpg.clear();
            for (int i = 0; i < proye.size(); i++) {
                EstudianteRealizaProyecto proy = proye.get(i);
                List<ProyectoDeGrado> pg = s.createQuery("from ProyectoDeGrado where proyecto= :var").setLong("var", proy.getProyecto().getId_proyecto()).list();
                if (!pg.isEmpty()) {
                    lpg.add(pg.get(0));
                }
            }
            request.setAttribute("L_PGS", lpg);


            //Mi Codigo
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
            // Mi codigo

//            request.getSession().removeAttribute("Proyecto");
//            request.getSession().removeAttribute("Tutor");
//            request.getSession().removeAttribute("Area");
//            request.getSession().removeAttribute("JuradoProyecto");
//            request.getSession().removeAttribute("Etapa1");
//            request.getSession().removeAttribute("Trimestre1");
//            request.getSession().removeAttribute("Descripcion1");
//            request.getSession().removeAttribute("Etapa2");
//            request.getSession().removeAttribute("Trimestre2");
//            request.getSession().removeAttribute("Descripcion2");
//            request.getSession().removeAttribute("Etapa3");
//            request.getSession().removeAttribute("Trimestre3");


            Long key = Long.parseLong(request.getParameter("idProyectoDeGrado"));
            ProyectoDeGrado pg = (ProyectoDeGrado) s.createQuery("from ProyectoDeGrado as p join fetch p.profesor where idProyectoDeGrado= :var").setLong("var", key).uniqueResult();
            List<AreaProyectoDeGrado> apg = s.createQuery("from AreaProyectoDeGrado where proyecto_de_grado= :var").setLong("var", key).list();
            List<Etapa> etapas = s.createQuery("from Etapa where proyecto_de_grado= :var").setLong("var", key).list();
//            List<JuradoProyecto> jurados = s.createQuery("from JuradoProyecto where proyecto= :var").setLong("var", key).list();


            request.setAttribute("Proyecto", pg);
            request.setAttribute("Tutor", pg.getProfesor());

            String[] res = new String[apg.size()];
            for (int i = 0; i < res.length; i++) {
                res[i] = apg.get(i).getArea().getNombre();
            }


//            String[] res2 = new String[jurados.size()*3];
//            int j = 0;
//            Iterator it = jurados.iterator();
//            while (it.hasNext()) {
//                Profesor pro = ((JuradoProyecto) it.next()).getProfesor();
//                res2[j] = pro.getNombre();
//                j++;
//                res2[j] = pro.getApellido();
//                j++;
//                res2[j] = pro.getEmail();
//
//            }


            request.setAttribute("Area", res);
//            request.getSession().setAttribute("JuradoProyecto", jurados);


            for (int i = 0; i < etapas.size(); i++) {

                List<PrimeraEtapa> etapa = s.createQuery("from PrimeraEtapa where etapa= :var").setLong("var", etapas.get(i).getIdEtapa()).list();
                if (!etapa.isEmpty()) {
                    PrimeraEtapa indirecto = etapa.get(0);
                    request.setAttribute("Etapa1", indirecto.getEtapa());
                    request.setAttribute("Trimestre1", indirecto.getEtapa().getTrimestre().getNombre());
                    request.setAttribute("Descripcion1", indirecto.getDescripcion_topicos());

                }


                List<SegundaEtapa> etapaa = s.createQuery("from SegundaEtapa where etapa= :var").setLong("var", etapas.get(i).getIdEtapa()).list();
                if (!etapaa.isEmpty()) {
                    SegundaEtapa indirecto = etapaa.get(0);
                    request.setAttribute("Etapa2", indirecto.getEtapa());
                    request.setAttribute("Trimestre2", indirecto.getEtapa().getTrimestre().getNombre());
                    request.setAttribute("Descripcion2", indirecto.getDescripcion_topicos());

                }


                List<TerceraEtapa> etapaaa = s.createQuery("from TerceraEtapa where etapa= :var").setLong("var", etapas.get(i).getIdEtapa()).list();
                if (!etapaaa.isEmpty()) {
                    TerceraEtapa indirecto = etapaaa.get(0);
                    request.setAttribute("Etapa3", indirecto.getEtapa());
                    request.setAttribute("Trimestre3", indirecto.getEtapa().getTrimestre().getNombre());
//                    request.getSession().setAttribute("Descripcion3", indirecto.getDescripcion_topicos());

                }
            }
            //Mi codigo
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

            Usuario user = (Usuario) request.getSession().getAttribute("usuario");            
            List<Pasantia> pas = s.createQuery("from Pasantia").list();            
            List<Pasantia> pas1 = new LinkedList<Pasantia>();  // solucion rancho...
            List<Pasantia> pas2 = new LinkedList<Pasantia>();
            List<Pasantia> pasDef = new LinkedList<Pasantia>();
            boolean tipoON = false;

            if (user.getUsbid().equals("coord-comp")){
                //VALOR CABLIAO
                long idCarrera = 2;
                // TODOS los proyectos, toca filtrarlos por carrera
                pas1 = s.createQuery("from Pasantia where proyecto IN (select proyecto from EstudianteRealizaProyecto where estudiante IN (select idEstudiante from Estudiante where carrera= :var))").setLong("var", idCarrera).list();

            } else {
                List<Carrera> career = s.createQuery("from Carrera").list();
                request.setAttribute("Carreras", career);
            }
            

            List<EstatusPasantia> estatus = s.createQuery("from EstatusPasantia").list();
            request.setAttribute("Estatus", estatus);

            F_Sinai f_sinai = (F_Sinai) form;


            if(f_sinai.getIdCarrera() != -1){
               pas1 = s.createQuery("from Pasantia where proyecto IN (select proyecto from EstudianteRealizaProyecto where estudiante IN (select idEstudiante from Estudiante where carrera= :var))").setLong("var", f_sinai.getIdCarrera()).list();
            }

            
            String tipo = f_sinai.getTipo();
            String query = new String();
            // Tipo de pasantía
            if (tipo.equals("larga")) {
                query = "from Pasantia where idPasantia IN (Select pasantia from PasantiaLarga)";
                pas = s.createQuery(query).list();
                tipoON = true;
            } else if (tipo.equals("corta")) {
                query = "from Pasantia where idPasantia IN (Select pasantia from PasantiaCorta)";
                pas = s.createQuery(query).list();
                tipoON = true;
            } else if (tipo.equals("intermedia")) {
                query = "from Pasantia where idPasantia IN (Select pasantia from PasantiaIntermedia)";
                pas = s.createQuery(query).list();
                tipoON = true;
            }

            if (f_sinai.getStatus() != -1){
               pas2 = s.createQuery("from Pasantia where estatus IN (select idEstatusPasantia from EstatusPasantia where idEstatusPasantia= :var)").setLong("var", f_sinai.getStatus()).list();
            }

            // El rancho en accion
            if (!pas1.isEmpty() && tipoON && !pas2.isEmpty()){
                pasDef = interseccion(pas2,pas1);
                pasDef = interseccion(pasDef,pas);
            } else if (!pas1.isEmpty() && tipoON){
                pasDef = interseccion(pas1,pas);

            } else if (!pas2.isEmpty() && tipoON){
                pasDef = interseccion(pas2,pas);

            } else if (!pas2.isEmpty() && !pas1.isEmpty()){
                pasDef = interseccion(pas2,pas1);

            } else if (!pas2.isEmpty()){
                pasDef = pas2;
            } else if (!pas1.isEmpty()){
                pasDef = pas1;
            } else
                pasDef = pas;


            /*  QUE WEBO TAN PELAO NO TENER UN PUTO ATRIBUTO AÑO!!!!
            if (f_sinai.getAno() != -1){
                pas = s.createQuery("from Pasantia where proyecto IN (select id_proyecto from Proyecto where created_at= :var)").setLong("var", f_sinai.getStatus()).list();
            }
*/
            

            request.setAttribute("Pasantias", pasDef);
            
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

   // funcion intersección de listas de pasantias
   private List<Pasantia> interseccion(List<Pasantia> a, List<Pasantia> b){
       
       List<Pasantia> pasDef = new LinkedList<Pasantia>();
       for (int i = 0; a.size() > i; i++) {
           if (b.indexOf(a.get(i)) != -1)
               pasDef.add(a.get(i));
       }
       return pasDef;
   }

}