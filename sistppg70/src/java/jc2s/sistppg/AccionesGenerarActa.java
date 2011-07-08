package jc2s.sistppg;


import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
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
import jc2s.sistppg.hibernate.Ciudad;
import jc2s.sistppg.hibernate.Estudiante;
import jc2s.sistppg.hibernate.EstudianteRealizaProyecto;
import jc2s.sistppg.hibernate.Pasantia;
import jc2s.sistppg.hibernate.PasantiaIntermedia;
import jc2s.sistppg.hibernate.PasantiaLarga;
import jc2s.sistppg.hibernate.Preinscripcion;
import jc2s.sistppg.hibernate.Profesor;
import jc2s.sistppg.hibernate.Usuario;

public class AccionesGenerarActa extends CohesionAction {

/**
     * Called by Struts for the execution of action A_GenerarSolicitudPasanti.
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
    public ActionForward A_GenerarActa(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_GenerarCartaPostulacion", "A_prep_gestionar_preinscripcion", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();

        try {

            /*mi codigo*/

            String path = getServlet().getServletContext().getRealPath("/") + "../../img/";
            String idPasantia = (String) request.getSession().getAttribute("EstaPasantia");
            Usuario u = (Usuario) request.getSession().getAttribute("usuario");
            Profesor prof = (Profesor) s.createQuery("from Profesor where usbid= :login").setString("login", u.getUsbid()).uniqueResult();
            Pasantia p = (Pasantia) s.createQuery("from Pasantia where idPasantia= :var").setLong("var",  Long.parseLong(idPasantia)).uniqueResult();
            PasantiaLarga larga = (PasantiaLarga) s.createQuery("from PasantiaLarga where pasantia = :var").setLong("var", Long.parseLong(idPasantia)).uniqueResult();
            EstudianteRealizaProyecto est = (EstudianteRealizaProyecto) s.createQuery("from EstudianteRealizaProyecto where proyecto = :var").setLong("var", p.getProyecto().getId()).uniqueResult();
            PasantiaIntermedia media = null;

            String tipoP = new String();
            String periodo = new String();
            if (larga != null) {
                tipoP = "LARGA";
                periodo = larga.getPeriodo().getNombre();
            } else {
                media = (PasantiaIntermedia) s.createQuery("from PasantiaIntermedia where pasantia = :var").setLong("var", Long.parseLong(idPasantia)).uniqueResult();
                if (media != null){
                    tipoP = "INTERMEDIA";
                    periodo = media.getPeriodo().getNombre();
                }
            }


