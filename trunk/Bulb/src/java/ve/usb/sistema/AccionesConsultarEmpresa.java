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
 */
public class AccionesConsultarEmpresa extends CohesionAction {

    /**
     * Called by Struts for the execution of action A_Pre_ConsultarEmpresa.
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
    public ActionForward A_Pre_ConsultarEmpresa(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_ConsultarEmpresa",};
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            /* Aqui empieza mi codigo */
        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try {
                s.close();
            } catch (Exception ex2) {
            }
        }
        return mapping.findForward("V_ConsultarEmpresa");
    }

    /**
     * Called by Struts for the execution of action A_ConsultarEmpresa.
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
    public ActionForward A_ConsultarEmpresa(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"A_Pre_ConsultarEmpresa", "A_Pre_ConsultarEmpresa", "A_Pre_ConsultarEmpresa",};
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;
        final int SALIDA_2 = 2;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {

            /* Aqui empieza mi codigo */

            /* Extrayendo info del form */
            if (form != null) {
                F_ConsultarEmpresa f_jur = (F_ConsultarEmpresa) form;
                String nombre = f_jur.getNombre();
                String rif = f_jur.getRif();
                String direccion = f_jur.getDireccion();
                String pais = f_jur.getPais();
                String ciudad = f_jur.getCiudad();
                String login = f_jur.getLogin();

                List<String> nombres;
                List<String> rifs;
                List<String> direcciones;
                List<String> paises;
                List<String> ciudades;
                List<String> logines;
                List<String> telefonos;


                List<String> Devolucion = s.createSQLQuery("select nombreprofesor from esjurado where nombreprofesor = 'nidevainaexisto'").list();

                String query = "";

                if (!nombre.equals("")) {
                    query = "where nombreempresa LIKE '%" + nombre + "%' ";
                }
                if (!rif.equals("")) {

                    if (!query.equals("")) {
                        query = query + " AND ";
                    } else {
                        query = query + " where ";
                    }
                    query = query + " rif LIKE '%"+ rif +"%'";

                }
                if (!direccion.equals("")) {

                    if (!query.equals("")) {
                        query = query + " AND ";
                    } else {
                        query = query + " where ";
                    }
                    query = query + " direccion LIKE '%"+ direccion +"%'";

                }
                if (!login.equals("")) {

                    if (!query.equals("")) {
                        query = query + " AND ";
                    } else {
                        query = query + " where ";
                    }
                    query = query + " loginempresa LIKE '%"+ login +"%'";

                }
                if (!ciudad.equals("")) {

                    if (!query.equals("")) {
                        query = query + " AND ";
                    } else {
                        query = query + " where ";
                    }
                    query = query + " ciudad LIKE '%"+ ciudad +"%'";

                }
                if (!pais.equals("")) {

                    if (!query.equals("")) {
                        query = query + " AND ";
                    } else {
                        query = query + " where ";
                    }
                    query = query + " pais LIKE '%"+ pais +"%'";

                }


             

                String nombre2 = "select nombreempresa from empresa " + query + ";";
                String rif2 = "select rif from empresa " + query + ";";
                String direccion2 = "select direccion from empresa " + query + ";";
                String pais2 = "select pais from empresa " + query + ";";
                String ciudad2 = "select ciudad from empresa " + query + ";";
                String login2 = "select loginempresa from empresa " + query + ";";
                String telefono2 = "select telefono from empresa " + query + ";";


                nombres = s.createSQLQuery(nombre2).list();
                rifs = s.createSQLQuery(rif2).list();
                direcciones = s.createSQLQuery(direccion2).list();
                paises = s.createSQLQuery(pais2).list();
                ciudades = s.createSQLQuery(ciudad2).list();
                logines = s.createSQLQuery(login2).list();
                telefonos = s.createSQLQuery(telefono2).list();

                for (int i = 0; i < nombres.size(); i++) {
                    Devolucion.add("<tr><td>" + nombres.get(i) + "</td><td>");
                    Devolucion.add(rifs.get(i));
                    Devolucion.add("</td><td>" + telefonos.get(i) + "</td><td>");
                    Devolucion.add(direcciones.get(i));
                    Devolucion.add("</td><td>" + logines.get(i) + "</td><td>");
                    Devolucion.add(ciudades.get(i));
                    Devolucion.add("</td><td>" + paises.get(i) + "</td></tr>");
                }

                if (!nombres.isEmpty()) {
                    request.setAttribute("Empresas", nombres);
//                    request.setAttribute("Tuts", tutoreos);
//                    request.setAttribute("Dpts", departamentos);
                    request.setAttribute("Resultado", Devolucion);
                }

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
        if (salida == 0) {
            request.setAttribute("msg",
                    getResources(request).getMessage("A_ConsultarEmpresa.msg0"));
        }
        if (salida == 1) {
            request.setAttribute("msg",
                    getResources(request).getMessage("A_ConsultarEmpresa.msg1"));
        }
        if (salida == 2) {
            request.setAttribute("msg",
                    getResources(request).getMessage("A_ConsultarEmpresa.msg2"));
        }

        return mapping.findForward("V_MostrarEmpresa");
    }
}
