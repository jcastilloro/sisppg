package ve.usb.sistema.hibernate;



public class EstRealizaProy implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of EstRealizaProy */
    public EstRealizaProy() {}
    
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
     * Holds value of property idEstRealizaProy.
     */
    private long idEstRealizaProy;

    /**
     * Getter for property idEstRealizaProy.
     * @return Value of property idEstRealizaProy.
     */
    public long getIdEstRealizaProy() {
        return this.idEstRealizaProy;
    }

    /**
     * Setter for property idEstRealizaProy.
     * @param idEstRealizaProy New value of property idEstRealizaProy.
     */
    public void setIdEstRealizaProy(long idEstRealizaProy) {
        this.id = this.idEstRealizaProy = idEstRealizaProy;
    }

    /**
     * Holds value of property carnetEstudiante.
     */
    private String carnetEstudiante = "";

    /**
     * Getter for property carnetEstudiante.
     * @return Value of property carnetEstudiante.
     */
    public String getCarnetEstudiante() {
        return this.carnetEstudiante;
    }

    /**
     * Setter for property carnetEstudiante.
     * @param carnetEstudiante New value of property carnetEstudiante.
     */
    public void setCarnetEstudiante(String carnetEstudiante) {
        this.carnetEstudiante = carnetEstudiante;
    }

    /**
     * Holds value of property codigoproy.
     */
    private int codigoproy;

    /**
     * Getter for property codigoproy.
     * @return Value of property codigoproy.
     */
    public int getCodigoproy() {
        return this.codigoproy;
    }

    /**
     * Setter for property codigoproy.
     * @param codigoproy New value of property codigoproy.
     */
    public void setCodigoproy(int codigoproy) {
        this.codigoproy = codigoproy;
    }

    /**
     * Holds value of property tipoProy.
     */
    private int tipoProy;

    /**
     * Getter for property tipoProy.
     * @return Value of property tipoProy.
     */
    public int getTipoProy() {
        return this.tipoProy;
    }

    /**
     * Setter for property tipoProy.
     * @param tipoProy New value of property tipoProy.
     */
    public void setTipoProy(int tipoProy) {
        this.tipoProy = tipoProy;
    }




    public String toString() {
        return "<EstRealizaProy id='C" + this.id +
      //idEstRealizaProy
      "\" carnetEstudiante =\"" + carnetEstudiante +
      "\" codigoproy =\"" + codigoproy +
      "\" tipoProy =\"" + tipoProy +

        "'/>";
    }

}