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
            
            if(!((codpt == 0 || empresa.equals("")|| nombreTI.equals("") || nombreTA.equals("")
                 || titulo_pasantia.equals("")|| area_proy.equals("") || resumen_proy.equals("")
                 || objetivo_pasantia.equals("") || fases.equals("")))){                
            

            Plantrabajo plantrabajo = new Plantrabajo();
            EstRealizaProy estrealizaproy = new EstRealizaProy();
            
            // FASE / ETAPA
            Fase fase = new Fase();
            IdFase idfase = new IdFase();
            idfase.setIdPasantia(codpt);
            idfase.setNumero(1);
            fase.setIdFase(idfase);
            fase.setObjetivosFase(faseObj);
            fase.setActividadesFase(faseAct);
            fase.setTiempoFase(faseTime);

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
            
            s.save(estrealizaproy);
            s.save(plantrabajo);
            s.save(fase);
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