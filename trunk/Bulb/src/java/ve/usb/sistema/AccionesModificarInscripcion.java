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

/**
 * 
 */
public class AccionesModificarInscripcion extends CohesionAction {
    
/**
     * Called by Struts for the execution of action A_Pre_ModificarInscripcion.
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
    public ActionForward A_Pre_ModificarInscripcion(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_ModificarInscripcion", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
     	/*aqui empieza */
             EstRealizaProy estudiante = (EstRealizaProy)s.createQuery("from EstRealizaProy where tipoproy='1' and carnetestudiante= :login").setString("login", (String)request.getSession().getAttribute("login")).uniqueResult();
             int codigo = (int)estudiante.getCodigoproy();
             Plantrabajo plantrabajo = (Plantrabajo)s.createQuery("from Plantrabajo where codigoPt = '"+codigo+"'").uniqueResult();
             int pt = plantrabajo.getCodigopt();

             request.setAttribute("empresa",plantrabajo.getEmpresa());
             request.setAttribute("codigoTutorIndustrial",plantrabajo.getCodigoTI());
             request.setAttribute("codigoTutorAcademico",plantrabajo.getCodigoTA());
             request.setAttribute("tituloPasantia",plantrabajo.getTituloPasantia());
             request.setAttribute("areaProyecto",plantrabajo.getAreaProyecto());
             request.setAttribute("resumenProyecto",plantrabajo.getResumenProyecto());
             request.setAttribute("objetivosPasantias",plantrabajo.getObjetivosPasantias());
             request.setAttribute("fasesPasantia",plantrabajo.getFasesPasantia());
             request.setAttribute("codigoPt",pt);

             Fase fase = (Fase)s.createQuery("from Fase where idpasantia= :pt ").setInteger("pt", pt).uniqueResult();
             request.setAttribute("objetivosFase",fase.getObjetivosFase());
             request.setAttribute("actividadesFase",fase.getActividadesFase());
             request.setAttribute("tiempoFase",fase.getTiempoFase());
              
        /*aqui termina */
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
     * Called by Struts for the execution of action A_ModificarInscripcion.
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
    public ActionForward A_ModificarInscripcion(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"A_Pre_ConsultarInscripcion", "A_Pre_ModificarInscripcion", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_PlanTrabajo fF_PlanTrabajo = (F_PlanTrabajo)form;

            String carnet = (String)request.getSession().getAttribute("login");
            
            String empresa = fF_PlanTrabajo.getEmpresa();
            String nombreTI = fF_PlanTrabajo.getCodigoTutorIndustrial();            
            String nombreTA = fF_PlanTrabajo.getCodigoTutorAcademico();
            
            String titulo_pasantia = fF_PlanTrabajo.getTituloPasantia();
            String area_proy = fF_PlanTrabajo.getAreaProyecto();
            String resumen_proy = fF_PlanTrabajo.getResumenProyecto();
            String objetivo_pasantia = fF_PlanTrabajo.getObjetivosPasantias();
            String fases = fF_PlanTrabajo.getFasesPasantia();
            String faseObj = fF_PlanTrabajo.getObjetivoFaseI();
            String faseAct = fF_PlanTrabajo.getActividadesFaseI();
            String faseTime = fF_PlanTrabajo.getTiempoFaseI();
            int codpt = fF_PlanTrabajo.getCodigopt();

            if(!(( empresa.equals("")|| nombreTI.equals("") || nombreTA.equals("")
                 || titulo_pasantia.equals("")|| area_proy.equals("") || resumen_proy.equals("")
                 || objetivo_pasantia.equals("") || fases.equals("") ))){
                
            
            EstRealizaProy estudiante = (EstRealizaProy)s.createQuery("from EstRealizaProy where carnetestudiante = :carnet").setString("carnet", carnet).uniqueResult();
            int codigopt = (int)estudiante.getCodigoproy();
            Plantrabajo plantrabajo =(Plantrabajo)s.createQuery("from Plantrabajo where codigoPt = :codigopt").setInteger("codigopt", codigopt).uniqueResult();
            EstRealizaProy estrealizaproy = new EstRealizaProy();
            int pt = plantrabajo.getCodigopt();
            
            estrealizaproy.setCarnetEstudiante(carnet);
            estrealizaproy.setTipoProy(1);

            // FASE / ETAPA
            Fase fase = (Fase)s.createQuery("from Fase where idpasantia= :pt").setInteger("pt", pt).uniqueResult();
            fase.setObjetivosFase(faseObj);
            fase.setActividadesFase(faseAct);
            fase.setTiempoFase(faseTime);

            plantrabajo.setEmpresa(empresa);
            plantrabajo.setCodigoTA(nombreTA);            
            plantrabajo.setCodigoTI(nombreTI);
            
            plantrabajo.setTituloPasantia(titulo_pasantia);
            plantrabajo.setAreaProyecto(area_proy);
            plantrabajo.setResumenProyecto(resumen_proy);
            plantrabajo.setObjetivosPasantias(objetivo_pasantia);
            plantrabajo.setFasesPasantia(fases);
            
            s.update(plantrabajo);
            s.update(fase);
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
            getResources(request).getMessage("A_ModificarInscripcion.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_ModificarInscripcion.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

}