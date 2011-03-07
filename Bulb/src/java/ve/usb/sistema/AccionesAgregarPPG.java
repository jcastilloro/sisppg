package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import ve.usb.cohesion.runtime.CohesionAction;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import ve.usb.cohesion.runtime.HibernateUtil;
import ve.usb.sistema.hibernate.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 
 */
public class AccionesAgregarPPG extends CohesionAction {
    
/**
     * Called by Struts for the execution of action A_Pre_AgregarPPG.
     * 
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @return The Struts name of the following step.
     * @throws java.lang.Exception For untreated exceptions. 
     * These exceptios will normally be treated with 
     * the default exception action.
     */
    public ActionForward A_Pre_AgregarPPG(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_AgregarPPG", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            /* Aqui empieza mi codigo */
            java.util.List<Area> list;
            list = (java.util.List<Area>)s.createQuery("from Area").list();
             request.setAttribute("L_Area", list);
             /* Aqui termina mi codigo */
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_AgregarPPG.
     * 
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @return The Struts name of the following step.
     * @throws java.lang.Exception For untreated exceptions. 
     * These exceptios will normally be treated with 
     * the default exception action.
     */
    public ActionForward A_AgregarPPG(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"A_Pre_GestionarPPG", "A_Pre_AgregarPPG", "A_Pre_AgregarPPG", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;
        final int SALIDA_2 = 2;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_AgregarPPG fF_AgregarPPG = (F_AgregarPPG)form;
            /* Aqui empieza mi codigo */
            String login = (String)request.getSession().getAttribute("login");
                        
            /*Se extrae los valores del formulario */
            String nombrePPG = fF_AgregarPPG.getNombrePPG();
            String fechaPPG = fF_AgregarPPG.getFechaPPG();
            String propuestop = fF_AgregarPPG.getPropuestop();
            String actvPPG = fF_AgregarPPG.getActvPPG();
            String ptosInte = fF_AgregarPPG.getPtosInte();
            String areas = fF_AgregarPPG.getAreas();
            String duraYrec = fF_AgregarPPG.getDuraYrec();
            String primeraE = fF_AgregarPPG.getPrimeraE();
            String trimestreUno = fF_AgregarPPG.getTrimestreUno();
            String resultMinUno = fF_AgregarPPG.getResultMinUno();
            String actResulUno = fF_AgregarPPG.getActResulUno();
            String descTopicosICI = fF_AgregarPPG.getDescTopicosICI();
            String segundaE = fF_AgregarPPG.getSegundaE();
            String trimestrDos = fF_AgregarPPG.getTrimestreDos();
            Boolean juntas = fF_AgregarPPG.getJuntas();
            String resultMinDos = fF_AgregarPPG.getResultMinDos();
            String actResulDos = fF_AgregarPPG.getActResulDos();
            String descTopicosICII = fF_AgregarPPG.getDescTopicosICII();
            String terceraE = fF_AgregarPPG.getTerceraE();
            String trimestreTres = fF_AgregarPPG.getTrimestreTres();
            String resultMinTres = fF_AgregarPPG.getResultMinTres();
            String actResulTres = fF_AgregarPPG.getActResulTres();
            String recurMate = fF_AgregarPPG.getRecurMate();
            int anoUno = fF_AgregarPPG.getAnoUno();
            int anoDos = fF_AgregarPPG.getAnoDos();
            int anoTres = fF_AgregarPPG.getAnoTres();

            
            if (!( anoUno == 0 || anoDos == 0 || anoTres == 0 || nombrePPG.equals("") || fechaPPG.equals("") || propuestop.equals("") ||
                    actvPPG.equals("") || ptosInte.equals("") || areas.equals("") || duraYrec.equals("") ||
                    primeraE.equals("") || trimestreUno.equals("") || resultMinUno.equals("") || 
                    actResulUno.equals("") || descTopicosICI.equals("") || segundaE.equals("") ||
                    trimestrDos.equals("") || resultMinDos.equals("") || actResulDos.equals("") ||
                    descTopicosICII.equals("") || terceraE.equals("") || trimestreTres.equals("") ||
                    resultMinTres.equals("") || actResulTres.equals("") || recurMate.equals(""))){
                List<Integer> consulta = s.createSQLQuery("select max(numeroppg) from PPG").list();

                int numeroPPG = 1;
                if (consulta.get(0) != null){ numeroPPG = consulta.get(0) + 1;}  




                /* Creamos el plan e ingresamos sus datos */
                PPG ppg = new PPG();
                ppg.setNumeroPPG(numeroPPG);
                ppg.setNombrePPG(nombrePPG);
                /* transformamos la fecha */
                SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
                Date fecha = null;
                try {
                    fecha = formatoDelTexto.parse(fechaPPG);
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
                ppg.setFechaPPG(fecha);
                ppg.setPropuestop(propuestop);
                ppg.setActvPPG(actvPPG);
                ppg.setPtosInte(ptosInte);
                ppg.setAreas(areas);
                ppg.setDuraYrec(duraYrec);
                ppg.setPrimeraE(primeraE);
                ppg.setTrimestreUno(trimestreUno);
                ppg.setResultMinUno(resultMinUno);
                ppg.setActResulUno(actResulUno);
                ppg.setDescTopicosICI(descTopicosICI);
                ppg.setSegundaE(segundaE);
                ppg.setTrimestreDos(trimestrDos);

                ppg.setJuntas(juntas);
                ppg.setResultMinDos(resultMinDos);
                ppg.setActResulDos(actResulDos);
                ppg.setDescTopicosICII(descTopicosICII);
                ppg.setTerceraE(terceraE);
                ppg.setTrimestreTres(trimestreTres);
                ppg.setResultMinTres(resultMinTres);
                ppg.setActResulTres(actResulTres);
                ppg.setRecurMate(recurMate);
                ppg.setAnoUno(anoUno);
                ppg.setAnoDos(anoDos);
                ppg.setAnoTres(anoTres);


                /* Agregamos ESTUDIANTES con sus respectivos PROYECTOS */
                String integrante1 = fF_AgregarPPG.getIntegrante1();
                String integrante2 = fF_AgregarPPG.getIntegrante2();
                String integrante3 = fF_AgregarPPG.getIntegrante3();
                salida = SALIDA_0;
                consulta = s.createSQLQuery("select * from estudiante where carnete='"+integrante1+"';").list();
                List consulta2 = s.createSQLQuery("select * from EstRealizaProy where carnetestudiante='"+integrante1+"';").list();
                if (!consulta.isEmpty() && consulta2.isEmpty()){
                    EstRealizaProy erp1 = new EstRealizaProy();
                    erp1.setCarnetEstudiante(integrante1);
                    int ppgId = (int)ppg.getNumeroPPG();
                    erp1.setCodigoproy(ppgId);
                    s.save(erp1);
                    s.save(ppg);

                    consulta = s.createSQLQuery("select * from estudiante where carnete='"+integrante2+"';").list();
                    consulta2 = s.createSQLQuery("select * from EstRealizaProy where carnetestudiante='"+integrante2+"';").list();
                     if (!consulta.isEmpty() && !integrante1.equals(integrante2) && consulta2.isEmpty()){
                        EstRealizaProy erp2 = new EstRealizaProy();
                        erp2.setCarnetEstudiante(integrante2);
                        erp2.setCodigoproy(ppgId);
                        s.save(erp2);
                        consulta = s.createSQLQuery("select * from estudiante where carnete='"+integrante3+"';").list();
                        consulta2 = s.createSQLQuery("select * from EstRealizaProy where carnetestudiante='"+integrante3+"';").list();
                        if (!consulta.isEmpty() && !integrante2.equals(integrante3) && !integrante1.equals(integrante3) && consulta2.isEmpty()){
                            EstRealizaProy erp3 = new EstRealizaProy();
                            erp3.setCarnetEstudiante(integrante3);
                            erp3.setCodigoproy(ppgId);
                            s.save(erp3);

                        }
                        else if (integrante3.equals("")) {;}
                        else { salida = SALIDA_1; }

                    }
                    else if (integrante2.equals("")) {;}
                    else { salida = SALIDA_1; }
             

                }
                else if (integrante1.equals("")) {;}
                else { salida = SALIDA_1; }

                if (salida==SALIDA_0){               
                    /* Agregamos Profesor con el PROYECTO que tutorea */
                        ProfTutoreaProy profTutProy = new ProfTutoreaProy();
                        profTutProy.setIdProfesor(login);
                        profTutProy.setNumeroPPG(numeroPPG);
                        profTutProy.setTipoproytutor(0);
                        s.save(profTutProy);

                    /* Creamos el area e ingresamos sus datos */
                    RelPPGArea relppgarea  = new RelPPGArea();
                    String codigoArea = fF_AgregarPPG.getCodigoAreaPPG();
                    relppgarea.setCodigo_Area(codigoArea);
                    relppgarea.setNumPPG(numeroPPG);
                    s.save(relppgarea);

                    /* Termino */
                    fF_AgregarPPG.reset(mapping, request);

                }            
            }
            else {salida = SALIDA_2;}
            /* Aqui termina mi codigo */
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_AgregarPPG.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_AgregarPPG.msg1"));
        }
        if (salida==2) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_AgregarPPG.msg2"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}