package ve.usb.sistema.hibernate;



public class Usuario implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of Usuario */
    public Usuario() {}
    
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
     * Holds value of property idUsuario.
     */
    private long idUsuario;

    /**
     * Getter for property idUsuario.
     * @return Value of property idUsuario.
     */
    public long getIdUsuario() {
        return this.idUsuario;
    }

    /**
     * Setter for property idUsuario.
     * @param idUsuario New value of property idUsuario.
     */
    public void setIdUsuario(long idUsuario) {
        this.id = this.idUsuario = idUsuario;
    }

    /**
     * Holds value of property login.
     */
    private String login = "";

    /**
     * Getter for property login.
     * @return Value of property login.
     */
    public String getLogin() {
        return this.login;
    }

    /**
     * Setter for property login.
     * @param login New value of property login.
     */
    public void setLogin(String login) {
        this.login = login;
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
     * Holds value of property privilegio.
     */
    private String privilegio = "";

    /**
     * Getter for property privilegio.
     * @return Value of property privilegio.
     */
    public String getPrivilegio() {
        return this.privilegio;
    }

    /**
     * Setter for property privilegio.
     * @param privilegio New value of property privilegio.
     */
    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }




    public String toString() {
        return "<Usuario id='C" + this.id +
      //idUsuario
      "\" login =\"" + login +
      "\" password =\"" + password +
      "\" privilegio =\"" + privilegio +

        "'/>";
    }

}