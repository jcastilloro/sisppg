package jc2s.sistppg;

import java.util.List;
import java.util.regex.Pattern;
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
public class AccionesC_Sesion_Administrador extends CohesionAction {

    /**
     * Called by Struts for the execution of action A_Prep_Inicio_Sesion_Est.
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
    public ActionForward A_Inicio_Sesion_Adm(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Sesion_Administrador",};
        final int SALIDA_0 = 0;


        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            //mi codigo
            request.getSession().removeAttribute("Singular");
            request.getSession().removeAttribute("Agregar");
            //mi codigo
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
            new CohesionActor(CohesionActor.ACTOR_estudiante).setMe(request);
        }
        if (salida == 0) {
            request.setAttribute("msg",
                    getResources(request).getMessage("A_Inicio_Sesion_Adm.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }











    //----------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------













    public ActionForward A_Prep_Inicio_Sesion_Adm(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_inicio_sesion_administrador",};
        final int SALIDA_0 = 0;


        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            //mi codigo
            //mi codigo
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
            new CohesionActor(CohesionActor.ACTOR_estudiante).setMe(request);
        }
        if (salida == 0) {
            request.setAttribute("msg",
                    getResources(request).getMessage("A_Prep_Inicio_Sesion_Adm.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }










    //----------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------













    public ActionForward A_Prep_Gestionar_Carreras(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Gestionar_Carreras",};                                   //CAMBIAR JSP
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors estudiante
        if (!CohesionActor.checkActor(request, 4)) {
            return mapping.findForward(CohesionActor.SALIDA_ACTOR);
        }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {


        //MI VAINA
            request.getSession().removeAttribute("Singular");
            request.getSession().removeAttribute("Datos");
            request.getSession().removeAttribute("Agregar");
            String parametro = request.getParameter("Agregar");
            if (parametro != null) {
                request.getSession().setAttribute("Agregar", parametro);
            }
            String parameter = request.getParameter("idCarrera");                                   //CAMBIAR CLAVE Y VAINAS DE LA BD
            if (parameter != null) {                                                                //AQUI ABAJO
                Carrera singular = (Carrera) s.createQuery("from Carrera where idCarrera= :var").setLong("var", Long.parseLong(request.getParameter("idCarrera"))).uniqueResult();
                request.getSession().setAttribute("Singular", singular);
            }
            List<Carrera> dato = s.createQuery("from Carrera ").list();                             //CAMBIAR LA TABLA

            if (!dato.isEmpty()) {
                request.getSession().setAttribute("Datos", dato);
            } else {
                request.setAttribute("msg",
                        getResources(request).getMessage("A_Prep_Inicio_Sesion_Adm.msg0"));
            }


            //YA NO ES MI VAINA
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












    //----------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------









    public ActionForward A_insertar_carrera(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Gestionar_Carreras",};
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//        if (!CohesionActor.checkActor(request, 8)) {
//            return mapping.findForward(CohesionActor.SALIDA_ACTOR);
//        }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {


            //MI VAINA
            F_Carrera fF_Carrera = (F_Carrera) form;                            //CAMBIAR CLASE


            request.getSession().removeAttribute("Agregar");
            // request.getSession().removeAttribute("Singular");

            request.getSession().removeAttribute("Datos");
            String parameter = request.getParameter("idCarrera");               //CAMBIAR CLAVE
            if (parameter != null && !parameter.equals("")) {                   //CAMBIAR VAINAS DE LAS TABLAS AQUI ABAJO
                Carrera singular = (Carrera) s.createQuery("from Carrera where idCarrera= :var").setLong("var", Long.parseLong(request.getParameter("idCarrera"))).uniqueResult();
                request.getSession().setAttribute("Singular", singular);
            }







            Carrera p;
            boolean guarda = true;
            if (!fF_Carrera.getIdCarrera().equals("")) {                                        //CAMBIAR CLASES
                p = (Carrera) request.getSession().getAttribute("Singular");
                guarda = false;
            } else {
                p = new Carrera();
            }


//            p.setIdCarrera(Long.parseLong(fF_Carrera.getIdCarrera()));



            //verifico nombre
            if (Pattern.matches(".+", fF_Carrera.getNombre())) {
                p.setNombre(fF_Carrera.getNombre());
            } else {
                request.setAttribute("msg", "Por Favor Inserte un Nombre Válido");
                return mapping.findForward(SALIDAS[salida]);
            }
            //verifico mail
            if (Pattern.matches("(\\w|-|\\.)+@(\\w|-|\\.)+\\.(\\w|-|\\.)+", fF_Carrera.getEmail())) {
                p.setEmail(fF_Carrera.getEmail());
            } else {
                request.setAttribute("msg", "Por Favor Inserte un Apellido Válido");
                return mapping.findForward(SALIDAS[salida]);
            }
            request.setAttribute("msg", "Modificación Exitosa");
            request.getSession().removeAttribute("Singular");
            if (guarda) {
                s.save(p);
            } else {
                s.update(p);
            }
            List<Carrera> dato = s.createQuery("from Carrera ").list();

            if (!dato.isEmpty()) {
                request.getSession().setAttribute("Datos", dato);
            } else {
                request.setAttribute("msg",
                        getResources(request).getMessage("A_Prep_Inicio_Sesion_Adm.msg0"));
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



        request.getSession().removeAttribute("Singular");
        request.setAttribute("msg", "Modificación Exitosa");
        return mapping.findForward(SALIDAS[salida]);
    }






    public ActionForward A_eliminar_carrera(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Gestionar_Carreras",};                                 //CAMBIAR PAGINA
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//        if (!CohesionActor.checkActor(request, 8)) {
//            return mapping.findForward(CohesionActor.SALIDA_ACTOR);
//        }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            request.getSession().removeAttribute("Agregar");
//            request.getSession().removeAttribute("Singular");
//            request.getSession().removeAttribute("Datos");
            Carrera p = (Carrera) request.getSession().getAttribute("Singular");                        //CAMBIAR CLASES
            request.getSession().removeAttribute("Singular");

            
            //List<Carrera> dato = s.createQuery("from Carrera ").list();
//            List<Carrera> dato = (List<Carrera>) request.getSession().getAttribute("Datos");
//            dato.remove(p);
//
//            if (!dato.isEmpty()) {
//                request.getSession().setAttribute("Datos", dato);
//            } else {
//                request.getSession().removeAttribute("Datos");
//                request.setAttribute("msg",
//                        getResources(request).getMessage("A_Prep_Inicio_Sesion_Adm.msg0"));
//            }




            s.delete(p);

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


        request.setAttribute("msg", "Se elimino con éxito el registro");
        return mapping.findForward(SALIDAS[salida]);
    }


























    //-------------------------------------------------------------------------------------

    //-------------------------------------------------------------------------------------

    //-------------------------------------------------------------------------------------

    //-------------------------------------------------------------------------------------

    //-------------------------------------------------------------------------------------

    //-------------------------------------------------------------------------------------

    //-------------------------------------------------------------------------------------
















    

public ActionForward A_Prep_Gestionar_Areas(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Gestionar_Areas",};                                   //CAMBIAR JSP
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors estudiante
        if (!CohesionActor.checkActor(request, 4)) {
            return mapping.findForward(CohesionActor.SALIDA_ACTOR);
        }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {


        //MI VAINA
            request.getSession().removeAttribute("Singular");
            request.getSession().removeAttribute("Datos");
            request.getSession().removeAttribute("Agregar");
            String parametro = request.getParameter("Agregar");
            if (parametro != null) {
                request.getSession().setAttribute("Agregar", parametro);
            }
            String parameter = request.getParameter("idArea");                                   //CAMBIAR CLAVE Y VAINAS DE LA BD
            if (parameter != null) {                                                                //AQUI ABAJO
                Area singular = (Area) s.createQuery("from Area where idArea= :var").setLong("var", Long.parseLong(request.getParameter("idArea"))).uniqueResult();
                request.getSession().setAttribute("Singular", singular);
            }
            List<Area> dato = s.createQuery("from Area ").list();                             //CAMBIAR LA TABLA

            if (!dato.isEmpty()) {
                request.getSession().setAttribute("Datos", dato);
            } else {
                request.setAttribute("msg",
                        getResources(request).getMessage("A_Prep_Inicio_Sesion_Adm.msg0"));
            }


            //YA NO ES MI VAINA
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












    //----------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------









    public ActionForward A_insertar_area(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Gestionar_Areas",};
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//        if (!CohesionActor.checkActor(request, 8)) {
//            return mapping.findForward(CohesionActor.SALIDA_ACTOR);
//        }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {


            //MI VAINA
            F_Area2 fF_Area2 = (F_Area2) form;                            //CAMBIAR CLASE


            request.getSession().removeAttribute("Agregar");
            // request.getSession().removeAttribute("Singular");

            request.getSession().removeAttribute("Datos");
            String parameter = request.getParameter("idArea");               //CAMBIAR CLAVE
            if (parameter != null && !parameter.equals("")) {                   //CAMBIAR VAINAS DE LAS TABLAS AQUI ABAJO
                Area singular = (Area) s.createQuery("from Area where idArea= :var").setLong("var", Long.parseLong(request.getParameter("idArea"))).uniqueResult();
                request.getSession().setAttribute("Singular", singular);
            }







            Area p;
            boolean guarda = true;
            if (!fF_Area2.getIdArea().equals("")) {                                        //CAMBIAR CLASES
                p = (Area) request.getSession().getAttribute("Singular");
                guarda = false;
            } else {
                p = new Area();
            }


//            p.setIdArea(Long.parseLong(fF_Area2.getIdArea()));



            //verifico nombre
            if (Pattern.matches(".+", fF_Area2.getArea())) {
                p.setNombre(fF_Area2.getArea());
            } else {
                request.setAttribute("msg", "Por Favor Inserte un Nombre Válido");
                return mapping.findForward(SALIDAS[salida]);
            }
           
            request.setAttribute("msg", "Modificación Exitosa");
            request.getSession().removeAttribute("Singular");
            if (guarda) {
                s.save(p);
            } else {
                s.update(p);
            }
            List<Area> dato = s.createQuery("from Area ").list();

            if (!dato.isEmpty()) {
                request.getSession().setAttribute("Datos", dato);
            } else {
                request.setAttribute("msg",
                        getResources(request).getMessage("A_Prep_Inicio_Sesion_Adm.msg0"));
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



        request.getSession().removeAttribute("Singular");
        request.setAttribute("msg", "Modificación Exitosa");
        return mapping.findForward(SALIDAS[salida]);
    }






    public ActionForward A_eliminar_area(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Gestionar_Areas",};                                 //CAMBIAR PAGINA
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//        if (!CohesionActor.checkActor(request, 8)) {
//            return mapping.findForward(CohesionActor.SALIDA_ACTOR);
//        }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            request.getSession().removeAttribute("Agregar");
//            request.getSession().removeAttribute("Singular");
//            request.getSession().removeAttribute("Datos");
            Area p = (Area) request.getSession().getAttribute("Singular");                        //CAMBIAR CLASES
            request.getSession().removeAttribute("Singular");


            //List<Area> dato = s.createQuery("from Area ").list();
//            List<Area> dato = (List<Area>) request.getSession().getAttribute("Datos");
//            dato.remove(p);
//
//            if (!dato.isEmpty()) {
//                request.getSession().setAttribute("Datos", dato);
//            } else {
//                request.getSession().removeAttribute("Datos");
//                request.setAttribute("msg",
//                        getResources(request).getMessage("A_Prep_Inicio_Sesion_Adm.msg0"));
//            }




            s.delete(p);

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


        request.setAttribute("msg", "Se elimino con éxito el registro");
        return mapping.findForward(SALIDAS[salida]);
    }


































    //-------------------------------------------------------------------------------------

    //-------------------------------------------------------------------------------------

    //-------------------------------------------------------------------------------------

    //-------------------------------------------------------------------------------------

    //-------------------------------------------------------------------------------------

    //-------------------------------------------------------------------------------------

    //-------------------------------------------------------------------------------------


















public ActionForward A_Prep_Gestionar_Estatus_Pasantias(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Gestionar_Estatus_Pasantias",};                                   //CAMBIAR JSP
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors estudiante
        if (!CohesionActor.checkActor(request, 4)) {
            return mapping.findForward(CohesionActor.SALIDA_ACTOR);
        }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {


        //MI VAINA
            request.getSession().removeAttribute("Singular");
            request.getSession().removeAttribute("Datos");
            request.getSession().removeAttribute("Agregar");
            String parametro = request.getParameter("Agregar");
            if (parametro != null) {
                request.getSession().setAttribute("Agregar", parametro);
            }
            String parameter = request.getParameter("idEstatus_Pasantia");                                   //CAMBIAR CLAVE Y VAINAS DE LA BD
            if (parameter != null) {                                                                //AQUI ABAJO
                EstatusPasantia singular = (EstatusPasantia) s.createQuery("from EstatusPasantia where idEstatusPasantia= :var").setLong("var", Long.parseLong(request.getParameter("idEstatus_Pasantia"))).uniqueResult();
                request.getSession().setAttribute("Singular", singular);
            }
            List<EstatusPasantia> dato = s.createQuery("from EstatusPasantia ").list();                             //CAMBIAR LA TABLA

            if (!dato.isEmpty()) {
                request.getSession().setAttribute("Datos", dato);
            } else {
                request.setAttribute("msg",
                        getResources(request).getMessage("A_Prep_Inicio_Sesion_Adm.msg0"));
            }


            //YA NO ES MI VAINA
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












    //----------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------









    public ActionForward A_insertar_estatus_pasantia(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Gestionar_Estatus_Pasantias",};
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//        if (!CohesionActor.checkActor(request, 8)) {
//            return mapping.findForward(CohesionActor.SALIDA_ACTOR);
//        }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {


            //MI VAINA
            F_Estatus_Pasantia fF_EstatusPasantia = (F_Estatus_Pasantia) form;                            //CAMBIAR CLASE


            request.getSession().removeAttribute("Agregar");
            // request.getSession().removeAttribute("Singular");

            request.getSession().removeAttribute("Datos");
            String parameter = request.getParameter("idEstatus_Pasantia");               //CAMBIAR CLAVE
            if (parameter != null && !parameter.equals("")) {                   //CAMBIAR VAINAS DE LAS TABLAS AQUI ABAJO
                EstatusPasantia singular = (EstatusPasantia) s.createQuery("from EstatusPasantia where idEstatusPasantia= :var").setLong("var", Long.parseLong(request.getParameter("idEstatus_Pasantia"))).uniqueResult();
                request.getSession().setAttribute("Singular", singular);
            }







            EstatusPasantia p;
            boolean guarda = true;
            if (!fF_EstatusPasantia.getIdEstatusPasantia().equals("")) {                                        //CAMBIAR CLASES
                p = (EstatusPasantia) request.getSession().getAttribute("Singular");
                guarda = false;
            } else {
                p = new EstatusPasantia();
            }


//            p.setIdEstatus_Pasantia(Long.parseLong(fF_Estatus_Pasantia.getIdEstatus_Pasantia()));



            //verifico estatus
            if (Pattern.matches(".+", fF_EstatusPasantia.getEstatus())) {
                p.setEstatus(fF_EstatusPasantia.getEstatus());
            } else {
                request.setAttribute("msg", "Por Favor Inserte un estatus Válido"+"LOOOOOOCOOOOOOOOO"+fF_EstatusPasantia.getEstatus());
                return mapping.findForward(SALIDAS[salida]);
            }

            request.setAttribute("msg", "Modificación Exitosa");
            request.getSession().removeAttribute("Singular");
            if (guarda) {
                s.save(p);
            } else {
                s.update(p);
            }
            List<EstatusPasantia> dato = s.createQuery("from EstatusPasantia ").list();

            if (!dato.isEmpty()) {
                request.getSession().setAttribute("Datos", dato);
            } else {
                request.setAttribute("msg",
                        getResources(request).getMessage("A_Prep_Inicio_Sesion_Adm.msg0"));
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



        request.getSession().removeAttribute("Singular");
        request.setAttribute("msg", "Modificación Exitosa");
        return mapping.findForward(SALIDAS[salida]);
    }






    public ActionForward A_eliminar_estatus_pasantia(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Gestionar_Estatus_Pasantias",};                                 //CAMBIAR PAGINA
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//        if (!CohesionActor.checkActor(request, 8)) {
//            return mapping.findForward(CohesionActor.SALIDA_ACTOR);
//        }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            request.getSession().removeAttribute("Agregar");
//            request.getSession().removeAttribute("Singular");
//            request.getSession().removeAttribute("Datos");
            EstatusPasantia p = (EstatusPasantia) request.getSession().getAttribute("Singular");                        //CAMBIAR CLASES
            request.getSession().removeAttribute("Singular");


            //List<Estatus_Pasantia> dato = s.createQuery("from EstatusPasantia ").list();
//            List<Estatus_Pasantia> dato = (List<Estatus_Pasantia>) request.getSession().getAttribute("Datos");
//            dato.remove(p);
//
//            if (!dato.isEmpty()) {
//                request.getSession().setAttribute("Datos", dato);
//            } else {
//                request.getSession().removeAttribute("Datos");
//                request.setAttribute("msg",
//                        getResources(request).getMessage("A_Prep_Inicio_Sesion_Adm.msg0"));
//            }




            s.delete(p);

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


        request.setAttribute("msg", "Se elimino con éxito el registro");
        return mapping.findForward(SALIDAS[salida]);
    }







}
