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
public class AccionesC_Empresa extends CohesionAction {
    
/**
     * Called by Struts for the execution of action A_Prep_Inicio_Sesion_Empresa.
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
    public ActionForward A_Prep_Inicio_Sesion_Empresa(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Inicio_Sesion_Empresa", };
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
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_Prep_Inicio_Sesion_Empresa.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_Prep_Registro_Empresa.
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
    public ActionForward A_Prep_Registro_Empresa(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Registro_Empresa", };
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
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_Prep_Registro_Empresa.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_Registrar_Empresa.
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
    public ActionForward A_Registrar_Empresa(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Inicio_Sesion_Empresa", "V_Registro_Empresa", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_Registro_Empresa fF_Registro_Empresa = (F_Registro_Empresa)form;
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_Registrar_Empresa.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_Registrar_Empresa.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_Inicio_Sesion_Empresa.
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
    public ActionForward A_Inicio_Sesion_Empresa(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Inicio_Sesion_Empresa", "V_Sesion_Empresa", };
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
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_Inicio_Sesion_Empresa.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_Inicio_Sesion_Empresa.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_prep_agregar_tutor_I.
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
    public ActionForward A_prep_agregar_tutor_I(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Agregar_Tutor_I", };
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
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_prep_agregar_tutor_I.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_Agregar_Tutor_Ind.
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
    public ActionForward A_Agregar_Tutor_Ind(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Agregar_Tutor_I", "V_Sesion_Empresa", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
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
            getResources(request).getMessage("A_Agregar_Tutor_Ind.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_Agregar_Tutor_Ind.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}