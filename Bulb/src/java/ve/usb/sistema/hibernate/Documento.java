package ve.usb.sistema.hibernate;
import java.sql.Timestamp;


public class Documento implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of Area */
    public Documento() {}

    /**
     * Holds value of property id.
     */
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for property id.
     * @return Value of property id.
     */
    public Long getId() {
        return this.id;
    }


    /**
     * Holds value of property nombreArea.
     */
    private String usuario = "";

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }



    /**
     * Holds value of property codigo_Area.
     */
    private byte[] file = null;

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    private String tipo = "";

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private boolean aprobado = false;

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    private boolean actual = false;

    public boolean isActual() {
        return actual;
    }

    public void setActual(boolean actual) {
        this.actual = actual;
    }

    private Timestamp fecha = null;

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }




    public String toString() {
        return "<Area id='C" + this.id +
      //idArea
      "\" usuario =\"" + usuario +
      "\" file =\"" + file +
      "\" tipo =\"" + tipo +
      "\" aprobado =\"" + aprobado +
      "\" actual =\"" + actual +
      "\" fecha =\"" + fecha +

        "'/>";
    }

}