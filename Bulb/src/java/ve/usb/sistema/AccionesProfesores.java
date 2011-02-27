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
     * These exceptions will normally be treated with
     * the default exception action.
     */
    public ActionForward A_Profesores(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Profesores",};
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
                String query = "";
                List<String> consulta;
                List<String> areas;
                List<String> departamentos;
                if (!depto.equals("todos")) {
                    query = " where departamentousb = '" + depto + "' ";
                }
                if (!areaf.equals("todas")) {
                    if (!query.equals("")) {
                        query = query + " AND ";
                    } else {
                        query = query + " where ";
                    }
                    query = query + " area = '" + areaf + "' ";
                }

                System.out.println("######################################################" + query);
                consulta = s.createSQLQuery("select nombreprofesor from profesor" + query + ";").list();
                areas = s.createSQLQuery("select area from profesor" + query + ";").list();
                departamentos = s.createSQLQuery("select departamentousb from profesor" + query + ";").list();

                List<String> Devolucion = s.createSQLQuery("select nombreprofesor from esjurado where nombreprofesor = 'nidevainaexisto'").list();

                for (int i = 0; i < consulta.size(); i++) {
                    Devolucion.add("<tr><td>" + consulta.get(i) + "</td><td>");
                    Devolucion.add(areas.get(i));
                    Devolucion.add("</td><td>" + departamentos.get(i) + "<td></tr>");
                }

                if (!consulta.isEmpty()) {
                    request.setAttribute("Profs", Devolucion);
                }
//                request.setAttribute("Area", areas);
//                request.setAttribute("Dep", departamentos);


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