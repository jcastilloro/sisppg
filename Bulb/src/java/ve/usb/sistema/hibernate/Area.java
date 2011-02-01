package ve.usb.sistema.hibernate;



public class Area implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of Area */
    public Area() {}
    
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
     * Holds value of property idArea.
     */
    private long idArea;

    /**
     * Getter for property idArea.
     * @return Value of property idArea.
     */
    public long getIdArea() {
        return this.idArea;
    }

    /**
     * Setter for property idArea.
     * @param idArea New value of property idArea.
     */
    public void setIdArea(long idArea) {
        this.id = this.idArea = idArea;
    }

    /**
     * Holds value of property nombreArea.
     */
    private String nombreArea = "";

    /**
     * Getter for property nombreArea.
     * @return Value of property nombreArea.
     */
    public String getNombreArea() {
        return this.nombreArea;
    }

    /**
     * Setter for property nombreArea.
     * @param nombreArea New value of property nombreArea.
     */
    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    /**
     * Holds value of property codigo_Area.
     */
    private String codigo_Area = "";

    /**
     * Getter for property codigo_Area.
     * @return Value of property codigo_Area.
     */
    public String getCodigo_Area() {
        return this.codigo_Area;
    }

    /**
     * Setter for property codigo_Area.
     * @param codigo_Area New value of property codigo_Area.
     */
    public void setCodigo_Area(String codigo_Area) {
        this.codigo_Area = codigo_Area;
    }




    public String toString() {
        return "<Area id='C" + this.id +
      //idArea
      "\" nombreArea =\"" + nombreArea +
      "\" codigo_Area =\"" + codigo_Area +

        "'/>";
    }

}