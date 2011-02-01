package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_RegistrarEmpresa extends org.apache.struts.action.ActionForm {
    
    
    public F_RegistrarEmpresa() {
        super();
        login = "";
        nombreEmpresa = "";
        rif = "";
        password = "";
        confirmarpassword = "";
        telefono = "";
        direccion = "";
        ciudad = "";
        pais = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        login = "";
        nombreEmpresa = "";
        rif = "";
        password = "";
        confirmarpassword = "";
        telefono = "";
        direccion = "";
        ciudad = "";
        pais = "";

    }

    public static F_RegistrarEmpresa clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_RegistrarEmpresa fF_RegistrarEmpresa = (F_RegistrarEmpresa) sess.getAttribute("F_RegistrarEmpresa");
        if (fF_RegistrarEmpresa == null) {
            fF_RegistrarEmpresa = new F_RegistrarEmpresa();
            sess.setAttribute("F_RegistrarEmpresa", fF_RegistrarEmpresa);
        } else {
            fF_RegistrarEmpresa.reset(mapping, request);
        }
        return fF_RegistrarEmpresa;
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
     * Holds value of property nombreEmpresa.
     */
    private String nombreEmpresa;

    /**
     * Getter for property nombreEmpresa.
     * @return Value of property nombreEmpresa.
     */
    public String getNombreEmpresa() {
        return this.nombreEmpresa;
    }

    /**
     * Setter for property nombreEmpresa.
     * @param nombreEmpresa New value of property nombreEmpresa.
     */
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    /**
     * Holds value of property rif.
     */
    private String rif;

    /**
     * Getter for property rif.
     * @return Value of property rif.
     */
    public String getRif() {
        return this.rif;
    }

    /**
     * Setter for property rif.
     * @param rif New value of property rif.
     */
    public void setRif(String rif) {
        this.rif = rif;
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

    /**
     * Holds value of property confirmarpassword.
     */
    private String confirmarpassword;

    /**
     * Getter for property confirmarpassword.
     * @return Value of property confirmarpassword.
     */
    public String getConfirmarpassword() {
        return this.confirmarpassword;
    }

    /**
     * Setter for property confirmarpassword.
     * @param confirmarpassword New value of property confirmarpassword.
     */
    public void setConfirmarpassword(String confirmarpassword) {
        this.confirmarpassword = confirmarpassword;
    }

    /**
     * Holds value of property telefono.
     */
    private String telefono;

    /**
     * Getter for property telefono.
     * @return Value of property telefono.
     */
    public String getTelefono() {
        return this.telefono;
    }

    /**
     * Setter for property telefono.
     * @param telefono New value of property telefono.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Holds value of property direccion.
     */
    private String direccion;

    /**
     * Getter for property direccion.
     * @return Value of property direccion.
     */
    public String getDireccion() {
        return this.direccion;
    }

    /**
     * Setter for property direccion.
     * @param direccion New value of property direccion.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Holds value of property ciudad.
     */
    private String ciudad;

    /**
     * Getter for property ciudad.
     * @return Value of property ciudad.
     */
    public String getCiudad() {
        return this.ciudad;
    }

    /**
     * Setter for property ciudad.
     * @param ciudad New value of property ciudad.
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Holds value of property pais.
     */
    private String pais;

    /**
     * Getter for property pais.
     * @return Value of property pais.
     */
    public String getPais() {
        return this.pais;
    }

    /**
     * Setter for property pais.
     * @param pais New value of property pais.
     */
    public void setPais(String pais) {
        this.pais = pais;
    }




}