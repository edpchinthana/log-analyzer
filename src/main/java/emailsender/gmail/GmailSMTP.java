package emailsender.gmail;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import emailsender.EmailSender;
import models.Email;

public class GmailSMTP implements EmailSender {
    final String from = "javaloganalyzer@gmail.com";
    final String password = "loganalyzer2020";
    final String host = "smtp.gmail.com";
    final Properties properties = System.getProperties();


    //todo : implement error handling functions
    public GmailSMTP() {
        this.properties.put("mail.smtp.host", "smtp.gmail.com");
        this.properties.put("mail.smtp.port", "465");
        this.properties.put("mail.smtp.ssl.enable", "true");
        this.properties.put("mail.smtp.auth", "true");
    }

    public void sendEmails(List<Email> emailList, List<String> errorList) {
        Session session = Session.getInstance(this.properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("javaloganalyzer@gmail.com"));
            message.setSubject("Log Analyzer Report");
            Multipart multipart = new MimeMultipart();
            MimeBodyPart textPart = new MimeBodyPart();
            String body = "Error\n";
            for(String error: errorList){
                body = body + error + "\n";
            }

            textPart.setText(body);
            multipart.addBodyPart(textPart);
            message.setContent(multipart);
            System.out.println("sending...");

            for(Email email: emailList){
                message.addRecipient(RecipientType.BCC, new InternetAddress(email.getEmail_address()));
                Transport.send(message);
            }

            System.out.println("Sent message successfully....");
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
}