package jc2s.sistppg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_Preincripcion extends org.apache.struts.action.ActionForm {
    
    
    public F_Preincripcion() {
        super();
        te_graduas = false;

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        te_graduas = false;

    }

    public static F_Preincripcion clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_Preincripcion fF_Preincripcion = (F_Preincripcion) sess.getAttribute("F_Preincripcion");
        if (fF_Preincripcion == null) {
            fF_Preincripcion = new F_Preincripcion();
            sess.setAttribute("F_Preincripcion", fF_Preincripcion);
        } else {
            fF_Preincripcion.reset(mapping, request);
        }
        return fF_Preincripcion;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property te_graduas.
     */
    private boolean te_graduas;

    /**
     * Getter for property te_graduas.
     * @return Value of property te_graduas.
     */
    public boolean getTe_graduas() {
        return this.te_graduas;
    }

    /**
     * Setter for property te_graduas.
     * @param te_graduas New value of property te_graduas.
     */
    public void setTe_graduas(boolean te_graduas) {
        this.te_graduas = te_graduas;
    }




}