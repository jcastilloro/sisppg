package ve.usb.sistema;

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
import ve.usb.sistema.hibernate.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class AccionesConsultarPPGTutor extends CohesionAction {
    
/**
     * Called by Struts for the execution of action A_Pre_ConsultarPPGTutor.
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
    public ActionForward A_Pre_ConsultarPPGTutor(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_ConsultarPPGTutor", "A_Pre_GestionarPPG", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            String codigoProfesor = (String)request.getSession().getAttribute("login");
            
            /*Agrega el tipoproy al query cuando puedas */
            List<Integer> codigosPPG = (List<Integer>)s.createSQLQuery("select numeroppg from ProfTutoreaProy where idprofesor='"+codigoProfesor+"';").list();
            List<PPG> ppg = new ArrayList();
            if (codigosPPG.isEmpty()){salida=SALIDA_1;}
            else {
                while (!codigosPPG.isEmpty()){
                    ppg.add((PPG)s.createQuery("from PPG where numeroppg = :temporal").setInteger("temporal", codigosPPG.get(0)).uniqueResult());
                    codigosPPG.remove(0);
                }
            }
                request.setAttribute("PPG", ppg);
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_Pre_ConsultarPPGTutor.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_MostrarDetallesPPG.
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
    public ActionForward A_MostrarDetallesPPG(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_MostrarDetallesPPG", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
           String numeroPPG = (String)request.getParameter("numeroPPG");
            int codigoPPG = Integer.parseInt(numeroPPG);
            PPG ppg = (PPG)s.createQuery("from PPG where numeroppg = :temporal").setInteger("temporal", codigoPPG).uniqueResult();
            List<Estudiante> estudiantes = new ArrayList();
            List<String> carnets = (List<String>)s.createSQLQuery("select carnetestudiante from EstRealizaProy where codigoproy='"+numeroPPG+"';").list();
            
            while(!carnets.isEmpty()){
                estudiantes.add((Estudiante)s.createQuery("from Estudiante where carnetE = :temporal").setString("temporal", carnets.get(0)).uniqueResult());
                carnets.remove(0);
            }
            /* Pasamos a la vista los atributos del estudiante */
            request.setAttribute("PPG",ppg);      
            request.setAttribute("Estudiante",estudiantes);
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