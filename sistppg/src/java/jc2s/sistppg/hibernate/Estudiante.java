package jc2s.sistppg.hibernate;



public class Estudiante implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of Estudiante */
    public Estudiante() {}
    
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
     * Holds value of property idEstudiante.
     */
    private long idEstudiante;

    /**
     * Getter for property idEstudiante.
     * @return Value of property idEstudiante.
     */
    public long getIdEstudiante() {
        return this.idEstudiante;
    }

    /**
     * Setter for property idEstudiante.
     * @param idEstudiante New value of property idEstudiante.
     */
    public void setIdEstudiante(long idEstudiante) {
        this.id = this.idEstudiante = idEstudiante;
    }

    /**
     * Holds value of property usbid.
     */
    private String usbid = "";

    /**
     * Getter for property usbid.
     * @return Value of property usbid.
     */
    public String getUsbid() {
        return this.usbid;
    }

    /**
     * Setter for property usbid.
     * @param usbid New value of property usbid.
     */
    public void setUsbid(String usbid) {
        this.usbid = usbid;
    }

    /**
     * Holds value of property carrera.
     */
    private Carrera carrera;

    /**
     * Getter for property carrera.
     * @return Value of property carrera.
     */
    public Carrera getCarrera() {
        return this.carrera;
    }

    /**
     * Setter for property carrera.
     * @param carrera New value of property carrera.
     */
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    /**
     * Holds value of property nombre.
     */
    private String nombre = "";

    /**
     * Getter for property nombre.
     * @return Value of property nombre.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Setter for property nombre.
     * @param nombre New value of property nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Holds value of property apellido.
     */
    private String apellido = "";

    /**
     * Getter for property apellido.
     * @return Value of property apellido.
     */
    public String getApellido() {
        return this.apellido;
    }

    /**
     * Setter for property apellido.
     * @param apellido New value of property apellido.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Holds value of property cedula.
     */
    private int cedula;

    /**
     * Getter for property cedula.
     * @return Value of property cedula.
     */
    public int getCedula() {
        return this.cedula;
    }

    /**
     * Setter for property cedula.
     * @param cedula New value of property cedula.
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * Holds value of property email.
     */
    private String email = "";

    /**
     * Getter for property email.
     * @return Value of property email.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for property email.
     * @param email New value of property email.
     */
    public void setEmail(String email) {
        this.email = email;
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




    public String toString() {
        return "<Estudiante id='C" + this.id +
      //idEstudiante
      "\" usbid =\"" + usbid +
        ((carrera==null) ? "" : "\" carrera =\"C" + carrera.getId()) +

      "\" nombre =\"" + nombre +
      "\" apellido =\"" + apellido +
      "\" cedula =\"" + cedula +
      "\" email =\"" + email +
      "\" telefono =\"" + telefono +

        "'/>";
    }

}