package jc2s.sistppg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_Inicio_Sesion_Empresa extends org.apache.struts.action.ActionForm {
    
    
    public F_Inicio_Sesion_Empresa() {
        super();
        login = "";
        password = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        login = "";
        password = "";

    }

    public static F_Inicio_Sesion_Empresa clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_Inicio_Sesion_Empresa fF_Inicio_Sesion_Empresa = (F_Inicio_Sesion_Empresa) sess.getAttribute("F_Inicio_Sesion_Empresa");
        if (fF_Inicio_Sesion_Empresa == null) {
            fF_Inicio_Sesion_Empresa = new F_Inicio_Sesion_Empresa();
            sess.setAttribute("F_Inicio_Sesion_Empresa", fF_Inicio_Sesion_Empresa);
        } else {
            fF_Inicio_Sesion_Empresa.reset(mapping, request);
        }
        return fF_Inicio_Sesion_Empresa;
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