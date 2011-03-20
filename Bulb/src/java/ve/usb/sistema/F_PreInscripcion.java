package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_PreInscripcion extends org.apache.struts.action.ActionForm {


    public F_PreInscripcion() {
        super();
        ep = 0;
        periodo_pasantia1 = "";
        periodo_pasantia2 = "";
        ano = 0;
        estado_civil = "";
        telef_hab = "";
        otro_telef = "";
        correo = "";
        direccion = "";
        graduando = false;
        tramiteCCTDS = false;
        region = "";
        estado = "";
        ciudad = "";

    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
        ep = 0;
        periodo_pasantia1 = "";
        periodo_pasantia2 = "";
        ano = 0;
        estado_civil = "";
        telef_hab = "";
        otro_telef = "";
        correo = "";
        direccion = "";
        graduando = false;
        tramiteCCTDS = false;
        region = "";
        estado = "";
        ciudad = "";

    }

    public static F_PreInscripcion clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_PreInscripcion fF_PreInscripcion = (F_PreInscripcion) sess.getAttribute("F_PreInscripcion");
        if (fF_PreInscripcion == null) {
            fF_PreInscripcion = new F_PreInscripcion();
            sess.setAttribute("F_PreInscripcion", fF_PreInscripcion);
        } else {
            fF_PreInscripcion.reset(mapping, request);
        }
        return fF_PreInscripcion;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property ep.
     */
    private int ep;

    /**
     * Getter for property ep.
     * @return Value of property ep.
     */
    public int getEp() {
        return this.ep;
    }

    /**
     * Setter for property ep.
     * @param ep New value of property ep.
     */
    public void setEp(int ep) {
        this.ep = ep;
    }

    /**
     * Getter for property periodo_pasantia.
     * @return Value of property periodo_pasantia.
     */
    public String getPeriodo_pasantia() {
        return this.periodo_pasantia1+"-"+this.periodo_pasantia2;
    }



    private String periodo_pasantia1;

    public String getPeriodo_pasantia1() {
        return periodo_pasantia1;
    }

    public void setPeriodo_pasantia1(String periodo_pasantia1) {
        this.periodo_pasantia1 = periodo_pasantia1;
    }

    public String getPeriodo_pasantia2() {
        return periodo_pasantia2;
    }

    public void setPeriodo_pasantia2(String periodo_pasantia2) {
        this.periodo_pasantia2 = periodo_pasantia2;
    }


    private String periodo_pasantia2;

    /**
     * Holds value of property ano.
     */
    private int ano;

    /**
     * Getter for property ano.
     * @return Value of property ano.
     */
    public int getAno() {
        return this.ano;
    }

    /**
     * Setter for property ano.
     * @param ano New value of property ano.
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * Holds value of property estado_civil.
     */
    private String estado_civil;

    /**
     * Getter for property estado_civil.
     * @return Value of property estado_civil.
     */
    public String getEstado_civil() {
        return this.estado_civil;
    }

    /**
     * Setter for property estado_civil.
     * @param estado_civil New value of property estado_civil.
     */
    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    /**
     * Holds value of property telef_hab.
     */
    private String telef_hab;

    /**
     * Getter for property telef_hab.
     * @return Value of property telef_hab.
     */
    public String getTelef_hab() {
        return this.telef_hab;
    }

    /**
     * Setter for property telef_hab.
     * @param telef_hab New value of property telef_hab.
     */
    public void setTelef_hab(String telef_hab) {
        this.telef_hab = telef_hab;
    }

    /**
     * Holds value of property otro_telef.
     */
    private String otro_telef;

    /**
     * Getter for property otro_telef.
     * @return Value of property otro_telef.
     */
    public String getOtro_telef() {
        return this.otro_telef;
    }

    /**
     * Setter for property otro_telef.
     * @param otro_telef New value of property otro_telef.
     */
    public void setOtro_telef(String otro_telef) {
        this.otro_telef = otro_telef;
    }

    /**
     * Holds value of property correo.
     */
    private String correo;

    /**
     * Getter for property correo.
     * @return Value of property correo.
     */
    public String getCorreo() {
        return this.correo;
    }

    /**
     * Setter for property correo.
     * @param correo New value of property correo.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Holds value of property direccion.
     */
    private String direccion;

    /**
     * Getter for property direccion.
     * @return Value of property direccion.
     */
    public String getDireccion() {
        return this.direccion;
    }

    /**
     * Setter for property direccion.
     * @param direccion New value of property direccion.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Holds value of property graduando.
     */
    private boolean graduando;

    /**
     * Getter for property graduando.
     * @return Value of property graduando.
     */
    public boolean getGraduando() {
        return this.graduando;
    }

    /**
     * Setter for property graduando.
     * @param graduando New value of property graduando.
     */
    public void setGraduando(boolean graduando) {
        this.graduando = graduando;
    }

    /**
     * Holds value of property tramiteCCTDS.
     */
    private boolean tramiteCCTDS;

    /**
     * Getter for property tramiteCCTDS.
     * @return Value of property tramiteCCTDS.
     */
    public boolean getTramiteCCTDS() {
        return this.tramiteCCTDS;
    }

    /**
     * Setter for property tramiteCCTDS.
     * @param tramiteCCTDS New value of property tramiteCCTDS.
     */
    public void setTramiteCCTDS(boolean tramiteCCTDS) {
        this.tramiteCCTDS = tramiteCCTDS;
    }

    /**
     * Holds value of property region.
     */
    private String region;

    /**
     * Getter for property region.
     * @return Value of property region.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for property region.
     * @param region New value of property region.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Holds value of property estado.
     */
    private String estado;

    /**
     * Getter for property estado.
     * @return Value of property estado.
     */
    public String getEstado() {
        return this.estado;
    }

    /**
     * Setter for property estado.
     * @param estado New value of property estado.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Holds value of property ciudad.
     */
    private String ciudad;

    /**
     * Getter for property ciudad.
     * @return Value of property ciudad.
     */
    public String getCiudad() {
        return this.ciudad;
    }

    /**
     * Setter for property ciudad.
     * @param ciudad New value of property ciudad.
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }




}