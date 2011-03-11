package ve.usb.sistema.hibernate;



public class UsuarioCCTDS implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of TutorIndustrial */
    public UsuarioCCTDS() {}

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

    int idusuariocctds;

    public String getCodigoprofesor() {
        return codigoprofesor;
    }

    public void setCodigoprofesor(String codigoprofesor) {
        this.codigoprofesor = codigoprofesor;
    }

    public boolean isEscoordinador() {
        return escoordinador;
    }

    public void setEscoordinador(boolean escoordinador) {
        this.escoordinador = escoordinador;
    }

    public int getIdusuariocctds() {
        return idusuariocctds;
    }

    public void setIdusuariocctds(int idusuariocctds) {
        this.idusuariocctds = idusuariocctds;
    }

    private String codigoprofesor;


    private boolean escoordinador;


    public String toString() {
        return "<TutorIndustrial id='C" + this.id +
      //idTutorIndustrial
      "\" codigoprofesor =\"" + codigoprofesor +
      "\" escoordinador =\"" + escoordinador +
        "'/>";
    }

}