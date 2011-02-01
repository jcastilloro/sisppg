package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_AgregarOferta extends org.apache.struts.action.ActionForm {
    
    
    public F_AgregarOferta() {
        super();
    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
    }

    public static F_AgregarOferta clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_AgregarOferta fF_AgregarOferta = (F_AgregarOferta) sess.getAttribute("F_AgregarOferta");
        if (fF_AgregarOferta == null) {
            fF_AgregarOferta = new F_AgregarOferta();
            sess.setAttribute("F_AgregarOferta", fF_AgregarOferta);
        } else {
            fF_AgregarOferta.reset(mapping, request);
        }
        return fF_AgregarOferta;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }



}