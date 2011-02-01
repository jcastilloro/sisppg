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

/**
 * 
 */
public class AccionesModificarPreinscripcion extends CohesionAction {
    
/**
     * Called by Struts for the execution of action A_Pre_ModificarPreinscripcion.
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
    public ActionForward A_Pre_ModificarPreinscripcion(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_modificarPreinscripcion", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
 /*aqui empieza*/
                PreInsPasantias preinspasantias = (PreInsPasantias)s.createQuery("from PreInsPasantias where estudiante = :login").setString("login", (String)request.getSession().getAttribute("login")).uniqueResult();
                Estudiante estudiante =(Estudiante)s.createQuery("from Estudiante where carnete = :login").setString("login", (String)request.getSession().getAttribute("login")).uniqueResult();
                EstCursaCarrera estcursacarrera = (EstCursaCarrera)s.createQuery("from EstCursaCarrera where codigoEstudiante = :login").setString("login", (String)request.getSession().getAttribute("login")).uniqueResult();
                String codigoCarrera = estcursacarrera.getCodigoCarrera();
            
            java.util.List<Carrera> list;
            list = (java.util.List<Carrera>)s.createQuery("from Carrera where codigoCarrera = '"+codigoCarrera+"'").list();
             Carrera carrera = list.get(0);
             
                request.setAttribute("ep",(int)(preinspasantias.getEp()));
               request.setAttribute("periodopasantia", (String)(preinspasantias.getPeriodoPasantia()));
               request.setAttribute("ano", (int)(preinspasantias.getAno()));
               request.setAttribute("cedula",estudiante.getCedulaE());
               request.setAttribute("carrera",carrera.getNombreCarrera());
               request.setAttribute("correo",(String)preinspasantias.getCorreo());
               request.setAttribute("indice",estudiante.getIndiceE());
               request.setAttribute("direccion", (String)preinspasantias.getDireccion());
               request.setAttribute("estadocivil",(String)preinspasantias.getEstado_civil());
               request.setAttribute("sexo",estudiante.getSexoE());
               request.setAttribute("telefhab", (String)preinspasantias.getTelef_hab());
               request.setAttribute("otrotelef",(String)preinspasantias.getOtro_telef());
               request.setAttribute("fechanacimiento",estudiante.getFechaNacimientoE());
               request.setAttribute("nacionalidad",estudiante.getNacionalidadE());
                boolean tramiteCCTDS = (Boolean)preinspasantias.getTramiteCCTDS();
               if (tramiteCCTDS){
                    request.setAttribute("tramiteCCTDS",true);
                    request.setAttribute("estado",(String)preinspasantias.getEstado());
                    request.setAttribute("region",(String)preinspasantias.getRegion());
                    request.setAttribute("ciudad",(String)preinspasantias.getCiudad());
               }
               else {
               request.setAttribute("tramiteCCTDS",false);
                    request.setAttribute("estado","");
                    request.setAttribute("region","");
                    request.setAttribute("ciudad","");
               }
               boolean graduando = (Boolean)preinspasantias.getGraduando();
               if (graduando){
                   request.setAttribute("graduando",true);
               }
               else  {
                   request.setAttribute("graduando",false);
               }
               
               /*aqui termina*/
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
     * Called by Struts for the execution of action A_ModificarPreinscripcion.
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
    public ActionForward A_ModificarPreinscripcion(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"A_Pre_GestionarPreinscripcion", "A_Pre_ModificarPreinscripcion", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_PreInscripcion fF_PreInscripcion = (F_PreInscripcion)form;
  /*aqui comienzo */
            String  carnet = (String)request.getSession().getAttribute("login");
            int ep = fF_PreInscripcion.getEp();
            String periodo_pasantia = fF_PreInscripcion.getPeriodo_pasantia();
            int ano = fF_PreInscripcion.getAno();

            String estado_civil = fF_PreInscripcion.getEstado_civil();
            String telef_hab = fF_PreInscripcion.getTelef_hab();
            String otro_telef = fF_PreInscripcion.getOtro_telef();
            String correo =fF_PreInscripcion.getCorreo();
            String direccion = fF_PreInscripcion.getDireccion();
            Boolean graduando = fF_PreInscripcion.getGraduando();
            Boolean tramiteCCTDS = fF_PreInscripcion.getTramiteCCTDS();
            String region = fF_PreInscripcion.getRegion();
            String estado = fF_PreInscripcion.getEstado();
            String ciudad = fF_PreInscripcion.getCiudad();
            if(!((ep == 0 || periodo_pasantia.equals("")|| ano == 0 ||estado_civil.equals("") || direccion.equals("")||
            telef_hab.equals("")|| correo.equals("")))){
               
                PreInsPasantias preinspasantias = (PreInsPasantias)s.createQuery("from PreInsPasantias where estudiante= :carnet").setString("carnet", carnet).uniqueResult();
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
                preinspasantias.setTramiteCCTDS(tramiteCCTDS);
                preinspasantias.setRegion(region);
                preinspasantias.setEstado(estado);
                preinspasantias.setCiudad(ciudad);
                if (tramiteCCTDS){
                    if ( (region!="" && estado!="" && ciudad!="")){
                        s.update(preinspasantias);
                    }else{
                        salida=SALIDA_1;
                    }
                }else{
                      s.update(preinspasantias);
                      fF_PreInscripcion.reset(mapping, request);
                }
            }else{
                salida=SALIDA_1;
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
            getResources(request).getMessage("A_ModificarPreinscripcion.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_ModificarPreinscripcion.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}