package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionMapping;


public class F_ConsultarJurados extends org.apache.struts.action.ActionForm {


    public F_ConsultarJurados() {
        super();
        nombrePPG = "";
        dptoJurado = "";
        areaProyecto = "";
        nombreProfesor = "";
        fechaAsignacion = "";
        fechaDefensa = "";
        filtro = "";
    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
        nombrePPG = "";
        dptoJurado = "";
        areaProyecto = "";
        nombreProfesor = "";
        fechaAsignacion = "";
        fechaDefensa = "";
        filtro = "";
    }

    public static F_ConsultarJurados clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_ConsultarJurados fF_ConsultarJurados = (F_ConsultarJurados) sess.getAttribute("F_ConsultarJurados");
        if (fF_ConsultarJurados == null) {
            fF_ConsultarJurados = new F_ConsultarJurados();
            sess.setAttribute("F_ConsultarJurados", fF_ConsultarJurados);
        } else {
            fF_ConsultarJurados.reset(mapping, request);
        }
        return fF_ConsultarJurados;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property nombrePPG.
     */
    private String nombrePPG;

    /**
     * Getter for property nombrePPG.
     * @return Value of property nombrePPG.
     */
    public String getNombrePPG() {
        return this.nombrePPG;
    }

    /**
     * Setter for property nombrePPG.
     * @param nombrePPG New value of property nombrePPG.
     */
    public void setNombrePPG(String nombrePPG) {
        this.nombrePPG = nombrePPG;
    }


    private String dptoJurado;

    public void setDptoJurado(String areaJurado) {
        this.dptoJurado = areaJurado;
    }

    /**
     * Getter for property nombrePPG.
     * @return Value of property nombrePPG.
     */
    public String getDptoJurado() {
        return this.dptoJurado;
    }

    private String areaProyecto;

    public void setAreaProyecto(String areaProyecto) {
        this.areaProyecto = areaProyecto;
    }

    /**
     * Getter for property nombrePPG.
     * @return Value of property nombrePPG.
     */
    public String getAreaProyecto() {
        return this.areaProyecto;
    }

    private String nombreProfesor;

    /**
     * Getter for property nombrePPG.
     * @return Value of property nombrePPG.
     */
    public String getNombreProfesor() {
        return this.nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    private String fechaAsignacion;

    public void setFechaAsignacion(String date) {
        this.fechaAsignacion = date;
    }

    /**
     * Getter for property nombrePPG.
     * @return Value of property nombrePPG.
     */
    public String fechaAsignacion() {
        return this.fechaAsignacion;
    }

    /**
     * Holds value of property fechaDefensa.
     */
    private String fechaDefensa;

    /**
     * Getter for property fechaDefensa.
     * @return Value of property fechaDefensa.
     */
    public String getFechaDefensa() {
        return this.fechaDefensa;
    }

    /**
     * Setter for property fechaDefensa.
     * @param fechaDefensa New value of property fechaDefensa.
     */
    public void setFechaDefensa(String fechaPPG) {
        this.fechaDefensa = fechaPPG;
    }

  public String filtro;

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    public String tutoreos;

    public String getTutoreos() {
        return tutoreos;
    }

    public void setTutoreos(String filtro) {
        this.tutoreos = filtro;
    }

}