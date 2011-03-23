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
public class AccionesC_Inicio_Sesion_T_industrial extends CohesionAction {

/**
     * Called by Struts for the execution of action A_prep_inicio_sesion_t_industrial.
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
    public ActionForward A_prep_inicio_sesion_t_industrial(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_inicio_sesion_t_industrial", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
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
     * Called by Struts for the execution of action A_inicio_sesion_t_industrial.
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
    public ActionForward A_inicio_sesion_t_industrial(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_sesion_tutor_i", "V_inicio_sesion_t_industrial", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_Inicio_Sesion_externo fF_Inicio_Sesion_externo = (F_Inicio_Sesion_externo)form;
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
            if (salida == 0) {
                new CohesionActor(CohesionActor.ACTOR_tutor_industrial)
                        .setMe(request);
            }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_inicio_sesion_t_industrial.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_inicio_sesion_t_industrial.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_modificar_perfil.
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
    public ActionForward A_modificar_perfil(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_modificar_perfil_TI", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors tutor_industrial
            if (!CohesionActor.checkActor(request, 16)) {
                return mapping.findForward(CohesionActor.SALIDA_ACTOR);
            }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_Tutor_Industrial fF_Tutor_Industrial = (F_Tutor_Industrial)form;
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_modificar_perfil.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_actualizar_perfil_TI.
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
    public ActionForward A_actualizar_perfil_TI(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_modificar_perfil_TI", "V_sesion_tutor_i", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
//Checking for actors tutor_industrial
            if (!CohesionActor.checkActor(request, 16)) {
                return mapping.findForward(CohesionActor.SALIDA_ACTOR);
            }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_Tutor_Industrial fF_Tutor_Industrial = (F_Tutor_Industrial)form;
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_actualizar_perfil_TI.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_actualizar_perfil_TI.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_prep_gestionar_pasatias_TI.
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
    public ActionForward A_prep_gestionar_pasatias_TI(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_gestionar_pasantias_TI", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors tutor_industrial
            if (!CohesionActor.checkActor(request, 16)) {
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



}