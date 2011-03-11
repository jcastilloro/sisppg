package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author chitty
 */
public class F_AgregarDpto extends org.apache.struts.action.ActionForm {


    public F_AgregarDpto() {
        super();
        dpto = "";

    }

    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        dpto = "";

    }

    public static F_AgregarDpto clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_AgregarDpto fF_AgregarDpto = (F_AgregarDpto) sess.getAttribute("F_AgregarDpto");
        if (fF_AgregarDpto == null) {
            fF_AgregarDpto = new F_AgregarDpto();
            sess.setAttribute("F_AgregarDpto", fF_AgregarDpto);
        } else {
            fF_AgregarDpto.reset(mapping, request);
        }
        return fF_AgregarDpto;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }


    /**
     * Holds value of property dpto.
     */
    private String dpto;

    /**
     * Getter for property dpto.
     * @return Value of property dpto.
     */
    public String getDpto() {
        return this.dpto;
    }

    /**
     * Setter for property dpto.
     * @param dpto New value of property dpto.
     */
    public void setDpto(String dpto) {
        this.dpto = dpto;
    }


}