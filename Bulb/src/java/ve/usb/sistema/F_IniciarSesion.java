package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_IniciarSesion extends org.apache.struts.action.ActionForm {
    
    
    public F_IniciarSesion() {
        super();
        login = "";
        password = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        login = "";
        password = "";

    }

    public static F_IniciarSesion clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_IniciarSesion fF_IniciarSesion = (F_IniciarSesion) sess.getAttribute("F_IniciarSesion");
        if (fF_IniciarSesion == null) {
            fF_IniciarSesion = new F_IniciarSesion();
            sess.setAttribute("F_IniciarSesion", fF_IniciarSesion);
        } else {
            fF_IniciarSesion.reset(mapping, request);
        }
        return fF_IniciarSesion;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property login.
     */
    private String login;

    /**
     * Getter for property login.
     * @return Value of property login.
     */
    public String getLogin() {
        return this.login;
    }

    /**
     * Setter for property login.
     * @param login New value of property login.
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Holds value of property password.
     */
    private String password;

    /**
     * Getter for property password.
     * @return Value of property password.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Setter for property password.
     * @param password New value of property password.
     */
    public void setPassword(String password) {
        this.password = password;
    }




}