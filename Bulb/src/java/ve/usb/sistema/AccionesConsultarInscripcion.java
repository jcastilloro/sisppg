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
public class AccionesConsultarInscripcion extends CohesionAction {
    
/**
     * Called by Struts for the execution of action A_Pre_ConsultarInscripcion.
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
    public ActionForward A_Pre_ConsultarInscripcion(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_ConsultarInscripcion", "A_Pre_GestionarInscripcion", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
	/*aqui empieza*/
            EstRealizaProy estudiante = (EstRealizaProy)s.createQuery("from EstRealizaProy where tipoproy='1' and carnetestudiante= :login").setString("login", (String)request.getSession().getAttribute("login")).uniqueResult();
            
           
              if (estudiante!=null){
                      int codigo = (int)estudiante.getCodigoproy();
                      Plantrabajo plantrabajo = (Plantrabajo)s.createQuery("from Plantrabajo where codigopt= :codigo").setInteger("codigo", codigo).uniqueResult();
                      int pt = plantrabajo.getCodigopt();
                     
                      request.setAttribute("empresa",plantrabajo.getEmpresa());
                      request.setAttribute("tutorI",plantrabajo.getCodigoTI());
                      request.setAttribute("tutorA",plantrabajo.getCodigoTA());
                      request.setAttribute("titulo",plantrabajo.getTituloPasantia());
                      request.setAttribute("area",plantrabajo.getAreaProyecto());
                      request.setAttribute("resumen",plantrabajo.getResumenProyecto());
                      request.setAttribute("objetivos",plantrabajo.getObjetivosPasantias());
                      request.setAttribute("fases",plantrabajo.getFasesPasantia());
                      request.setAttribute("codigoPt",pt);

                      Fase fase = (Fase)s.createQuery("from Fase where idpasantia= :pt ").setInteger("pt", pt).uniqueResult();
                      request.setAttribute("objetivosFase",fase.getObjetivosFase());
                      request.setAttribute("actividadesFase",fase.getActividadesFase());
                      request.setAttribute("tiempoFase",fase.getTiempoFase());
              }else{
                salida = SALIDA_1;
              }
                  
              	/*aqui termina*/
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_Pre_ConsultarInscripcion.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_Pre_ConsultarInscripcion.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}