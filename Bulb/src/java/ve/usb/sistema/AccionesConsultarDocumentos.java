package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.*;
import java.text.SimpleDateFormat;



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


/**
 *
 */
public class AccionesConsultarDocumentos extends CohesionAction {

/**
     * Called by Struts for the execution of action A_Pre_ConsultarInscripcion.
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
    public ActionForward A_Pre_ConsultarDocumentos(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {


        //Salidas
        final String[] SALIDAS = {"V_ConsultarDocumentos", "A_Pre_GestionarCulminacion", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        String filePath = getServlet().getServletContext().getRealPath("/") + "upload\\DocC";
        String archivo;
        String dateString;
        SimpleDateFormat fecha = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
	/*aqui empieza*/

             File carpeta = new File(filePath);
             File[] listaArchivos = carpeta.listFiles();

              if (listaArchivos.length!=0){

                for (int i = 0; i < listaArchivos.length; i++){
                    if (listaArchivos[i].isFile()){
                        archivo = listaArchivos[i].getName();
                        dateString = fecha.format(listaArchivos[i].lastModified());
                        request.setAttribute("archivo",archivo);
                        request.setAttribute("fecha",dateString);
                    }
                }

              }else{
                salida = SALIDA_1;
              }

              	/*aqui termina*/
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("V_ConsultarDocumentos.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("V_ConsultarDocumentos.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }


public ActionForward A_ConsultarDocumentos(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        final String[] SALIDAS = {"A_Pre_ConsultarDocumentos", "A_Pre_ConsultarDocumentos", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;
        boolean success;
        String filePath = getServlet().getServletContext().getRealPath("/") + "upload\\DocC";

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            
        File carpeta = new File(filePath);
        File[] listaArchivos = carpeta.listFiles();

        success = listaArchivos[listaArchivos.length - 1].delete();

        if (!success){
          salida = SALIDA_1;
        }
        
        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_ConsultarDocumentos.msg2"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_ConsultarDocumentos.msg3"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }


}



