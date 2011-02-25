package ve.usb.sistema;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.regex.*;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

import ve.usb.cohesion.runtime.CohesionAction;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ve.usb.cohesion.runtime.HibernateUtil;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import org.hibernate.Query;
import ve.usb.sistema.hibernate.Carrera;
import ve.usb.sistema.hibernate.Estudiante;

/**
 *
 */
public class AccionesCorreoElectronico extends CohesionAction {

    public ActionForward A_Pre_GestionarCorreos(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_GestionarCorreos",};
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
            try { s.close(); } catch (Exception ex2) {}
        }
        return mapping.findForward(SALIDAS[salida]);
    }

    public ActionForward A_Pre_EspecificarCorreo(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_EspecificarCorreo",};
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            String coord = (String)request.getSession().getAttribute("carrera");
            Query q = s.createSQLQuery("select e.nombreE, e.carnetE from Estudiante e, EstCursaCarrera ecc where e.carnetE = ecc.codigoEstudiante and ecc.codigoCarrera = :var").setString("var",coord);
            List<String> result = (List)q.list();
            List<Estudiante> estudiantes = (List)q.list();
            estudiantes.removeAll(estudiantes);

            //mando los datos de los estudiantes
            Object [] objIt;
            Estudiante e;
            for (Iterator it = ((List)q.list()).iterator(); it.hasNext();){

                objIt = (Object []) it.next();
                e = new Estudiante();
                e.setNombreE((String)objIt[0]);
                e.setCarnetE((String)objIt[1]);
                estudiantes.add(e);
            }
            request.setAttribute("Estudiantes",estudiantes);//estudiantes de la carrera
            if(coord.isEmpty())
                request.setAttribute("Carrera","jajaj");
            else
                request.setAttribute("Carrera",coord);
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        return mapping.findForward(SALIDAS[salida]);
    }


    public ActionForward A_EnviarCorreo(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_GestionarCorreos",};
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            
            String coord = (String)request.getSession().getAttribute("carrera");
            Carrera c = (Carrera) s.createQuery("from Carrera c where c.codigoCarrera = :var").setString("var",coord).uniqueResult();
            String carnet = (String)request.getSession().getAttribute("Carnet");
            enviarCorreo(c.getNombreCarrera(),carnet);


            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        return mapping.findForward(SALIDAS[salida]);
    }

public void enviarCorreo(String carrera, String carnet) throws Exception{

            Properties props = new Properties();

            // Nombre del host de correo, es smtp.gmail.com
            props.setProperty("mail.smtp.host", "smtp.gmail.com");

            // TLS si está disponible
            props.setProperty("mail.smtp.starttls.enable", "true");

            // Puerto de gmail para envio de correos
            props.setProperty("mail.smtp.port","587");

            // Nombre del usuario
            props.setProperty("mail.smtp.user", "sistemappg@gmail.com");

            // Si requiere o no usuario y password para conectarse.
            props.setProperty("mail.smtp.auth", "true");

            javax.mail.Session sessionMail = javax.mail.Session.getDefaultInstance(props);
            sessionMail.setDebug(true);

            MimeMessage message = new MimeMessage(sessionMail);

            // Quien envia el correo
            String from = "sistemappg@gmail.com";
            message.setFrom(new InternetAddress(from));

            // A quien va dirigido
            String to = (carnet+"@usb.ve");
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            MimeMultipart multipart = new MimeMultipart("related");

            // first part  (the html)
            BodyPart messageBodyPart = new MimeBodyPart();
            String motivo="Recordatorio: Entrega Documentos";
            String htmlText = setEmailContent(to,carrera,motivo);
            messageBodyPart.setContent(htmlText, "text/html");

            // add it
            multipart.addBodyPart(messageBodyPart);

            // second part (the image)
            messageBodyPart = new MimeBodyPart();
            DataSource fds = new FileDataSource(getServlet().getServletContext().getRealPath("/")+ "../../email/img06.gif");
            messageBodyPart.setDataHandler(new DataHandler(fds));
            messageBodyPart.setHeader("Content-ID","<image>");

            // add it
            multipart.addBodyPart(messageBodyPart);

            // put everything together
            message.setContent(multipart);

            Transport t = sessionMail.getTransport("smtp");
            t.connect("sistemappg@gmail.com","jc2system");
            t.sendMessage(message,message.getAllRecipients());
            t.close();
    }

    public String setEmailContent (String to, String from, String motivo) throws FileNotFoundException, IOException{

        String path = getServlet().getServletContext().getRealPath("/")+ "../../email/";

        FileInputStream fstream = new FileInputStream(path+"email.html");
        // Get the object of DataInputStream
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        String emailContenido = "",strLine;
        //Read File Line By Line
        while ((strLine = br.readLine()) != null)   {
            // Print the content on the console
            emailContenido=emailContenido+"\n"+strLine;
        }

        Pattern patronMotivo = Pattern.compile("TITULO1");
        // creamos el Matcher a partir del patron, la cadena como parametro
        Matcher encaja = patronMotivo.matcher(emailContenido);
        // invocamos el metodo replaceAll
        String resultado = encaja.replaceAll(motivo);

        Pattern patronDestinatario = Pattern.compile("DESTINATARIO");
        // creamos el Matcher a partir del patron, la cadena como parametro
        encaja = patronDestinatario.matcher(resultado);
        // invocamos el metodo replaceAll
        resultado = encaja.replaceAll(to);
        
        Pattern patronRemitente = Pattern.compile("REMITENTE");
        // creamos el Matcher a partir del patron, la cadena como parametro
        encaja = patronRemitente.matcher(resultado);
        // invocamos el metodo replaceAll
        resultado = encaja.replaceAll(from);




        return resultado;

    }

}
