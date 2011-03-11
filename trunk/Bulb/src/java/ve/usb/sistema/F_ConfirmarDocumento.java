package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionMapping;


public class F_ConfirmarDocumento extends org.apache.struts.action.ActionForm {


    public F_ConfirmarDocumento() {
        super();
        ruta="";
    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
        ruta = "";
    }

    public static F_ConfirmarDocumento clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_ConfirmarDocumento fF_ConfirmarDocumento = (F_ConfirmarDocumento) sess.getAttribute("F_ConfirmarDocumento");
        if (fF_ConfirmarDocumento == null) {
            fF_ConfirmarDocumento = new F_ConfirmarDocumento();
            sess.setAttribute("F_ConfirmarDocumento", fF_ConfirmarDocumento);
        } else {
            fF_ConfirmarDocumento.reset(mapping, request);
        }
        return fF_ConfirmarDocumento;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property nombrePPG.
     */
    private String ruta;

    public String getRuta() {
        return this.ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }




}