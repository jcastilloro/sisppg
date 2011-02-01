package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class FplanPG extends org.apache.struts.action.ActionForm {
    
    
    public FplanPG() {
        super();
        idPlanPG = 0l;
        titulo = "";
        numero = 0;

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        idPlanPG = 0l;
        titulo = "";
        numero = 0;

    }

    public static FplanPG clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        FplanPG fFplanPG = (FplanPG) sess.getAttribute("FplanPG");
        if (fFplanPG == null) {
            fFplanPG = new FplanPG();
            sess.setAttribute("FplanPG", fFplanPG);
        } else {
            fFplanPG.reset(mapping, request);
        }
        return fFplanPG;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property idPlanPG.
     */
    private Long idPlanPG;

    /**
     * Getter for property idPlanPG.
     * @return Value of property idPlanPG.
     */
    public Long getIdPlanPG() {
        return this.idPlanPG;
    }

    /**
     * Setter for property idPlanPG.
     * @param idPlanPG New value of property idPlanPG.
     */
    public void setIdPlanPG(Long idPlanPG) {
        this.idPlanPG = idPlanPG;
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
     * Holds value of property numero.
     */
    private int numero;

    /**
     * Getter for property numero.
     * @return Value of property numero.
     */
    public int getNumero() {
        return this.numero;
    }

    /**
     * Setter for property numero.
     * @param numero New value of property numero.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }




}