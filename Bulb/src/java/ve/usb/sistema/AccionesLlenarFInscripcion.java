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
public class AccionesLlenarFInscripcion extends CohesionAction {
    
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
    public ActionForward A_Pre_LlenarFInscripcion(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_LlenarFInscripcion", "A_Pre_GestionarInscripcion", };
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
            getResources(request).getMessage("A_Pre_LlenarFInscripcion.msg1"));
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
    public ActionForward A_LlenarFIncripcion(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"A_Pre_GestionarPasantia", "A_Pre_LlenarFInscripcion", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_PlanTrabajo fF_PlanTrabajo = (F_PlanTrabajo)form;
/* a echar codigo */

            String  carnet = (String)request.getSession().getAttribute("login");
            int codpt = fF_PlanTrabajo.getCodigopt();
            String empresa = fF_PlanTrabajo.getEmpresa();
            String nombreTI = fF_PlanTrabajo.getCodigoTutorIndustrial();
            
            String nombreTA = fF_PlanTrabajo.getCodigoTutorAcademico();
            
            String titulo_pasantia = fF_PlanTrabajo.getTituloPasantia();
            String area_proy = fF_PlanTrabajo.getAreaProyecto();
            String resumen_proy = fF_PlanTrabajo.getResumenProyecto();
            String objetivo_pasantia = fF_PlanTrabajo.getObjetivosPasantias();
            String fases = fF_PlanTrabajo.getFasesPasantia();
            String fase1Obj = fF_PlanTrabajo.getObjetivoFaseI();
            String fase1Act = fF_PlanTrabajo.getActividadesFaseI();
            String fase1Time = fF_PlanTrabajo.getTiempoFaseI();
            String fase2Obj = fF_PlanTrabajo.getObjetivoFaseII();
            String fase2Act = fF_PlanTrabajo.getActividadesFaseII();
            String fase2Time = fF_PlanTrabajo.getTiempoFaseII();
            String fase3Obj = fF_PlanTrabajo.getObjetivoFaseIII();
            String fase3Act = fF_PlanTrabajo.getActividadesFaseIII();
            String fase3Time = fF_PlanTrabajo.getTiempoFaseIII();
            String fase4Obj = fF_PlanTrabajo.getObjetivoFaseIV();
            String fase4Act = fF_PlanTrabajo.getActividadesFaseIV();
            String fase4Time = fF_PlanTrabajo.getTiempoFaseIV();

            if(!((codpt == 0 || empresa.equals("")|| nombreTI.equals("") || nombreTA.equals("")
                 || titulo_pasantia.equals("")|| area_proy.equals("") || resumen_proy.equals("")
                 || objetivo_pasantia.equals("") || fases.equals("")))){
                
            

            Plantrabajo plantrabajo = new Plantrabajo();
            EstRealizaProy estrealizaproy = new EstRealizaProy();
            estrealizaproy.setCodigoproy(codpt);
            estrealizaproy.setCarnetEstudiante(carnet);
            estrealizaproy.setTipoProy(1);
            plantrabajo.setCodigopt(codpt);
            plantrabajo.setEmpresa(empresa);
            plantrabajo.setCodigoTA(nombreTA);
            
            plantrabajo.setCodigoTI(nombreTI);
            
            plantrabajo.setTituloPasantia(titulo_pasantia);
            plantrabajo.setAreaProyecto(area_proy);
            plantrabajo.setResumenProyecto(resumen_proy);
            plantrabajo.setObjetivosPasantias(objetivo_pasantia);
            plantrabajo.setFasesPasantia(fases);
            plantrabajo.setObjetivosFaseI(fase1Obj);
            plantrabajo.setActividadesFaseI(fase1Act);
            plantrabajo.setTiempoFaseI(fase1Time);
            plantrabajo.setObjetivosFaseII(fase2Obj);
            plantrabajo.setActividadesFaseII(fase2Act);
            plantrabajo.setTiempoFaseII(fase2Time);
            plantrabajo.setObjetivosFaseIII(fase3Obj);
            plantrabajo.setActividadesFaseIII(fase3Act);
            plantrabajo.setTiempoFaseIII(fase3Time);
            plantrabajo.setObjetivosFaseIV(fase4Obj);
            plantrabajo.setActividadesFaseIV(fase4Act);
            plantrabajo.setTiempoFaseIV(fase4Time);
            s.save(estrealizaproy);
            s.save(plantrabajo);
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
            getResources(request).getMessage("A_LlenarFIncripcion.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_LlenarFIncripcion.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}