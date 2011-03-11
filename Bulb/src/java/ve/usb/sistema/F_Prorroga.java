package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_Prorroga extends org.apache.struts.action.ActionForm {


    public F_Prorroga() {
        super();
        coordinacion = "";
        nombre = "";
        codigoTutorAcademico = "";
        tituloPasantia = "";
        areaProyecto = "";
        fecha = "";
        justificacion = "";


    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
        coordinacion = "";
        nombre = "";
        codigoTutorAcademico = "";
        tituloPasantia = "";
        areaProyecto = "";
        fecha = "";
        justificacion = "";


    }

    public static F_Prorroga clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_Prorroga fF_Prorroga = (F_Prorroga) sess.getAttribute("F_Prorroga");
        if (fF_Prorroga == null) {
            fF_Prorroga = new F_Prorroga();
            sess.setAttribute("F_Prorroga", fF_Prorroga);
        } else {
            fF_Prorroga.reset(mapping, request);
        }
        return fF_Prorroga;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property empresa.
     */
    private String coordinacion;

    /**
     * Getter for property empresa.
     * @return Value of property empresa.
     */
    public String getCoordinacion() {
        return this.coordinacion;
    }

    /**
     * Setter for property empresa.
     * @param empresa New value of property empresa.
     */
    public void setCoordinacion(String coordinacion) {
        this.coordinacion = coordinacion;
    }

    /**
     * Holds value of property codigoTutorIndustrial.
     */
    private String nombre;

    /**
     * Getter for property codigoTutorIndustrial.
     * @return Value of property codigoTutorIndustrial.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Setter for property codigoTutorIndustrial.
     * @param codigoTutorIndustrial New value of property codigoTutorIndustrial.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    private String fecha;

    /**
     * Getter for property resumenProyecto.
     * @return Value of property resumenProyecto.
     */
    public String getFecha() {
        return this.fecha;
    }

    /**
     * Setter for property resumenProyecto.
     * @param resumenProyecto New value of property resumenProyecto.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Holds value of property objetivosPasantias.
     */
    private String justificacion;

    /**
     * Getter for property objetivosPasantias.
     * @return Value of property objetivosPasantias.
     */
    public String getJustificacion() {
        return this.justificacion;
    }

    /**
     * Setter for property objetivosPasantias.
     * @param objetivosPasantias New value of property objetivosPasantias.
     */
    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }





}
