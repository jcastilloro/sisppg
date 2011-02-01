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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 
 */
public class AccionesLlenarFormularioPreinscripcion extends CohesionAction {
    
/**
     * Called by Struts for the execution of action A_Pre_LlenarFormularioPreinscripcion.
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
    public ActionForward A_Pre_LlenarFormularioPreinscripcion(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_LlenarFormularioPreinscripcion", "A_Pre_GestionarPreinscripcion", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
/* Aqui empieza mi codigo */
            String  carnet = (String)request.getSession().getAttribute("login");
            List consulta = s.createSQLQuery("select * from PreInsPasantias where estudiante='"+carnet+"';").list();
            if (!consulta.isEmpty()){
                salida=SALIDA_1;}
           
 java.util.List<Carrera> list;
            list = (java.util.List<Carrera>)s.createQuery("from Carrera").list();
             request.setAttribute("L_Carrera", list);
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
            getResources(request).getMessage("A_Pre_LlenarFormularioPreinscripcion.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_LlenarFormularioPreinscripcion.
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
    public ActionForward A_LlenarFormularioPreinscripcion(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"A_Pre_GestionarPasantia", "A_LlenarFormularioPreinscripcion", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_PreInscripcion fF_PreInscripcion = (F_PreInscripcion)form;
   /* a echar codigo */ 
            
            String  carnet = (String)request.getSession().getAttribute("login");
            PreInsPasantias consulta = (PreInsPasantias)s.createQuery("from PreInsPasantias where estudiante= :carnet").setString("carnet", carnet).uniqueResult();
            if (consulta!=null){
                return mapping.findForward(SALIDAS[SALIDA_1]);}
            
            int ep = fF_PreInscripcion.getEp();
            String periodo_pasantia = fF_PreInscripcion.getPeriodo_pasantia();
            int ano = fF_PreInscripcion.getAno();
            String estado_civil = fF_PreInscripcion.getEstado_civil();
            String telef_hab = fF_PreInscripcion.getTelef_hab();
            String otro_telef = fF_PreInscripcion.getOtro_telef();
            String correo =fF_PreInscripcion.getCorreo();
            String direccion = fF_PreInscripcion.getDireccion();
            Boolean graduando = fF_PreInscripcion.getGraduando();
            Boolean tramitecctds = fF_PreInscripcion.getTramiteCCTDS();
            String region = fF_PreInscripcion.getRegion();
            String estado = fF_PreInscripcion.getEstado();
            String ciudad = fF_PreInscripcion.getCiudad();
             if(!((ep == 0 || periodo_pasantia.equals("")|| ano == 0 ||estado_civil.equals("") || direccion.equals("")||
            telef_hab.equals("")|| correo.equals("")))){
               
               PreInsPasantias preinspasantias = new PreInsPasantias();
                preinspasantias.setEp(ep);
                preinspasantias.setPeriodoPasantia(periodo_pasantia);
                preinspasantias.setAno(ano);
                preinspasantias.setEstudiante(carnet);
                preinspasantias.setEstado_civil(estado_civil);
                preinspasantias.setTelef_hab(telef_hab);
                preinspasantias.setOtro_telef(otro_telef);
                preinspasantias.setCorreo(correo);
                preinspasantias.setDireccion(direccion);
                preinspasantias.setGraduando(graduando);
                preinspasantias.setTramiteCCTDS(tramitecctds);
                preinspasantias.setRegion(region);
                preinspasantias.setEstado(estado);
                preinspasantias.setCiudad(ciudad);
                if (tramitecctds){
                    if ( (region!="" && estado!="" && ciudad!="")){
                        s.update(preinspasantias);
                    }else{
                        salida=SALIDA_1;
                    }
                }else{
                      s.save(preinspasantias);
                      fF_PreInscripcion.reset(mapping, request);
                }
            }else{
                salida=SALIDA_1;
            }
               
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
            getResources(request).getMessage("A_LlenarFormularioPreinscripcion.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_LlenarFormularioPreinscripcion.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}