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
import java.sql.Timestamp;

/**
 * 
 */
public class AccionesRevisarDocumentos extends CohesionAction {

    /**
     * Called by Struts for the execution of action A_Pre_IniciarSesion.
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
    public ActionForward A_Pre_RevisarDocumentos(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_RevisarDocumentos",};
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
//            tr.commit();
            List<String> usuarios = s.createSQLQuery("select usuario from documento where aprobado = 'false'").list();
            List<String> rutas = s.createSQLQuery("select ruta from documento where aprobado = 'false'").list();
            List<String> tipos = s.createSQLQuery("select tipo from documento where aprobado = 'false'").list();
            List<Timestamp> fechas = s.createSQLQuery("select fecha from documento where aprobado = 'false'").list();
            List<String> Devolucion = s.createSQLQuery("select nombreprofesor from esjurado where nombreprofesor = 'nidevainaexisto'").list();


            for (int i = 0; i < usuarios.size(); i++) {
                Devolucion.add("<tr><td>" + usuarios.get(i) + "</td><td>");
                Devolucion.add(tipos.get(i));
                Devolucion.add("</td><td>" + fechas.get(i) + "</td><td>");
                if (tipos.get(i).equals("Inscripcion")) {
                    Devolucion.add("<A HREF=\"/upload/DocIns/" + rutas.get(i) + "\" target=\"_blank\">Ver</A>" + "</td>");
                }else{
                    Devolucion.add("<A HREF=\"/upload/DocC/" + rutas.get(i) + "\" target=\"_blank\">Ver</A>" + "</td>");
                }
                Devolucion.add("<td><form action=\"A_ConfirmarDocumento.do\" method=\"post\" enctype=\"multipart/form-data\"><input type=\"hidden\" name=\"Ruta\" property=\"Ruta\" value=\""+rutas.get(i)+"\"><input type=\"submit\" name=\"mysubmit\" value=\"Confirmar\" /></form></td></tr>");
               // Devolucion.add(rutas.get(i));

                //<html:form action="/A_ConsultarJurados" method="post" enctype="multipart/form-data">

                //<A HREF="http://www.htmlpoint.com">Visita HTMLpoint</A>
            }


            request.setAttribute("Usuarios", usuarios);
            request.setAttribute("Resultado", Devolucion);



        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try {
                s.close();
                tr.commit();
            } catch (Exception ex2) {
            }
        }
        return mapping.findForward(SALIDAS[salida]);
    }
}
