package ve.usb.sistema.hibernate;



public class Carrera implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of Carrera */
    public Carrera() {}
    
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
     * Holds value of property idCarrera.
     */
    private long idCarrera;

    /**
     * Getter for property idCarrera.
     * @return Value of property idCarrera.
     */
    public long getIdCarrera() {
        return this.idCarrera;
    }

    /**
     * Setter for property idCarrera.
     * @param idCarrera New value of property idCarrera.
     */
    public void setIdCarrera(long idCarrera) {
        this.id = this.idCarrera = idCarrera;
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

    /**
     * Holds value of property nombreCarrera.
     */
    private String nombreCarrera = "";

    /**
     * Getter for property nombreCarrera.
     * @return Value of property nombreCarrera.
     */
    public String getNombreCarrera() {
        return this.nombreCarrera;
    }

    /**
     * Setter for property nombreCarrera.
     * @param nombreCarrera New value of property nombreCarrera.
     */
    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }




    public String toString() {
        return "<Carrera id='C" + this.id +
      //idCarrera
      "\" codigoCarrera =\"" + codigoCarrera +
      "\" nombreCarrera =\"" + nombreCarrera +

        "'/>";
    }

}