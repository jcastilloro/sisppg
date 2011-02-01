package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_PlanTrabajo extends org.apache.struts.action.ActionForm {
    
    
    public F_PlanTrabajo() {
        super();
        empresa = "";
        codigoTutorIndustrial = "";
        codigoTutorAcademico = "";
        tituloPasantia = "";
        areaProyecto = "";
        resumenProyecto = "";
        objetivosPasantias = "";
        fasesPasantia = "";
        objetivoFaseI = "";
        actividadesFaseI = "";
        tiempoFaseI = "";
        objetivoFaseII = "";
        actividadesFaseII = "";
        tiempoFaseII = "";
        objetivoFaseIII = "";
        actividadesFaseIII = "";
        tiempoFaseIII = "";
        objetivoFaseIV = "";
        actividadesFaseIV = "";
        tiempoFaseIV = "";
        codigopt = 0;

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        empresa = "";
        codigoTutorIndustrial = "";
        codigoTutorAcademico = "";
        tituloPasantia = "";
        areaProyecto = "";
        resumenProyecto = "";
        objetivosPasantias = "";
        fasesPasantia = "";
        objetivoFaseI = "";
        actividadesFaseI = "";
        tiempoFaseI = "";
        objetivoFaseII = "";
        actividadesFaseII = "";
        tiempoFaseII = "";
        objetivoFaseIII = "";
        actividadesFaseIII = "";
        tiempoFaseIII = "";
        objetivoFaseIV = "";
        actividadesFaseIV = "";
        tiempoFaseIV = "";
        codigopt = 0;

    }

    public static F_PlanTrabajo clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_PlanTrabajo fF_PlanTrabajo = (F_PlanTrabajo) sess.getAttribute("F_PlanTrabajo");
        if (fF_PlanTrabajo == null) {
            fF_PlanTrabajo = new F_PlanTrabajo();
            sess.setAttribute("F_PlanTrabajo", fF_PlanTrabajo);
        } else {
            fF_PlanTrabajo.reset(mapping, request);
        }
        return fF_PlanTrabajo;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property empresa.
     */
    private String empresa;

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
     * Holds value of property codigoTutorIndustrial.
     */
    private String codigoTutorIndustrial;

    /**
     * Getter for property codigoTutorIndustrial.
     * @return Value of property codigoTutorIndustrial.
     */
    public String getCodigoTutorIndustrial() {
        return this.codigoTutorIndustrial;
    }

    /**
     * Setter for property codigoTutorIndustrial.
     * @param codigoTutorIndustrial New value of property codigoTutorIndustrial.
     */
    public void setCodigoTutorIndustrial(String codigoTutorIndustrial) {
        this.codigoTutorIndustrial = codigoTutorIndustrial;
    }

    /**
     * Holds value of property codigoTutorAcademico.
     */
    private String codigoTutorAcademico;

    /**
     * Getter for property codigoTutorAcademico.
     * @return Value of property codigoTutorAcademico.
     */
    public String getCodigoTutorAcademico() {
        return this.codigoTutorAcademico;
    }

    /**
     * Setter for property codigoTutorAcademico.
     * @param codigoTutorAcademico New value of property codigoTutorAcademico.
     */
    public void setCodigoTutorAcademico(String codigoTutorAcademico) {
        this.codigoTutorAcademico = codigoTutorAcademico;
    }

    /**
     * Holds value of property tituloPasantia.
     */
    private String tituloPasantia;

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
    private String areaProyecto;

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
    private String resumenProyecto;

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
    private String objetivosPasantias;

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
    private String fasesPasantia;

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
     * Holds value of property objetivoFaseI.
     */
    private String objetivoFaseI;

    /**
     * Getter for property objetivoFaseI.
     * @return Value of property objetivoFaseI.
     */
    public String getObjetivoFaseI() {
        return this.objetivoFaseI;
    }

    /**
     * Setter for property objetivoFaseI.
     * @param objetivoFaseI New value of property objetivoFaseI.
     */
    public void setObjetivoFaseI(String objetivoFaseI) {
        this.objetivoFaseI = objetivoFaseI;
    }

    /**
     * Holds value of property actividadesFaseI.
     */
    private String actividadesFaseI;

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
    private String tiempoFaseI;

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
     * Holds value of property objetivoFaseII.
     */
    private String objetivoFaseII;

    /**
     * Getter for property objetivoFaseII.
     * @return Value of property objetivoFaseII.
     */
    public String getObjetivoFaseII() {
        return this.objetivoFaseII;
    }

    /**
     * Setter for property objetivoFaseII.
     * @param objetivoFaseII New value of property objetivoFaseII.
     */
    public void setObjetivoFaseII(String objetivoFaseII) {
        this.objetivoFaseII = objetivoFaseII;
    }

    /**
     * Holds value of property actividadesFaseII.
     */
    private String actividadesFaseII;

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
    private String tiempoFaseII;

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
     * Holds value of property objetivoFaseIII.
     */
    private String objetivoFaseIII;

    /**
     * Getter for property objetivoFaseIII.
     * @return Value of property objetivoFaseIII.
     */
    public String getObjetivoFaseIII() {
        return this.objetivoFaseIII;
    }

    /**
     * Setter for property objetivoFaseIII.
     * @param objetivoFaseIII New value of property objetivoFaseIII.
     */
    public void setObjetivoFaseIII(String objetivoFaseIII) {
        this.objetivoFaseIII = objetivoFaseIII;
    }

    /**
     * Holds value of property actividadesFaseIII.
     */
    private String actividadesFaseIII;

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
    private String tiempoFaseIII;

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
     * Holds value of property objetivoFaseIV.
     */
    private String objetivoFaseIV;

    /**
     * Getter for property objetivoFaseIV.
     * @return Value of property objetivoFaseIV.
     */
    public String getObjetivoFaseIV() {
        return this.objetivoFaseIV;
    }

    /**
     * Setter for property objetivoFaseIV.
     * @param objetivoFaseIV New value of property objetivoFaseIV.
     */
    public void setObjetivoFaseIV(String objetivoFaseIV) {
        this.objetivoFaseIV = objetivoFaseIV;
    }

    /**
     * Holds value of property actividadesFaseIV.
     */
    private String actividadesFaseIV;

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
    private String tiempoFaseIV;

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




}