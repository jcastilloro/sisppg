package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_ConsultarEstudiante extends org.apache.struts.action.ActionForm {
    
    
    public F_ConsultarEstudiante() {
        super();
        areaPPG = "";
        tutorPPG = "";
        periodoPPG = "";
        anoPPG = 0;

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        areaPPG = "";
        tutorPPG = "";
        periodoPPG = "";
        anoPPG = 0;

    }

    public static F_ConsultarEstudiante clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_ConsultarEstudiante fF_ConsultarEstudiante = (F_ConsultarEstudiante) sess.getAttribute("F_ConsultarEstudiante");
        if (fF_ConsultarEstudiante == null) {
            fF_ConsultarEstudiante = new F_ConsultarEstudiante();
            sess.setAttribute("F_ConsultarEstudiante", fF_ConsultarEstudiante);
        } else {
            fF_ConsultarEstudiante.reset(mapping, request);
        }
        return fF_ConsultarEstudiante;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property areaPPG.
     */
    private String areaPPG;

    /**
     * Getter for property areaPPG.
     * @return Value of property areaPPG.
     */
    public String getAreaPPG() {
        return this.areaPPG;
    }

    /**
     * Setter for property areaPPG.
     * @param areaPPG New value of property areaPPG.
     */
    public void setAreaPPG(String areaPPG) {
        this.areaPPG = areaPPG;
    }

    /**
     * Holds value of property tutorPPG.
     */
    private String tutorPPG;

    /**
     * Getter for property tutorPPG.
     * @return Value of property tutorPPG.
     */
    public String getTutorPPG() {
        return this.tutorPPG;
    }

    /**
     * Setter for property tutorPPG.
     * @param tutorPPG New value of property tutorPPG.
     */
    public void setTutorPPG(String tutorPPG) {
        this.tutorPPG = tutorPPG;
    }

    /**
     * Holds value of property periodoPPG.
     */
    private String periodoPPG;

    /**
     * Getter for property periodoPPG.
     * @return Value of property periodoPPG.
     */
    public String getPeriodoPPG() {
        return this.periodoPPG;
    }

    /**
     * Setter for property periodoPPG.
     * @param periodoPPG New value of property periodoPPG.
     */
    public void setPeriodoPPG(String periodoPPG) {
        this.periodoPPG = periodoPPG;
    }

    /**
     * Holds value of property anoPPG.
     */
    private int anoPPG;

    /**
     * Getter for property anoPPG.
     * @return Value of property anoPPG.
     */
    public int getAnoPPG() {
        return this.anoPPG;
    }

    /**
     * Setter for property anoPPG.
     * @param anoPPG New value of property anoPPG.
     */
    public void setAnoPPG(int anoPPG) {
        this.anoPPG = anoPPG;
    }




}