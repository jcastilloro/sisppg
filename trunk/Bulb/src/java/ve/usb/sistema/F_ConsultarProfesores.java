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
        Departamento = "";
        Area = "";

    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
        Departamento = "";
        Area = "";

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