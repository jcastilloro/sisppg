package ve.usb.sistema;

import java.util.Iterator;
import java.util.List;
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
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import ve.usb.cohesion.runtime.HibernateUtil;
import ve.usb.sistema.hibernate.*;

/**
 *
 * @author chitty
 */
public class AccionesGestionarConsultaTutor extends CohesionAction {

/**
     * Called by Struts for the execution of action A_GestionarConsultaTutor.
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
    public ActionForward A_GestionarConsultaTutor(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_GestionarConsultaTutor", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            //comienza mi codigo

            //finaliza mi codigo
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        return mapping.findForward(SALIDAS[salida]);
    }

    public ActionForward A_ConsultaEstudiantesTutoreados(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

    //Salidas
        final String[] SALIDAS = {"V_EstudiantesTutoreados", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            //comienza mi codigo

            String codProf = (String)request.getSession().getAttribute("login");
            Query query = s.createSQLQuery("select carnetestudiante, nombreppg, fechappg from estrealizaproy, proftutoreaproy, ppg where estrealizaproy.codigoproy = proftutoreaproy.numeroppg and proftutoreaproy.idprofesor = '"+codProf+"' and estrealizaproy.tipoproy = proftutoreaproy.tipoproytutor and tipoproy=0 and  ppg.numeroppg = proftutoreaproy.numeroppg");
            List<String> resultPG = (List)query.list();
            resultPG.removeAll(resultPG);
            List<String> resultPasantia = (List)query.list();
            resultPasantia.removeAll(resultPasantia);
            //mando los datos de los estudiantes de tesis
            Object [] objIt;
            for (Iterator it = ((List)query.list()).iterator(); it.hasNext();){

                objIt = (Object []) it.next();
                resultPG.add("Carnet: "+(String)objIt[0]+" |    Nombre PG: "+(String)objIt[1]);
            }
            request.setAttribute("EstPG",resultPG);//numero d estudiantes tuto de pasantia

            //mando los datos de los estudiantes de pasantia
            query = s.createSQLQuery("select carnetestudiante, empresa, titulopasantia from estrealizaproy, proftutoreaproy, plantrabajo where estrealizaproy.codigoproy = proftutoreaproy.numeroppg and proftutoreaproy.idprofesor = '"+codProf+"' and estrealizaproy.tipoproy = proftutoreaproy.tipoproytutor and tipoproy=1 and  proftutoreaproy.numeroppg = plantrabajo.codigopt");
            for (Iterator it = ((List)query.list()).iterator(); it.hasNext();){

                objIt = (Object []) it.next();
                resultPasantia.add("Carnet: "+(String)objIt[0]+" |    Empresa: "+(String)objIt[1]+" |  Titulo Pasantia: "+(String)objIt[1]);
            }
            request.setAttribute("EstPasantia",resultPasantia);//numero d estudiantes tuto de pasantia

            //finaliza mi codigo
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