package jc2s.sistppg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_Inscripcion_Pasantia extends org.apache.struts.action.ActionForm {
    
    
    public F_Inscripcion_Pasantia() {
        super();
        titulo_pasantia = "";
        resumen = "";
        objetivos = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        titulo_pasantia = "";
        resumen = "";
        objetivos = "";

    }

    public static F_Inscripcion_Pasantia clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_Inscripcion_Pasantia fF_Inscripcion_Pasantia = (F_Inscripcion_Pasantia) sess.getAttribute("F_Inscripcion_Pasantia");
        if (fF_Inscripcion_Pasantia == null) {
            fF_Inscripcion_Pasantia = new F_Inscripcion_Pasantia();
            sess.setAttribute("F_Inscripcion_Pasantia", fF_Inscripcion_Pasantia);
        } else {
            fF_Inscripcion_Pasantia.reset(mapping, request);
        }
        return fF_Inscripcion_Pasantia;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property titulo_pasantia.
     */
    private String titulo_pasantia;

    /**
     * Getter for property titulo_pasantia.
     * @return Value of property titulo_pasantia.
     */
    public String getTitulo_pasantia() {
        return this.titulo_pasantia;
    }

    /**
     * Setter for property titulo_pasantia.
     * @param titulo_pasantia New value of property titulo_pasantia.
     */
    public void setTitulo_pasantia(String titulo_pasantia) {
        this.titulo_pasantia = titulo_pasantia;
    }

    /**
     * Holds value of property resumen.
     */
    private String resumen;

    /**
     * Getter for property resumen.
     * @return Value of property resumen.
     */
    public String getResumen() {
        return this.resumen;
    }

    /**
     * Setter for property resumen.
     * @param resumen New value of property resumen.
     */
    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    /**
     * Holds value of property objetivos.
     */
    private String objetivos;

    /**
     * Getter for property objetivos.
     * @return Value of property objetivos.
     */
    public String getObjetivos() {
        return this.objetivos;
    }

    /**
     * Setter for property objetivos.
     * @param objetivos New value of property objetivos.
     */
    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }




}