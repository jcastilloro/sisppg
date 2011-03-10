package ve.usb.sistema.hibernate;



public class Plantrabajo implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of Plantrabajo */
    public Plantrabajo() {}
    
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
     * Holds value of property idPlantrabajo.
     */
    private long idPlantrabajo;

    /**
     * Getter for property idPlantrabajo.
     * @return Value of property idPlantrabajo.
     */
    public long getIdPlantrabajo() {
        return this.idPlantrabajo;
    }

    /**
     * Setter for property idPlantrabajo.
     * @param idPlantrabajo New value of property idPlantrabajo.
     */
    public void setIdPlantrabajo(long idPlantrabajo) {
        this.id = this.idPlantrabajo = idPlantrabajo;
    }

    /**
     * Holds value of property empresa.
     */
    private String empresa = "";

    /**
     * Getter for property empresa.
     * @return Value of property empresa.
     */
    public String getEmpresa() {
        return this.empresa;
    }

    /**
     * Setter for property empresa.
     * @param empresa New value of property empresa.
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * Holds value of property tituloPasantia.
     */
    private String tituloPasantia = "";

    /**
     * Getter for property tituloPasantia.
     * @return Value of property tituloPasantia.
     */
    public String getTituloPasantia() {
        return this.tituloPasantia;
    }

    /**
     * Setter for property tituloPasantia.
     * @param tituloPasantia New value of property tituloPasantia.
     */
    public void setTituloPasantia(String tituloPasantia) {
        this.tituloPasantia = tituloPasantia;
    }

    /**
     * Holds value of property areaProyecto.
     */
    private String areaProyecto = "";

    /**
     * Getter for property areaProyecto.
     * @return Value of property areaProyecto.
     */
    public String getAreaProyecto() {
        return this.areaProyecto;
    }

    /**
     * Setter for property areaProyecto.
     * @param areaProyecto New value of property areaProyecto.
     */
    public void setAreaProyecto(String areaProyecto) {
        this.areaProyecto = areaProyecto;
    }

    /**
     * Holds value of property resumenProyecto.
     */
    private String resumenProyecto = "";

    /**
     * Getter for property resumenProyecto.
     * @return Value of property resumenProyecto.
     */
    public String getResumenProyecto() {
        return this.resumenProyecto;
    }

    /**
     * Setter for property resumenProyecto.
     * @param resumenProyecto New value of property resumenProyecto.
     */
    public void setResumenProyecto(String resumenProyecto) {
        this.resumenProyecto = resumenProyecto;
    }

    /**
     * Holds value of property objetivosPasantias.
     */
    private String objetivosPasantias = "";

    /**
     * Getter for property objetivosPasantias.
     * @return Value of property objetivosPasantias.
     */
    public String getObjetivosPasantias() {
        return this.objetivosPasantias;
    }

    /**
     * Setter for property objetivosPasantias.
     * @param objetivosPasantias New value of property objetivosPasantias.
     */
    public void setObjetivosPasantias(String objetivosPasantias) {
        this.objetivosPasantias = objetivosPasantias;
    }

    /**
     * Holds value of property fasesPasantia.
     */
    private String fasesPasantia = "";

    /**
     * Getter for property fasesPasantia.
     * @return Value of property fasesPasantia.
     */
    public String getFasesPasantia() {
        return this.fasesPasantia;
    }

    /**
     * Setter for property fasesPasantia.
     * @param fasesPasantia New value of property fasesPasantia.
     */
    public void setFasesPasantia(String fasesPasantia) {
        this.fasesPasantia = fasesPasantia;
    }

     /**
     * Holds value of property codigopt.
     */
    private int codigopt;

    /**
     * Getter for property codigopt.
     * @return Value of property codigopt.
     */
    public int getCodigopt() {
        return this.codigopt;
    }

    /**
     * Setter for property codigopt.
     * @param codigopt New value of property codigopt.
     */
    public void setCodigopt(int codigopt) {
        this.codigopt = codigopt;
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
     * Holds value of property codigoTA.
     */
    private String codigoTA = "";

    /**
     * Getter for property codigoTA.
     * @return Value of property codigoTA.
     */
    public String getCodigoTA() {
        return this.codigoTA;
    }

    /**
     * Setter for property codigoTA.
     * @param codigoTA New value of property codigoTA.
     */
    public void setCodigoTA(String codigoTA) {
        this.codigoTA = codigoTA;
    }


    public String toString() {
        return "<Plantrabajo id='C" + this.id +
      //idPlantrabajo
      "\" empresa =\"" + empresa +
      "\" tituloPasantia =\"" + tituloPasantia +
      "\" areaProyecto =\"" + areaProyecto +
      "\" resumenProyecto =\"" + resumenProyecto +
      "\" objetivosPasantias =\"" + objetivosPasantias +
      "\" fasesPasantia =\"" + fasesPasantia +
      "\" codigopt =\"" + codigopt +
      "\" codigoTI =\"" + codigoTI +
      "\" codigoTA =\"" + codigoTA +

        "'/>";
    }

}