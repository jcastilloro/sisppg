package ve.usb.sistema.hibernate;

/**
 *
 * @author chitty
 */
public class Fase implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of Fase */
    public Fase() {}

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
     * Holds value of property idFase.
     */
    private IdFase idFase;

    /**
     * Getter for property idFase.
     * @return Value of property idFase.
     */
    public IdFase getIdFase() {
        return this.idFase;
    }

    /**
     * Setter for property idFase.
     * @param idFase New value of property idFase.
     */
    public void setIdFase(IdFase idFase) {
        this.idFase = idFase;
        this.id = idFase.getIdPasantia();
    }

    /**
     * Holds value of property objetivosFase.
     */
    private String objetivosFase = "";

    /**
     * Getter for property objetivosFase.
     * @return Value of property objetivosFase.
     */
    public String getObjetivosFase() {
        return this.objetivosFase;
    }

    /**
     * Setter for property objetivosFase.
     * @param objetivosFaseI New value of property objetivosFase.
     */
    public void setObjetivosFase(String objetivosFase) {
        this.objetivosFase = objetivosFase;
    }

    /**
     * Holds value of property actividadesFase.
     */
    private String actividadesFase = "";

    /**
     * Getter for property actividadesFase.
     * @return Value of property actividadesFase.
     */
    public String getActividadesFase() {
        return this.actividadesFase;
    }

    /**
     * Setter for property actividadesFase.
     * @param actividadesFase New value of property actividadesFase.
     */
    public void setActividadesFase(String actividadesFase) {
        this.actividadesFase = actividadesFase;
    }

    /**
     * Holds value of property tiempoFase.
     */
    private String tiempoFase = "";

    /**
     * Getter for property tiempoFase.
     * @return Value of property tiempoFase.
     */
    public String getTiempoFase() {
        return this.tiempoFase;
    }

    /**
     * Setter for property tiempoFase.
     * @param tiempoFase New value of property tiempoFase.
     */
    public void setTiempoFase(String tiempoFase) {
        this.tiempoFase = tiempoFase;
    }



    public String toString() {
        return "<Fase id='C" + this.idFase +

      "\" objetivosFase =\"" + objetivosFase +
      "\" actividadesFase =\"" + actividadesFase +
      "\" tiempoFase =\"" + tiempoFase +

        "'/>";
    }

}

