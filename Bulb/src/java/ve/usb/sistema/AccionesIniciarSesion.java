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

import java.util.List;

/**
 * 
 */
public class AccionesIniciarSesion extends CohesionAction {
    
/**
     * Called by Struts for the execution of action A_Pre_IniciarSesion.
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
    public ActionForward A_Pre_IniciarSesion(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_IniciarSesion", };
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

/**
     * Called by Struts for the execution of action A_IniciarSesion.
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
    public ActionForward A_IniciarSesion(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"A_Pre_VistaEstudiante", "A_Pre_VistaProfesor", "A_Pre_IniciarSesion", "A_Pre_VistaCoordinacion", "A_VistaAdmin", "A_Pre_VistaUsuarioCCTDS"};
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;
        final int SALIDA_2 = 2;
        final int SALIDA_3 = 3;
        final int SALIDA_4 = 4;
        final int SALIDA_5 = 5;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_IniciarSesion fF_IniciarSesion = (F_IniciarSesion)form;
            /* Aqui empieza mi codigo */
            String login = fF_IniciarSesion.getLogin();
            String password = fF_IniciarSesion.getPassword();
            List<String> consulta =   s.createSQLQuery("select privilegio from usuario where login='"+login+"' and password='"+password+"';").list();
            if (!consulta.isEmpty()){
               request.getSession().setAttribute("login", login);
               request.getSession().setAttribute("privilegio",((String)consulta.get(0)));
                if (((String)consulta.get(0)).equals("estudiante")){
                   ;
                }
                else if (((String)consulta.get(0)).equals("profesor")){
                    consulta =   s.createSQLQuery("select coordinacarrera from EsCoordinador where codigoprofesor='"+login+"';").list();
                    List<Boolean> consulta2 =   s.createSQLQuery("select escoordinador from UsuarioCCTDS where codigoprofesor='"+login+"';").list();
                    System.out.println("CHECKPOINT 1 -#####################################");
                    if (!consulta.isEmpty()){
                        salida = SALIDA_3;
                        request.getSession().setAttribute("carrera", consulta.get(0));
                    }
                    else if (!consulta2.isEmpty()){
                        //aqui verificar si es coord
                        salida = SALIDA_5;
                        System.out.println("CHECKPOINT 2 -#####################################");
                    }
 else {
                        salida = SALIDA_1;
                    }
                }  else if (((String)consulta.get(0)).equals("admin")){
                    salida = SALIDA_4;
                }
               fF_IniciarSesion.reset(mapping, request);                
            }
            else {salida = SALIDA_2;}
            
            /* Aqui termina mi codgio */
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==2) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_IniciarSesion.msg2"));
        }
        if (salida==3) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_IniciarSesion.msg3"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}