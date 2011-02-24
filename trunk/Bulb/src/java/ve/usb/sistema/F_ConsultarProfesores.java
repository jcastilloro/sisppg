
package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author chitty
 */
public class F_ConsultarProfesores extends org.apache.struts.action.ActionForm {


    public F_ConsultarProfesores() {
        super();
        areaPPG = "";
        tutorPPG = "";
        periodoPPG = "";

    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
        areaPPG = "";
        tutorPPG = "";
        periodoPPG = "";

    }

        public static F_ConsultarProfesores clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_ConsultarProfesores fF_ConsultarProfesores = (F_ConsultarProfesores) sess.getAttribute("F_ConsultarProfesores");
        if (fF_ConsultarProfesores == null) {
            fF_ConsultarProfesores = new F_ConsultarProfesores();
            sess.setAttribute("F_ConsultarProfesores", fF_ConsultarProfesores);
        } else {
            fF_ConsultarProfesores.reset(mapping, request);
        }
        return fF_ConsultarProfesores;
    }

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
    
}
