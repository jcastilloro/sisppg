package ve.usb.sistema.hibernate;



public class Profesor implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of Profesor */
    public Profesor() {}
    
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
     * Holds value of property idProfesor.
     */
    private long idProfesor;

    /**
     * Getter for property idProfesor.
     * @return Value of property idProfesor.
     */
    public long getIdProfesor() {
        return this.idProfesor;
    }

    /**
     * Setter for property idProfesor.
     * @param idProfesor New value of property idProfesor.
     */
    public void setIdProfesor(long idProfesor) {
        this.id = this.idProfesor = idProfesor;
    }

    /**
     * Holds value of property nombreProfesor.
     */
    private String nombreProfesor = "";

    /**
     * Getter for property nombreProfesor.
     * @return Value of property nombreProfesor.
     */
    public String getNombreProfesor() {
        return this.nombreProfesor;
    }

    /**
     * Setter for property nombreProfesor.
     * @param nombreProfesor New value of property nombreProfesor.
     */
    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    /**
     * Holds value of property codigoProfesor.
     */
    private String codigoProfesor = "";

    /**
     * Getter for property codigoProfesor.
     * @return Value of property codigoProfesor.
     */
    public String getCodigoProfesor() {
        return this.codigoProfesor;
    }

    /**
     * Setter for property codigoProfesor.
     * @param codigoProfesor New value of property codigoProfesor.
     */
    public void setCodigoProfesor(String codigoProfesor) {
        this.codigoProfesor = codigoProfesor;
    }

    /**
     * Holds value of property departamentoUSB.
     */
    private String departamentoUSB = "";

    /**
     * Getter for property departamentoUSB.
     * @return Value of property departamentoUSB.
     */
    public String getDepartamentoUSB() {
        return this.departamentoUSB;
    }

    /**
     * Setter for property departamentoUSB.
     * @param departamentoUSB New value of property departamentoUSB.
     */
    public void setDepartamentoUSB(String departamentoUSB) {
        this.departamentoUSB = departamentoUSB;
    }

    /**
     * Holds value of property telefonoProfesor.
     */
    private String telefonoProfesor = "";

    /**
     * Getter for property telefonoProfesor.
     * @return Value of property telefonoProfesor.
     */
    public String getTelefonoProfesor() {
        return this.telefonoProfesor;
    }

    /**
     * Setter for property telefonoProfesor.
     * @param telefonoProfesor New value of property telefonoProfesor.
     */
    public void setTelefonoProfesor(String telefonoProfesor) {
        this.telefonoProfesor = telefonoProfesor;
    }

    /**
     * Holds value of property correoProfesor.
     */
    private String correoProfesor = "";

    /**
     * Getter for property correoProfesor.
     * @return Value of property correoProfesor.
     */
    public String getCorreoProfesor() {
        return this.correoProfesor;
    }

    /**
     * Setter for property correoProfesor.
     * @param correoProfesor New value of property correoProfesor.
     */
    public void setCorreoProfesor(String correoProfesor) {
        this.correoProfesor = correoProfesor;
    }




    public String toString() {
        return "<Profesor id='C" + this.id +
      //idProfesor
      "\" nombreProfesor =\"" + nombreProfesor +
      "\" codigoProfesor =\"" + codigoProfesor +
      "\" departamentoUSB =\"" + departamentoUSB +
      "\" telefonoProfesor =\"" + telefonoProfesor +
      "\" correoProfesor =\"" + correoProfesor +

        "'/>";
    }

}