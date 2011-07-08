package jc2s.sistppg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_Defensa extends org.apache.struts.action.ActionForm {


    public F_Defensa() {
        super();
        fecha_defensa = "";


    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
        fecha_defensa = "";

    }

    public static F_Departamento clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_Departamento fF_Departamento = (F_Departamento) sess.getAttribute("F_Departamento");
        if (fF_Departamento == null) {
            fF_Departamento = new F_Departamento();
            sess.setAttribute("F_Departamento", fF_Departamento);
        } else {
            fF_Departamento.reset(mapping, request);
        }
        return fF_Departamento;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property Departamento.
     */
    private String fecha_defensa;

    public String getFecha_defensa() {
        return fecha_defensa;
    }

    public void setFecha_defensa(String fecha_defensa) {
        this.fecha_defensa = fecha_defensa;
    }


}