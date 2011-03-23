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
public class AccionesC_Gestionar_Pasantias_Estudiante extends CohesionAction {
    
/**
     * Called by Struts for the execution of action A_Prep_Gestion_Pasantias_Estudiante.
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
    public ActionForward A_Prep_Gestion_Pasantias_Estudiante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Gestion_Pasantias_Est", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            //micodigo

            Estudiante e = (Estudiante) request.getSession().getAttribute("Estudiante");

            List<EstudianteRealizaProyecto> proyectos = s.createQuery("from EstudianteRealizaProyecto where estudiante= :var").setLong("var", e.getId()).list();

            // Debe haber una manera de crear esta lista sin hacer una consulta inecesaria!
            List<Pasantia> pasantias = s.createQuery("from Pasantia").list();
            pasantias.clear();

            if (!proyectos.isEmpty()) {

                EstudianteRealizaProyecto proy = new EstudianteRealizaProyecto  ();
                Iterator it = proyectos.iterator();

                while(it.hasNext()){
                    proy = (EstudianteRealizaProyecto) it.next();

                    Pasantia pasantia = (Pasantia) s.createQuery("from Pasantia where proyecto= :var").setLong("var", proy.getId()).uniqueResult();

                    if (!pasantia.equals(null)) {
                        pasantias.add(pasantia);
                    }
                }
                request.getSession().setAttribute("Pasantias", pasantias);

            }

            //micodigo

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