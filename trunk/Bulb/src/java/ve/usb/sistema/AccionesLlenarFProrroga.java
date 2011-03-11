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

import java.util.List;

/**
 *
 */
public class AccionesLlenarFProrroga extends CohesionAction {

/**
     * Called by Struts for the execution of action A_Pre_LlenarFInscripcion.
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
    public ActionForward A_Pre_LlenarFProrroga(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_LlenarFProrroga", "A_Pre_GestionarProrroga", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
 /*aqui empieza*/
            PreInsPasantias pasantias = (PreInsPasantias)s.createQuery("from PreInsPasantias where estudiante = :login").setString("login", (String)request.getSession().getAttribute("login")).uniqueResult();
            EstRealizaProy estudiante = (EstRealizaProy)s.createQuery("from EstRealizaProy where tipoproy='1' and carnetestudiante= :login").setString("login", (String)request.getSession().getAttribute("login")).uniqueResult();
            if(estudiante!=null){
                salida = SALIDA_1;

            }

            /* aqui termino */
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_Pre_LlenarFProrroga.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_LlenarFIncripcion.
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
    public ActionForward A_LlenarFProrroga(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"A_Pre_GestionarProrroga", "A_Pre_LlenarFProrroga", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_Prorroga fF_Prorroga = (F_Prorroga)form;
/* a echar codigo */


            String  carnet = (String)request.getSession().getAttribute("login");

            String coordinacion = fF_Prorroga.getCoordinacion();
            String nombre = fF_Prorroga.getNombre();
            String codigoTutorAcademico = fF_Prorroga.getCodigoTutorAcademico();
            String tituloPasantia = fF_Prorroga.getTituloPasantia();
            String areaProyecto = fF_Prorroga.getAreaProyecto();
            String fecha = fF_Prorroga.getFecha();
            String justificacion = fF_Prorroga.getJustificacion();



            if(!((coordinacion.equals("")|| nombre.equals("") || codigoTutorAcademico.equals("")
                 || tituloPasantia.equals("")|| areaProyecto.equals("") || fecha.equals("")
                 || justificacion.equals("") ))){



            Prorroga prorroga = new Prorroga();

            prorroga.setIdc(carnet);
            prorroga.setCoordinacion(coordinacion);
            prorroga.setAreaProyecto(areaProyecto);
            prorroga.setNombre(nombre);
            prorroga.setCodigoTutorAcademico(codigoTutorAcademico);
            prorroga.setTituloPasantia(tituloPasantia);

            prorroga.setFecha(fecha);
            prorroga.setJustificacion(justificacion);

            s.save(prorroga);
            }
            else {salida=1;}
            /* aqui termina */
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_LlenarFProrroga.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_LlenarFProrroga.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}