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
public class AccionesGenerarPlanTrabajo extends CohesionAction {

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
    public ActionForward A_GenerarPlanTrabajo(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_ConsultarInscripcion", "A_Pre_GestionarInscripcion", };
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

            if (student != null) {
                int codigo = (int) student.getCodigoproy();
                Plantrabajo plantrabajo = (Plantrabajo) s.createQuery("from Plantrabajo where codigopt= :codigo").setInteger("codigo", codigo).uniqueResult();
                request.setAttribute("empresa", plantrabajo.getEmpresa());

                request.setAttribute("tutorA", plantrabajo.getCodigoTA());

                String tutorIn = plantrabajo.getCodigoTI();
                String tutorAc = plantrabajo.getCodigoTA();
                String carnet = (String)(estudiante.getCarnetE());
                String nombre = estudiante.getNombreE();
                String cedula = estudiante.getCedulaE();
                String periodopasantia = (String)(consulta.getPeriodoPasantia());
                int ano = (int)(consulta.getAno());
                String tlfhab = (String)consulta.getTelef_hab();
                String correo = (String)consulta.getCorreo();
                String title = plantrabajo.getTituloPasantia();
                String area = plantrabajo.getAreaProyecto();
                String resumen = plantrabajo.getResumenProyecto();
                String obj = plantrabajo.getObjetivosPasantias();
                String fases = plantrabajo.getFasesPasantia();
                String objI = plantrabajo.getObjetivosFaseI();
                String actI = plantrabajo.getActividadesFaseI();
                String tiempoI = plantrabajo.getTiempoFaseI();
                String objII = plantrabajo.getObjetivosFaseII();
                String actII = plantrabajo.getActividadesFaseII();
                String tiempoII = plantrabajo.getTiempoFaseII();
                String objIII = plantrabajo.getObjetivosFaseIII();
                String actIII = plantrabajo.getActividadesFaseIII();
                String tiempoIII = plantrabajo.getTiempoFaseIII();
                String objIV = plantrabajo.getObjetivosFaseIV();
                String actIV = plantrabajo.getActividadesFaseIV();
                String tiempoIV = plantrabajo.getTiempoFaseIV();

                String path = getServlet().getServletContext().getRealPath("/")+ "../../img/";

                /**************************************/
                /* PDF */
                /**************************************/
                try {
                    Document pdf = new Document(PageSize.LETTER);

                    response.setContentType("application/pdf");
                    response.setHeader("Content-Disposition", " inline; filename=planTrabajo.pdf");

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

                    Paragraph titulo = new Paragraph("PLAN DE TRABAJO", font);
                    titulo.setAlignment(Paragraph.ALIGN_CENTER);
                    pdf.add(titulo);

                    Paragraph blank = new Paragraph("\n");

                    // Estudiante
                    Phrase est = new Phrase("Estudiante", font);
                    pdf.add(est);

                    float[] w = { 1f, 2f };
                    String[] linea = { "Nombre y Apellido", " "+nombre };
                    pdf.add(crearTabla(w, linea));
                    pdf.add(blank);

                    w = new float[] { 2f, 2f, 2f, 3f, 2f, 2f };
                    linea = new String[] { "Carnet", " "+carnet, "Cédula", " "+cedula, "Carrera", "0800"};
                    pdf.add(crearTabla(w, linea ));
                    pdf.add(blank);

                    w = new float[] { 1f, 1f, 1f, 2f };
                    linea = new String[] { "Teléfono", " "+tlfhab, "E-mail", " "+correo };
                    pdf.add(crearTabla(w, linea ));
                    pdf.add(blank);

                    w = new float[] { 3f, 3f, 2f, 2f };
                    linea = new String[] { "Período de pasantía", " "+periodopasantia, "Año", " "+ano };
                    pdf.add(crearTabla(w, linea ));
                    pdf.add(blank);

                    // Tutor Industrial
                    Phrase ind = new Phrase("Tutor Industrial", font);
                    pdf.add(ind);

                    w = new float[] { 1f, 2f };
                    linea = new String[] { "Nombre y Apellido", " "+tutorIn };
                    pdf.add(crearTabla(w, linea));
                    pdf.add(blank);

                    w = new float[] { 1f, 2f, 1f, 2f };
                    linea = new String[] { "Profesión", " ", "Cargo", " " };
                    pdf.add(crearTabla(w, linea));
                    pdf.add(blank);

                    w = new float[] { 1f, 2f };
                    linea = new String[] { "Departamento", " " };
                    pdf.add(crearTabla(w, linea));
                    pdf.add(blank);

                    w = new float[] { 1f, 3f };
                    linea = new String[] { "Dirección", " " };
                    pdf.add(crearTabla(w, linea));
                    pdf.add(blank);

                    w = new float[] { 1f, 1f, 1f, 2f };
                    linea = new String[] { "Teléfono", " ", "E-mail", " " };
                    pdf.add(crearTabla(w, linea ));
                    pdf.add(blank);

                    // Tutor Académico
                    Phrase acad = new Phrase("Tutor Académico", font);
                    pdf.add(acad);

                    w = new float[] { 1f, 2f };
                    linea = new String[] { "Nombre y Apellido", " "+tutorAc };
                    pdf.add(crearTabla(w, linea));
                    pdf.add(blank);

                    w = new float[] { 1f, 2f };
                    linea = new String[] { "Departamento USB", " " };
                    pdf.add(crearTabla(w, linea));
                    pdf.add(new Paragraph("\n"));

                    w = new float[] { 1f, 1f, 1f, 2f };
                    linea = new String[] { "Teléfono", " ", "E-mail", " " };
                    pdf.add(crearTabla(w, linea ));
                    pdf.add(blank);

                    // Pasantía
                    Phrase pas = new Phrase("Pasantía", font);
                    pdf.add(pas);

                    w = new float[] { 1f, 2f };
                    linea = new String[] { "Titulo", " "+title };
                    pdf.add(crearTabla(w, linea));
                    pdf.add(blank);

                    w = new float[] { 1f, 2f };
                    linea = new String[] { "Area del Trabajo", " "+area };
                    pdf.add(crearTabla(w, linea));
                    pdf.add(blank);

                    w = new float[] { 1f, 2f };
                    linea = new String[] { "Resumen del Trabajo", " "+resumen };
                    pdf.add(crearTabla(w, linea));
                    pdf.add(blank);

                    w = new float[] { 1f, 2f };
                    linea = new String[] { "Objetivos de la Pasantía", " "+obj };
                    pdf.add(crearTabla(w, linea));
                    pdf.add(blank);

                    w = new float[] { 1f, 2f };
                    linea = new String[] { "FASES", " "+fases };
                    pdf.add(crearTabla(w, linea));
                    pdf.add(blank);
                    
                    float[] widths = { 1f, 2f, 2f, 1f };
                    PdfPTable t = new PdfPTable(widths);
                    t.addCell("Fase");  t.addCell("Objetivos"); t.addCell("Actividades");   t.addCell("Tiempo Estimado");
                    t.addCell("1");     t.addCell(objI);        t.addCell(actI);            t.addCell(tiempoI);
                    t.addCell("2");     t.addCell(objII);       t.addCell(actII);           t.addCell(tiempoII);
                    t.addCell("3");     t.addCell(objIII);      t.addCell(actIII);          t.addCell(tiempoIII);
                    t.addCell("4");     t.addCell(objIV);       t.addCell(actIV);           t.addCell(tiempoIV);
                    t.setHorizontalAlignment(Element.ALIGN_LEFT);
                    pdf.add(t);

                    Paragraph firma = new Paragraph("\n\n\n\n_________________\nFIRMA ");
                    firma.setAlignment(Paragraph.ALIGN_CENTER);
                    pdf.add(firma);

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
            getResources(request).getMessage("A_Pre_ConsultarInscripcion.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("A_Pre_ConsultarInscripcion.msg1"));
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