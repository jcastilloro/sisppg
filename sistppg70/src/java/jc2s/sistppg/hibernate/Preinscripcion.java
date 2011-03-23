package jc2s.sistppg.hibernate;

import ve.usb.cohesion.runtime.Timestamp;

public class Preinscripcion implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of Preinscripcion */
    public Preinscripcion() {}
    
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
     * Holds value of property idPreinscripcion.
     */
    private long idPreinscripcion;

    /**
     * Getter for property idPreinscripcion.
     * @return Value of property idPreinscripcion.
     */
    public long getIdPreinscripcion() {
        return this.idPreinscripcion;
    }

    /**
     * Setter for property idPreinscripcion.
     * @param idPreinscripcion New value of property idPreinscripcion.
     */
    public void setIdPreinscripcion(long idPreinscripcion) {
        this.id = this.idPreinscripcion = idPreinscripcion;
    }

    /**
     * Holds value of property carta_postulacion.
     */
    private String carta_postulacion = "";

    /**
     * Getter for property carta_postulacion.
     * @return Value of property carta_postulacion.
     */
    public String getCarta_postulacion() {
        return this.carta_postulacion;
    }

    /**
     * Setter for property carta_postulacion.
     * @param carta_postulacion New value of property carta_postulacion.
     */
    public void setCarta_postulacion(String carta_postulacion) {
        this.carta_postulacion = carta_postulacion;
    }

    /**
     * Holds value of property tipo.
     */
    private int tipo;

    /**
     * Getter for property tipo.
     * @return Value of property tipo.
     */
    public int getTipo() {
        return this.tipo;
    }

    /**
     * Setter for property tipo.
     * @param tipo New value of property tipo.
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * Holds value of property curriculum.
     */
    private String curriculum = "";

    /**
     * Getter for property curriculum.
     * @return Value of property curriculum.
     */
    public String getCurriculum() {
        return this.curriculum;
    }

    /**
     * Setter for property curriculum.
     * @param curriculum New value of property curriculum.
     */
    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    /**
     * Holds value of property por_graduar.
     */
    private boolean por_graduar;

    /**
     * Getter for property por_graduar.
     * @return Value of property por_graduar.
     */
    public boolean getPor_graduar() {
        return this.por_graduar;
    }

    /**
     * Setter for property por_graduar.
     * @param por_graduar New value of property por_graduar.
     */
    public void setPor_graduar(boolean por_graduar) {
        this.por_graduar = por_graduar;
    }

    /**
     * Holds value of property estudiante.
     */
    private Estudiante estudiante;

    /**
     * Getter for property estudiante.
     * @return Value of property estudiante.
     */
    public Estudiante getEstudiante() {
        return this.estudiante;
    }

    /**
     * Setter for property estudiante.
     * @param estudiante New value of property estudiante.
     */
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    /**
     * Holds value of property created_at.
     */
    private java.util.Date created_at;

    /**
     * Getter for property created_at.
     * @return Value of property created_at.
     */
    public java.util.Date getCreated_at() {
        return this.created_at;
    }

    /**
     * Setter for property created_at.
     * @param created_at New value of property created_at.
     */
    public void setCreated_at(java.util.Date created_at) {
        if (created_at==null || created_at instanceof Timestamp)
            this.created_at = created_at;
        else this.created_at = new Timestamp(created_at);
    }



    public String toString() {
        return "<Preinscripcion id='C" + this.id +
      //idPreinscripcion
      "\" carta_postulacion =\"" + carta_postulacion +
      "\" tipo =\"" + tipo +
      "\" curriculum =\"" + curriculum +
      "\" por_graduar =\"" + por_graduar +
        ((estudiante==null) ? "" : "\" estudiante =\"C" + estudiante.getId()) +

      "\" created_at =\"" + created_at +

        "'/>";
    }

}