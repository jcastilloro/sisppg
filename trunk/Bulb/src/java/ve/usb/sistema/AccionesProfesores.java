package ve.usb.sistema;

import java.util.Iterator;
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

import java.util.List;

/**
 *
 * @author chitty
 */
public class AccionesProfesores extends CohesionAction {

    /**
     * Called by Struts for the execution of action A_ConsultarProfesores.
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
    public ActionForward A_Profesores(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Profesores", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            /* Aqui empieza mi codigo */

            /* Extrayendo info del form */
            if (form != null) {
                F_Profesores f_prof = (F_Profesores) form;
                String depto = f_prof.getDepartamento();
                String areaf = f_prof.getArea();

                List <String> consulta;
                if (depto.equals("todos") || areaf.equals("todas")) 
                    consulta = s.createSQLQuery("select nombreprofesor from profesor;").list();
                else 
                    consulta = s.createSQLQuery("select nombreprofesor from profesor where idprofesor='" + areaf + "';").list();

                if (!consulta.isEmpty()) {
                    request.setAttribute("Profs", consulta);
                }
                request.setAttribute("Area", areaf);
                request.setAttribute("Dep", depto);
                

            }

            /* Aqui termina mi codigo */
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