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

/**
 * 
 */
public class AccionesConsultarPPG extends CohesionAction {
    
/**
     * Called by Struts for the execution of action A_Pre_ConsultarPPG.
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
    public ActionForward A_Pre_ConsultarPPG(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_ConsultarPPG", "V_VistaEstudiante", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
        /* Aqui empieza mi codgio */
            EstRealizaProy consulta = (EstRealizaProy)s.createQuery("from EstRealizaProy where carnetestudiante = :login").setString("login", (String)request.getSession().getAttribute("login")).uniqueResult();
            if (consulta!=null){
              PPG ppg = (PPG)s.createQuery("from PPG where numeroppg = "+consulta.getCodigoproy()+"")
                           .uniqueResult();
             if (  ppg != null ){               
               request.setAttribute("numeroppg",(int)(ppg.getNumeroPPG()));
               request.setAttribute("nombreppg", (String)(ppg.getNombrePPG()));
               request.setAttribute("fechappg", (Date)(ppg.getFechaPPG()));
               request.setAttribute("propuestopor",(String)(ppg.getPropuestop()));
               request.setAttribute("actvppg",(String)ppg.getActvPPG());
               request.setAttribute("ptosinte",(String)ppg.getPtosInte());
               request.setAttribute("areas", (String)ppg.getAreas());
               request.setAttribute("durayrec",(String)ppg.getDuraYrec());
               request.setAttribute("primerae",(String)ppg.getPrimeraE());
               request.setAttribute("trimestreuno", (String)ppg.getTrimestreUno());
               request.setAttribute("resultminuno",(String)ppg.getResultMinUno());
               request.setAttribute("actresuluno",(String)ppg.getActResulUno());
               request.setAttribute("desctopicosici",(String)ppg.getDescTopicosICI());
               request.setAttribute("segundae",(String)ppg.getSegundaE());
               request.setAttribute("trimestredos",(String)ppg.getTrimestreDos());
               /* Juntas */
               boolean juntas = (Boolean)ppg.getJuntas();
               if (juntas){
                   request.setAttribute("juntas","si");
               }
               else  {
                   request.setAttribute("juntas","si");
               }
               request.setAttribute("resultmindos",(String)ppg.getResultMinDos());
               request.setAttribute("actresuldos",(String)ppg.getActResulDos());
               request.setAttribute("desctopicosicii",(String)ppg.getDescTopicosICII());
               request.setAttribute("tercerae",(String)ppg.getTerceraE());
               request.setAttribute("trimestretres",(String)ppg.getTrimestreTres());
               request.setAttribute("resultmintres",(String)ppg.getResultMinTres());
               request.setAttribute("actresultres",(String)ppg.getActResulTres());
               request.setAttribute("recurmate",(String)ppg.getRecurMate());


               /* Area */
               RelPPGArea relArea = (RelPPGArea)s.createQuery("from RelPPGArea where numppg = "+ppg.getNumeroPPG()+"")
                           .uniqueResult();
               Area area = (Area)s.createQuery("from Area where codigo_area = '"+relArea.getCodigo_Area()+"'").uniqueResult();
               request.setAttribute("codigoarea",(String)area.getCodigo_Area());
               request.setAttribute("nombrearea",(String)area.getNombreArea());

               /* Tutor */
               ProfTutoreaProy proftutproy = (ProfTutoreaProy)s.createQuery("from ProfTutoreaProy where numeroppg = "+ppg.getNumeroPPG()+"")
                           .uniqueResult();
               Profesor profesor = (Profesor)s.createQuery("from Profesor where codigoprofesor = '"+proftutproy.getIdProfesor()+"'").uniqueResult();
               request.setAttribute("idprofesor",(String)proftutproy.getIdProfesor());
               request.setAttribute("nombreprofesor",(String)profesor.getNombreProfesor());



            }
            }
             else {salida = 1;}
            /* Aqui termina mi codigo */
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_Pre_ConsultarPPG.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}