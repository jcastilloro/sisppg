package jc2s.sistppg;

import java.io.File;
import java.io.FileOutputStream;
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
import jc2s.sistppg.hibernate.*;
import org.apache.struts.upload.FormFile;


/**
 * 
 */
public class AccionesC_Retiro_Pasantia_Est extends CohesionAction {
    
/**
     * Called by Struts for the execution of action A_prep_retirar_pasantia.
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
    public ActionForward A_prep_retirar_pasantia(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_Retirar_Pasantia", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
//Checking for actors estudiante
            if (!CohesionActor.checkActor(request, 4)) {
                return mapping.findForward(CohesionActor.SALIDA_ACTOR);
            }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_prep_retirar_pasantia.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action A_Retirar_Pasantia.
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
    public ActionForward A_Retirar_Pasantia(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"A_Prep_Gestion_Pasantias_Estudiante", "V_Retirar_Pasantia", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
//Checking for actors estudiante
            if (!CohesionActor.checkActor(request, 4)) {
                return mapping.findForward(CohesionActor.SALIDA_ACTOR);
            }
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            F_Retiro_Pasantia fF_Retiro_Pasantia = (F_Retiro_Pasantia)form;
                    // Process the FormFile

            if(fF_Retiro_Pasantia.getCarta_retiro_estudiante()==null || fF_Retiro_Pasantia.getCarta_retiro_tutor_academico()==null || fF_Retiro_Pasantia.getCarta_retiro_tutor_industrial()==null){
                salida = SALIDA_1;
            }else{
                boolean successUserDir = (new File(getServlet().getServletContext().getRealPath("/") + "documentos/")).mkdir();
                            System.out.println("Creo bien el directorio?:" + successUserDir);
                successUserDir = (new File(getServlet().getServletContext().getRealPath("/") + "documentos/"+((Usuario)request.getSession().getAttribute("usuario")).getUsbid())).mkdir();
                            System.out.println("Creo bien el del usuario??:" + successUserDir);
                //----------------------------
                //Montar la carta del estudiante
                FormFile myFile = fF_Retiro_Pasantia.getCarta_retiro_estudiante();
                String contentType = myFile.getContentType();
                String fileName = myFile.getFileName();
                int fileSize = myFile.getFileSize();
                String filePath = getServlet().getServletContext().getRealPath("/") + "documentos/"+((Usuario)request.getSession().getAttribute("usuario")).getUsbid()+"/C_retiro_E";
                successUserDir = (new File(filePath)).mkdir();
                System.out.println("Creo bien el primero?:" + successUserDir);
                if (!fileName.equals("")) {
                    String ext = ".___";
                    if (!contentType.equals("image/jpeg") && !contentType.equals("application/pdf")) {
                        salida = SALIDA_1;
                    }
                    if (fileSize > 5000000) {
                        salida = SALIDA_1;
                    }
                    System.out.println("Server path:" + filePath);
                    File fileToCreate = new File(filePath, fileName);
                    boolean createNewFileBoole = fileToCreate.createNewFile();
                    System.out.println("boolean:" + createNewFileBoole);
                    if (!fileToCreate.exists()) {
                        FileOutputStream fileOutStream = new FileOutputStream(fileToCreate);
                        fileOutStream.write(myFile.getFileData());
                        fileOutStream.flush();
                        fileOutStream.close();
                    }
                }
                //-----------
                //----------------------------
                //Montar la carta del T academico
                myFile = fF_Retiro_Pasantia.getCarta_retiro_tutor_academico();
                contentType = myFile.getContentType();
                fileName = myFile.getFileName();
                filePath = getServlet().getServletContext().getRealPath("/") + "documentos/"+((Usuario)request.getSession().getAttribute("usuario")).getUsbid()+"/C_retiro_TA";
                successUserDir = (new File(filePath)).mkdir();
                System.out.println("Creo bien el segundo?:" + successUserDir);
                if (!fileName.equals("")) {
                    String ext = ".___";
                    if (!contentType.equals("image/jpeg") && !contentType.equals("application/pdf")) {
                        salida = SALIDA_1;
                    }
                    if (fileSize > 5000000) {
                        salida = SALIDA_1;
                    }

                    System.out.println("Server path:" + filePath);
                    File fileToCreate = new File(filePath, fileName);
                    boolean createNewFileBoole = fileToCreate.createNewFile();
                    System.out.println("boolean:" + createNewFileBoole);
                    if (!fileToCreate.exists()) {
                        FileOutputStream fileOutStream = new FileOutputStream(fileToCreate);
                        fileOutStream.write(myFile.getFileData());
                        fileOutStream.flush();
                        fileOutStream.close();
                    }
                }
                //-----------
                //----------------------------
                //Montar la carta del T industrial
                myFile = fF_Retiro_Pasantia.getCarta_retiro_tutor_industrial();
                contentType = myFile.getContentType();
                fileName = myFile.getFileName();
                fileSize = myFile.getFileSize();
                filePath = getServlet().getServletContext().getRealPath("/") + "documentos/"+((Usuario)request.getSession().getAttribute("usuario")).getUsbid()+"/C_retiro_TI";
                successUserDir = (new File(filePath)).mkdir();
                System.out.println("Creo bien el segundo?:" + successUserDir);
                if (!fileName.equals("")) {
                    String ext = ".___";
                    if (!contentType.equals("image/jpeg") && !contentType.equals("application/pdf")) {
                        salida = SALIDA_1;
                    }
                    if (fileSize > 5000000) {
                        salida = SALIDA_1;
                    }
                    System.out.println("Server path:" + filePath);
                    File fileToCreate = new File(filePath, fileName);
                    if (!fileToCreate.exists()) {
                        FileOutputStream fileOutStream = new FileOutputStream(fileToCreate);
                        fileOutStream.write(myFile.getFileData());
                        fileOutStream.flush();
                        fileOutStream.close();
                    }
                }
                //-----------

            }
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_Retirar_Pasantia.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_Retirar_Pasantia.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}