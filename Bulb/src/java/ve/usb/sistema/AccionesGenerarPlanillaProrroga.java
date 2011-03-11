package ve.usb.sistema;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
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
import ve.usb.sistema.hibernate.*;

/**
 *
 * @author chitty
 */
public class AccionesGenerarPlanillaProrroga extends CohesionAction {

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
    public ActionForward A_GenerarPlanillaProrroga(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_GestionarProrroga", "A_Pre_GestionarProrroga", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            /*aqui empieza*/
            EstRealizaProy student = (EstRealizaProy)s.createQuery("from EstRealizaProy where tipoproy='1' and carnetestudiante= :login").setString("login", (String)request.getSession().getAttribute("login")).uniqueResult();
            Estudiante estudiante =(Estudiante)s.createQuery("from Estudiante where carnete = :login").setString("login", (String)request.getSession().getAttribute("login")).uniqueResult();
            PreInsPasantias consulta = (PreInsPasantias)s.createQuery("from PreInsPasantias where estudiante = :login").setString("login", (String)request.getSession().getAttribute("login")).uniqueResult();

            if (estudiante != null) {

            String  carnet = (String)request.getSession().getAttribute("login");
            Prorroga fF_Prorroga = (Prorroga) s.createQuery("from Prorroga where idc= :carnet").setString("carnet", carnet).uniqueResult();;
            String coordinacion = fF_Prorroga.getCoordinacion();
            String nombre = fF_Prorroga.getNombre();
            String codigoTutorAcademico = fF_Prorroga.getCodigoTutorAcademico();
            String tituloPasantia = fF_Prorroga.getTituloPasantia();
            String areaProyecto = fF_Prorroga.getAreaProyecto();
            String fecha = fF_Prorroga.getFecha();
            String justificacion = fF_Prorroga.getJustificacion();
      
            String path = getServlet().getServletContext().getRealPath("/")+ "../../img/";

                /**************************************/
                /* PDF */
                /**************************************/
                try {
                    Document pdf = new Document(PageSize.LETTER);

                    response.setContentType("application/pdf4");
                    response.setHeader("Content-Disposition", " inline; filename=PlanillaProrroga.pdf");

                    PdfWriter.getInstance(pdf, response.getOutputStream());

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

                    Font font = FontFactory.getFont("Arial", BaseFont.IDENTITY_H, 12);
                    font.setStyle(Font.BOLD);

                    Font font2 = FontFactory.getFont("Arial", BaseFont.IDENTITY_H, 13);
                    font2.setStyle(Font.UNDERLINE);
                    font2.setStyle(Font.BOLD);

                    Paragraph titulo = new Paragraph("PERMISO PARA PASANTIA (Prorroga)", font2);
                    titulo.setAlignment(Paragraph.ALIGN_CENTER);
                    pdf.add(titulo);

                    Paragraph blank = new Paragraph("\n");

                    pdf.add(blank);
                    pdf.add(blank);

                    Phrase est = new Phrase("Coordinación de: "+ coordinacion , font);
                    pdf.add(est);
                    pdf.add(blank);

                    est = new Phrase("Nombre: " + nombre +"                          Carnet: "+ carnet, font);
                    pdf.add(est);
                    pdf.add(blank);

                    Paragraph pfecha= new Paragraph("*Fecha Propuesta: "+fecha);
                    pfecha.setAlignment(Paragraph.ALIGN_CENTER);
                    pdf.add(pfecha);

                    pfecha= new Paragraph("_______________________________________________________________________", font);
                    pfecha.setAlignment(Paragraph.ALIGN_CENTER);
                    pdf.add(pfecha);
                    pdf.add(blank);

                    pfecha= new Paragraph("Pasantía", font2);
                    pfecha.setAlignment(Paragraph.ALIGN_CENTER);
                    pdf.add(pfecha);
                    pdf.add(blank);

                    if (tituloPasantia.equals("3420")){
                    pfecha= new Paragraph("Pasantía Larga (3420)       "+  "Periodo: " + areaProyecto, font);
                    }
                    if (tituloPasantia.equals("2420")){
                    pfecha= new Paragraph("Pasantía Media (2420)       "+  "Periodo: " + areaProyecto, font);
                    }
                    if (tituloPasantia.equals("1420")){
                    pfecha= new Paragraph("Pasantía Corta (1420)       "+  "Periodo: " + areaProyecto, font);
                    }

                    pfecha.setAlignment(Paragraph.ALIGN_CENTER);
                    pdf.add(pfecha);
                    pdf.add(blank);

                    pdf.add(blank);

                    est = new Phrase("*Tutor Academico:  "+codigoTutorAcademico , font);
                    pdf.add(est);

                    est = new Phrase("                      Firma:_____________________" , font);
                    pdf.add(est);
                    pdf.add(blank);

                    pfecha= new Paragraph("Justificacion: ",font);
                    pdf.add(pfecha);
                    pdf.add(blank);
                    pfecha= new Paragraph( justificacion);
                    pdf.add(pfecha);
                    pdf.add(blank);
                    pdf.add(blank);

                    est = new Phrase("Observaciones:______________________________________________________");
                    pdf.add(est);
                    pdf.add(blank);

                    est = new Phrase("Firma y Sello Coordinación:______________________________" , font);
                    pdf.add(est);
                    pdf.add(blank);

                    est = new Phrase("Firma CCTDS:_____________________________________________" , font);
                    pdf.add(est);
                    pdf.add(blank);

                    pdf.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }

                /**************************************/
                /* PDF */
                /**************************************/

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
            getResources(request).getMessage("A_Pre_ConsultarPlanillaProrroga.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_Pre_ConsultarPlanillaProrroga.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

    private PdfPTable crearTabla (float[] widths, String[] names){

        int tam = names.length;
        PdfPTable nom = new PdfPTable(widths);

        for (int i=0; i<tam; i++){
            nom.addCell(names[i]);
        }

        nom.setHorizontalAlignment(Element.ALIGN_CENTER);

        return nom;
    }

}