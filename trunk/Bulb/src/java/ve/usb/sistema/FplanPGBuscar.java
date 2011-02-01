package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class FplanPGBuscar extends org.apache.struts.action.ActionForm {
    
    
    public FplanPGBuscar() {
        super();
        titulo = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        titulo = "";

    }

    public static FplanPGBuscar clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        FplanPGBuscar fFplanPGBuscar = (FplanPGBuscar) sess.getAttribute("FplanPGBuscar");
        if (fFplanPGBuscar == null) {
            fFplanPGBuscar = new FplanPGBuscar();
            sess.setAttribute("FplanPGBuscar", fFplanPGBuscar);
        } else {
            fFplanPGBuscar.reset(mapping, request);
        }
        return fFplanPGBuscar;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

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




}