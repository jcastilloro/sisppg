package jc2s.sistppg.hibernate;



public class TutorIndustrial implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of TutorIndustrial */
    public TutorIndustrial() {}
    
    /**
     * Holds value of property id.
     */
    private Long id;

    /**
     * Getter for property id.
     * @return Value of property id.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Holds value of property idTutorIndustrial.
     */
    private long idTutorIndustrial;

    /**
     * Getter for property idTutorIndustrial.
     * @return Value of property idTutorIndustrial.
     */
    public long getIdTutorIndustrial() {
        return this.idTutorIndustrial;
    }

    /**
     * Setter for property idTutorIndustrial.
     * @param idTutorIndustrial New value of property idTutorIndustrial.
     */
    public void setIdTutorIndustrial(long idTutorIndustrial) {
        this.id = this.idTutorIndustrial = idTutorIndustrial;
    }

    /**
     * Holds value of property nombre.
     */
    private String nombre = "";

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
     * Holds value of property cedula.
     */
    private String cedula = "";

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
    private String email = "";

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
    private String telefono = "";

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
    private Empresa empresa;

    /**
     * Getter for property empresa.
     * @return Value of property empresa.
     */
    public Empresa getEmpresa() {
        return this.empresa;
    }

    /**
     * Setter for property empresa.
     * @param empresa New value of property empresa.
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }



    public String toString() {
        return "<TutorIndustrial id='C" + this.id +
      //idTutorIndustrial
      "\" nombre =\"" + nombre +
      "\" cedula =\"" + cedula +
      "\" email =\"" + email +
      "\" telefono =\"" + telefono +
        ((empresa==null) ? "" : "\" empresa =\"C" + empresa.getId()) +


        "'/>";
    }

}