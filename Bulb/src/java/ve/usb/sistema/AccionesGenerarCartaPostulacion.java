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

        int ep = 0;
        String periodopasantia = "";
        int ano = 0;
        String carnet ="";
        Double indice=0.0;
        String nombre = "";
        String cedula = "";
        String sexo = "";
        Date fn = new Date();
        String nacionalidad = "";
        String edocivil = "";
        String tlfhab = "";
        String tlfotro = "";
        String correo = "";
        String direccion = "";
        String estado = "";
        String region = "";
        String ciudad = "";
        boolean tramite = false;
        boolean graduando = false;

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

               ep = (int)(consulta.getEp());
               periodopasantia = (String)(consulta.getPeriodoPasantia());
               ano = (int)(consulta.getAno());
               carnet = (String)(estudiante.getCarnetE());
               indice = estudiante.getIndiceE();
               nombre = estudiante.getNombreE();
               cedula = estudiante.getCedulaE();
               sexo = estudiante.getSexoE();
               fn = estudiante.getFechaNacimientoE();
               nacionalidad = estudiante.getNacionalidadE();
               edocivil = (String)consulta.getEstado_civil();
               tlfhab = (String)consulta.getTelef_hab();
               tlfotro = (String)consulta.getOtro_telef();
               correo = (String)consulta.getCorreo();
               direccion = (String)consulta.getDireccion();
               estado = (String)consulta.getEstado();
               region = (String)consulta.getRegion();
               ciudad = (String)consulta.getCiudad();


               request.setAttribute("ep",(int)(consulta.getEp()));
               request.setAttribute("periodopasantia", (String)(consulta.getPeriodoPasantia()));
               request.setAttribute("ano", (int)(consulta.getAno()));
               request.setAttribute("cedula",estudiante.getCedulaE());
               request.setAttribute("carrera",carrera.getNombreCarrera());
               request.setAttribute("correo",(String)consulta.getCorreo());
               request.setAttribute("indice",estudiante.getIndiceE());
               request.setAttribute("direccion", (String)consulta.getDireccion());
               request.setAttribute("estadocivil",(String)consulta.getEstado_civil());
               request.setAttribute("sexo",estudiante.getSexoE());
               request.setAttribute("telefhab", (String)consulta.getTelef_hab());
               request.setAttribute("otrotelef",(String)consulta.getOtro_telef());
               request.setAttribute("fechanacimiento",estudiante.getFechaNacimientoE());
               request.setAttribute("nacionalidad",estudiante.getNacionalidadE());
               tramite = (Boolean)consulta.getTramiteCCTDS();
               if (tramite){
                    request.setAttribute("tramite","si");
                    request.setAttribute("estado",(String)consulta.getEstado());
                    request.setAttribute("region",(String)consulta.getRegion());
                    request.setAttribute("ciudad",(String)consulta.getCiudad());
               }
               else {
               request.setAttribute("tramite","no");
                    request.setAttribute("estado","");
                    request.setAttribute("region","");
                    request.setAttribute("ciudad","");
               }

               graduando = (Boolean)consulta.getGraduando();
               if (graduando){
                   request.setAttribute("graduando","si");
               }
               else  {
                   request.setAttribute("graduando","no");
               }



            }
            else {salida = 1;}

            /* Aqui termina mi codigo */
             
            /**************************************/
                             /* PDF */
             /**************************************/
            try {
                Document d = new Document(PageSize.LETTER);

                FileOutputStream os = new FileOutputStream("/home/chitty/cartaP.pdf");
                PdfWriter.getInstance(d, os);
                d.addTitle("Carta de Postulación - "+nombre);
                d.open();


                Image logo = Image.getInstance("/home/chitty/DEx.png");
                Image foto = Image.getInstance("/home/chitty/foto.png");
                logo.scaleToFit(156, 105);
                logo.setAlignment(Chunk.ALIGN_LEFT);
                foto.scaleToFit(130, 161);
                foto.setAbsolutePosition(420, 400);
                d.add(logo);
                d.add(foto);


                Paragraph header = new Paragraph("Coordinación de Cooperación Técnica y Desarrollo Social");
                d.add(header);

                Paragraph titulo = new Paragraph("SOLICITUD DE PASANTÍA",
                        FontFactory.getFont("arial", 20));

                titulo.setAlignment(Paragraph.ALIGN_CENTER);
                d.add(titulo);

                Paragraph datos = new Paragraph("EP-"+ep+"\nPERÍODO: "+periodopasantia+" AÑO: "+ano+
                                     "\n\nDATOS PERSONALES\n\nCarnet: "+carnet+"\nCarrera: "+codigoCarrera+
                                     "\nIndice Académico: "+indice+"\nNombre: "+nombre+" Cédula: "+cedula+
                                     "\nFecha de Nacimiento: "+fn+"\nSexo: "+sexo+" Nacionalidad: "+nacionalidad+
                                     "\nEstado civil: "+edocivil+"\nTeléfono habitación: "+tlfhab+" Otro Teléfono: "
                                     +tlfotro+"\nEmail: "+correo+"\nDirección: "+direccion+"\n");
                d.add(datos);

                Paragraph bloque;
                if (graduando) {
                    bloque = new Paragraph("BLOQUE A (Me graduo con la pasantía)\n\n");
                } else {
                    bloque = new Paragraph("BLOQUE B (No me graduo con la pasantía)\n\n");
                }
                d.add(bloque);

                Paragraph deseo;             
                if (tramite){
                    deseo = new Paragraph("Deseo que la CCTDS tramite el Proceso de Búsqueda de Pasantía en la Empresa"
                            + " \nEstoy dispuesto(a) a ir a la región: "+region+"\nTengo preferencia por el Estado: "
                            +estado+" y la Ciudad: "+ciudad+"\n\n\n\n");
                } else {
                    deseo = new Paragraph("No Deseo que la CCTDS tramite el Proceso de Búsqueda de Pasantía en la Empresa\n\n\n\n\n\n");
                }

                d.add(deseo);

                Paragraph firma = new Paragraph("_________________\nFIRMA ");
                firma.setAlignment(Paragraph.ALIGN_RIGHT);
                d.add(firma);
                
                d.close();
                os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            /**************************************/
                             /* PDF */
             /**************************************/

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
