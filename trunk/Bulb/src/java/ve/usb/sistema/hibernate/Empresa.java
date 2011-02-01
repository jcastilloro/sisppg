package ve.usb.sistema.hibernate;



public class Empresa implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of Empresa */
    public Empresa() {}
    
    /**
     * Holds value of property id.
     */
    private Long id;

    /**
     * Getter for property id.
     * @return Value of property id.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Holds value of property idEmpresa.
     */
    private long idEmpresa;

    /**
     * Getter for property idEmpresa.
     * @return Value of property idEmpresa.
     */
    public long getIdEmpresa() {
        return this.idEmpresa;
    }

    /**
     * Setter for property idEmpresa.
     * @param idEmpresa New value of property idEmpresa.
     */
    public void setIdEmpresa(long idEmpresa) {
        this.id = this.idEmpresa = idEmpresa;
    }

    /**
     * Holds value of property rif.
     */
    private String rif = "";

    /**
     * Getter for property rif.
     * @return Value of property rif.
     */
    public String getRif() {
        return this.rif;
    }

    /**
     * Setter for property rif.
     * @param rif New value of property rif.
     */
    public void setRif(String rif) {
        this.rif = rif;
    }

    /**
     * Holds value of property nombreEmpresa.
     */
    private String nombreEmpresa = "";

    /**
     * Getter for property nombreEmpresa.
     * @return Value of property nombreEmpresa.
     */
    public String getNombreEmpresa() {
        return this.nombreEmpresa;
    }

    /**
     * Setter for property nombreEmpresa.
     * @param nombreEmpresa New value of property nombreEmpresa.
     */
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    /**
     * Holds value of property telefono.
     */
    private String telefono = "";

    /**
     * Getter for property telefono.
     * @return Value of property telefono.
     */
    public String getTelefono() {
        return this.telefono;
    }

    /**
     * Setter for property telefono.
     * @param telefono New value of property telefono.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Holds value of property direccion.
     */
    private String direccion = "";

    /**
     * Getter for property direccion.
     * @return Value of property direccion.
     */
    public String getDireccion() {
        return this.direccion;
    }

    /**
     * Setter for property direccion.
     * @param direccion New value of property direccion.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Holds value of property password.
     */
    private String password = "";

    /**
     * Getter for property password.
     * @return Value of property password.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Setter for property password.
     * @param password New value of property password.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Holds value of property loginempresa.
     */
    private String loginempresa = "";

    /**
     * Getter for property loginempresa.
     * @return Value of property loginempresa.
     */
    public String getLoginempresa() {
        return this.loginempresa;
    }

    /**
     * Setter for property loginempresa.
     * @param loginempresa New value of property loginempresa.
     */
    public void setLoginempresa(String loginempresa) {
        this.loginempresa = loginempresa;
    }

    /**
     * Holds value of property ciudad.
     */
    private String ciudad = "";

    /**
     * Getter for property ciudad.
     * @return Value of property ciudad.
     */
    public String getCiudad() {
        return this.ciudad;
    }

    /**
     * Setter for property ciudad.
     * @param ciudad New value of property ciudad.
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Holds value of property pais.
     */
    private String pais = "";

    /**
     * Getter for property pais.
     * @return Value of property pais.
     */
    public String getPais() {
        return this.pais;
    }

    /**
     * Setter for property pais.
     * @param pais New value of property pais.
     */
    public void setPais(String pais) {
        this.pais = pais;
    }




    public String toString() {
        return "<Empresa id='C" + this.id +
      //idEmpresa
      "\" rif =\"" + rif +
      "\" nombreEmpresa =\"" + nombreEmpresa +
      "\" telefono =\"" + telefono +
      "\" direccion =\"" + direccion +
      "\" password =\"" + password +
      "\" loginempresa =\"" + loginempresa +
      "\" ciudad =\"" + ciudad +
      "\" pais =\"" + pais +

        "'/>";
    }

}