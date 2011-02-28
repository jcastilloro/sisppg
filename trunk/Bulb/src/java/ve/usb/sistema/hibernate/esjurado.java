package ve.usb.sistema.hibernate;

import ve.usb.cohesion.runtime.LocalDate;

/**
 *
 * @author chitty
 */
public class esjurado implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of esjurado */
    public esjurado() {}

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
     * Holds value of property idesjurado.
     */
    private long idesjurado;

    /**
     * Getter for property idesjurado.
     * @return Value of property idesjurado.
     */
    public long getidesjurado() {
        return this.idesjurado;
    }

    /**
     * Setter for property idesjurado.
     * @param idesjurado New value of property idesjurado.
     */
    public void setidesjurado(long idesjurado) {
        this.idesjurado = this.idesjurado = idesjurado;
    }

    /**
     * Holds value of property nombreppg.
     */
    private String nombreppg = "";

    /**
     * Getter for property nombreppg.
     * @return Value of property nombreppg.
     */
    public String getnombreppg() {
        return this.nombreppg;
    }

    /**
     * Setter for property nombreppg.
     * @param nombreppg New value of property nombreppg.
     */
    public void setnombreppg(String nombreppg) {
        this.nombreppg = nombreppg;
    }

    /**
     * Holds value of property fechaasignacion.
     */
    private java.util.Date fechaasignacion;

    /**
     * Getter for property fechaasignacion.
     * @return Value of property fechaasignacion.
     */
    public java.util.Date getfechaasignacion() {
        return this.fechaasignacion;
    }

    /**
     * Setter for property fechaasignacion.
     * @param fechaasignacion New value of property fechaasignacion.
     */
    public void setfechaasignacion(java.util.Date fechaasignacion) {
        if (fechaasignacion==null || fechaasignacion instanceof LocalDate)
            this.fechaasignacion = fechaasignacion;
        else this.fechaasignacion = new LocalDate(fechaasignacion);
    }

    /**
     * Holds value of property fechadefensa.
     */
    private java.util.Date fechadefensa;

    /**
     * Getter for property fechadefensa.
     * @return Value of property fechadefensa.
     */
    public java.util.Date getfechadefensa() {
        return this.fechadefensa;
    }

    /**
     * Setter for property fechadefensa.
     * @param fechadefensa New value of property fechadefensa.
     */
    public void setfechadefensa(java.util.Date fechadefensa) {
        if (fechadefensa==null || fechadefensa instanceof LocalDate)
            this.fechadefensa = fechadefensa;
        else this.fechadefensa = new LocalDate(fechadefensa);
    }

    /**
     * Holds value of property areajurado.
     */
    private String areajurado = "";

    /**
     * Getter for property areajurado.
     * @return Value of property areajurado.
     */
    public String getareajurado() {
        return this.areajurado;
    }

    /**
     * Setter for property areajurado.
     * @param areajurado New value of property areajurado.
     */
    public void setareajurado(String areajurado) {
        this.areajurado = areajurado;
    }

    /**
     * Holds value of property areaproyecto.
     */
    private String areaproyecto = "";

    /**
     * Getter for property areaproyecto.
     * @return Value of property areaproyecto.
     */
    public String getareaproyecto() {
        return this.areaproyecto;
    }

    /**
     * Setter for property areaproyecto.
     * @param areaproyecto New value of property areaproyecto.
     */
    public void setareaproyecto(String areaproyecto) {
        this.areaproyecto = areaproyecto;
    }

   /**
     * Holds value of property nombreprofesor.
     */
    private String nombreprofesor = "";

    /**
     * Getter for property nombreprofesor.
     * @return Value of property nombreprofesor.
     */
    public String getnombreprofesor() {
        return this.nombreprofesor;
    }

    /**
     * Setter for property nombreprofesor.
     * @param nombreprofesor New value of property nombreprofesor.
     */
    public void setnombreprofesor(String nombreprofesor) {
        this.nombreprofesor = nombreprofesor;
    }

    /**
     * Holds value of property idpasantia.
     */
    private int idpasantia = 0;

    /**
     * Getter for property idpasantia.
     * @return Value of property idpasantia.
     */
    public int getidpasantia() {
        return this.idpasantia;
    }

    /**
     * Setter for property idpasantia.
     * @param idpasantia New value of property idpasantia.
     */
    public void setidpasantia(int idpasantia) {
        this.idpasantia = idpasantia;
    }

    /**
     * Holds value of property idppg.
     */
    private int idppg = 0;

    /**
     * Getter for property idppg.
     * @return Value of property idppg.
     */
    public int getidppg() {
        return this.idppg;
    }

    /**
     * Setter for property idppg.
     * @param idppg New value of property idppg.
     */
    public void setidppg(int idppg) {
        this.idppg = idppg;
    }

    /**
     * Holds value of property pasantia.
     */
    private String pasantia = "";

    /**
     * Getter for property pasantia.
     * @return Value of property pasantia.
     */
    public String getpasantia() {
        return this.pasantia;
    }

    /**
     * Setter for property pasantia.
     * @param pasantia New value of property pasantia.
     */
    public void setpasantia(String pasantia) {
        this.pasantia = pasantia;
    }
    
    /**
     * Holds value of property esppg.
     */
    private boolean esppg = false;

    /**
     * Getter for property esppg.
     * @return Value of property esppg.
     */
    public boolean getesppg() {
        return this.esppg;
    }

    /**
     * Setter for property esppg.
     * @param esppg New value of property esppg.
     */
    public void setesppg(boolean esppg) {
        this.esppg = esppg;
    }
    
    /**
     * Holds value of property tutoreo.
     */
    private int tutoreo = 0;

    /**
     * Getter for property tutoreo.
     * @return Value of property tutoreo.
     */
    public int gettutoreo() {
        return this.tutoreo;
    }

    /**
     * Setter for property tutoreo.
     * @param tutoreo New value of property tutoreo.
     */
    public void settutoreo(int tutoreo) {
        this.tutoreo = tutoreo;
    }   


    public String toString() {
        return "<esjurado id='C" + this.id +
      //idEstudiante
      "\" nombreppg =\"" + nombreppg +
      "\" fechaasignacion =\"" + fechaasignacion +
      "\" fechadefensa =\"" + fechadefensa +
      "\" areajurado =\"" + areajurado +
      "\" areaproyecto =\"" + areaproyecto +
      "\" nombreprofesor =\"" + nombreprofesor +
      "\" idpasantia =\"" + idpasantia +
      "\" idppg =\"" + idppg +
      "\" pasantia =\"" + pasantia +
      "\" esppg =\"" + esppg +
      "\" tutoreo =\"" + tutoreo +

        "'/>";
    }

}
