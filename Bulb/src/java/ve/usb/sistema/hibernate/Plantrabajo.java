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
     * Holds value of property objetivosFaseI.
     */
    private String objetivosFaseI = "";

    /**
     * Getter for property objetivosFaseI.
     * @return Value of property objetivosFaseI.
     */
    public String getObjetivosFaseI() {
        return this.objetivosFaseI;
    }

    /**
     * Setter for property objetivosFaseI.
     * @param objetivosFaseI New value of property objetivosFaseI.
     */
    public void setObjetivosFaseI(String objetivosFaseI) {
        this.objetivosFaseI = objetivosFaseI;
    }

    /**
     * Holds value of property actividadesFaseI.
     */
    private String actividadesFaseI = "";

    /**
     * Getter for property actividadesFaseI.
     * @return Value of property actividadesFaseI.
     */
    public String getActividadesFaseI() {
        return this.actividadesFaseI;
    }

    /**
     * Setter for property actividadesFaseI.
     * @param actividadesFaseI New value of property actividadesFaseI.
     */
    public void setActividadesFaseI(String actividadesFaseI) {
        this.actividadesFaseI = actividadesFaseI;
    }

    /**
     * Holds value of property tiempoFaseI.
     */
    private String tiempoFaseI = "";

    /**
     * Getter for property tiempoFaseI.
     * @return Value of property tiempoFaseI.
     */
    public String getTiempoFaseI() {
        return this.tiempoFaseI;
    }

    /**
     * Setter for property tiempoFaseI.
     * @param tiempoFaseI New value of property tiempoFaseI.
     */
    public void setTiempoFaseI(String tiempoFaseI) {
        this.tiempoFaseI = tiempoFaseI;
    }

    /**
     * Holds value of property objetivosFaseII.
     */
    private String objetivosFaseII = "";

    /**
     * Getter for property objetivosFaseII.
     * @return Value of property objetivosFaseII.
     */
    public String getObjetivosFaseII() {
        return this.objetivosFaseII;
    }

    /**
     * Setter for property objetivosFaseII.
     * @param objetivosFaseII New value of property objetivosFaseII.
     */
    public void setObjetivosFaseII(String objetivosFaseII) {
        this.objetivosFaseII = objetivosFaseII;
    }

    /**
     * Holds value of property actividadesFaseII.
     */
    private String actividadesFaseII = "";

    /**
     * Getter for property actividadesFaseII.
     * @return Value of property actividadesFaseII.
     */
    public String getActividadesFaseII() {
        return this.actividadesFaseII;
    }

    /**
     * Setter for property actividadesFaseII.
     * @param actividadesFaseII New value of property actividadesFaseII.
     */
    public void setActividadesFaseII(String actividadesFaseII) {
        this.actividadesFaseII = actividadesFaseII;
    }

    /**
     * Holds value of property tiempoFaseII.
     */
    private String tiempoFaseII = "";

    /**
     * Getter for property tiempoFaseII.
     * @return Value of property tiempoFaseII.
     */
    public String getTiempoFaseII() {
        return this.tiempoFaseII;
    }

    /**
     * Setter for property tiempoFaseII.
     * @param tiempoFaseII New value of property tiempoFaseII.
     */
    public void setTiempoFaseII(String tiempoFaseII) {
        this.tiempoFaseII = tiempoFaseII;
    }

    /**
     * Holds value of property objetivosFaseIII.
     */
    private String objetivosFaseIII = "";

    /**
     * Getter for property objetivosFaseIII.
     * @return Value of property objetivosFaseIII.
     */
    public String getObjetivosFaseIII() {
        return this.objetivosFaseIII;
    }

    /**
     * Setter for property objetivosFaseIII.
     * @param objetivosFaseIII New value of property objetivosFaseIII.
     */
    public void setObjetivosFaseIII(String objetivosFaseIII) {
        this.objetivosFaseIII = objetivosFaseIII;
    }

    /**
     * Holds value of property actividadesFaseIII.
     */
    private String actividadesFaseIII = "";

    /**
     * Getter for property actividadesFaseIII.
     * @return Value of property actividadesFaseIII.
     */
    public String getActividadesFaseIII() {
        return this.actividadesFaseIII;
    }

    /**
     * Setter for property actividadesFaseIII.
     * @param actividadesFaseIII New value of property actividadesFaseIII.
     */
    public void setActividadesFaseIII(String actividadesFaseIII) {
        this.actividadesFaseIII = actividadesFaseIII;
    }

    /**
     * Holds value of property tiempoFaseIII.
     */
    private String tiempoFaseIII = "";

    /**
     * Getter for property tiempoFaseIII.
     * @return Value of property tiempoFaseIII.
     */
    public String getTiempoFaseIII() {
        return this.tiempoFaseIII;
    }

    /**
     * Setter for property tiempoFaseIII.
     * @param tiempoFaseIII New value of property tiempoFaseIII.
     */
    public void setTiempoFaseIII(String tiempoFaseIII) {
        this.tiempoFaseIII = tiempoFaseIII;
    }

    /**
     * Holds value of property objetivosFaseIV.
     */
    private String objetivosFaseIV = "";

    /**
     * Getter for property objetivosFaseIV.
     * @return Value of property objetivosFaseIV.
     */
    public String getObjetivosFaseIV() {
        return this.objetivosFaseIV;
    }

    /**
     * Setter for property objetivosFaseIV.
     * @param objetivosFaseIV New value of property objetivosFaseIV.
     */
    public void setObjetivosFaseIV(String objetivosFaseIV) {
        this.objetivosFaseIV = objetivosFaseIV;
    }

    /**
     * Holds value of property actividadesFaseIV.
     */
    private String actividadesFaseIV = "";

    /**
     * Getter for property actividadesFaseIV.
     * @return Value of property actividadesFaseIV.
     */
    public String getActividadesFaseIV() {
        return this.actividadesFaseIV;
    }

    /**
     * Setter for property actividadesFaseIV.
     * @param actividadesFaseIV New value of property actividadesFaseIV.
     */
    public void setActividadesFaseIV(String actividadesFaseIV) {
        this.actividadesFaseIV = actividadesFaseIV;
    }

    /**
     * Holds value of property tiempoFaseIV.
     */
    private String tiempoFaseIV = "";

    /**
     * Getter for property tiempoFaseIV.
     * @return Value of property tiempoFaseIV.
     */
    public String getTiempoFaseIV() {
        return this.tiempoFaseIV;
    }

    /**
     * Setter for property tiempoFaseIV.
     * @param tiempoFaseIV New value of property tiempoFaseIV.
     */
    public void setTiempoFaseIV(String tiempoFaseIV) {
        this.tiempoFaseIV = tiempoFaseIV;
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
      "\" objetivosFaseI =\"" + objetivosFaseI +
      "\" actividadesFaseI =\"" + actividadesFaseI +
      "\" tiempoFaseI =\"" + tiempoFaseI +
      "\" objetivosFaseII =\"" + objetivosFaseII +
      "\" actividadesFaseII =\"" + actividadesFaseII +
      "\" tiempoFaseII =\"" + tiempoFaseII +
      "\" objetivosFaseIII =\"" + objetivosFaseIII +
      "\" actividadesFaseIII =\"" + actividadesFaseIII +
      "\" tiempoFaseIII =\"" + tiempoFaseIII +
      "\" objetivosFaseIV =\"" + objetivosFaseIV +
      "\" actividadesFaseIV =\"" + actividadesFaseIV +
      "\" tiempoFaseIV =\"" + tiempoFaseIV +
      "\" codigopt =\"" + codigopt +
      "\" codigoTI =\"" + codigoTI +
      "\" codigoTA =\"" + codigoTA +

        "'/>";
    }

}