package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_ConsultarPPG extends org.apache.struts.action.ActionForm {
    
    
    public F_ConsultarPPG() {
        super();
        area = "";
        tutor = "";
        trimestre = "";
        ano = 0;

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        area = "";
        tutor = "";
        trimestre = "";
        ano = 0;

    }

    public static F_ConsultarPPG clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_ConsultarPPG fF_ConsultarPPG = (F_ConsultarPPG) sess.getAttribute("F_ConsultarPPG");
        if (fF_ConsultarPPG == null) {
            fF_ConsultarPPG = new F_ConsultarPPG();
            sess.setAttribute("F_ConsultarPPG", fF_ConsultarPPG);
        } else {
            fF_ConsultarPPG.reset(mapping, request);
        }
        return fF_ConsultarPPG;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property area.
     */
    private String area;

    /**
     * Getter for property area.
     * @return Value of property area.
     */
    public String getArea() {
        return this.area;
    }

    /**
     * Setter for property area.
     * @param area New value of property area.
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * Holds value of property tutor.
     */
    private String tutor;

    /**
     * Getter for property tutor.
     * @return Value of property tutor.
     */
    public String getTutor() {
        return this.tutor;
    }

    /**
     * Setter for property tutor.
     * @param tutor New value of property tutor.
     */
    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    /**
     * Holds value of property trimestre.
     */
    private String trimestre;

    /**
     * Getter for property trimestre.
     * @return Value of property trimestre.
     */
    public String getTrimestre() {
        return this.trimestre;
    }

    /**
     * Setter for property trimestre.
     * @param trimestre New value of property trimestre.
     */
    public void setTrimestre(String trimestre) {
        this.trimestre = trimestre;
    }

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




}