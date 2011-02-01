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
public class AccionesModificarPPG extends CohesionAction {
    
/**
     * Called by Struts for the execution of action A_Pre_ModificarPPG.
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
    public ActionForward A_Pre_ModificarPPG(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_ModificarPPG", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
/*Aqui comienza mi codigo*/
            String numeroPPG = (String)request.getParameter("numeroPPG");
            int codigoPPG = Integer.parseInt(numeroPPG);

            PPG consulta = (PPG)s.createQuery("from PPG where numeroPPG = :tempi").setInteger("tempi",codigoPPG).uniqueResult();
            
            if (consulta != null){
                request.setAttribute("nombrePPG", (String)(consulta.getNombrePPG()));
                request.setAttribute("fechaPPG", (Date)(consulta.getFechaPPG()));
                request.setAttribute("propuestop", (String)(consulta.getPropuestop()));
                request.setAttribute("actvPPG", (String)(consulta.getActvPPG()));
                request.setAttribute("Areas", (String)(consulta.getAreas()));
                request.setAttribute("ptosInte",(String)(consulta.getPtosInte()));
                request.setAttribute("duraYrec", (String)(consulta.getDuraYrec()));
                request.setAttribute("primeraE", (String)(consulta.getPrimeraE()));
                request.setAttribute("trimestreUno", (String)(consulta.getTrimestreUno()));
                request.setAttribute("resultMinUno", (String)(consulta.getResultMinUno()));
                request.setAttribute("actResulUno", (String)(consulta.getActResulUno()));
                request.setAttribute("descTopicosICI", (String)(consulta.getDescTopicosICI()));
                request.setAttribute("segundaE", (String)(consulta.getSegundaE()));
                request.setAttribute("trimestreDos", (String)(consulta.getTrimestreDos()));
                request.setAttribute("juntas", (Boolean)(consulta.getJuntas()));
                request.setAttribute("resultMinDos", (String)(consulta.getResultMinDos()));
                request.setAttribute("actResulDos", (String)(consulta.getActResulDos()));
                request.setAttribute("descTopicosICII", (String)(consulta.getDescTopicosICII()));
                request.setAttribute("terceraE", (String)(consulta.getTerceraE()));
                request.setAttribute("trimestreTres", (String)(consulta.getTrimestreTres()));
                request.setAttribute("resultMinTres", (String)(consulta.getResultMinTres()));
                request.setAttribute("actResulTres", (String)(consulta.getActResulTres()));
                request.setAttribute("recurMate", (String)(consulta.getRecurMate()));
                request.setAttribute("ano1",(consulta.getAnoUno()));
                request.setAttribute("ano2",(consulta.getAnoDos()));
                request.setAttribute("ano3",(consulta.getAnoTres()));
                request.getSession().setAttribute("numeroppg", (consulta.getNumeroPPG()));
                /*Recuperando ProfesorPPG, Codigos de Areas e Integrantes*/
                //Recuerda cambiar el Query por el correcto cuando Consultar este listo
                //INTETRANTES
                List <String> consulta2 = s.createSQLQuery("select carnetestudiante from EstRealizaProy where codigoproy = :tempi").setInteger("tempi",codigoPPG).list();
                int num = consulta2.size();
                if (num == 3){
                    request.setAttribute("integrante1", consulta2.get(0));
                    request.setAttribute("integrante2", consulta2.get(1));
                    request.setAttribute("integrante3", consulta2.get(2));
                }
                else if (num == 2){
                    request.setAttribute("integrante1", consulta2.get(0));
                    request.setAttribute("integrante2", consulta2.get(1));
                }
                else if (num == 1){
                    request.setAttribute("integrante1", consulta2.get(0));
                }
                //PROFESOR TUTOR
                //CODIGO AREA
                RelPPGArea codArea = (RelPPGArea)s.createQuery("from RelPPGArea where numppg = :tempi").setInteger("tempi",codigoPPG).uniqueResult();
                request.setAttribute("codigoArea", (String)(codArea.getCodigo_Area()));

            }

