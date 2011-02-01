package ve.usb.sistema.hibernate;



public class EvalProy implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of EvalProy */
    public EvalProy() {}
    
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
     * Holds value of property idEvalProy.
     */
    private long idEvalProy;

    /**
     * Getter for property idEvalProy.
     * @return Value of property idEvalProy.
     */
    public long getIdEvalProy() {
        return this.idEvalProy;
    }

    /**
     * Setter for property idEvalProy.
     * @param idEvalProy New value of property idEvalProy.
     */
    public void setIdEvalProy(long idEvalProy) {
        this.id = this.idEvalProy = idEvalProy;
    }

    /**
     * Holds value of property codigoProy.
     */
    private int codigoProy;

    /**
     * Getter for property codigoProy.
     * @return Value of property codigoProy.
     */
    public int getCodigoProy() {
        return this.codigoProy;
    }

    /**
     * Setter for property codigoProy.
     * @param codigoProy New value of property codigoProy.
     */
    public void setCodigoProy(int codigoProy) {
        this.codigoProy = codigoProy;
    }

    /**
     * Holds value of property evaluacion.
     */
    private String evaluacion = "";

    /**
     * Getter for property evaluacion.
     * @return Value of property evaluacion.
     */
    public String getEvaluacion() {
        return this.evaluacion;
    }

    /**
     * Setter for property evaluacion.
     * @param evaluacion New value of property evaluacion.
     */
    public void setEvaluacion(String evaluacion) {
        this.evaluacion = evaluacion;
    }

    /**
     * Holds value of property descripcion.
     */
    private String descripcion = "";

    /**
     * Getter for property descripcion.
     * @return Value of property descripcion.
     */
    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     * Setter for property descripcion.
     * @param descripcion New value of property descripcion.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




    public String toString() {
        return "<EvalProy id='C" + this.id +
      //idEvalProy
      "\" codigoProy =\"" + codigoProy +
      "\" evaluacion =\"" + evaluacion +
      "\" descripcion =\"" + descripcion +

        "'/>";
    }

}