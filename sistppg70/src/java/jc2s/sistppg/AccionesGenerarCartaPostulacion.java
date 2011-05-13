
package jc2s.sistppg;


import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
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

/**
 *
 * @author chitty
 */
public class AccionesGenerarCartaPostulacion  extends CohesionAction {

/**
     * Called by Struts for the execution of action A_GenerarCartaPostulacion.
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
    public ActionForward A_GenerarCartaPostulacion(ActionMapping mapping, ActionForm  form,
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

                String path = getServlet().getServletContext().getRealPath("/")+ "../../img/";

                /* PDF */
                try {
                    Document pdf = new Document(PageSize.LETTER);

                    response.setContentType("application/pdf");
                    response.setHeader("Content-Disposition", " inline; filename=cartaPostulacion.pdf");

                    PdfWriter.getInstance(pdf, response.getOutputStream());

                    pdf.addTitle("Carta de Postulación - " );
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
                    Font bold = FontFactory.getFont("Times New Roman", BaseFont.IDENTITY_H, 12);
                    bold.setStyle(Font.BOLD);

                    Paragraph blank = new Paragraph("\n");
                    pdf.add(blank);
                    pdf.add(blank);
                    pdf.add(blank);

                    Paragraph titulo = new Paragraph("A QUIEN PUEDA INTERESAR", font);
                    titulo.setAlignment(Paragraph.ALIGN_CENTER);
                    pdf.add(titulo);
                    pdf.add(blank);
                    pdf.add(blank);
                    pdf.add(blank);

                    Paragraph uno = new Paragraph("Después de saludarle, me dirijo a Usted para presentarle a la Br. ???,  "
                            + "estudiante de la carrera  de ???, Carnet ???, a fin de que se le permita una entrevista para optar a la"
                            + " realización de su pasantía ??? en la empresa,  correspondiente a la asignatura EP ???,  durante el período ???"
                            + "  del año ???, con una duración de (???) semanas que equivalen a (???) créditos académicos.", font);
                    pdf.add(uno);
                    pdf.add(blank);

                    Paragraph dos = new Paragraph("La pasantía busca la familiarización  del estudiante  con la dinámica del sector "
                            + "productivo. Además le permitirá  su participación en tareas o proyectos previamente convenidos entre el "
                            + "tutor industrial y el tutor académico, y  la  aplicación de los conocimientos adquiridos en  sus estudios. ");
                    pdf.add(dos);
                    pdf.add(blank);

                    Paragraph tres = new Paragraph("Agradecemos de antemano la colaboración que pueda prestar a este bachiller en función de "
                            + "proporcionarle un proyecto  para su pasantía que pueda redundar en amplios beneficios tanto para su empresa "
                            + "como para el estudiante. De igual forma, la misma ayuda al desarrollo de nuestro Programa de Pasantías, el cual "
                            + "está  adscrito al Decanato de Extensión de esta casa de estudios.");
                    pdf.add(tres);
                    pdf.add(blank);

                    Paragraph cuatro = new Paragraph("Esperando contar siempre con su participación en el Programa de Pasantías de la U.S.B, le saluda.");
                    pdf.add(cuatro);
                    pdf.add(blank);

                    Paragraph fin = new Paragraph("Atentamente,\n\n\n\n\nProf. Kenyer Dominguez\n", font);
                    fin.setAlignment(Paragraph.ALIGN_CENTER);
                    pdf.add(fin);

                    Paragraph fin2 = new Paragraph("Coordinador de Cooperación Técnica y Desarrollo Social", bold);
                    fin2.setAlignment(Paragraph.ALIGN_CENTER);
                    pdf.add(fin2);

                    pdf.close();
                    /* PDF */

                } catch (Exception e) {
                    e.printStackTrace();
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


}
