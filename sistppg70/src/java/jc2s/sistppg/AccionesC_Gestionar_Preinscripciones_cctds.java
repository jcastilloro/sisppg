package jc2s.sistppg;

import java.util.Iterator;
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
import jc2s.sistppg.hibernate.Preinscripcion;


/**
 * 
 */
public class AccionesC_Gestionar_Preinscripciones_cctds extends CohesionAction {
    
/**
     * Called by Struts for the execution of action A_prep_gestionar_preinscripcion_cctds.
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
    public ActionForward A_prep_gestionar_preinscripcion_cctds(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_gestionar_preinscripciones_cctds", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors coordinador_cctds
            if (!CohesionActor.checkActor(request, 1)) {
                return mapping.findForward(CohesionActor.SALIDA_ACTOR);
            }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            String orderby = (String) request.getParameter("orderby");//request.getAttribute("orderby");
            List<Preinscripcion> preinscripciones;
            if(orderby!=null){
                if(orderby.equals("1")){
                    preinscripciones = (List<Preinscripcion>) s.createQuery("from Preinscripcion order by tipo desc").list();
                }else if(orderby.equals("2")){
                    preinscripciones = (List<Preinscripcion>) s.createQuery("from Preinscripcion order by estudiante desc").list();
                }else if(orderby.equals("3")){
                    preinscripciones = (List<Preinscripcion>) s.createQuery("from Preinscripcion order by estatus desc").list();
                }else if(orderby.equals("4")){
                    preinscripciones = (List<Preinscripcion>) s.createQuery("from Preinscripcion order by created_at desc").list();
                }else{
                    preinscripciones = (List<Preinscripcion>) s.createQuery("from Preinscripcion order by created_at desc").list();
                }
            }else{
                    preinscripciones = (List<Preinscripcion>) s.createQuery("from Preinscripcion").list();
                }
            request.setAttribute("L_preinscripciones", preinscripciones);
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
     * Called by Struts for the execution of action A_prep_consultar_no_aprobados.
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
    public ActionForward A_prep_consultar_no_aprobados(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_consultar_no_aprobados", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors coordinador_cctds
            if (!CohesionActor.checkActor(request, 1)) {
                return mapping.findForward(CohesionActor.SALIDA_ACTOR);
            }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            String orderby = (String) request.getParameter("orderby");//request.getAttribute("orderby");
            List<Preinscripcion> preinscripciones;
            if(orderby!=null){
                if(orderby.equals("1")){
                    preinscripciones = (List<Preinscripcion>) s.createQuery("from Preinscripcion where estatus = :bool order by tipo asc").setBoolean("bool", false).list();
                }else if(orderby.equals("2")){
                    preinscripciones = (List<Preinscripcion>) s.createQuery("from Preinscripcion where estatus = :bool order by estudiante asc").setBoolean("bool", false).list();
                }else if(orderby.equals("3")){
                    preinscripciones = (List<Preinscripcion>) s.createQuery("from Preinscripcion where estatus = :bool order by tipo asc").setBoolean("bool", false).list();
                }else if(orderby.equals("4")){
                    preinscripciones = (List<Preinscripcion>) s.createQuery("from Preinscripcion where estatus = :bool order by created_at desc").setBoolean("bool", false).list();
                }else{
                    preinscripciones = (List<Preinscripcion>) s.createQuery("from Preinscripcion where estatus = :bool order by created_at desc").setBoolean("bool", false).list();
                }
            }else{
                    preinscripciones = (List<Preinscripcion>) s.createQuery("from Preinscripcion where estatus = :bool").setBoolean("bool", false).list();
                }
            request.setAttribute("L_preinscripciones", preinscripciones);
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
     * Called by Struts for the execution of action A_procesar_aprobados.
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
    public ActionForward A_procesar_aprobados(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"A_prep_gestionar_preinscripcion_cctds", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors coordinador_cctds
            if (!CohesionActor.checkActor(request, 1)) {
                return mapping.findForward(CohesionActor.SALIDA_ACTOR);
            }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            List<Preinscripcion> preinscripciones = (List<Preinscripcion>) s.createQuery("from Preinscripcion where estatus = :bool").setBoolean("bool", true).list();
            Iterator i = preinscripciones.iterator();
            while(i.hasNext()){
                Preinscripcion p = (Preinscripcion) i.next();
                s.delete(p);

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
            getResources(request).getMessage("A_procesar_aprobados.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_mostrar_preinscripcion.
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
    public ActionForward A_mostrar_preinscripcion(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_mostrar_preinscripcion", "A_prep_consultar_no_aprobados"};
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
//Checking for actors coordinador_cctds
            if (!CohesionActor.checkActor(request, 1)) {
                return mapping.findForward(CohesionActor.SALIDA_ACTOR);
            }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            String parametro = (String) request.getParameter("preId");
            long preId = Long.parseLong(parametro);
            Preinscripcion p = (Preinscripcion) s.createQuery("from Preinscripcion where idPreinscripcion = :id").setLong("id", preId).uniqueResult();
            if(p==null){
                salida = SALIDA_1;
            }else{
                request.setAttribute("p", p);
            }
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
     * Called by Struts for the execution of action A_cambiar_estatus.
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
    public ActionForward A_cambiar_estatus(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"A_prep_gestionar_preinscripcion_cctds", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors coordinador_cctds
            if (!CohesionActor.checkActor(request, 1)) {
                return mapping.findForward(CohesionActor.SALIDA_ACTOR);
            }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            String parametro = (String) request.getParameter("preId");
            long preId = Long.parseLong(parametro);
            Preinscripcion p = (Preinscripcion) s.createQuery("from Preinscripcion where idPreinscripcion = :id").setLong("id", preId).uniqueResult();
            p.setEstatus(true);
            s.update(p);

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg","Estatus Cambiado Satisfactoriamente");
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}