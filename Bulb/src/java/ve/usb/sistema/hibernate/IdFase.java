package ve.usb.sistema.hibernate;

/**
 *
 * @author chitty
 */
public class IdFase implements java.io.Serializable {

    /** Creates a new instance of Fase */
    public IdFase() {}

    private long idPasantia;
    private int numero;

    /**
     * Getter for property idPasantia.
     * @return Value of property idPasantia.
     */
    public long getIdPasantia() {
        return this.idPasantia;
    }

    /**
     * Setter for property idPasantia.
     * @param idPasantia New value of property idPasantia.
     */
    public void setIdPasantia(long idPasantia) {
        this.idPasantia = idPasantia;
    }

    /**
     * Getter for property numero.
     * @return Value of property numero.
     */
    public int getNumero() {
        return this.numero;
    }

    /**
     * Setter for property numero.
     * @param numero New value of property numero.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

}
