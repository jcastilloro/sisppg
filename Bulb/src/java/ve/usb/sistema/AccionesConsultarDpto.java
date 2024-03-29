package ve.usb.sistema;

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

import ve.usb.sistema.hibernate.Departamento;

/**
 *
 * @author chitty
 */
public class AccionesConsultarDpto extends CohesionAction {

    /**
     * Called by Struts for the execution of action A_ConsultarProfesores.
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
    public ActionForward A_ConsultarDpto(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_ConsultarDpto",};
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            /* Aqui empieza mi codigo */

            List<Departamento> departamentos = (List<Departamento>)s.createQuery("from Departamento").list();
            List<String> Devolucion = s.createQuery("from Departamento").list();

            Devolucion.clear();
            for (int i = 0; i < departamentos.size(); i++) {
                Devolucion.add(" " +departamentos.get(i).getNombreDpto() + " ");
            }

            if (!departamentos.isEmpty()) {
                request.setAttribute("Dpto", Devolucion);
            }

            /* Aqui termina mi codigo */
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
}