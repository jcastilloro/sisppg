package ve.usb.sistema;

import com.itextpdf.text.Chunk;
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

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

import java.util.Date;

/**
 *
 * @author chitty
 */
public class AccionesGenerarCartaPostulacion  extends CohesionAction {

/**
     * Called by Struts for the execution of action A_Pre_GenerarCartaPostulacion.
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
    public ActionForward A_GenerarCartaPostulacion(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_GenerarCartaPostulacion", "A_Pre_GestionarPreinscripcion", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();

        try {

            /*mi codigo*/
            PreInsPasantias consulta = (PreInsPasantias)s.createQuery("from PreInsPasantias where estudiante = :login").setString("login", (String)request.getSession().getAttribute("login")).uniqueResult();
            Estudiante estudiante =(Estudiante)s.createQuery("from Estudiante where carnete = :login").setString("login", (String)request.getSession().getAttribute("login")).uniqueResult();
            EstCursaCarrera estcursacarrera = (EstCursaCarrera)s.createQuery("from EstCursaCarrera where codigoEstudiante = :login").setString("login", (String)request.getSession().getAttribute("login")).uniqueResult();
            String codigoCarrera = estcursacarrera.getCodigoCarrera();

            java.util.List<Carrera> list;
            list = (java.util.List<Carrera>)s.createQuery("from Carrera where codigoCarrera = '"+codigoCarrera+"'").list();
            Carrera carrera = list.get(0);

            if (consulta!=null){

                int ep = (int)(consulta.getEp());
                String periodopasantia = (String)(consulta.getPeriodoPasantia());
                int ano = (int)(consulta.getAno());
                String ncarrera = carrera.getNombreCarrera();
                String carnet = (String)(estudiante.getCarnetE());
                Double indice = estudiante.getIndiceE();
                String nombre = estudiante.getNombreE();
                String cedula = estudiante.getCedulaE();
                String sexo = estudiante.getSexoE();
                Date fn = estudiante.getFechaNacimientoE();
                String nacionalidad = estudiante.getNacionalidadE();
                String edocivil = (String)consulta.getEstado_civil();
                String tlfhab = (String)consulta.getTelef_hab();
                String tlfotro = (String)consulta.getOtro_telef();
                String correo = (String)consulta.getCorreo();
                String direccion = (String)consulta.getDireccion();
                String estado = (String)consulta.getEstado();
                String region = (String)consulta.getRegion();
                String ciudad = (String)consulta.getCiudad();
                boolean graduando = (Boolean)consulta.getGraduando();
                boolean tramite = (Boolean)consulta.getTramiteCCTDS();

                String path = getServlet().getServletContext().getRealPath("/")+ "../../img/";

                /* PDF */
                try {
                    Document pdf = new Document(PageSize.LETTER);

                    response.setContentType("application/pdf");
                    response.setHeader("Content-Disposition", " inline; filename=cartaPostulacion.pdf");

                    PdfWriter.getInstance(pdf, response.getOutputStream());

                    pdf.addTitle("Carta de Postulación - " + nombre);
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
                    
                    Paragraph titulo = new Paragraph("SOLICITUD DE PASANTÍA", font);
                    titulo.setAlignment(Paragraph.ALIGN_CENTER);
                    pdf.add(titulo);
                    
                    // Foto
                    Image foto = Image.getInstance(path +"foto.png");
                    foto.scaleToFit(125, 168);
                    foto.setAlignment(Image.ALIGN_RIGHT | Image.TEXTWRAP);
                    pdf.add(foto);

                    Chunk space = new Chunk(' ');
                    Chunk epBold = new Chunk("\nEP: ", font);
                    Chunk epAns = new Chunk(" "+ep+" ");
                    Chunk periodBold = new Chunk("PERÍODO: ", font);
                    Chunk periodAns = new Chunk(" "+periodopasantia+" ");
                    Chunk anoBold = new Chunk("AÑO: ", font);
                    Chunk anoAns = new Chunk(" "+ano+" ");
                    pdf.add(epBold);
                    pdf.add(epAns);
                    for( int i=0; i<5; i++)
                        pdf.add(space);
                    pdf.add(periodBold);
                    pdf.add(periodAns);
                    for( int i=0; i<5; i++)
                        pdf.add(space);
                    pdf.add(anoBold);
                    pdf.add(anoAns);

                    Phrase dPersonales = new Phrase("\n\nDATOS PERSONALES", font);
                    pdf.add(dPersonales);                    

                    PdfPTable datosP = new PdfPTable(1);
                    PdfPCell cell = new PdfPCell(new Paragraph("CARNET: " +carnet));
                    cell.setMinimumHeight(30f);
                    datosP.addCell(cell);                    

                    cell = new PdfPCell(new Paragraph("CARRERA: "+ ncarrera +" - "+ codigoCarrera));
                    cell.setMinimumHeight(30f);
                    datosP.addCell(cell);

                    cell = new PdfPCell(new Paragraph("ÍNDICE ACADÉMICO: "+indice));
                    cell.setMinimumHeight(30f);
                    datosP.addCell(cell);
                    
                    datosP.setWidthPercentage(75);
                    datosP.setHorizontalAlignment(Element.ALIGN_LEFT);
                    pdf.add(datosP);

                    Paragraph datos = new Paragraph("\n\nNombre: " + nombre + " Cédula: "
                            + cedula + "\nFecha de Nacimiento: " + fn + "\nSexo: " + sexo + " Nacionalidad: "
                            + nacionalidad + "\nEstado civil: " + edocivil + "\nTeléfono habitación: " + tlfhab
                            + " Otro Teléfono: " + tlfotro + "\nEmail: " + correo + "\nDirección: " + direccion + "\n");
                    pdf.add(datos);

                    Paragraph bloque;
                    if (graduando) {
                        bloque = new Paragraph("BLOQUE A (Me graduo con la pasantía)\n\n");
                    } else {
                        bloque = new Paragraph("BLOQUE B (No me graduo con la pasantía)\n\n");
                    }
                    pdf.add(bloque);

                    Paragraph deseo;
                    if (tramite) {
                        deseo = new Paragraph("Deseo que la CCTDS tramite el Proceso de Búsqueda de Pasantía en la Empresa"
                                + " \nEstoy dispuesto(a) a ir a la región: " + region + "\nTengo preferencia por el Estado: "
                                + estado + " y la Ciudad: " + ciudad);
                    } else {
                        deseo = new Paragraph("No Deseo que la CCTDS tramite el Proceso de Búsqueda de Pasantía en la Empresa\n\n");
                    }

                    pdf.add(deseo);

                    Paragraph firma = new Paragraph("\n\n\n\n_________________\nFIRMA ");
                    firma.setAlignment(Paragraph.ALIGN_CENTER);
                    pdf.add(firma);

                    pdf.close();
                    /* PDF */

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else {salida = 1;}

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