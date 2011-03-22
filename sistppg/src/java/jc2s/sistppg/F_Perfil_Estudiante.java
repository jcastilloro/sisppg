package jc2s.sistppg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_Perfil_Estudiante extends org.apache.struts.action.ActionForm {
    
    
    public F_Perfil_Estudiante() {
        super();
        nombre = "";
        apellido = "";
        cedula = "";
        email = "";
        telefono = "";
        carrera = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        nombre = "";
        apellido = "";
        cedula = "";
        email = "";
        telefono = "";
        carrera = "";

    }

    public static F_Perfil_Estudiante clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_Perfil_Estudiante fF_Perfil_Estudiante = (F_Perfil_Estudiante) sess.getAttribute("F_Perfil_Estudiante");
        if (fF_Perfil_Estudiante == null) {
            fF_Perfil_Estudiante = new F_Perfil_Estudiante();
            sess.setAttribute("F_Perfil_Estudiante", fF_Perfil_Estudiante);
        } else {
            fF_Perfil_Estudiante.reset(mapping, request);
        }
        return fF_Perfil_Estudiante;
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
     * Holds value of property apellido.
     */
    private String apellido;

    /**
     * Getter for property apellido.
     * @return Value of property apellido.
     */
    public String getApellido() {
        return this.apellido;
    }

    /**
     * Setter for property apellido.
     * @param apellido New value of property apellido.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
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
     * Holds value of property carrera.
     */
    private String carrera;

    /**
     * Getter for property carrera.
     * @return Value of property carrera.
     */
    public String getCarrera() {
        return this.carrera;
    }

    /**
     * Setter for property carrera.
     * @param carrera New value of property carrera.
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }




}