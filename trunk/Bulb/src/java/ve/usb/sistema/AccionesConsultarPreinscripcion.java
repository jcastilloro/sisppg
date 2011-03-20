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
public class AccionesConsultarPreinscripcion extends CohesionAction {

/**
     * Called by Struts for the execution of action A_Pre_ConsultarPreinscripcion.
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
    public ActionForward A_Pre_ConsultarPreinscripcion(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_ConsultarPreinscripcion", "A_Pre_GestionarPreinscripcion", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
/*mi codigo*/
            PreInsPasantias consulta = (PreInsPasantias)s.createQuery("from PreInsPasantias where estudiante = :login").setString("login", (String)request.getSession().getAttribute("login")).uniqueResult();
            Estudiante estudiante =(Estudiante)s.createQuery("from Estudiante where carnete = :login").setString("login", (String)request.getSession().getAttribute("login")).uniqueResult();
            EstCursaCarrera estcursacarrera = (EstCursaCarrera)s.createQuery("from EstCursaCarrera where codigoEstudiante = :login").setString("login", (String)request.getSession().getAttribute("login")).uniqueResult();
            String codigoCarrera = estcursacarrera.getCodigoCarrera();

            java.util.List<Carrera> list;
            list = (java.util.List<Carrera>)s.createQuery("from Carrera where codigoCarrera = '"+codigoCarrera+"'").list();
             Carrera carrera = list.get(0);
            if (consulta!=null){

               request.setAttribute("ep",(int)(consulta.getEp()));
               request.setAttribute("periodopasantia", (String)(consulta.getPeriodoPasantia()));
               request.setAttribute("ano", (int)(consulta.getAno()));
               request.setAttribute("cedula",estudiante.getCedulaE());
               request.setAttribute("carrera",carrera.getNombreCarrera());
               request.setAttribute("correo",(String)consulta.getCorreo());
               request.setAttribute("indice",estudiante.getIndiceE());
               request.setAttribute("direccion", (String)consulta.getDireccion());
               request.setAttribute("estadocivil",(String)consulta.getEstado_civil());
               request.setAttribute("sexo",estudiante.getSexoE());
               request.setAttribute("telefhab", (String)consulta.getTelef_hab());
               request.setAttribute("otrotelef",(String)consulta.getOtro_telef());
               request.setAttribute("fechanacimiento",estudiante.getFechaNacimientoE());
               request.setAttribute("nacionalidad",estudiante.getNacionalidadE());
               boolean tramite = (Boolean)consulta.getTramiteCCTDS();
               if (tramite){
                    request.setAttribute("tramite","si");
                    request.setAttribute("estado",(String)consulta.getEstado());
                    request.setAttribute("region",(String)consulta.getRegion());
                    request.setAttribute("ciudad",(String)consulta.getCiudad());
               }
               else {
               request.setAttribute("tramite","no");
                    request.setAttribute("estado","No Aplica");
                    request.setAttribute("region","No Aplica");
                    request.setAttribute("ciudad","No Aplica");
               }

               boolean graduando = (Boolean)consulta.getGraduando();
               if (graduando){
                   request.setAttribute("graduando","si");
               }
               else  {
                   request.setAttribute("graduando","no");
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
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_Pre_ConsultarPreinscripcion.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_Pre_ConsultarPreinscripcion.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}