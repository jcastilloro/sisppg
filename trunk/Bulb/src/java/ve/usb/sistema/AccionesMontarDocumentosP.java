/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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

import com.itextpdf.text.Chunk;
import java.io.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author Gurren Lagann
 */
public class AccionesMontarDocumentosP extends CohesionAction {

    public ActionForward A_Pre_MontarDocumentosP(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_MontarDocumentosP",};
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try {
                s.close();
            } catch (Exception ex2) {
            }
        }
        return mapping.findForward(SALIDAS[salida]);
    }

    public ActionForward A_MontarDocumentosP(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        F_Upload myForm = (F_Upload) form;

        // Process the FormFile
        FormFile myFile = myForm.getTheFile();
        String contentType = myFile.getContentType();
        String fileName = myFile.getFileName();
        int fileSize = myFile.getFileSize();
//        byte[] fileData = myFile.getFileData();
        String filePath = getServlet().getServletContext().getRealPath("/") + "upload/DocC";
//        System.out.println("contentType: " + contentType);
//        System.out.println("File Name: " + fileName);
//        System.out.println("File Size: " + fileSize);
        if (!fileName.equals("")) {
            String ext = ".___";
            if (!contentType.equals("image/jpeg") && !contentType.equals("application/pdf")) {
                return mapping.findForward("formato");
            }
            if (fileSize > 5000000) {
                return mapping.findForward("tamano");
            }
            if (contentType.equals("image/jpeg")) {
                ext = ".jpg";
            } else {
                ext = ".pdf";
            }
            System.out.println("Server path:" + filePath);
            //Create file
            // Format the current time.
            Session s = HibernateUtil.getCurrentSession();
            Transaction tr = s.beginTransaction();
            Estudiante estudiante = (Estudiante) s.createQuery("from Estudiante where carnete = :login").setString("login", (String) request.getSession().getAttribute("login")).uniqueResult();
            String carnet = (String)(estudiante.getCarnetE());
            SimpleDateFormat formatter = new SimpleDateFormat("-yyyy-MM-dd-hh-mm-ss");
            Date currentTime_1 = new Date();
            String dateString = formatter.format(currentTime_1);

            File fileToCreate = new File(filePath, carnet + dateString + ext);
           
            //If file does not exists create file
            if (!fileToCreate.exists()) {
                FileOutputStream fileOutStream = new FileOutputStream(fileToCreate);
                fileOutStream.write(myFile.getFileData());
                fileOutStream.flush();
                fileOutStream.close();
            }


            return mapping.findForward("success");

        } else {
            return mapping.findForward("vacio");
        }

    }
}
