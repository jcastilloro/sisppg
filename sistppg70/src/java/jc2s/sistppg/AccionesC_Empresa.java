package jc2s.sistppg;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.regex.*;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

import ve.usb.cohesion.runtime.CohesionAction;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ve.usb.cohesion.runtime.HibernateUtil;
import jc2s.sistppg.hibernate.*;

/**
 *
 */
public class AccionesC_Empresa extends CohesionAction {

    /**
     * Called by Struts for the execution of action A_Prep_Inicio_Sesion_Empresa.
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
    public ActionForward A_Prep_Inicio_Sesion_Empresa(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Inicio_Sesion_Empresa",};
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
        if (salida == 0) {
            request.setAttribute("msg",
                    getResources(request).getMessage("A_Prep_Inicio_Sesion_Empresa.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

    /**
     * Called by Struts for the execution of action A_Prep_Registro_Empresa.
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
    public ActionForward A_Prep_Registro_Empresa(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Registro_Empresa",};
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            //mi codigo


            //paso la lista de ciudades
            List<Ciudad> L_Ciudades = s.createQuery("from Ciudad").list();
            request.setAttribute("L_Ciudades", L_Ciudades);

            List<Pais> L_Paises = s.createQuery("from Pais").list();
            request.setAttribute("L_Paises", L_Paises);
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
            request.setAttribute("msg",
                    getResources(request).getMessage("A_Prep_Registro_Empresa.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

    /**
     * Called by Struts for the execution of action A_Registrar_Empresa.
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
    public ActionForward A_Registrar_Empresa(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Inicio_Sesion_Empresa", "V_Registro_Empresa",};
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_Registro_Empresa fempresa = (F_Registro_Empresa) form;

            //mi codigo

            //verifico si el usuario existe
            String login = fempresa.getLogin();
            if (!(s.createQuery("from Empresa where login = :var").setString("var", login).list().isEmpty())) {
                salida = SALIDA_1;
                request.setAttribute("msg", "Disculpe el Login ya Existe");
            }
            if (salida == 0) {
                Empresa e = new Empresa();
                Ciudad c = (Ciudad) s.createQuery("from Ciudad where idCiudad = :var").setInteger("var", Integer.parseInt(fempresa.getCiudad())).list().get(0);
                Pais pa = (Pais) s.createQuery("from Pais where idPais = :var").setInteger("var", Integer.parseInt(fempresa.getPais())).list().get(0);

                e.setCiudad(c);
                e.setDireccion(new String(fempresa.getDireccion().getBytes("ISO-8859-1"),"UTF-8"));
                e.setEmail(fempresa.getLogin());
                e.setLogin(new String(fempresa.getLogin().getBytes("ISO-8859-1"),"UTF-8"));
                e.setNombre(new String(fempresa.getNombre().getBytes("ISO-8859-1"),"UTF-8"));
                e.setPassword(fempresa.getPassword());
                e.setRif(fempresa.getRif());
                e.setTelefono(fempresa.getTelefono());
                s.save(e);

                fempresa.reset(mapping, request);

            } else {
                List<Ciudad> L_Ciudades = s.createQuery("from Ciudad").list();
                request.setAttribute("L_Ciudades", L_Ciudades);

                 List<Pais> L_Paises = s.createQuery("from Pais").list();
            request.setAttribute("L_Paises", L_Paises);
            }
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
            request.setAttribute("msg",
                    getResources(request).getMessage("A_Registrar_Empresa.msg0"));
        }
//        if (salida == 1) {
//            request.setAttribute("msg",
//                    getResources(request).getMessage("A_Registrar_Empresa.msg1"));
//
//        }

        return mapping.findForward(SALIDAS[salida]);
    }

    /**
     * Called by Struts for the execution of action A_Inicio_Sesion_Empresa.
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
    public ActionForward A_Inicio_Sesion_Empresa(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Inicio_Sesion_Empresa", "V_Sesion_Empresa",};
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_Inicio_Sesion_externo fempresa = (F_Inicio_Sesion_externo) form;

            //mi codigo

            List<Empresa> le = s.createQuery("from Empresa where login = :login").setString("login", fempresa.getLogin()).list();

            if (!le.isEmpty()) {
                Empresa e = le.get(0);
                if (e.getPassword().equals(fempresa.getPassword())) {
                    request.getSession().setAttribute("empresa", e);
//                    request.setAttribute("tutores", s.createQuery("from TutorIndustrial where empresa = :var").setLong("var", e.getId()).uniqueResult());
                    salida = SALIDA_1;
                    fempresa.reset(mapping, request);
                    request.setAttribute("L_Tutores", s.createQuery("from TutorIndustrial where empresa = :var").setLong("var", e.getId()).list());
                }
            }

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
            request.setAttribute("msg",
                    getResources(request).getMessage("A_Inicio_Sesion_Empresa.msg0"));
        }
        if (salida == 1) {
            request.setAttribute("msg",
                    getResources(request).getMessage("A_Inicio_Sesion_Empresa.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

    /**
     * Called by Struts for the execution of action A_prep_agregar_tutor_I.
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
    public ActionForward A_prep_agregar_tutor_I(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Agregar_Tutor_I",};
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
        if (salida == 0) {
            request.setAttribute("msg",
                    getResources(request).getMessage("A_prep_agregar_tutor_I.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

    /**
     * Called by Struts for the execution of action A_Agregar_Tutor_Ind.
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
    public ActionForward A_Agregar_Tutor_Ind(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Agregar_Tutor_I", "V_Sesion_Empresa",};
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_1;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_Tutor_Industrial findustrial = (F_Tutor_Industrial) form;

            //mi codigo
            


            if (salida == SALIDA_1) {

                TutorIndustrial ti = new TutorIndustrial();
                ti.setCedula(new String(findustrial.getCedula().getBytes("ISO-8859-1"),"UTF-8"));
                ti.setEmail(new String(findustrial.getEmail().getBytes("ISO-8859-1"),"UTF-8"));
                ti.setEmpresa((Empresa) request.getSession().getAttribute("empresa"));
                ti.setNombre(new String(findustrial.getNombre().getBytes("ISO-8859-1"),"UTF-8"));
                ti.setTelefono(new String(findustrial.getTelefono().getBytes("ISO-8859-1"),"UTF-8"));
                ti.setProfesion(new String(findustrial.getProfesion().getBytes("ISO-8859-1"),"UTF-8"));
                ti.setDireccion(new String(findustrial.getDireccion().getBytes("ISO-8859-1"),"UTF-8"));
                ti.setDepartamento(new String(findustrial.getDepartamento().getBytes("ISO-8859-1"),"UTF-8"));
                ti.setCargo(new String(findustrial.getCargo().getBytes("ISO-8859-1"),"UTF-8"));
                ti.setLogin(new String(findustrial.getLogin().getBytes("ISO-8859-1"),"UTF-8"));
                ti.setPassword(new String(findustrial.getPassword().getBytes("ISO-8859-1"),"UTF-8"));

                s.save(ti);
                findustrial.reset(mapping, request);
                request.setAttribute("L_Tutores", s.createQuery("from TutorIndustrial where empresa = :var").setLong("var", ((Empresa) request.getSession().getAttribute("empresa")).getId()).list());
            }
            //mi codifo
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
//        if (salida == 0) {
//            request.setAttribute("msg",
//                    getResources(request).getMessage("A_Agregar_Tutor_Ind.msg0"));
//        }
        if (salida == 1) {
            request.setAttribute("msg",
                    getResources(request).getMessage("A_Agregar_Tutor_Ind.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }
}
