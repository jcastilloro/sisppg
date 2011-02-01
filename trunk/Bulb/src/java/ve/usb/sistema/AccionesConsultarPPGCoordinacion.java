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

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 * 
 */
public class AccionesConsultarPPGCoordinacion extends CohesionAction {
    
/**
     * Called by Struts for the execution of action A_Pre_ConsultarPPGCoordinacion.
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
    public ActionForward A_Pre_ConsultarPPGCoordinacion(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_ConsultarPPGCoordinacion", };
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
     * Called by Struts for the execution of action A_ConsultarPPGCoordinacion.
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
    public ActionForward A_ConsultarPPGCoordinacion(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_MostrarConsultaPPG", "V_ConsultarPPGCoordinacion", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_ConsultarPPG fF_ConsultarPPG = (F_ConsultarPPG)form;
            /* Aqui empieza mi codigo */
            /* Se extraen los elementos del formulario */
            String area = fF_ConsultarPPG.getArea();
            String tutor = fF_ConsultarPPG.getTutor();
            String periodo = fF_ConsultarPPG.getTrimestre();
            int ano = fF_ConsultarPPG.getAno();
            
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
            PPG ppg;
            List<PPG> listappgs= new ArrayList();
            String carrera = (String)request.getSession().getAttribute("carrera");
            List<String> temp = new ArrayList();
      
            
            while (!codigosPPG.isEmpty()){           
                        temp = (List<String>)s.createSQLQuery("select ec.codigocarrera from EstRealizaProy ep, EstCursaCarrera ec where ep.carnetestudiante = ec.codigoestudiante and ep.codigoproy='"+codigosPPG.get(0)+"';").list();

                        if (temp.get(0).equals(carrera)){
                            ppg = (PPG)s.createQuery("from PPG where numeroppg = :temporal").setInteger("temporal", codigosPPG.get(0)).uniqueResult();

                            listappgs.add(ppg);
                        }
                        codigosPPG.remove(0);
                    }
                    if (listappgs.isEmpty()) {
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
   

                     salida = 1;}
            else {
                request.setAttribute("L_PPG", listappgs);
                fF_ConsultarPPG.reset(mapping, request);
            }
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_ConsultarPPGCoordinacion.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_MostrarConsultaPPG.
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
    public ActionForward A_MostrarConsultaPPG(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_MostrarDescripcionPPG", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
           /* Aqui empieza mi codigo */
          
            String codigo = request.getParameter("numeroPPG");
            int codigoPPG = Integer.parseInt(codigo);
            PPG ppg = (PPG)s.createQuery("from PPG where numeroppg = :temporal").setInteger("temporal", codigoPPG).uniqueResult();
            List<Estudiante> estudiantes = new ArrayList();
            List<String> carnets = (List<String>)s.createSQLQuery("select carnetestudiante from EstRealizaProy where codigoproy='"+codigo+"';").list();
            
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

/**
     * Called by Struts for the execution of action A_Pre_MostrarConsultaPPG.
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
    public ActionForward A_Pre_MostrarConsultaPPG(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_MostrarConsultaPPG", };
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