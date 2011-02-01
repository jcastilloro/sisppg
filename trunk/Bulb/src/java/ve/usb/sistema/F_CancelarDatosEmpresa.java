package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_CancelarDatosEmpresa extends org.apache.struts.action.ActionForm {
    
    
    public F_CancelarDatosEmpresa() {
        super();
        verificacion = false;

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        verificacion = false;

    }

    public static F_CancelarDatosEmpresa clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_CancelarDatosEmpresa fF_CancelarDatosEmpresa = (F_CancelarDatosEmpresa) sess.getAttribute("F_CancelarDatosEmpresa");
        if (fF_CancelarDatosEmpresa == null) {
            fF_CancelarDatosEmpresa = new F_CancelarDatosEmpresa();
            sess.setAttribute("F_CancelarDatosEmpresa", fF_CancelarDatosEmpresa);
        } else {
            fF_CancelarDatosEmpresa.reset(mapping, request);
        }
        return fF_CancelarDatosEmpresa;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property verificacion.
     */
    private boolean verificacion;

    /**
     * Getter for property verificacion.
     * @return Value of property verificacion.
     */
    public boolean getVerificacion() {
        return this.verificacion;
    }

    /**
     * Setter for property verificacion.
     * @param verificacion New value of property verificacion.
     */
    public void setVerificacion(boolean verificacion) {
        this.verificacion = verificacion;
    }




}