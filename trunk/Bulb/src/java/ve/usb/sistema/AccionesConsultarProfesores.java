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
import org.hibernate.Query;

/**
 *
 * @author chitty
 */
public class AccionesConsultarProfesores extends CohesionAction {

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
    public ActionForward A_ConsultarProfesores(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_ConsultarProfesores", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            /* Aqui empieza mi codigo */

            /* Consultas*/
            
            /* Lista de Areas */
            List<Area> list;
            Query q = s.createQuery("from Area");
            list = q.list();
            request.setAttribute("L_Area", list);

            List<Profesor> listd;
            q = s.createQuery("from Profesor");
            listd = q.list();
            request.setAttribute("L_Dpts", listd);

            /* Lista de Depts */
        /*    List<String> listDpts;
            q = s.createSQLQuery("select departamentoUSB from Profesor");
            listDpts = q.list();
            listDpts.removeAll(listDpts);


            //armo los dtps
            Object [] objIt;
            Estudiante e;
            for (Iterator it = ((List)q.list()).iterator(); it.hasNext();){

                String dep = (String)it.next();
                if(!listDpts.contains(dep))
                    listDpts.add(dep);
            }
            request.setAttribute("L_Dpts", listDpts);

*/


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