package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author chitty
 */
public class F_Profesores extends org.apache.struts.action.ActionForm {


    public F_Profesores() {
        super();
        Departamento = "";
        Area = "";

    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
        Departamento = "";
        Area = "";

    }

        public static F_Profesores clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_Profesores fF_Profesores = (F_Profesores) sess.getAttribute("F_Profesores");
        if (fF_Profesores == null) {
            fF_Profesores = new F_Profesores();
            sess.setAttribute("F_Profesores", fF_Profesores);
        } else {
            fF_Profesores.reset(mapping, request);
        }
        return fF_Profesores;
    }

    /**
     * Holds value of property Departamento.
     */
    private String Departamento;

    /**
     * Getter for property Departamento.
     * @return Value of property Departamento.
     */
    public String getDepartamento() {
        return this.Departamento;
    }

    /**
     * Setter for property Departamento.
     * @param Departamento New value of property Departamento.
     */
    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    /**
     * Holds value of property Area.
     */
    private String Area;

    /**
     * Getter for property Area.
     * @return Value of property Area.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Setter for property Area.
     * @param Area New value of property Area.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

}