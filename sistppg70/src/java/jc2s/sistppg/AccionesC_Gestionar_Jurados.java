package jc2s.sistppg;

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
import org.hibernate.Session;
import org.hibernate.Transaction;
import ve.usb.cohesion.runtime.HibernateUtil;
import jc2s.sistppg.hibernate.*;

/**
 * 
 */
public class AccionesC_Gestionar_Jurados extends CohesionAction {

    /**
     * Called by Struts for the execution of action A_Prep_Gestionar_Jurados.
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
    public ActionForward A_Prep_Gestionar_Jurados(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Gestionar_Jurados",};
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors cordiacion_de_carrera
        if (!CohesionActor.checkActor(request, 2)) {
            return mapping.findForward(CohesionActor.SALIDA_ACTOR);
        }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
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

    /**
     * Called by Struts for the execution of action A_consultar_jurado.
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
    public ActionForward A_consultar_jurado(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_consultar_jurados",};
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors cordiacion_de_carrera
        if (!CohesionActor.checkActor(request, 2)) {
            return mapping.findForward(CohesionActor.SALIDA_ACTOR);
        }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {



            List<Area> L_Areas = s.createQuery("from Area").list();
            request.getSession().setAttribute("L_Areas", L_Areas);
            List<Departamento> L_Departamentos = s.createQuery("from Departamento").list();
            request.getSession().setAttribute("L_Departamentos", L_Departamentos);
            List<Trimestre> L_Trimestres = s.createQuery("from Trimestre").list();
            request.getSession().setAttribute("L_Trimestres", L_Trimestres);
            List<PeriodoPasantiaIntermedia> L_PeriodosPasantiaIntermedia = s.createQuery("from PeriodoPasantiaIntermedia").list();
            request.getSession().setAttribute("L_PeriodosPasantiaIntermedia", L_PeriodosPasantiaIntermedia);
            List<PeriodoPasantiaLarga> L_PeriodosPasantiaLarga = s.createQuery("from PeriodoPasantiaLarga").list();
            request.getSession().setAttribute("L_PeriodosPasantiaLarga", L_PeriodosPasantiaLarga);


            List<String> Devolucion = s.createSQLQuery("select nombre from trimestre where nombre = 'nidevainaexisto'").list();
            List<Profesor> profesores = s.createQuery("from Profesor").list();
            Iterator iterador = profesores.iterator();

            while(iterador.hasNext()){
                Profesor iterado = (Profesor) iterador.next();
                Devolucion.add("<tr><td><center>" + iterado.getNombre() + "</center></td><td><center>" + iterado.getApellido() + "</center></td>");
                Devolucion.add("<td><center>" + iterado.getDepartamento().getNombre() + "</center></td><td><center>"+""+"</center></td></tr>");
            }

            if (!Devolucion.isEmpty()) {
                request.getSession().setAttribute("Datos", Devolucion);
            } else {
                request.setAttribute("msg",
                        getResources(request).getMessage("A_Prep_Consultar_Jurados.msg0"));
            }





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

    /**
     * Called by Struts for the execution of action A_mostrar_jurado.
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
    public ActionForward A_mostrar_jurado(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_mostrar_jurado",};
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors cordiacion_de_carrera
        if (!CohesionActor.checkActor(request, 2)) {
            return mapping.findForward(CohesionActor.SALIDA_ACTOR);
        }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
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
