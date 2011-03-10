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
        tiempoFaseI = "";;
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