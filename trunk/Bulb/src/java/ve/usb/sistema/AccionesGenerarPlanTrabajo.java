
package ve.usb.sistema;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
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
                request.setAttribute("tutorI", plantrabajo.getCodigoTI());
                request.setAttribute("tutorA", plantrabajo.getCodigoTA());

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
                    Image logo = Image.getInstance("/home/chitty/logo.png");
                    logo.scaleToFit(295, 122);
                    logo.setAlignment(Image.ALIGN_LEFT);
                    pdf.add(logo);

                    // Pie
                    Image pie = Image.getInstance("/home/chitty/pie.png");
                    pie.scaleToFit(500, 216);
                    pie.setAbsolutePosition(40, 20);
                    pdf.add(pie);

                    Paragraph titulo = new Paragraph("PLAN DE TRABAJO", FontFactory.getFont("arial", 20));        
                    titulo.setAlignment(Paragraph.ALIGN_CENTER);
                    pdf.add(titulo);
                    
                    Paragraph datos = new Paragraph("ESTUDIANTE\nNombre: "+nombre +
                            "\nCarnet: " + carnet + " Cédula: "+cedula+" Carrera: ?"
                            +"\nTeléfono: "+tlfhab+" E-mail: "+correo
                            +"\nPeríodo Pasantía: "+periodopasantia+" Año: "+ano);
                    pdf.add(datos);

                    Paragraph tutorI = new Paragraph("\nTUTOR INDUSTRIAL\nNombre:");
                    pdf.add(tutorI);

                    Paragraph tutorA = new Paragraph("\nTUTOR ACADÉMICO\nNombre:\n\nPASANTÍA\n");
                    pdf.add(tutorA);

                    float[] widths1 = { 1f, 2f };
                    PdfPTable table = new PdfPTable(widths1);
                    table.addCell("Titulo:");                   table.addCell(title);
                    table.addCell("Area del trabajo:");         table.addCell(area);
                    table.addCell("Resumen del trabajo:");      table.addCell(resumen);
                    table.addCell("Objetivos de la Pasantía:"); table.addCell(obj);
                    table.addCell("FASES:");                    table.addCell(fases);
                    table.setHorizontalAlignment(Element.ALIGN_LEFT);
                    pdf.add(table);

                    Paragraph blank = new Paragraph("\n");
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

}