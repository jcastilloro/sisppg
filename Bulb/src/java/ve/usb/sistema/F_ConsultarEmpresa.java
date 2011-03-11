package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionMapping;


public class F_ConsultarEmpresa extends org.apache.struts.action.ActionForm {


    public F_ConsultarEmpresa() {
        super();
        rif = "";
        nombre = "";
        direccion = "";
        pais = "";
        ciudad = "";
        login = "";
    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
        rif = "";
        nombre = "";
        direccion = "";
        pais = "";
        ciudad = "";
        login = "";
    }

    public static F_ConsultarJurados clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_ConsultarJurados fF_ConsultarJurados = (F_ConsultarJurados) sess.getAttribute("F_ConsultarJurados");
        if (fF_ConsultarJurados == null) {
            fF_ConsultarJurados = new F_ConsultarJurados();
            sess.setAttribute("F_ConsultarJurados", fF_ConsultarJurados);
        } else {
            fF_ConsultarJurados.reset(mapping, request);
        }
        return fF_ConsultarJurados;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        this.rif = rif;
    }

    private String rif;
    private String nombre;
    private String direccion;
    private String pais;
    private String ciudad;
    private String login;

}