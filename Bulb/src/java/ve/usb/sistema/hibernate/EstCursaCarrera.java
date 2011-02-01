package ve.usb.sistema.hibernate;



public class EstCursaCarrera implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of EstCursaCarrera */
    public EstCursaCarrera() {}
    
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
     * Holds value of property idEstCursaCarrera.
     */
    private long idEstCursaCarrera;

    /**
     * Getter for property idEstCursaCarrera.
     * @return Value of property idEstCursaCarrera.
     */
    public long getIdEstCursaCarrera() {
        return this.idEstCursaCarrera;
    }

    /**
     * Setter for property idEstCursaCarrera.
     * @param idEstCursaCarrera New value of property idEstCursaCarrera.
     */
    public void setIdEstCursaCarrera(long idEstCursaCarrera) {
        this.id = this.idEstCursaCarrera = idEstCursaCarrera;
    }

    /**
     * Holds value of property codigoEstudiante.
     */
    private String codigoEstudiante = "";

    /**
     * Getter for property codigoEstudiante.
     * @return Value of property codigoEstudiante.
     */
    public String getCodigoEstudiante() {
        return this.codigoEstudiante;
    }

    /**
     * Setter for property codigoEstudiante.
     * @param codigoEstudiante New value of property codigoEstudiante.
     */
    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    /**
     * Holds value of property codigoCarrera.
     */
    private String codigoCarrera = "";

    /**
     * Getter for property codigoCarrera.
     * @return Value of property codigoCarrera.
     */
    public String getCodigoCarrera() {
        return this.codigoCarrera;
    }

    /**
     * Setter for property codigoCarrera.
     * @param codigoCarrera New value of property codigoCarrera.
     */
    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }




    public String toString() {
        return "<EstCursaCarrera id='C" + this.id +
      //idEstCursaCarrera
      "\" codigoEstudiante =\"" + codigoEstudiante +
      "\" codigoCarrera =\"" + codigoCarrera +

        "'/>";
    }

}