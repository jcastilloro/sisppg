package ve.usb.sistema.hibernate;



public class RelPPGArea implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of RelPPGArea */
    public RelPPGArea() {}
    
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
     * Holds value of property idRelPPGArea.
     */
    private long idRelPPGArea;

    /**
     * Getter for property idRelPPGArea.
     * @return Value of property idRelPPGArea.
     */
    public long getIdRelPPGArea() {
        return this.idRelPPGArea;
    }

    /**
     * Setter for property idRelPPGArea.
     * @param idRelPPGArea New value of property idRelPPGArea.
     */
    public void setIdRelPPGArea(long idRelPPGArea) {
        this.id = this.idRelPPGArea = idRelPPGArea;
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

    /**
     * Holds value of property numPPG.
     */
    private int numPPG;

    /**
     * Getter for property numPPG.
     * @return Value of property numPPG.
     */
    public int getNumPPG() {
        return this.numPPG;
    }

    /**
     * Setter for property numPPG.
     * @param numPPG New value of property numPPG.
     */
    public void setNumPPG(int numPPG) {
        this.numPPG = numPPG;
    }




    public String toString() {
        return "<RelPPGArea id='C" + this.id +
      //idRelPPGArea
      "\" codigo_Area =\"" + codigo_Area +
      "\" numPPG =\"" + numPPG +

        "'/>";
    }

}