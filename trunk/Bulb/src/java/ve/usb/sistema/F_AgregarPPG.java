package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_AgregarPPG extends org.apache.struts.action.ActionForm {
    
    
    public F_AgregarPPG() {
        super();
        nombrePPG = "";
        codigoAreaPPG = "";
        fechaPPG = "";
        propuestop = "";
        actvPPG = "";
        ptosInte = "";
        areas = "";
        duraYrec = "";
        primeraE = "";
        trimestreUno = "";
        resultMinUno = "";
        actResulUno = "";
        descTopicosICI = "";
        segundaE = "";
        trimestreDos = "";
        juntas = false;
        resultMinDos = "";
        actResulDos = "";
        descTopicosICII = "";
        terceraE = "";
        trimestreTres = "";
        resultMinTres = "";
        actResulTres = "";
        recurMate = "";
        integrante1 = "";
        integrante2 = "";
        integrante3 = "";
        anoUno = 0;
        anoDos = 0;
        anoTres = 0;

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        nombrePPG = "";
        codigoAreaPPG = "";
        fechaPPG = "";
        propuestop = "";
        actvPPG = "";
        ptosInte = "";
        areas = "";
        duraYrec = "";
        primeraE = "";
        trimestreUno = "";
        resultMinUno = "";
        actResulUno = "";
        descTopicosICI = "";
        segundaE = "";
        trimestreDos = "";
        juntas = false;
        resultMinDos = "";
        actResulDos = "";
        descTopicosICII = "";
        terceraE = "";
        trimestreTres = "";
        resultMinTres = "";
        actResulTres = "";
        recurMate = "";
        integrante1 = "";
        integrante2 = "";
        integrante3 = "";
        anoUno = 0;
        anoDos = 0;
        anoTres = 0;

    }

    public static F_AgregarPPG clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_AgregarPPG fF_AgregarPPG = (F_AgregarPPG) sess.getAttribute("F_AgregarPPG");
        if (fF_AgregarPPG == null) {
            fF_AgregarPPG = new F_AgregarPPG();
            sess.setAttribute("F_AgregarPPG", fF_AgregarPPG);
        } else {
            fF_AgregarPPG.reset(mapping, request);
        }
        return fF_AgregarPPG;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property nombrePPG.
     */
    private String nombrePPG;

    /**
     * Getter for property nombrePPG.
     * @return Value of property nombrePPG.
     */
    public String getNombrePPG() {
        return this.nombrePPG;
    }

    /**
     * Setter for property nombrePPG.
     * @param nombrePPG New value of property nombrePPG.
     */
    public void setNombrePPG(String nombrePPG) {
        this.nombrePPG = nombrePPG;
    }

    /**
     * Holds value of property codigoAreaPPG.
     */
    private String codigoAreaPPG;

    /**
     * Getter for property codigoAreaPPG.
     * @return Value of property codigoAreaPPG.
     */
    public String getCodigoAreaPPG() {
        return this.codigoAreaPPG;
    }

    /**
     * Setter for property codigoAreaPPG.
     * @param codigoAreaPPG New value of property codigoAreaPPG.
     */
    public void setCodigoAreaPPG(String codigoAreaPPG) {
        this.codigoAreaPPG = codigoAreaPPG;
    }

    /**
     * Holds value of property fechaPPG.
     */
    private String fechaPPG;

    /**
     * Getter for property fechaPPG.
     * @return Value of property fechaPPG.
     */
    public String getFechaPPG() {
        return this.fechaPPG;
    }

    /**
     * Setter for property fechaPPG.
     * @param fechaPPG New value of property fechaPPG.
     */
    public void setFechaPPG(String fechaPPG) {
        this.fechaPPG = fechaPPG;
    }

    /**
     * Holds value of property propuestop.
     */
    private String propuestop;

    /**
     * Getter for property propuestop.
     * @return Value of property propuestop.
     */
    public String getPropuestop() {
        return this.propuestop;
    }

    /**
     * Setter for property propuestop.
     * @param propuestop New value of property propuestop.
     */
    public void setPropuestop(String propuestop) {
        this.propuestop = propuestop;
    }

    /**
     * Holds value of property actvPPG.
     */
    private String actvPPG;

    /**
     * Getter for property actvPPG.
     * @return Value of property actvPPG.
     */
    public String getActvPPG() {
        return this.actvPPG;
    }

    /**
     * Setter for property actvPPG.
     * @param actvPPG New value of property actvPPG.
     */
    public void setActvPPG(String actvPPG) {
        this.actvPPG = actvPPG;
    }

    /**
     * Holds value of property ptosInte.
     */
    private String ptosInte;

    /**
     * Getter for property ptosInte.
     * @return Value of property ptosInte.
     */
    public String getPtosInte() {
        return this.ptosInte;
    }

    /**
     * Setter for property ptosInte.
     * @param ptosInte New value of property ptosInte.
     */
    public void setPtosInte(String ptosInte) {
        this.ptosInte = ptosInte;
    }

    /**
     * Holds value of property areas.
     */
    private String areas;

    /**
     * Getter for property areas.
     * @return Value of property areas.
     */
    public String getAreas() {
        return this.areas;
    }

    /**
     * Setter for property areas.
     * @param areas New value of property areas.
     */
    public void setAreas(String areas) {
        this.areas = areas;
    }

    /**
     * Holds value of property duraYrec.
     */
    private String duraYrec;

    /**
     * Getter for property duraYrec.
     * @return Value of property duraYrec.
     */
    public String getDuraYrec() {
        return this.duraYrec;
    }

    /**
     * Setter for property duraYrec.
     * @param duraYrec New value of property duraYrec.
     */
    public void setDuraYrec(String duraYrec) {
        this.duraYrec = duraYrec;
    }

    /**
     * Holds value of property primeraE.
     */
    private String primeraE;

    /**
     * Getter for property primeraE.
     * @return Value of property primeraE.
     */
    public String getPrimeraE() {
        return this.primeraE;
    }

    /**
     * Setter for property primeraE.
     * @param primeraE New value of property primeraE.
     */
    public void setPrimeraE(String primeraE) {
        this.primeraE = primeraE;
    }

    /**
     * Holds value of property trimestreUno.
     */
    private String trimestreUno;

    /**
     * Getter for property trimestreUno.
     * @return Value of property trimestreUno.
     */
    public String getTrimestreUno() {
        return this.trimestreUno;
    }

    /**
     * Setter for property trimestreUno.
     * @param trimestreUno New value of property trimestreUno.
     */
    public void setTrimestreUno(String trimestreUno) {
        this.trimestreUno = trimestreUno;
    }

    /**
     * Holds value of property resultMinUno.
     */
    private String resultMinUno;

    /**
     * Getter for property resultMinUno.
     * @return Value of property resultMinUno.
     */
    public String getResultMinUno() {
        return this.resultMinUno;
    }

    /**
     * Setter for property resultMinUno.
     * @param resultMinUno New value of property resultMinUno.
     */
    public void setResultMinUno(String resultMinUno) {
        this.resultMinUno = resultMinUno;
    }

    /**
     * Holds value of property actResulUno.
     */
    private String actResulUno;

    /**
     * Getter for property actResulUno.
     * @return Value of property actResulUno.
     */
    public String getActResulUno() {
        return this.actResulUno;
    }

    /**
     * Setter for property actResulUno.
     * @param actResulUno New value of property actResulUno.
     */
    public void setActResulUno(String actResulUno) {
        this.actResulUno = actResulUno;
    }

    /**
     * Holds value of property descTopicosICI.
     */
    private String descTopicosICI;

    /**
     * Getter for property descTopicosICI.
     * @return Value of property descTopicosICI.
     */
    public String getDescTopicosICI() {
        return this.descTopicosICI;
    }

    /**
     * Setter for property descTopicosICI.
     * @param descTopicosICI New value of property descTopicosICI.
     */
    public void setDescTopicosICI(String descTopicosICI) {
        this.descTopicosICI = descTopicosICI;
    }

    /**
     * Holds value of property segundaE.
     */
    private String segundaE;

    /**
     * Getter for property segundaE.
     * @return Value of property segundaE.
     */
    public String getSegundaE() {
        return this.segundaE;
    }

    /**
     * Setter for property segundaE.
     * @param segundaE New value of property segundaE.
     */
    public void setSegundaE(String segundaE) {
        this.segundaE = segundaE;
    }

    /**
     * Holds value of property trimestreDos.
     */
    private String trimestreDos;

    /**
     * Getter for property trimestreDos.
     * @return Value of property trimestreDos.
     */
    public String getTrimestreDos() {
        return this.trimestreDos;
    }

    /**
     * Setter for property trimestreDos.
     * @param trimestreDos New value of property trimestreDos.
     */
    public void setTrimestreDos(String trimestreDos) {
        this.trimestreDos = trimestreDos;
    }

    /**
     * Holds value of property juntas.
     */
    private boolean juntas;

    /**
     * Getter for property juntas.
     * @return Value of property juntas.
     */
    public boolean getJuntas() {
        return this.juntas;
    }

    /**
     * Setter for property juntas.
     * @param juntas New value of property juntas.
     */
    public void setJuntas(boolean juntas) {
        this.juntas = juntas;
    }

    /**
     * Holds value of property resultMinDos.
     */
    private String resultMinDos;

    /**
     * Getter for property resultMinDos.
     * @return Value of property resultMinDos.
     */
    public String getResultMinDos() {
        return this.resultMinDos;
    }

    /**
     * Setter for property resultMinDos.
     * @param resultMinDos New value of property resultMinDos.
     */
    public void setResultMinDos(String resultMinDos) {
        this.resultMinDos = resultMinDos;
    }

    /**
     * Holds value of property actResulDos.
     */
    private String actResulDos;

    /**
     * Getter for property actResulDos.
     * @return Value of property actResulDos.
     */
    public String getActResulDos() {
        return this.actResulDos;
    }

    /**
     * Setter for property actResulDos.
     * @param actResulDos New value of property actResulDos.
     */
    public void setActResulDos(String actResulDos) {
        this.actResulDos = actResulDos;
    }

    /**
     * Holds value of property descTopicosICII.
     */
    private String descTopicosICII;

    /**
     * Getter for property descTopicosICII.
     * @return Value of property descTopicosICII.
     */
    public String getDescTopicosICII() {
        return this.descTopicosICII;
    }

    /**
     * Setter for property descTopicosICII.
     * @param descTopicosICII New value of property descTopicosICII.
     */
    public void setDescTopicosICII(String descTopicosICII) {
        this.descTopicosICII = descTopicosICII;
    }

    /**
     * Holds value of property terceraE.
     */
    private String terceraE;

    /**
     * Getter for property terceraE.
     * @return Value of property terceraE.
     */
    public String getTerceraE() {
        return this.terceraE;
    }

    /**
     * Setter for property terceraE.
     * @param terceraE New value of property terceraE.
     */
    public void setTerceraE(String terceraE) {
        this.terceraE = terceraE;
    }

    /**
     * Holds value of property trimestreTres.
     */
    private String trimestreTres;

    /**
     * Getter for property trimestreTres.
     * @return Value of property trimestreTres.
     */
    public String getTrimestreTres() {
        return this.trimestreTres;
    }

    /**
     * Setter for property trimestreTres.
     * @param trimestreTres New value of property trimestreTres.
     */
    public void setTrimestreTres(String trimestreTres) {
        this.trimestreTres = trimestreTres;
    }

    /**
     * Holds value of property resultMinTres.
     */
    private String resultMinTres;

    /**
     * Getter for property resultMinTres.
     * @return Value of property resultMinTres.
     */
    public String getResultMinTres() {
        return this.resultMinTres;
    }

    /**
     * Setter for property resultMinTres.
     * @param resultMinTres New value of property resultMinTres.
     */
    public void setResultMinTres(String resultMinTres) {
        this.resultMinTres = resultMinTres;
    }

    /**
     * Holds value of property actResulTres.
     */
    private String actResulTres;

    /**
     * Getter for property actResulTres.
     * @return Value of property actResulTres.
     */
    public String getActResulTres() {
        return this.actResulTres;
    }

    /**
     * Setter for property actResulTres.
     * @param actResulTres New value of property actResulTres.
     */
    public void setActResulTres(String actResulTres) {
        this.actResulTres = actResulTres;
    }

    /**
     * Holds value of property recurMate.
     */
    private String recurMate;

    /**
     * Getter for property recurMate.
     * @return Value of property recurMate.
     */
    public String getRecurMate() {
        return this.recurMate;
    }

    /**
     * Setter for property recurMate.
     * @param recurMate New value of property recurMate.
     */
    public void setRecurMate(String recurMate) {
        this.recurMate = recurMate;
    }

    /**
     * Holds value of property integrante1.
     */
    private String integrante1;

    /**
     * Getter for property integrante1.
     * @return Value of property integrante1.
     */
    public String getIntegrante1() {
        return this.integrante1;
    }

    /**
     * Setter for property integrante1.
     * @param integrante1 New value of property integrante1.
     */
    public void setIntegrante1(String integrante1) {
        this.integrante1 = integrante1;
    }

    /**
     * Holds value of property integrante2.
     */
    private String integrante2;

    /**
     * Getter for property integrante2.
     * @return Value of property integrante2.
     */
    public String getIntegrante2() {
        return this.integrante2;
    }

    /**
     * Setter for property integrante2.
     * @param integrante2 New value of property integrante2.
     */
    public void setIntegrante2(String integrante2) {
        this.integrante2 = integrante2;
    }

    /**
     * Holds value of property integrante3.
     */
    private String integrante3;

    /**
     * Getter for property integrante3.
     * @return Value of property integrante3.
     */
    public String getIntegrante3() {
        return this.integrante3;
    }

    /**
     * Setter for property integrante3.
     * @param integrante3 New value of property integrante3.
     */
    public void setIntegrante3(String integrante3) {
        this.integrante3 = integrante3;
    }

    /**
     * Holds value of property anoUno.
     */
    private int anoUno;

    /**
     * Getter for property anoUno.
     * @return Value of property anoUno.
     */
    public int getAnoUno() {
        return this.anoUno;
    }

    /**
     * Setter for property anoUno.
     * @param anoUno New value of property anoUno.
     */
    public void setAnoUno(int anoUno) {
        this.anoUno = anoUno;
    }

    /**
     * Holds value of property anoDos.
     */
    private int anoDos;

    /**
     * Getter for property anoDos.
     * @return Value of property anoDos.
     */
    public int getAnoDos() {
        return this.anoDos;
    }

    /**
     * Setter for property anoDos.
     * @param anoDos New value of property anoDos.
     */
    public void setAnoDos(int anoDos) {
        this.anoDos = anoDos;
    }

    /**
     * Holds value of property anoTres.
     */
    private int anoTres;

    /**
     * Getter for property anoTres.
     * @return Value of property anoTres.
     */
    public int getAnoTres() {
        return this.anoTres;
    }

    /**
     * Setter for property anoTres.
     * @param anoTres New value of property anoTres.
     */
    public void setAnoTres(int anoTres) {
        this.anoTres = anoTres;
    }




}