package jc2s.sistppg;

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
public class AccionesC_Perfil_Estudiante extends CohesionAction {
    
/**
     * Called by Struts for the execution of action A_prep_crear_perfil_estudiante.
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
    public ActionForward A_prep_crear_perfil_estudiante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_perfil_est", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            //micodigo
            List<Carrera> c = s.createQuery("from Carrera").list();

            request.setAttribute("L_Carreras", c);
            //micodigo
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
            if (salida == 0) {
                new CohesionActor(CohesionActor.ACTOR_estudiante)
                        .setMe(request);
            }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_prep_crear_perfil_estudiante.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_guardar_perfil.
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
    public ActionForward A_guardar_perfil(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_perfil_est", "A_Prep_Inicio_Sesion_Est", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
//Checking for actors estudiante
            if (!CohesionActor.checkActor(request, 4)) {
                return mapping.findForward(CohesionActor.SALIDA_ACTOR);
            }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_Perfil_Estudiante fperfil = (F_Perfil_Estudiante)form;
            //mi codigo
            Usuario u = (Usuario) request.getSession().getAttribute("usuario");
            List<Estudiante> lu = s.createQuery("from Estudiante where usbid= :var").setString("var",u.getUsbid()).list();

            Estudiante e;
            if(lu.isEmpty()){
                e = new Estudiante();

                e.setUsbid(u.getUsbid());

                Boolean formOK = true;

                //verifico nombre
                if(formOK && !fperfil.getNombre().equals(""))
                    e.setNombre(fperfil.getNombre());
                else
                    formOK=false;
                //verifico apellido
                if(formOK && !fperfil.getApellido().equals(""))
                    e.setApellido(fperfil.getApellido());
                else
                    formOK=false;
                //verifico cedula
                if(formOK && !fperfil.getCedula().equals(""))
                    e.setCedula(Integer.parseInt(fperfil.getCedula()));
                else
                    formOK=false;

                //verifico email
                if(formOK && !fperfil.getEmail().equals(""))
                    e.setEmail(fperfil.getEmail());
                else
                    formOK=false;

                //verifico telefono
                if(formOK && !fperfil.getTelefono().equals(""))
                    e.setTelefono(fperfil.getTelefono());
                else
                    formOK=false;

                int idCarrera = Integer.parseInt(fperfil.getCarrera());
                Carrera c = (Carrera) s.createQuery("from Carrera where idCarrera = :var").setInteger("var",idCarrera).uniqueResult();
                if(c!=null)
                    e.setCarrera(c);

                if(formOK){
    //                e.setUsbid(u.getUsbid());
                    s.save(e);
                    request.getSession().setAttribute("Estudiante", e);
                    salida=SALIDA_1;
                }
            }else{
                e = lu.get(0);

                e.setUsbid(u.getUsbid());

                //verifico nombre
                if(!fperfil.getNombre().equals(""))
                    e.setNombre(fperfil.getNombre());

                //verifico apellido
                if(!fperfil.getApellido().equals(""))
                    e.setApellido(fperfil.getApellido());

                //verifico cedula
                if(!fperfil.getCedula().equals(""))
                    e.setCedula(Integer.parseInt(fperfil.getCedula()));

                //verifico email
                if(!fperfil.getEmail().equals(""))
                    e.setEmail(fperfil.getEmail());

                //verifico telefono
                if(!fperfil.getTelefono().equals(""))
                    e.setTelefono(fperfil.getTelefono());

                int idCarrera = Integer.parseInt(fperfil.getCarrera());
                Carrera c = (Carrera) s.createQuery("from Carrera where idCarrera = :var").setInteger("var",idCarrera).uniqueResult();
                e.setCarrera(c);
                s.save(e);
                request.getSession().setAttribute("Estudiante", e);
                salida=SALIDA_1;
            }


            //mi codigo
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_guardar_perfil.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_prep_modif_perfil_estudiante.
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
    public ActionForward A_prep_modif_perfil_estudiante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_perfil_est", };
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
            List<Carrera> c = s.createQuery("from Carrera").list();

            request.setAttribute("L_Carreras", c);
            //micodigo
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_prep_modif_perfil_estudiante.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}