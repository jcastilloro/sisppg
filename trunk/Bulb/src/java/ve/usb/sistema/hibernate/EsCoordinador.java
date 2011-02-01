package ve.usb.sistema.hibernate;



public class EsCoordinador implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of EsCoordinador */
    public EsCoordinador() {}
    
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
     * Holds value of property idEsCoordinador.
     */
    private long idEsCoordinador;

    /**
     * Getter for property idEsCoordinador.
     * @return Value of property idEsCoordinador.
     */
    public long getIdEsCoordinador() {
        return this.idEsCoordinador;
    }

    /**
     * Setter for property idEsCoordinador.
     * @param idEsCoordinador New value of property idEsCoordinador.
     */
    public void setIdEsCoordinador(long idEsCoordinador) {
        this.id = this.idEsCoordinador = idEsCoordinador;
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
     * Holds value of property coordinaCarrera.
     */
    private String coordinaCarrera = "";

    /**
     * Getter for property coordinaCarrera.
     * @return Value of property coordinaCarrera.
     */
    public String getCoordinaCarrera() {
        return this.coordinaCarrera;
    }

    /**
     * Setter for property coordinaCarrera.
     * @param coordinaCarrera New value of property coordinaCarrera.
     */
    public void setCoordinaCarrera(String coordinaCarrera) {
        this.coordinaCarrera = coordinaCarrera;
    }




    public String toString() {
        return "<EsCoordinador id='C" + this.id +
      //idEsCoordinador
      "\" codigoProfesor =\"" + codigoProfesor +
      "\" coordinaCarrera =\"" + coordinaCarrera +

        "'/>";
    }

}