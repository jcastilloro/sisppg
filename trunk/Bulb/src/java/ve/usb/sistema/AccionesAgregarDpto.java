package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

import ve.usb.cohesion.runtime.CohesionAction;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ve.usb.cohesion.runtime.HibernateUtil;
import ve.usb.sistema.hibernate.*;

/**
 *
 * @author chitty
 */
public class AccionesAgregarDpto extends CohesionAction {

    /**
     * Called by Struts for the execution of action A_Pre_AgregarDpto.
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
    public ActionForward A_Pre_AgregarDpto(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_AgregarDpto", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
 /*       Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_AgregarDpto fF_AgregarDpto = (F_AgregarDpto)form;
           /* a echar codigo 

            String dpto = fF_AgregarDpto.getDpto();

             if( !(dpto.equals("")) ){

                Departamento departamento = new Departamento();
                departamento.setNombreDpto(dpto);

                s.save(departamento);
            }else{
                salida=SALIDA_1;
            }

            /* aqui termina 
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
  * 
  */
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_AgregarDpto.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_AgregarDpto.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }
    

    /**
     * Called by Struts for the execution of action A_AgregarDpto.
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
    public ActionForward A_AgregarDpto(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_GestionarDepartamentos", "V_AgregarDpto", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_AgregarDpto fF_AgregarDpto = (F_AgregarDpto)form;
           // a echar codigo

            String dpto = fF_AgregarDpto.getDpto();

             if( !(dpto.equals("")) ){

                Departamento departamento = new Departamento();
                departamento.setNombreDpto(dpto);

                s.save(departamento);
            }else{
                salida=SALIDA_1;
            }

            // aqui termina
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
  
  
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_AgregarDpto.msg2"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_AgregarDpto.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }


}