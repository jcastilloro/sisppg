package jc2s.sistppg;

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
public class AccionesC_Gestionar_PG_Prof extends CohesionAction {
    
/**
     * Called by Struts for the execution of action A_prep_gestionar_PG_prof.
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
    public ActionForward A_prep_gestionar_PG_prof(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_gestionar_PG_prof", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors profesor
            if (!CohesionActor.checkActor(request, 8)) {
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
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_prep_gestionar_PG_prof.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_prep_agregar_PG.
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
    public ActionForward A_prep_agregar_PG(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_agregar_PG", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors profesor
            if (!CohesionActor.checkActor(request, 8)) {
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
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_prep_agregar_PG.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_agregar_PG.
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
    public ActionForward A_agregar_PG(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_agregar_PG", "V_areas_pg", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
//Checking for actors profesor
            if (!CohesionActor.checkActor(request, 8)) {
                return mapping.findForward(CohesionActor.SALIDA_ACTOR);
            }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_Inscripcion_PG fF_Inscripcion_PG = (F_Inscripcion_PG)form;
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_agregar_PG.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_agregar_PG.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_agregar_area_PG.
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
    public ActionForward A_agregar_area_PG(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_areas_pg", "V_areas_pg", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
//Checking for actors profesor
            if (!CohesionActor.checkActor(request, 8)) {
                return mapping.findForward(CohesionActor.SALIDA_ACTOR);
            }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_Area fF_Area = (F_Area)form;
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_agregar_area_PG.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_agregar_area_PG.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_prep_etapas_ppg.
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
    public ActionForward A_prep_etapas_ppg(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_etapas_pg", "V_areas_pg", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
//Checking for actors profesor
            if (!CohesionActor.checkActor(request, 8)) {
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
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_prep_etapas_ppg.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_prep_etapas_ppg.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_prep_agregar_primera_etapa.
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
    public ActionForward A_prep_agregar_primera_etapa(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_agregar_primera_etapa", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors profesor
            if (!CohesionActor.checkActor(request, 8)) {
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
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_prep_agregar_primera_etapa.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_guardar_primera_etapa.
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
    public ActionForward A_guardar_primera_etapa(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_actividades_etapa", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors profesor
            if (!CohesionActor.checkActor(request, 8)) {
                return mapping.findForward(CohesionActor.SALIDA_ACTOR);
            }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_Etapa_PG fF_Etapa_PG = (F_Etapa_PG)form;
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
     * Called by Struts for the execution of action A_agregar_actividad_etapa.
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
    public ActionForward A_agregar_actividad_etapa(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_actividades_etapa", "V_actividades_etapa", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
//Checking for actors profesor
            if (!CohesionActor.checkActor(request, 8)) {
                return mapping.findForward(CohesionActor.SALIDA_ACTOR);
            }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_Actividad_Etapa fF_Actividad_Etapa = (F_Actividad_Etapa)form;
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_agregar_actividad_etapa.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_agregar_actividad_etapa.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_finalizar_actividades_etapa.
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
    public ActionForward A_finalizar_actividades_etapa(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_actividades_etapa", "A_prep_etapas_ppg", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
//Checking for actors profesor
            if (!CohesionActor.checkActor(request, 8)) {
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
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_finalizar_actividades_etapa.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_finalizar_actividades_etapa.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_finalizar_generar_PG.
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
    public ActionForward A_finalizar_generar_PG(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"A_prep_gestionar_PG_prof", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors profesor
            if (!CohesionActor.checkActor(request, 8)) {
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
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_finalizar_generar_PG.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_prep_agregar_segunda_etapa.
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
    public ActionForward A_prep_agregar_segunda_etapa(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_agregar_segunda_etapa", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors profesor
            if (!CohesionActor.checkActor(request, 8)) {
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
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_prep_agregar_segunda_etapa.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_guardar_segunda_etapa.
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
    public ActionForward A_guardar_segunda_etapa(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_agregar_segunda_etapa", "V_actividades_etapa", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
//Checking for actors profesor
            if (!CohesionActor.checkActor(request, 8)) {
                return mapping.findForward(CohesionActor.SALIDA_ACTOR);
            }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_Etapa_PG fF_Etapa_PG = (F_Etapa_PG)form;
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_guardar_segunda_etapa.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_prep_agregar_tercera_etapa.
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
    public ActionForward A_prep_agregar_tercera_etapa(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_agregar_tercera_etapa", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors profesor
            if (!CohesionActor.checkActor(request, 8)) {
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
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_prep_agregar_tercera_etapa.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_guardar_tercera_etapa.
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
    public ActionForward A_guardar_tercera_etapa(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_actividades_etapa", "V_agregar_tercera_etapa", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
//Checking for actors profesor
            if (!CohesionActor.checkActor(request, 8)) {
                return mapping.findForward(CohesionActor.SALIDA_ACTOR);
            }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_Etapa_PG fF_Etapa_PG = (F_Etapa_PG)form;
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_guardar_tercera_etapa.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}