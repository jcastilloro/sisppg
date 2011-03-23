package jc2s.sistppg;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
public class AccionesC_Gestionar_proyectos_Estudiante extends CohesionAction {

/**
     * Called by Struts for the execution of action A_Prep_Gestion_Proy_Est.
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
    public ActionForward A_Prep_Gestion_Proy_Est(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Gestion_Proy_Est", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors estudiante
            if (!CohesionActor.checkActor(request, 4)) {
                return mapping.findForward(CohesionActor.SALIDA_ACTOR);
            }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            //micodigo

            Estudiante e = (Estudiante) request.getSession().getAttribute("Estudiante");

            List<EstudianteRealizaProyecto> proyectos = s.createQuery("from EstudianteRealizaProyecto where estudiante= :var").setLong("var", e.getId()).list();

            request.getSession().setAttribute("EstudianteRealizaProyecto", proyectos);
            if (!proyectos.isEmpty()) {

                // cambiar por un for para hacerlo por cada proyecto
                Proyecto proy = proyectos.get(0).getProyecto();
                List<ProyectoDeGrado> pg = s.createQuery("from ProyectoDeGrado where proyecto= :var").setLong("var", proy.getId_proyecto()).list();

                if (!pg.isEmpty()) { // Es proyecto de grado
                    request.getSession().setAttribute("ProyectoDeGrado", pg);
                } else { // Puede ser pasantia
                    // si no es proyecto de grado DEBE ser ajuro pasantía, si no es un ERROR!
                    List<Pasantia> pasantia = s.createQuery("from Pasantia where proyecto= :var").setLong("var", proy.getId_proyecto()).list();
                }
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