package ve.usb.sistema.hibernate;



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
     * Holds value of property nombreTI.
     */
    private String nombreTI = "";

    /**
     * Getter for property nombreTI.
     * @return Value of property nombreTI.
     */
    public String getNombreTI() {
        return this.nombreTI;
    }

    /**
     * Setter for property nombreTI.
     * @param nombreTI New value of property nombreTI.
     */
    public void setNombreTI(String nombreTI) {
        this.nombreTI = nombreTI;
    }

    /**
     * Holds value of property profesionTI.
     */
    private String profesionTI = "";

    /**
     * Getter for property profesionTI.
     * @return Value of property profesionTI.
     */
    public String getProfesionTI() {
        return this.profesionTI;
    }

    /**
     * Setter for property profesionTI.
     * @param profesionTI New value of property profesionTI.
     */
    public void setProfesionTI(String profesionTI) {
        this.profesionTI = profesionTI;
    }

    /**
     * Holds value of property cargoTI.
     */
    private String cargoTI = "";

    /**
     * Getter for property cargoTI.
     * @return Value of property cargoTI.
     */
    public String getCargoTI() {
        return this.cargoTI;
    }

    /**
     * Setter for property cargoTI.
     * @param cargoTI New value of property cargoTI.
     */
    public void setCargoTI(String cargoTI) {
        this.cargoTI = cargoTI;
    }

    /**
     * Holds value of property departamentoTI.
     */
    private String departamentoTI = "";

    /**
     * Getter for property departamentoTI.
     * @return Value of property departamentoTI.
     */
    public String getDepartamentoTI() {
        return this.departamentoTI;
    }

    /**
     * Setter for property departamentoTI.
     * @param departamentoTI New value of property departamentoTI.
     */
    public void setDepartamentoTI(String departamentoTI) {
        this.departamentoTI = departamentoTI;
    }

    /**
     * Holds value of property direccionTI.
     */
    private String direccionTI = "";

    /**
     * Getter for property direccionTI.
     * @return Value of property direccionTI.
     */
    public String getDireccionTI() {
        return this.direccionTI;
    }

    /**
     * Setter for property direccionTI.
     * @param direccionTI New value of property direccionTI.
     */
    public void setDireccionTI(String direccionTI) {
        this.direccionTI = direccionTI;
    }

    /**
     * Holds value of property correoTI.
     */
    private String correoTI = "";

    /**
     * Getter for property correoTI.
     * @return Value of property correoTI.
     */
    public String getCorreoTI() {
        return this.correoTI;
    }

    /**
     * Setter for property correoTI.
     * @param correoTI New value of property correoTI.
     */
    public void setCorreoTI(String correoTI) {
        this.correoTI = correoTI;
    }

    /**
     * Holds value of property telefonoTI.
     */
    private String telefonoTI = "";

    /**
     * Getter for property telefonoTI.
     * @return Value of property telefonoTI.
     */
    public String getTelefonoTI() {
        return this.telefonoTI;
    }

    /**
     * Setter for property telefonoTI.
     * @param telefonoTI New value of property telefonoTI.
     */
    public void setTelefonoTI(String telefonoTI) {
        this.telefonoTI = telefonoTI;
    }

    /**
     * Holds value of property codigoEmpresa.
     */
    private String codigoEmpresa = "";

    /**
     * Getter for property codigoEmpresa.
     * @return Value of property codigoEmpresa.
     */
    public String getCodigoEmpresa() {
        return this.codigoEmpresa;
    }

    /**
     * Setter for property codigoEmpresa.
     * @param codigoEmpresa New value of property codigoEmpresa.
     */
    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    /**
     * Holds value of property cedulaTI.
     */
    private String cedulaTI = "";

    /**
     * Getter for property cedulaTI.
     * @return Value of property cedulaTI.
     */
    public String getCedulaTI() {
        return this.cedulaTI;
    }

    /**
     * Setter for property cedulaTI.
     * @param cedulaTI New value of property cedulaTI.
     */
    public void setCedulaTI(String cedulaTI) {
        this.cedulaTI = cedulaTI;
    }




    public String toString() {
        return "<TutorIndustrial id='C" + this.id +
      //idTutorIndustrial
      "\" nombreTI =\"" + nombreTI +
      "\" profesionTI =\"" + profesionTI +
      "\" cargoTI =\"" + cargoTI +
      "\" departamentoTI =\"" + departamentoTI +
      "\" direccionTI =\"" + direccionTI +
      "\" correoTI =\"" + correoTI +
      "\" telefonoTI =\"" + telefonoTI +
      "\" codigoEmpresa =\"" + codigoEmpresa +
      "\" cedulaTI =\"" + cedulaTI +

        "'/>";
    }

}