package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

import ve.usb.cohesion.runtime.CohesionAction;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ve.usb.cohesion.runtime.HibernateUtil;
import ve.usb.sistema.hibernate.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author chitty
 */
public class AccionesConsultarProfesores extends CohesionAction {

/**
     * Called by Struts for the execution of action A_ConsultarProfesores.
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
    public ActionForward A_ConsultarProfesores(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_ConsultarProfesores", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            /* Aqui empieza mi codigo */

            /* Lista de Areas */
            java.util.List<Area> list;
            list = (java.util.List<Area>)s.createQuery("from Area").list();
             request.setAttribute("L_Area", list);

             /* Lista de Profesores */
             java.util.List<ProfTutoreaProy> listPT;
             listPT = (java.util.List<ProfTutoreaProy>)s.createQuery("from ProfTutoreaProy where tipoproytutor = 0 ").list();
             java.util.List<Profesor> listP = new ArrayList();
             Profesor prof;
             while (!listPT.isEmpty()){
                prof = (Profesor)s.createQuery("from Profesor where codigoprofesor = :temporal").setString("temporal", (listPT.get(0)).getIdProfesor()).uniqueResult();
                if (!listP.contains(prof)){
                    listP.add(prof);
                }
                listPT.remove(0);
             }
             request.setAttribute("L_Profesor", listP);

             /* Obtenemos el año actual */
             java.util.Date fecha = new Date();
             int ano = fecha.getYear();
             request.setAttribute("anoactual", ano);


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

/**
     * Called by Struts for the execution of action A_BusquedaEstudiante.
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
    public ActionForward A_BusquedaEstudiante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_MostrarConsulta", "A_Pre_ConsultarProfesores", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
/*        try {
            F_ConsultarE fF_ConsultarProfesores = (F_ConsultarProfesores)form;
/* Aqui empieza mi codigo 
            /* Se extraen los elementos del formulario 
            String area = fF_ConsultarProfesores.getAreaPPG();
            String tutor = fF_ConsultarProfesores.getTutorPPG();
            String periodo = fF_ConsultarProfesores.getPeriodoPPG();
            int ano = fF_ConsultarProfesores.getAnoPPG();

            String consulta = "";
            if (!area.equals("") ) { consulta += "rp.codigo_Area = '"+area+"' "; }
            else { consulta += "rp.codigo_Area = rp.codigo_Area "; }



            if (!tutor.equals("")) { consulta += "and pp.idProfesor ='"+tutor+"' "; }
            else {consulta += "and pp.idProfesor = pp.idProfesor "; }



	    if (!periodo.equals("")) {
			consulta += "and (pg.trimestreUno ='"+periodo+"' or pg.trimestreDos ='"+periodo+"' or pg.trimestreTres ='"+periodo+"') ";
            }
	    else { consulta += "and pg.trimestreUno = pg.trimestreUno "; }

	    if (ano != 0) {
			consulta += "and (pg.anoUno ='"+ano+"' or pg.anoDos ='"+ano+"' or pg.anoTres = '"+ano+"') ";
            }
            else {  consulta += "and pg.anoUno = pg.anoUno "; }




            String consultaFinal = "select pp.numeroPPG from RelPPGArea rp, ProfTutoreaProy pp, PPG pg where pp.numeroPPG = rp.numPPG and pg.numeroppg = pp.numeroPPG and pg.numeroppg = rp.numPPG and "+consulta+";";


            List<Integer> codigosPPG = (List<Integer>)s.createSQLQuery(consultaFinal).list();

            List<String> carnets = new ArrayList();

            List<String> carnets1 = new ArrayList();
            String carrera = (String)request.getSession().getAttribute("carrera");
            int codigo;
            while (!codigosPPG.isEmpty()){
                codigo = codigosPPG.get(0);
                carnets1 = (java.util.List<String>)s.createSQLQuery("select carnetEstudiante from EstRealizaProy ep, EstCursaCarrera ec where ep.carnetestudiante = ec.codigoestudiante and ep.codigoproy='"+codigo+"' and ec.codigocarrera='"+carrera+"' ;").list();
                codigosPPG.remove(0);
                while(!carnets1.isEmpty()){
                    carnets.add(carnets1.get(0));
                    carnets1.remove(0);
                }
            }
                String carnet;
                String aux;

              //  List<String> carnetsfinal = new ArrayList();
    /*            while (!carnets.isEmpty()){
                    carnet = (String)carnets.get(0);
                    aux = (String)s.createSQLQuery("select codigoestudiante from EstCursaCarrera where codigocarrera = '"+carrera+"';").uniqueResult();
                    if (aux != null && !carnetsfinal.contains(aux)){
                        carnetsfinal.add(aux);
                    }
                    carnets.remove(0);
                }
 */

/*
                List<Estudiante> estudiantes = new ArrayList();
                Estudiante est;
                while (!carnets.isEmpty()){
                    carnet = carnets.get(0);
                    est = (Estudiante)s.createQuery("from Estudiante where carnete = '"+carnet+"'").uniqueResult();
                    carnets.remove(0);
                    estudiantes.add(est);
                }




            if (estudiantes.isEmpty()) {salida = 1;}
            else {
                request.setAttribute("L_Estudiante", estudiantes);
                fF_ConsultarProfesores.reset(mapping, request);
            }

            /* Aqui termina mi codigo 
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        */
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_BusquedaEstudiante.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_MostrarConsultaEstudiante.
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
    public ActionForward A_MostrarConsultaEstudiante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_MostrarConsultaEstudiante", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            /* Aqui empieza mi codigo */

            String aux = (String)request.getParameter("carnetE");
            Estudiante estudiante = (Estudiante)s.createQuery("from Estudiante where carnete = :temporal").setString("temporal", aux).uniqueResult();

            /* Pasamos a la vista los atributos del estudiante */
            request.setAttribute("carnet",(String)estudiante.getCarnetE());
            request.setAttribute("cedula", (String)estudiante.getCedulaE());
            request.setAttribute("fechanac", (Date)estudiante.getFechaNacimientoE());
            request.setAttribute("nacionalidad", (String)estudiante.getNacionalidadE());
            request.setAttribute("nombre", (String)estudiante.getNombreE());
            request.setAttribute("sexo", (String)estudiante.getSexoE());
            request.setAttribute("indice", (double)estudiante.getIndiceE());

            int codigo = (Integer)s.createSQLQuery("select codigoproy from EstRealizaProy where carnetestudiante='"+aux+"';").uniqueResult();
            PPG ppg = (PPG)s.createQuery("from PPG where numeroppg = :temporal ").setInteger("temporal", codigo).uniqueResult();

            request.setAttribute("ppg", ppg);

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

/**
     * Called by Struts for the execution of action A_Pre_MostrarConsulta.
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
    public ActionForward A_Pre_MostrarConsulta(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_MostrarConsulta", };
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
            try { s.close(); } catch (Exception ex2) {}
        }
        return mapping.findForward(SALIDAS[salida]);
    }

}