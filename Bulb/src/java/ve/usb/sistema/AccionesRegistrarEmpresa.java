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


/**
 * 
 */
public class AccionesRegistrarEmpresa extends CohesionAction {
    
/**
     * Called by Struts for the execution of action A_Pre_RegistrarEmpresa.
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
    public ActionForward A_Pre_RegistrarEmpresa(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_RegistrarEmpresa", };
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
     * Called by Struts for the execution of action A_RegistrarEmpresa.
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
    public ActionForward A_RegistrarEmpresa(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"A_Pre_RegistrarEmpresa", "A_Pre_IniciarSesionEmpresa", "A_Pre_RegistrarEmpresa", "A_Pre_RegistrarEmpresa", "A_Pre_RegistrarEmpresa", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;
        final int SALIDA_2 = 2;
        final int SALIDA_3 = 3;
        final int SALIDA_4 = 4;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_RegistrarEmpresa fF_RegistrarEmpresa = (F_RegistrarEmpresa)form;
            /* Aqui empieza mi codigo */
            String login = fF_RegistrarEmpresa.getLogin();
            String nombreEmpresa = fF_RegistrarEmpresa.getNombreEmpresa();
            String rif = fF_RegistrarEmpresa.getRif();
            String password1 = fF_RegistrarEmpresa.getPassword();
            String password2 = fF_RegistrarEmpresa.getConfirmarpassword();
            String telefono = fF_RegistrarEmpresa.getTelefono();
            String direccion = fF_RegistrarEmpresa.getDireccion();
            String ciudad = fF_RegistrarEmpresa.getCiudad();
            String pais = fF_RegistrarEmpresa.getPais();
                
           
            
            /*Evaluamos si el login es valido*/
            Empresa consulta = (Empresa)s.createQuery("from Empresa where loginempresa = :login").setString("login", login).uniqueResult();
            if (consulta==null){
                /* Evaluamos si el rif es valido */
                consulta = (Empresa)s.createQuery("from Empresa where rif = :rif").setString("rif", rif).uniqueResult();
                if (consulta == null){
                    /* Confirmando si no existen campos vacios */
                    if ( nombreEmpresa!="" && telefono != "" && direccion != "" && ciudad != "" && pais != "" ){
                        /* Confirma si las contraseñas son iguales  */
                        if (password1.equals(password2)){
                            /* carga los datos en el nuevo objeto empresa */
                            Empresa empresa = new Empresa();
                            empresa.setLoginempresa(login);
                            empresa.setNombreEmpresa(nombreEmpresa);
                            empresa.setRif(rif);
                            empresa.setPassword(password1);
                            empresa.setTelefono(telefono);
                            empresa.setDireccion(direccion);
                            empresa.setCiudad(ciudad);
                            empresa.setPais(pais);
                            /* almacenamos la empresa en la base de datos */
                            s.save(empresa);
                            salida = SALIDA_1;
                            fF_RegistrarEmpresa.reset(mapping, request);
                        }
                        else { salida = SALIDA_2; }
                    }
                    else { salida = SALIDA_3; }
                }
                else {salida=SALIDA_4;}
                   
            }
            else {salida = SALIDA_0;}
            
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
            getResources(request).getMessage("A_RegistrarEmpresa.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_RegistrarEmpresa.msg1"));
        }
        if (salida==2) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_RegistrarEmpresa.msg2"));
        }
        if (salida==3) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_RegistrarEmpresa.msg3"));
        }
        if (salida==4) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_RegistrarEmpresa.msg4"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}