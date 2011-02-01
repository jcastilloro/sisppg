package ve.usb.sistema.hibernate;



public class TITutoreaPasantia implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of TITutoreaPasantia */
    public TITutoreaPasantia() {}
    
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
     * Holds value of property idTITutoreaPasantia.
     */
    private long idTITutoreaPasantia;

    /**
     * Getter for property idTITutoreaPasantia.
     * @return Value of property idTITutoreaPasantia.
     */
    public long getIdTITutoreaPasantia() {
        return this.idTITutoreaPasantia;
    }

    /**
     * Setter for property idTITutoreaPasantia.
     * @param idTITutoreaPasantia New value of property idTITutoreaPasantia.
     */
    public void setIdTITutoreaPasantia(long idTITutoreaPasantia) {
        this.id = this.idTITutoreaPasantia = idTITutoreaPasantia;
    }

    /**
     * Holds value of property codigoTI.
     */
    private String codigoTI = "";

    /**
     * Getter for property codigoTI.
     * @return Value of property codigoTI.
     */
    public String getCodigoTI() {
        return this.codigoTI;
    }

    /**
     * Setter for property codigoTI.
     * @param codigoTI New value of property codigoTI.
     */
    public void setCodigoTI(String codigoTI) {
        this.codigoTI = codigoTI;
    }

    /**
     * Holds value of property codigoPT.
     */
    private int codigoPT;

    /**
     * Getter for property codigoPT.
     * @return Value of property codigoPT.
     */
    public int getCodigoPT() {
        return this.codigoPT;
    }

    /**
     * Setter for property codigoPT.
     * @param codigoPT New value of property codigoPT.
     */
    public void setCodigoPT(int codigoPT) {
        this.codigoPT = codigoPT;
    }




    public String toString() {
        return "<TITutoreaPasantia id='C" + this.id +
      //idTITutoreaPasantia
      "\" codigoTI =\"" + codigoTI +
      "\" codigoPT =\"" + codigoPT +

        "'/>";
    }

}