            if (prof != null && p != null && est != null) {

                String tutorA = prof.getNombre() +" "+ prof.getApellido();
                String tutorA_CI = prof.getCedula();
                String tutorI = p.getTutor_industrial().getNombre();
                String tutorI_CI = p.getTutor_industrial().getCedula();
                int ano = p.getAno();
                String tituloP = p.getTitulo();
                String apellidoE = est.getEstudiante().getApellido();
                String nombreE = est.getEstudiante().getNombre();
                String carnet = est.getEstudiante().getUsbid();
                String carrera = est.getEstudiante().getCarrera().getNombre();
                String nota = p.getEvaluacion_tutor_academico();


                /* PDF */
                try {
                    Document pdf = new Document(PageSize.LETTER);

                    response.setContentType("application/pdf");
                    response.setHeader("Content-Disposition", " inline; filename=cartaPostulacion.pdf");

                    PdfWriter.getInstance(pdf, response.getOutputStream());

                    pdf.addTitle("Acta de Evaluación" );
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

                    Font font2 = FontFactory.getFont("Times New Roman", BaseFont.IDENTITY_H, 8);

                    Paragraph blank = new Paragraph("\n");
                    pdf.add(blank);

                    Paragraph fecha = new Paragraph("Fecha:____________", font);
                    fecha.setAlignment(Paragraph.ALIGN_RIGHT);
                    pdf.add(fecha);

                    Paragraph titulo = new Paragraph("ACTA DE EVALUACIÓN DEL PERÍODO "+periodo+" "+ano, font);
                    titulo.setAlignment(Paragraph.ALIGN_CENTER);
                    pdf.add(titulo);

                    Phrase tipo = new Phrase("\nTIPO DE PASANTÍA: "+tipoP);
                    pdf.add(tipo);

                    Paragraph titulop = new Paragraph("Título: "+tituloP);
                    pdf.add(titulop);

                    Paragraph ape = new Paragraph("Apellidos y Nombre del Estudiante: "+apellidoE+" "+nombreE);
                    pdf.add(ape);

                    Paragraph cc = new Paragraph("Carnet: "+carnet+" Carrera: "+carrera);
                    pdf.add(cc);

                    pdf.add(blank);
                    pdf.add(blank);

                    Paragraph fila1 = new Paragraph("CALIFICACIÓN "+nota, font);
                    float[] widths = { 2f, 3f, 2f };
                    PdfPTable datosP = new PdfPTable(widths);
                    PdfPCell cell = new PdfPCell( fila1 );
                    cell.setMinimumHeight(20f);
                    cell.setColspan(3);
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    datosP.addCell(cell);

                    cell = new PdfPCell(new Paragraph("\n\n\nTUTOR ACADÉMICO"));
                    cell.setMinimumHeight(80f);
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    datosP.addCell(cell);
                    cell = new PdfPCell (new Paragraph ("\nFirma:_______________\n\nNombre: "+tutorA+"\n\nC.I: "+tutorA_CI));
                    cell.setHorizontalAlignment(Element.ALIGN_LEFT);
                    datosP.addCell(cell);
                    cell = new PdfPCell (new Paragraph ("\n\n\n\n\n\n\n\nSello del Departamento", font2));
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    datosP.addCell(cell);

                    cell = new PdfPCell(new Paragraph("\n\n\nTUTOR INDUSTRIAL"));
                    cell.setMinimumHeight(80f);
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    datosP.addCell(cell);
                    cell = new PdfPCell (new Paragraph ("\nFirma:_______________\n\nNombre: "+tutorI+"\n\nC.I: "+tutorI_CI));
                    cell.setHorizontalAlignment(Element.ALIGN_LEFT);
                    datosP.addCell(cell);
                    cell = new PdfPCell (new Paragraph ("\n\n\n\n\n\n\n\nSello de la Coordinación de Carrera", font2));
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    datosP.addCell(cell);

                    cell = new PdfPCell(new Paragraph("\n\n\nJURADO"));
                    cell.setMinimumHeight(80f);
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    datosP.addCell(cell);
                    cell = new PdfPCell (new Paragraph ("\nFirma:_______________\n\nNombre:______________\n\nC.I:__________________ "));
                    cell.setHorizontalAlignment(Element.ALIGN_LEFT);
                    datosP.addCell(cell);
                    cell = new PdfPCell (new Paragraph ("\n\n\n\n\n\n\n\nSello del Departamento", font2));
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    datosP.addCell(cell);

                    cell = new PdfPCell(new Paragraph ("Artículo 15.Parágrafo Único. Reglamento de los Cursos en Cooperación: Cuando el jurado examinador considere por unanimidad que el "
                            + "Trabajo realizado por el pasante es EXCEPCIONALMENTE BUENO, lo hará constar en forma razonada en el Acta"
                            + "\n\n____________________________________________________________________"
                            + "\n\n____________________________________________________________________"
                            + "\n\n____________________________________________________________________\n.", font2));
                    cell.setMinimumHeight(20f);
                    cell.setColspan(2);;
                    datosP.addCell(cell);
                    cell = new PdfPCell (new Paragraph ("\n\nValidación de CCTDS\n(Firma y Sello)", font2));
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    datosP.addCell(cell);

                    datosP.setWidthPercentage(80);
                    datosP.setHorizontalAlignment(Element.ALIGN_LEFT);
                    pdf.add(datosP);

                    Paragraph abajo = new Paragraph("Nota: En caso de inasistencia del Tutor Industrial, el jurado examinador quedará conformado por el Tutor Académico y Jurado, "
                            + "y se solicitará al estudiante la evaluación del Tutor Industrial como referencia, en este caso favor colocar No-Presente en el Acta", font2);
                    pdf.add(abajo);
                    
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
            getResources(request).getMessage("A_GenerarCartaPostulacion.msg1"));
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