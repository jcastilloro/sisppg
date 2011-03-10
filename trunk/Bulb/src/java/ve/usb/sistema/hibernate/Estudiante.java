package ve.usb.sistema.hibernate;

import ve.usb.cohesion.runtime.LocalDate;

public class Estudiante implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of Estudiante */
    public Estudiante() {}
    
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
     * Holds value of property idEstudiante.
     */
    private long idEstudiante;

    /**
     * Getter for property idEstudiante.
     * @return Value of property idEstudiante.
     */
    public long getIdEstudiante() {
        return this.idEstudiante;
    }

    /**
     * Setter for property idEstudiante.
     * @param idEstudiante New value of property idEstudiante.
     */
    public void setIdEstudiante(long idEstudiante) {
        this.id = this.idEstudiante = idEstudiante;
    }

    /**
     * Holds value of property carnetE.
     */
    private String carnetE = "";

    /**
     * Getter for property carnetE.
     * @return Value of property carnetE.
     */
    public String getCarnetE() {
        return this.carnetE;
    }

    /**
     * Setter for property carnetE.
     * @param carnetE New value of property carnetE.
     */
    public void setCarnetE(String carnetE) {
        this.carnetE = carnetE;
    }

    /**
     * Holds value of property nombreE.
     */
    private String nombreE = "";

    /**
     * Getter for property nombreE.
     * @return Value of property nombreE.
     */
    public String getNombreE() {
        return this.nombreE;
    }

    /**
     * Setter for property nombreE.
     * @param nombreE New value of property nombreE.
     */
    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    /**
     * Holds value of property apellidoE.
     */
    private String apellidoE = "";

    /**
     * Getter for property apellidoE.
     * @return Value of property apellidoE.
     */
    public String getApellidoE() {
        return this.apellidoE;
    }

    /**
     * Setter for property apellidoE.
     * @param apellidoE New value of property apellidoE.
     */
    public void setApellidoE(String apellidoE) {
        this.apellidoE = apellidoE;
    }

    /**
     * Holds value of property cedulaE.
     */
    private String cedulaE = "";

    /**
     * Getter for property cedulaE.
     * @return Value of property cedulaE.
     */
    public String getCedulaE() {
        return this.cedulaE;
    }

    /**
     * Setter for property cedulaE.
     * @param cedulaE New value of property cedulaE.
     */
    public void setCedulaE(String cedulaE) {
        this.cedulaE = cedulaE;
    }

    /**
     * Holds value of property indiceE.
     */
    private double indiceE;

    /**
     * Getter for property indiceE.
     * @return Value of property indiceE.
     */
    public double getIndiceE() {
        return this.indiceE;
    }

    /**
     * Setter for property indiceE.
     * @param indiceE New value of property indiceE.
     */
    public void setIndiceE(double indiceE) {
        this.indiceE = indiceE;
    }

    /**
     * Holds value of property sexoE.
     */
    private String sexoE = "";

    /**
     * Getter for property sexoE.
     * @return Value of property sexoE.
     */
    public String getSexoE() {
        return this.sexoE;
    }

    /**
     * Setter for property sexoE.
     * @param sexoE New value of property sexoE.
     */
    public void setSexoE(String sexoE) {
        this.sexoE = sexoE;
    }

    /**
     * Holds value of property nacionalidadE.
     */
    private String nacionalidadE = "";

    /**
     * Getter for property nacionalidadE.
     * @return Value of property nacionalidadE.
     */
    public String getNacionalidadE() {
        return this.nacionalidadE;
    }

    /**
     * Setter for property nacionalidadE.
     * @param nacionalidadE New value of property nacionalidadE.
     */
    public void setNacionalidadE(String nacionalidadE) {
        this.nacionalidadE = nacionalidadE;
    }

    /**
     * Holds value of property fechaNacimientoE.
     */
    private java.util.Date fechaNacimientoE;

    /**
     * Getter for property fechaNacimientoE.
     * @return Value of property fechaNacimientoE.
     */
    public java.util.Date getFechaNacimientoE() {
        return this.fechaNacimientoE;
    }

    /**
     * Setter for property fechaNacimientoE.
     * @param fechaNacimientoE New value of property fechaNacimientoE.
     */
    public void setFechaNacimientoE(java.util.Date fechaNacimientoE) {
        if (fechaNacimientoE==null || fechaNacimientoE instanceof LocalDate)
            this.fechaNacimientoE = fechaNacimientoE;
        else this.fechaNacimientoE = new LocalDate(fechaNacimientoE);
    }




    public String toString() {
        return "<Estudiante id='C" + this.id +
      //idEstudiante
      "\" carnetE =\"" + carnetE +
      "\" nombreE =\"" + nombreE +
      "\" cedulaE =\"" + cedulaE +
      "\" indiceE =\"" + indiceE +
      "\" sexoE =\"" + sexoE +
      "\" nacionalidadE =\"" + nacionalidadE +
      "\" fechaNacimientoE =\"" + fechaNacimientoE +

        "'/>";
    }

}