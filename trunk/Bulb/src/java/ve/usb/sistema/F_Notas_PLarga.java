package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_Notas_PLarga extends org.apache.struts.action.ActionForm {
    
    
    public F_Notas_PLarga() {
        super();
        fecha = "";
        acta_Evaluacion_Periodo_Pasantia = "";
        tipo_Pasantia = "";
        titulo = "";
        apellidos_Nombres_Est = "";
        carnet = "";
        carrera = "";
        aprobado = "";
        reprobado = "";
        tutor_Acad = "";
        nombre_tutor_Acad = "";
        ci_tutor_Acad = "";
        tutor_Ind = "";
        nombre_tutor_Ind = "";
        ci_tutor_Ind = "";
        jurado = "";
        nombre_jurado = "";
        ci_jurado = "";
        articulo15 = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        fecha = "";
        acta_Evaluacion_Periodo_Pasantia = "";
        tipo_Pasantia = "";
        titulo = "";
        apellidos_Nombres_Est = "";
        carnet = "";
        carrera = "";
        aprobado = "";
        reprobado = "";
        tutor_Acad = "";
        nombre_tutor_Acad = "";
        ci_tutor_Acad = "";
        tutor_Ind = "";
        nombre_tutor_Ind = "";
        ci_tutor_Ind = "";
        jurado = "";
        nombre_jurado = "";
        ci_jurado = "";
        articulo15 = "";

    }

    public static F_Notas_PLarga clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_Notas_PLarga fF_Notas_PLarga = (F_Notas_PLarga) sess.getAttribute("F_Notas_PLarga");
        if (fF_Notas_PLarga == null) {
            fF_Notas_PLarga = new F_Notas_PLarga();
            sess.setAttribute("F_Notas_PLarga", fF_Notas_PLarga);
        } else {
            fF_Notas_PLarga.reset(mapping, request);
        }
        return fF_Notas_PLarga;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property fecha.
     */
    private String fecha;

    /**
     * Getter for property fecha.
     * @return Value of property fecha.
     */
    public String getFecha() {
        return this.fecha;
    }

    /**
     * Setter for property fecha.
     * @param fecha New value of property fecha.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Holds value of property acta_Evaluacion_Periodo_Pasantia.
     */
    private String acta_Evaluacion_Periodo_Pasantia;

    /**
     * Getter for property acta_Evaluacion_Periodo_Pasantia.
     * @return Value of property acta_Evaluacion_Periodo_Pasantia.
     */
    public String getActa_Evaluacion_Periodo_Pasantia() {
        return this.acta_Evaluacion_Periodo_Pasantia;
    }

    /**
     * Setter for property acta_Evaluacion_Periodo_Pasantia.
     * @param acta_Evaluacion_Periodo_Pasantia New value of property acta_Evaluacion_Periodo_Pasantia.
     */
    public void setActa_Evaluacion_Periodo_Pasantia(String acta_Evaluacion_Periodo_Pasantia) {
        this.acta_Evaluacion_Periodo_Pasantia = acta_Evaluacion_Periodo_Pasantia;
    }

    /**
     * Holds value of property tipo_Pasantia.
     */
    private String tipo_Pasantia;

    /**
     * Getter for property tipo_Pasantia.
     * @return Value of property tipo_Pasantia.
     */
    public String getTipo_Pasantia() {
        return this.tipo_Pasantia;
    }

    /**
     * Setter for property tipo_Pasantia.
     * @param tipo_Pasantia New value of property tipo_Pasantia.
     */
    public void setTipo_Pasantia(String tipo_Pasantia) {
        this.tipo_Pasantia = tipo_Pasantia;
    }

    /**
     * Holds value of property titulo.
     */
    private String titulo;

    /**
     * Getter for property titulo.
     * @return Value of property titulo.
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Setter for property titulo.
     * @param titulo New value of property titulo.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Holds value of property apellidos_Nombres_Est.
     */
    private String apellidos_Nombres_Est;

    /**
     * Getter for property apellidos_Nombres_Est.
     * @return Value of property apellidos_Nombres_Est.
     */
    public String getApellidos_Nombres_Est() {
        return this.apellidos_Nombres_Est;
    }

    /**
     * Setter for property apellidos_Nombres_Est.
     * @param apellidos_Nombres_Est New value of property apellidos_Nombres_Est.
     */
    public void setApellidos_Nombres_Est(String apellidos_Nombres_Est) {
        this.apellidos_Nombres_Est = apellidos_Nombres_Est;
    }

    /**
     * Holds value of property carnet.
     */
    private String carnet;

    /**
     * Getter for property carnet.
     * @return Value of property carnet.
     */
    public String getCarnet() {
        return this.carnet;
    }

    /**
     * Setter for property carnet.
     * @param carnet New value of property carnet.
     */
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    /**
     * Holds value of property carrera.
     */
    private String carrera;

    /**
     * Getter for property carrera.
     * @return Value of property carrera.
     */
    public String getCarrera() {
        return this.carrera;
    }

    /**
     * Setter for property carrera.
     * @param carrera New value of property carrera.
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * Holds value of property aprobado.
     */
    private String aprobado;

    /**
     * Getter for property aprobado.
     * @return Value of property aprobado.
     */
    public String getAprobado() {
        return this.aprobado;
    }

    /**
     * Setter for property aprobado.
     * @param aprobado New value of property aprobado.
     */
    public void setAprobado(String aprobado) {
        this.aprobado = aprobado;
    }

    /**
     * Holds value of property reprobado.
     */
    private String reprobado;

    /**
     * Getter for property reprobado.
     * @return Value of property reprobado.
     */
    public String getReprobado() {
        return this.reprobado;
    }

    /**
     * Setter for property reprobado.
     * @param reprobado New value of property reprobado.
     */
    public void setReprobado(String reprobado) {
        this.reprobado = reprobado;
    }

    /**
     * Holds value of property tutor_Acad.
     */
    private String tutor_Acad;

    /**
     * Getter for property tutor_Acad.
     * @return Value of property tutor_Acad.
     */
    public String getTutor_Acad() {
        return this.tutor_Acad;
    }

    /**
     * Setter for property tutor_Acad.
     * @param tutor_Acad New value of property tutor_Acad.
     */
    public void setTutor_Acad(String tutor_Acad) {
        this.tutor_Acad = tutor_Acad;
    }

    /**
     * Holds value of property nombre_tutor_Acad.
     */
    private String nombre_tutor_Acad;

    /**
     * Getter for property nombre_tutor_Acad.
     * @return Value of property nombre_tutor_Acad.
     */
    public String getNombre_tutor_Acad() {
        return this.nombre_tutor_Acad;
    }

    /**
     * Setter for property nombre_tutor_Acad.
     * @param nombre_tutor_Acad New value of property nombre_tutor_Acad.
     */
    public void setNombre_tutor_Acad(String nombre_tutor_Acad) {
        this.nombre_tutor_Acad = nombre_tutor_Acad;
    }

    /**
     * Holds value of property ci_tutor_Acad.
     */
    private String ci_tutor_Acad;

    /**
     * Getter for property ci_tutor_Acad.
     * @return Value of property ci_tutor_Acad.
     */
    public String getCi_tutor_Acad() {
        return this.ci_tutor_Acad;
    }

    /**
     * Setter for property ci_tutor_Acad.
     * @param ci_tutor_Acad New value of property ci_tutor_Acad.
     */
    public void setCi_tutor_Acad(String ci_tutor_Acad) {
        this.ci_tutor_Acad = ci_tutor_Acad;
    }

    /**
     * Holds value of property tutor_Ind.
     */
    private String tutor_Ind;

    /**
     * Getter for property tutor_Ind.
     * @return Value of property tutor_Ind.
     */
    public String getTutor_Ind() {
        return this.tutor_Ind;
    }

    /**
     * Setter for property tutor_Ind.
     * @param tutor_Ind New value of property tutor_Ind.
     */
    public void setTutor_Ind(String tutor_Ind) {
        this.tutor_Ind = tutor_Ind;
    }

    /**
     * Holds value of property nombre_tutor_Ind.
     */
    private String nombre_tutor_Ind;

    /**
     * Getter for property nombre_tutor_Ind.
     * @return Value of property nombre_tutor_Ind.
     */
    public String getNombre_tutor_Ind() {
        return this.nombre_tutor_Ind;
    }

    /**
     * Setter for property nombre_tutor_Ind.
     * @param nombre_tutor_Ind New value of property nombre_tutor_Ind.
     */
    public void setNombre_tutor_Ind(String nombre_tutor_Ind) {
        this.nombre_tutor_Ind = nombre_tutor_Ind;
    }

    /**
     * Holds value of property ci_tutor_Ind.
     */
    private String ci_tutor_Ind;

    /**
     * Getter for property ci_tutor_Ind.
     * @return Value of property ci_tutor_Ind.
     */
    public String getCi_tutor_Ind() {
        return this.ci_tutor_Ind;
    }

    /**
     * Setter for property ci_tutor_Ind.
     * @param ci_tutor_Ind New value of property ci_tutor_Ind.
     */
    public void setCi_tutor_Ind(String ci_tutor_Ind) {
        this.ci_tutor_Ind = ci_tutor_Ind;
    }

    /**
     * Holds value of property jurado.
     */
    private String jurado;

    /**
     * Getter for property jurado.
     * @return Value of property jurado.
     */
    public String getJurado() {
        return this.jurado;
    }

    /**
     * Setter for property jurado.
     * @param jurado New value of property jurado.
     */
    public void setJurado(String jurado) {
        this.jurado = jurado;
    }

    /**
     * Holds value of property nombre_jurado.
     */
    private String nombre_jurado;

    /**
     * Getter for property nombre_jurado.
     * @return Value of property nombre_jurado.
     */
    public String getNombre_jurado() {
        return this.nombre_jurado;
    }

    /**
     * Setter for property nombre_jurado.
     * @param nombre_jurado New value of property nombre_jurado.
     */
    public void setNombre_jurado(String nombre_jurado) {
        this.nombre_jurado = nombre_jurado;
    }

    /**
     * Holds value of property ci_jurado.
     */
    private String ci_jurado;

    /**
     * Getter for property ci_jurado.
     * @return Value of property ci_jurado.
     */
    public String getCi_jurado() {
        return this.ci_jurado;
    }

    /**
     * Setter for property ci_jurado.
     * @param ci_jurado New value of property ci_jurado.
     */
    public void setCi_jurado(String ci_jurado) {
        this.ci_jurado = ci_jurado;
    }

    /**
     * Holds value of property articulo15.
     */
    private String articulo15;

    /**
     * Getter for property articulo15.
     * @return Value of property articulo15.
     */
    public String getArticulo15() {
        return this.articulo15;
    }

    /**
     * Setter for property articulo15.
     * @param articulo15 New value of property articulo15.
     */
    public void setArticulo15(String articulo15) {
        this.articulo15 = articulo15;
    }




}