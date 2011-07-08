package jc2s.sistppg;

import java.util.regex.*;
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
public class AccionesC_Inicio_Sesion_T_industrial extends CohesionAction {

    /**
     * Called by Struts for the execution of action A_prep_inicio_sesion_t_industrial.
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
    public ActionForward A_prep_inicio_sesion_t_industrial(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_inicio_sesion_t_industrial",};
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
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
     * Called by Struts for the execution of action A_inicio_sesion_t_industrial.
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
    public ActionForward A_inicio_sesion_t_industrial(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_sesion_tutor_i", "V_inicio_sesion_t_industrial",};
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_1;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_Inicio_Sesion_externo fF_Inicio_Sesion_externo = (F_Inicio_Sesion_externo) form;

            List<TutorIndustrial> le = s.createQuery("from TutorIndustrial where login = :login").setString("login", fF_Inicio_Sesion_externo.getLogin()).list();

            if (!le.isEmpty()) {
                TutorIndustrial e = le.get(0);
                if (e.getPassword().equals(fF_Inicio_Sesion_externo.getPassword())) {
                    request.getSession().setAttribute("tutorindustrial", e);
                    salida = SALIDA_0;
                    fF_Inicio_Sesion_externo.reset(mapping, request);
                }
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
        if (salida == 0) {
            new CohesionActor(CohesionActor.ACTOR_tutor_industrial).setMe(request);
        }
        if (salida == 0) {
            request.setAttribute("msg",
                    getResources(request).getMessage("A_inicio_sesion_t_industrial.msg0"));
        }
        if (salida == 1) {
            request.setAttribute("msg",
                    getResources(request).getMessage("A_inicio_sesion_t_industrial.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

    /**
     * Called by Struts for the execution of action A_modificar_perfil.
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
    public ActionForward A_modificar_perfil(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_modificar_perfil_TI",};
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors tutor_industrial
        if (!CohesionActor.checkActor(request, 16)) {
            return mapping.findForward(CohesionActor.SALIDA_ACTOR);
        }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {


            TutorIndustrial ti = (TutorIndustrial) request.getSession().getAttribute("tutorindustrial");
            List<Empresa> em = s.createQuery("from Empresa").list();

//            TutorIndustrial p = (TutorIndustrial) s.createQuery("from TutorIndustrial where login = :var").setString("var", p.getUsbid()).uniqueResult();


            request.setAttribute("Datos", ti);
            request.setAttribute("L_Empresas", em);
            Empresa singular = (Empresa) s.createQuery("from Empresa where idEmpresa= :var").setLong("var", ti.getEmpresa().getIdEmpresa()).uniqueResult();


            request.setAttribute("empresa", singular);
            request.setAttribute("tutorindustrial", ti);
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
                    getResources(request).getMessage("A_modificar_perfil.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

    /**
     * Called by Struts for the execution of action A_actualizar_perfil_TI.
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
    public ActionForward A_actualizar_perfil_TI(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_modificar_perfil_TI", "V_sesion_tutor_i",};
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_1;
//Checking for actors tutor_industrial
        if (!CohesionActor.checkActor(request, 16)) {
            return mapping.findForward(CohesionActor.SALIDA_ACTOR);
        }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_Tutor_Industrial fF_Tutor_Industrial = (F_Tutor_Industrial) form;

            //Mi Codigo



            if (salida == SALIDA_1) {

                TutorIndustrial ti = (TutorIndustrial) request.getSession().getAttribute("tutorindustrial");



//               List<TutorIndustrial> lp = s.createQuery("from TutorIndustrial where login= :var").setString("var", login).list();
//               TutorIndustrial tt = lp.get(0);
                ti.setCedula(new String(fF_Tutor_Industrial.getCedula().getBytes("ISO-8859-1"), "UTF-8"));
                ti.setEmail(new String(fF_Tutor_Industrial.getEmail().getBytes("ISO-8859-1"), "UTF-8"));
                ti.setNombre(new String(fF_Tutor_Industrial.getNombre().getBytes("ISO-8859-1"), "UTF-8"));
                ti.setTelefono(new String(fF_Tutor_Industrial.getTelefono().getBytes("ISO-8859-1"), "UTF-8"));
                ti.setProfesion(new String(fF_Tutor_Industrial.getProfesion().getBytes("ISO-8859-1"), "UTF-8"));
                ti.setDireccion(new String(fF_Tutor_Industrial.getDireccion().getBytes("ISO-8859-1"), "UTF-8"));
                ti.setDepartamento(new String(fF_Tutor_Industrial.getDepartamento().getBytes("ISO-8859-1"), "UTF-8"));
                ti.setCargo(new String(fF_Tutor_Industrial.getCargo().getBytes("ISO-8859-1"), "UTF-8"));
                ti.setPassword(new String(fF_Tutor_Industrial.getPassword().getBytes("ISO-8859-1"), "UTF-8"));

                //ti.setIdTutorIndustrial(((TutorIndustrial) request.getSession().getAttribute("tutorindustrial")).getIdTutorIndustrial());

                s.update(ti);
                request.getSession().setAttribute("tutorindustrial", ti);
                request.setAttribute("tutorindustrial", ti);
                fF_Tutor_Industrial.reset(mapping, request);
            } else {
                TutorIndustrial ti = (TutorIndustrial) request.getSession().getAttribute("tutorindustrial");
                List<Empresa> em = s.createQuery("from Empresa").list();

//            TutorIndustrial p = (TutorIndustrial) s.createQuery("from TutorIndustrial where login = :var").setString("var", p.getUsbid()).uniqueResult();


                request.setAttribute("Datos", ti);
                request.setAttribute("L_Empresas", em);
            }


            //Mi Codigo

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

        if (salida == 1) {
            request.setAttribute("msg",
                    getResources(request).getMessage("A_actualizar_perfil_TI.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

    /**
     * Called by Struts for the execution of action A_prep_gestionar_pasatias_TI.
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
    public ActionForward A_prep_gestionar_pasatias_TI(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_gestionar_pasantias_TI",};
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        //Checking for actors tutor_industrial
        if (!CohesionActor.checkActor(request, 16)) {
            return mapping.findForward(CohesionActor.SALIDA_ACTOR);
        }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            // Mi codigo
            TutorIndustrial tutor = (TutorIndustrial) request.getSession().getAttribute("tutorindustrial");
            List<Pasantia> pasantias = s.createQuery("from Pasantia where tutor_industrial = :var))").setLong("var", tutor.getId()).list();
            request.setAttribute("Pasantias", pasantias);

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

    // EVALUAR PASANTIA TI
    public ActionForward A_evaluar_pasatias_TI(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_evaluar_pasantias_TI",};
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        //Checking for actors tutor_industrial
        if (!CohesionActor.checkActor(request, 16)) {
            return mapping.findForward(CohesionActor.SALIDA_ACTOR);
        }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            // Mi codigo
            TutorIndustrial tutor = (TutorIndustrial) request.getSession().getAttribute("tutorindustrial");
            List<Pasantia> pasantias = s.createQuery("from Pasantia where tutor_industrial = :var))").setLong("var", tutor.getId()).list();
            request.setAttribute("Pasantias", pasantias);

            String pas = request.getParameter("idPasantia");


            long idPas = 57;
            if (pas != null) {
                idPas = Long.valueOf(pas).longValue();
                System.out.println("__________============================================" + idPas);
            }
            Pasantia pasantia = (Pasantia) s.createQuery("from Pasantia where idpasantia= :var").setLong("var", idPas).uniqueResult();
            request.setAttribute("Pasantia", pasantia);

            F_EvaluacionTI eval = (F_EvaluacionTI) form;

            double nota = (eval.getUno() + eval.getDos() + eval.getTres() + eval.getCuatro()
                    + eval.getCinco() + eval.getSeis() + eval.getSiete() + eval.getOcho()
                    + eval.getNueve() + eval.getDiez()) / 10.0;

            if (nota > 0.11) {
                request.setAttribute("Ya_Evaluo", nota);
                pasantia = (Pasantia) s.createQuery("from Pasantia where idpasantia= :var").setLong("var", Long.parseLong(eval.getId())).uniqueResult();
                pasantia.setObservaciones_tutor_industrial(eval.getObservaciones());
                pasantia.setEvaluacion_tutor_industrial(String.valueOf(nota));
                s.update(pasantia);
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
}
