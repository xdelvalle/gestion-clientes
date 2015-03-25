package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EnviarMail {

    public EnviarMail() {
        super();
    }

    public boolean sendMail(List<String> destinatarios, String imagenAdjunta, String ficheroAdjunto, String subject) {

//        destinatarios.clear();
//        destinatarios.add("********@gmail.com");
//        destinatarios.add("********@hotmail.com");

        List<String> list50Mails = new ArrayList<String>();

        int bloques = (destinatarios.size() / 50) + 1;
        int indexBloque = 0;

        for (int i = 0; i < bloques; i++) {
            for (int j = 0; j < 50; j++) {
                try {
                    String email = destinatarios.get(j + indexBloque);
                    list50Mails.add(email);
                }
                catch (IndexOutOfBoundsException ex) {
                    break;
                }
            }

            if (!send50Mails(list50Mails, imagenAdjunta, ficheroAdjunto, subject)) {
                return false;
            }

            list50Mails.clear();
            indexBloque = indexBloque + 50;
        }
        return true;
    }

    private boolean send50Mails(List<String> lista50, String imagenAdjunta, String ficheroAdjunto, String subject) {
        Filename file = new Filename(ficheroAdjunto, '/', '.');
        Filename body = new Filename(imagenAdjunta, '/', '.');

        try {
            Properties props = new Properties();
            // Nombre del host de correo, es smtp.gmail.com
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            // TLS si está disponible
            props.setProperty("mail.smtp.starttls.enable", "true");
            // Puerto de gmail para envio de correos
            props.setProperty("mail.smtp.port", "587");
            // Nombre del usuario
            props.setProperty("mail.smtp.user", "********@gmail.com");
            // Si requiere o no usuario y password para conectarse.
            props.setProperty("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props);

            MimeMultipart multiParte = new MimeMultipart();

            BodyPart html = new MimeBodyPart();
            html.setContent("<img src=\"cid:image\">", "text/html");

            BodyPart imagen = new MimeBodyPart();
            imagen.setDataHandler(new DataHandler(new FileDataSource(imagenAdjunta)));
            imagen.setFileName(body.filename() + "." + body.extension());
            imagen.setHeader("Content-ID", "<image>");

            BodyPart adjunto = new MimeBodyPart();
            if (ficheroAdjunto != null) {
                adjunto.setDataHandler(new DataHandler(new FileDataSource(ficheroAdjunto)));
                adjunto.setFileName(file.filename() + "." + file.extension());
                multiParte.addBodyPart(adjunto);
            }

            multiParte.addBodyPart(html);
            multiParte.addBodyPart(imagen);

            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress("********@gmail.com"));

            InternetAddress[] direccionesCCO = new InternetAddress[lista50.size()];
            for (int i = 0; i < lista50.size(); i++) {
                direccionesCCO[i] = new InternetAddress(lista50.get(i));
            }

            msg.addRecipient(Message.RecipientType.TO, new InternetAddress("********@gmail.com"));
            msg.addRecipients(Message.RecipientType.BCC, direccionesCCO);

            msg.setSubject(subject);
            msg.setContent(multiParte);

            Transport t = session.getTransport("smtp");
            t.connect("********@gmail.com", "********");
            t.sendMessage(msg, msg.getAllRecipients());

            t.close();

            return true;
        }
        catch (MessagingException ex) {
            //ex.printStackTrace();
            return false;
        }
        catch (Exception ex) {
            //ex.printStackTrace();
            return false;
        }
    }
}
