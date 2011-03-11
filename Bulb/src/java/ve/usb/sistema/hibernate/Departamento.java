package ve.usb.sistema.hibernate;

/**
 *
 * @author chitty
 */
public class Departamento implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of Departamento */
    public Departamento() {}

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
     * Holds value of property idDpto.
     */
    private long idDpto;

    /**
     * Getter for property idDpto.
     * @return Value of property idDpto.
     */
    public long getIdDpto() {
        return this.idDpto;
    }

    /**
     * Setter for property idDpto.
     * @param idDpto New value of property idDpto.
     */
    public void setIdDpto(long idDpto) {
        this.id = this.idDpto = idDpto;
    }

    /**
     * Holds value of property nombreDpto.
     */
    private String nombreDpto = "";

    /**
     * Getter for property nombreDpto.
     * @return Value of property nombreDpto.
     */
    public String getNombreDpto() {
        return this.nombreDpto;
    }

    /**
     * Setter for property nombreDpto.
     * @param nombreDpto New value of property nombreDpto.
     */
    public void setNombreDpto(String nombreDpto) {
        this.nombreDpto = nombreDpto;
    }

    public String toString() {
        return "<Departamento id='C" + this.id +
      //idDpto
      "\" nombreArea =\"" + nombreDpto +
        "'/>";
    }

}
