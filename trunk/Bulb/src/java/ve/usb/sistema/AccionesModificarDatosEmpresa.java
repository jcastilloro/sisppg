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
public class AccionesModificarDatosEmpresa extends CohesionAction {
    
/**
     * Called by Struts for the execution of action A_Pre_ModificarDatosEmpresa.
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
    public ActionForward A_Pre_ModificarDatosEmpresa(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_ModificarDatosEmpresa", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
   /*Aqui empieza mi codigo*/
            Empresa consulta = (Empresa)s.createQuery("from Empresa where loginempresa = :login").setString("login", (String)request.getSession().getAttribute("login")).uniqueResult();
            if (consulta!=null){
                              
               request.setAttribute("login",(String)(consulta.getLoginempresa()));
               request.setAttribute("nombreEmpresa", (String)(consulta.getNombreEmpresa()));
               request.setAttribute("rif", (String)(consulta.getRif()));
               request.setAttribute("telefono",(String)consulta.getTelefono());
               request.setAttribute("direccion",(String)consulta.getDireccion());
               request.setAttribute("ciudad",(String)(consulta.getCiudad()));
               request.setAttribute("pais",(String)consulta.getPais());
            }
/*Aqui termina mi codigo*/
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
     * Called by Struts for the execution of action A_ModificarDatosEmpresa.
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
    public ActionForward A_ModificarDatosEmpresa(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"A_Pre_VistaEmpresa", "A_Pre_ModificarDatosEmpresa", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_RegistrarEmpresa fF_RegistrarEmpresa = (F_RegistrarEmpresa)form;
/* aqui empieza mi codigo*/
    String telefono = fF_RegistrarEmpresa.getTelefono();
            String direccion = fF_RegistrarEmpresa.getDireccion();
            String ciudad = fF_RegistrarEmpresa.getCiudad();
            String pais = fF_RegistrarEmpresa.getPais();
                
             Empresa empresa = (Empresa)s.createQuery("from Empresa where loginempresa = :login").setString("login", (String)request.getSession().getAttribute("login")).uniqueResult();
            
                    if ( telefono != "" && direccion != "" && ciudad != "" && pais != "" ){
                            
                            empresa.setTelefono(telefono);
                            empresa.setDireccion(direccion);
                            empresa.setCiudad(ciudad);
                            empresa.setPais(pais);
                            /* almacenamos la empresa en la base de datos */
                            s.update(empresa);
                            salida = SALIDA_0;
                            fF_RegistrarEmpresa.reset(mapping, request);
                    
                    
                                   
            }
            else {salida = SALIDA_1;}
            
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
            getResources(request).getMessage("A_ModificarDatosEmpresa.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_ModificarDatosEmpresa.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}