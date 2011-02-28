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
public class AccionesConsultarJurados extends CohesionAction {

    /**
     * Called by Struts for the execution of action A_Pre_ConsultarJurados.
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
    public ActionForward A_Pre_ConsultarJurados(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_ConsultarJurados", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            /* Aqui empieza mi codigo */
            List<String> list;
            list = s.createSQLQuery("select distinct areajurado from esjurado").list();
            request.setAttribute("Dpto", list);
             /* Aqui termina mi codigo */
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        return mapping.findForward("V_ConsultarJurados");
    }

    /**
     * Called by Struts for the execution of action A_ConsultarJurados.
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
    public ActionForward A_ConsultarJurados(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"A_Pre_ConsultarJurados", "A_Pre_ConsultarJurados", "A_Pre_ConsultarJurados",};
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
                F_ConsultarJurados f_jur = (F_ConsultarJurados) form;
                String dptoJurado = f_jur.getDptoJurado();
                String nombreProfesor = f_jur.getNombreProfesor();
                String filtro = f_jur.getFiltro();
                int tutorie = Integer.parseInt(f_jur.getTutoreos());

                List<String> nombres;
                List<String> tutoreos;
                List<String> departamentos;
                List<String> Devolucion=s.createSQLQuery("select nombreprofesor from esjurado where nombreprofesor = 'nidevainaexisto'").list();

                String query = "";

                if(!dptoJurado.equals("Todos")){
                    query = "where areajurado = '"+dptoJurado+"' ";
                }
                if(!filtro.equals("Todo")){
                    if(filtro.equals("PPG")){
                        if(!query.equals("")){
                            query=query+" AND ";
                        }else{
                            query=query+" where ";
                        }
                        query =query + " esppg = 'true'";
                    }
                    else{
                        if(!query.equals("")){
                            query=query+" AND ";
                        }else{
                            query=query+" where ";
                        }
                        query = query + " esppg = 'false'";
                    }
                }
                if(!nombreProfesor.equals("")){
                    if(!query.equals("")){
                            query=query+" AND ";
                        }else{
                            query=query+" where ";
                        }
                    query = query + " nombreprofesor = '"+nombreProfesor+"' ";
                }

                if (!query.equals("")) {
                    query = query + " AND ";
                } else {
                    query = query + " where ";
                }
                query = query + " tutoreo <= " + tutorie + " ";

                String nombre = "select nombreprofesor from esjurado " + query + ";";
                String tutoreo = "select tutoreo from esjurado " + query + ";";
                String dpto = "select areajurado from esjurado " + query + ";";

                nombres = s.createSQLQuery(nombre).list();
                tutoreos = s.createSQLQuery(tutoreo).list();
                departamentos = s.createSQLQuery(dpto).list();

                for (int i = 0; i < nombres.size(); i++) {
                    Devolucion.add("<tr><td>"+nombres.get(i)+"</td><td>");
                    Devolucion.add(f_jur.getTutoreos());
                    Devolucion.add("</td><td>"+departamentos.get(i)+"<td></tr>");
                }

                if (!nombres.isEmpty()) {
                    request.setAttribute("Jurs", nombres);
                    request.setAttribute("Tuts", tutoreos);
                    request.setAttribute("Dpts", departamentos);
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
                    getResources(request).getMessage("A_ConsultarJurados.msg0"));
        }
        if (salida == 1) {
            request.setAttribute("msg",
                    getResources(request).getMessage("A_ConsultarJurados.msg1"));
        }
        if (salida == 2) {
            request.setAttribute("msg",
                    getResources(request).getMessage("A_ConsultarJurados.msg2"));
        }

        return mapping.findForward("V_MostrarJurados");
    }
}