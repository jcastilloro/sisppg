package ve.usb.sistema.hibernate;



public class ProfTutoreaProy implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of ProfTutoreaProy */
    public ProfTutoreaProy() {}
    
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
     * Holds value of property idProfTutoreaProy.
     */
    private long idProfTutoreaProy;

    /**
     * Getter for property idProfTutoreaProy.
     * @return Value of property idProfTutoreaProy.
     */
    public long getIdProfTutoreaProy() {
        return this.idProfTutoreaProy;
    }

    /**
     * Setter for property idProfTutoreaProy.
     * @param idProfTutoreaProy New value of property idProfTutoreaProy.
     */
    public void setIdProfTutoreaProy(long idProfTutoreaProy) {
        this.id = this.idProfTutoreaProy = idProfTutoreaProy;
    }

    /**
     * Holds value of property idProfesor.
     */
    private String idProfesor = "";

    /**
     * Getter for property idProfesor.
     * @return Value of property idProfesor.
     */
    public String getIdProfesor() {
        return this.idProfesor;
    }

    /**
     * Setter for property idProfesor.
     * @param idProfesor New value of property idProfesor.
     */
    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    /**
     * Holds value of property numeroPPG.
     */
    private int numeroPPG;

    /**
     * Getter for property numeroPPG.
     * @return Value of property numeroPPG.
     */
    public int getNumeroPPG() {
        return this.numeroPPG;
    }

    /**
     * Setter for property numeroPPG.
     * @param numeroPPG New value of property numeroPPG.
     */
    public void setNumeroPPG(int numeroPPG) {
        this.numeroPPG = numeroPPG;
    }

    /**
     * Holds value of property tipoproytutor.
     */
    private int tipoproytutor;

    /**
     * Getter for property tipoproytutor.
     * @return Value of property tipoproytutor.
     */
    public int getTipoproytutor() {
        return this.tipoproytutor;
    }

    /**
     * Setter for property tipoproytutor.
     * @param tipoproytutor New value of property tipoproytutor.
     */
    public void setTipoproytutor(int tipoproytutor) {
        this.tipoproytutor = tipoproytutor;
    }




    public String toString() {
        return "<ProfTutoreaProy id='C" + this.id +
      //idProfTutoreaProy
      "\" idProfesor =\"" + idProfesor +
      "\" numeroPPG =\"" + numeroPPG +
      "\" tipoproytutor =\"" + tipoproytutor +

        "'/>";
    }

}