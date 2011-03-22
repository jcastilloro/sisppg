package jc2s.sistppg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_Tutor_Industrial extends org.apache.struts.action.ActionForm {
    
    
    public F_Tutor_Industrial() {
        super();
        nombre = "";
        email = "";
        cedula = "";
        telefono = "";
        empresa = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        nombre = "";
        email = "";
        cedula = "";
        telefono = "";
        empresa = "";

    }

    public static F_Tutor_Industrial clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_Tutor_Industrial fF_Tutor_Industrial = (F_Tutor_Industrial) sess.getAttribute("F_Tutor_Industrial");
        if (fF_Tutor_Industrial == null) {
            fF_Tutor_Industrial = new F_Tutor_Industrial();
            sess.setAttribute("F_Tutor_Industrial", fF_Tutor_Industrial);
        } else {
            fF_Tutor_Industrial.reset(mapping, request);
        }
        return fF_Tutor_Industrial;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property nombre.
     */
    private String nombre;

    /**
     * Getter for property nombre.
     * @return Value of property nombre.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Setter for property nombre.
     * @param nombre New value of property nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Holds value of property email.
     */
    private String email;

    /**
     * Getter for property email.
     * @return Value of property email.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for property email.
     * @param email New value of property email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Holds value of property cedula.
     */
    private String cedula;

    /**
     * Getter for property cedula.
     * @return Value of property cedula.
     */
    public String getCedula() {
        return this.cedula;
    }

    /**
     * Setter for property cedula.
     * @param cedula New value of property cedula.
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
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
     * Holds value of property empresa.
     */
    private String empresa;

    /**
     * Getter for property empresa.
     * @return Value of property empresa.
     */
    public String getEmpresa() {
        return this.empresa;
    }

    /**
     * Setter for property empresa.
     * @param empresa New value of property empresa.
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }




}