            /*Aqui termina mi codigo*/   
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
     * Called by Struts for the execution of action A_ModificarPPG.
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
    public ActionForward A_ModificarPPG(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"A_Pre_GestionarPPG", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_AgregarPPG fF_AgregarPPG = (F_AgregarPPG)form;
           /*Aqui comienza mi codigo*/
            String nombrePPG = fF_AgregarPPG.getNombrePPG();
            String fechaPPG = fF_AgregarPPG.getFechaPPG();
            String propuesto = fF_AgregarPPG.getPropuestop();
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
            String trimestreDos = fF_AgregarPPG.getTrimestreDos();
            Boolean juntas = fF_AgregarPPG.getJuntas();
            String resultMinDos = fF_AgregarPPG.getResultMinDos();
            String actResulDos = fF_AgregarPPG.getActResulDos();
            String descTopicosICII = fF_AgregarPPG.getDescTopicosICII();
            String terceraE = fF_AgregarPPG.getTerceraE();
            String trimestreTres = fF_AgregarPPG.getTrimestreTres();
            String resultMinTres = fF_AgregarPPG.getResultMinTres();
            String actResulTres = fF_AgregarPPG.getActResulTres();
            String recurMate = fF_AgregarPPG.getRecurMate();
            int ano1 = fF_AgregarPPG.getAnoUno();
            int ano2 = fF_AgregarPPG.getAnoDos();
            int ano3 = fF_AgregarPPG.getAnoTres();
            /*Se realiza la carga de los datos a la BD UPDATE*/
            //PPG ppg = (PPG)s.createQuery("from PPG where numeroPPG = :tempi").setInteger("tempi",codigoPPG).uniqueResult();
            int numppg = (Integer)request.getSession().getAttribute("numeroppg");
            PPG ppg = (PPG)s.createQuery("from PPG where numeroPPG = :numppg").setInteger("numppg", numppg).uniqueResult();
            /* transformamos la fecha */
            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = null;
            try {
                fecha = formatoDelTexto.parse(fechaPPG);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            ppg.setFechaPPG(fecha);
            ppg.setPropuestop(propuesto);
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
            ppg.setTrimestreDos(trimestreDos);
            ppg.setJuntas(juntas);
            ppg.setResultMinDos(resultMinDos);
            ppg.setActResulDos(actResulDos);
            ppg.setDescTopicosICII(descTopicosICII);
            ppg.setTerceraE(terceraE);
            ppg.setTrimestreTres(trimestreTres);
            ppg.setResultMinTres(resultMinTres);
            ppg.setActResulTres(actResulTres);
            ppg.setRecurMate(recurMate);
            ppg.setAnoUno(ano1);
            ppg.setAnoDos(ano2);
            ppg.setAnoTres(ano3);
            /* Agregamos ESTUDIANTES con sus respectivos PROYECTOS */
            String integrante1 = fF_AgregarPPG.getIntegrante1();
            String integrante2 = fF_AgregarPPG.getIntegrante2();
            String integrante3 = fF_AgregarPPG.getIntegrante3();
            salida = SALIDA_0;
            List consulta = s.createSQLQuery("select * from estudiante where carnete='"+integrante1+"';").list();
            List consulta2 = s.createSQLQuery("select * from EstRealizaProy where carnetestudiante='"+integrante1+"';").list();
            //EstRealizaProy erase = (EstRealizaProy)s.createQuery("delete from EstRealizaProy where codigoproy = :tempi").setInteger("tempi",codigoPPG);
            //List erase = s.createQuery("delete from EstRealizaProy where codigoproy = 1").list();
            
            if (!consulta.isEmpty() && consulta2.isEmpty()){
                EstRealizaProy erp1 = new EstRealizaProy();
                erp1.setCarnetEstudiante(integrante1);
                int ppgId = (int)ppg.getNumeroPPG();
                erp1.setCodigoproy(ppgId);
                s.save(erp1);
                consulta = s.createSQLQuery("select * from estudiante where carnete='"+integrante2+"';").list();
                consulta2 = s.createSQLQuery("select * from EstRealizaProy where carnetestudiante='"+integrante2+"';").list();
                 if ((!consulta.isEmpty()) && (integrante1 != integrante2) && consulta2.isEmpty()){
                    EstRealizaProy erp2 = new EstRealizaProy();
                    erp2.setCarnetEstudiante(integrante2);
                    erp2.setCodigoproy(ppgId);
                    s.save(erp2);
                    consulta = s.createSQLQuery("select * from estudiante where carnete='"+integrante3+"';").list();
                    consulta2 = s.createSQLQuery("select * from EstRealizaProy where carnetestudiante='"+integrante3+"';").list();
                    if (!consulta.isEmpty() && integrante2!=integrante3 && integrante1!=integrante3 && consulta2.isEmpty()){
                        EstRealizaProy erp3 = new EstRealizaProy();
                        erp3.setCarnetEstudiante(integrante3);
                        erp3.setCodigoproy(ppgId);
                        s.save(erp3);
                    }
                  }
            }
            else if (!consulta.isEmpty() && (!consulta2.isEmpty())){
                consulta = s.createSQLQuery("select * from estudiante where carnete='"+integrante2+"';").list();
                consulta2 = s.createSQLQuery("select * from EstRealizaProy where carnetestudiante='"+integrante2+"';").list();
                if (!consulta.isEmpty() && consulta2.isEmpty()){
                    EstRealizaProy erp2 = new EstRealizaProy();
                    int ppgId = (int)ppg.getNumeroPPG();
                    erp2.setCarnetEstudiante(integrante2);
                    erp2.setCodigoproy(ppgId);
                    s.save(erp2);
                    consulta = s.createSQLQuery("select * from estudiante where carnete='"+integrante3+"';").list();
                    consulta2 = s.createSQLQuery("select * from EstRealizaProy where carnetestudiante='"+integrante3+"';").list();
                    if (!consulta.isEmpty() && consulta2.isEmpty()){
                        EstRealizaProy erp3 = new EstRealizaProy();
                        erp3.setCarnetEstudiante(integrante3);
                        erp3.setCodigoproy(ppgId);
                        s.save(erp3);
                     }
                }
                else if (!consulta.isEmpty() && !consulta2.isEmpty()){
                    consulta = s.createSQLQuery("select * from estudiante where carnete='"+integrante3+"';").list();
                    consulta2 = s.createSQLQuery("select * from EstRealizaProy where carnetestudiante='"+integrante3+"';").list();
                    if (!consulta.isEmpty() && consulta2.isEmpty()){
                        EstRealizaProy erp3 = new EstRealizaProy();
                        int ppgId = (int)ppg.getNumeroPPG();
                        erp3.setCarnetEstudiante(integrante3);
                        erp3.setCodigoproy(ppgId);
                        s.save(erp3);
                     }
               }
             }
            /*Fin Update Estudiante*/
            /*UPDATE*/
            //s.update(ppg);
            salida = SALIDA_0;
            fF_AgregarPPG.reset(mapping, request);
            /*Aqui termina mi codigo*/
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        return mapping.findForward(SALIDAS[salida]);
    }



}