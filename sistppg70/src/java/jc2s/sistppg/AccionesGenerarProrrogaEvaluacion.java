package jc2s.sistppg;


import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

import ve.usb.cohesion.runtime.CohesionAction;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ve.usb.cohesion.runtime.HibernateUtil;

import java.util.Calendar;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jc2s.sistppg.hibernate.Estudiante;
import jc2s.sistppg.hibernate.EstudianteRealizaProyecto;
import jc2s.sistppg.hibernate.Pasantia;
import jc2s.sistppg.hibernate.PasantiaCorta;
import jc2s.sistppg.hibernate.PasantiaIntermedia;
import jc2s.sistppg.hibernate.PasantiaLarga;
import jc2s.sistppg.hibernate.Preinscripcion;
import jc2s.sistppg.hibernate.Prorroga;
import jc2s.sistppg.hibernate.Usuario;

public class AccionesGenerarProrrogaEvaluacion extends CohesionAction {

/**
     * Called by Struts for the execution of action A_GenerarSolicitudPasantia.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @return The Struts name of the following step.
     * @throws java.lang.Exception For untreated exceptions.
     * These exceptions will normally be treated with
     * the default exception action.
     */
    public ActionForward A_GenerarProrrogaEvaluacion(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_GenerarCartaPostulacion", "A_prep_solicitar_prorroga_evaluacion", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();

        try {

            /*mi codigo*/

            String path = getServlet().getServletContext().getRealPath("/") + "../../img/";
            Usuario u = (Usuario) request.getSession().getAttribute("usuario");
            Estudiante estudiante = (Estudiante) s.createQuery("from Estudiante where usbid = :login").setString("login", u.getUsbid()).uniqueResult();

            List<EstudianteRealizaProyecto> proyectos = s.createQuery("from EstudianteRealizaProyecto where estudiante= :var").setLong("var", estudiante.getId()).list();
            Pasantia pasantia = null;
            if (!proyectos.isEmpty()) {

                Iterator it = proyectos.iterator();
                EstudianteRealizaProyecto proy = new EstudianteRealizaProyecto();

                while (it.hasNext()) {
                    proy = (EstudianteRealizaProyecto) it.next();

                    pasantia = (Pasantia) s.createQuery("from Pasantia where proyecto= :var").setLong("var", proy.getProyecto().getId()).uniqueResult();
                    if (pasantia != null) {
                        break;
                    }

                }
            }

            List<Prorroga> prorrogas = (List<Prorroga>) s.createQuery("from Prorroga where estudiante = :idEst and idProrroga IN (Select prorroga from ProrrogaEvaluacion)").setLong("idEst", estudiante.getIdEstudiante()).list();
            Prorroga pro = null;

            if (!prorrogas.isEmpty())
                pro = prorrogas.get(0);

            if (pro != null && pasantia != null) {


                String carnet = (String) estudiante.getUsbid();
                String nombre = (String) estudiante.getNombre();
                String apellido = (String) estudiante.getApellido();
                String carrera = (String) estudiante.getCarrera().getNombre();
                int year = pasantia.getAno();
                String periodo = new String();
                String ep = new String();
                PasantiaLarga pl = (PasantiaLarga) s.createQuery("from PasantiaLarga where pasantia = :pas").setLong("pas", pasantia.getIdPasantia()).uniqueResult();

                if (pl != null){
                    ep = "LARGA (EP-3420)";
                    periodo = pl.getPeriodo().getNombre();
                } else {
                    PasantiaIntermedia pi = (PasantiaIntermedia) s.createQuery("from PasantiaIntermedia where pasantia = :pas").setLong("pas", pasantia.getIdPasantia()).uniqueResult();
                    if (pi != null){
                        ep = "INTERMEDIA (EP-2420)";
                        periodo = pi.getPeriodo().getNombre();
                    } else {
                        PasantiaCorta pc = (PasantiaCorta) s.createQuery("from PasantiaCorta where pasantia = :pas").setLong("pas", pasantia.getIdPasantia()).uniqueResult();
                        if (pc != null){
                            ep = "CORTA (EP-1420)";
                            periodo = "Julio-Septiembre";
                        }
                    }
                }
                String just = pro.getJustificacion();
                String tutor = (String) pasantia.getTutor_academico().getNombre();
                tutor = tutor.concat((String) pasantia.getTutor_academico().getApellido());


                /* PDF */
                try {
                    Document pdf = new Document(PageSize.LETTER);

                    response.setContentType("application/pdf");
                    response.setHeader("Content-Disposition", " inline; filename=cartaPostulacion.pdf");

                    PdfWriter.getInstance(pdf, response.getOutputStream());

                    pdf.addTitle("Solicitud de Pasantía - " );
                    pdf.open();

                    // Logo
                    Image logo = Image.getInstance(path +"logo.png");
                    logo.scaleToFit(197, 81);
                    logo.setAlignment(Image.ALIGN_LEFT);
                    pdf.add(logo);

                    // Pie
                    Image pie = Image.getInstance(path +"pie.png");
                    pie.scaleToFit(500, 216);
                    pie.setAbsolutePosition(40, 20);
                    pdf.add(pie);


                    Font font = FontFactory.getFont("Times New Roman", BaseFont.IDENTITY_H, 12);
                    font.setStyle(Font.BOLD);

                    Paragraph blank = new Paragraph("\n");
                    pdf.add(blank);

                    Paragraph titulo = new Paragraph("PERMISO PARA PASANTÍA", font);
                    titulo.setAlignment(Paragraph.ALIGN_CENTER);
                    pdf.add(titulo);

                    Chunk space = new Chunk(' ');
                    Chunk epBold = new Chunk("\nCoordinación de " + carrera, font);
                    Chunk otro = new Chunk("\n\nNombre del estudiante: "+nombre+" "+apellido+" Carnet: "+carnet+"\n\nEVALUACIÓN EXTEMPORANEA");
                    pdf.add(epBold);
                    pdf.add(otro);

                    Paragraph fila1 = new Paragraph("PASANTÍA\n\n"+ep+"\n\nPERIODO: "+periodo+" "+year);
                    PdfPTable datosP = new PdfPTable(3);
                    PdfPCell cell = new PdfPCell( fila1 );
                    cell.setMinimumHeight(80f);
                    cell.setColspan(3);
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    datosP.addCell(cell);

                    cell = new PdfPCell(new Paragraph("TUTOR ACADÉMICO"));
                    cell.setMinimumHeight(50f);
                    datosP.addCell(cell);
                    cell = new PdfPCell (new Paragraph ("Nombre: "+tutor));
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    datosP.addCell(cell);
                    cell = new PdfPCell (new Paragraph ("\nFirma:____________"));
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    datosP.addCell(cell);

                    cell = new PdfPCell(new Paragraph("Justificación:\n"+just ));
                    cell.setMinimumHeight(80f);
                    cell.setColspan(3);
                    datosP.addCell(cell);

                    cell = new PdfPCell(new Paragraph("Observaciones CCTDS: \n\n____________________________________________________________________________________________________"));
                    cell.setMinimumHeight(100f);
                    datosP.addCell(cell);
                    cell = new PdfPCell (new Paragraph ("\n\n\n\n\nVo Bo. Firma y sello de Coordinación de Carrera\nFecha:"));
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    datosP.addCell(cell);
                    cell = new PdfPCell (new Paragraph ("\n\n\n\n\nFirma del Coordinador de CCTDS\nFecha:"));
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    datosP.addCell(cell);

                    datosP.setWidthPercentage(80);
                    datosP.setHorizontalAlignment(Element.ALIGN_LEFT);
                    pdf.add(datosP);


                    pdf.close();
                    /* PDF */

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else {
                salida = 1;
            }

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
            getResources(request).getMessage("A_GenerarCartaPostulacion.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_GenerarProrroga.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

    private int calcularEdad(Date fechaNacimiento){

        Calendar fn = new GregorianCalendar();
        Calendar hoy = new GregorianCalendar();
        int edad = 0;
        int factor = 0;

        Date currentDate = new Date();
        fn.setTime(fechaNacimiento);
        hoy.setTime(currentDate);
        if (hoy.get(Calendar.MONTH) <= fn.get(Calendar.MONTH)) {
            if (hoy.get(Calendar.MONTH) == fn.get(Calendar.MONTH)) {
                if (hoy.get(Calendar.DATE) > fn.get(Calendar.DATE)) {
                    factor = -1; //Aun no celebra su cumpleaños
                }
            } else {
                factor = -1; //Aun no celebra su cumpleaños
            }
        }
        edad = (hoy.get(Calendar.YEAR) - fn.get(Calendar.YEAR)) + factor;
        return edad;
    }

}
