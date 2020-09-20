package emailSender.gmail;

import emailSender.EmailSender;
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
import models.Email;
import models.EmailSenderConfigurationModel;
import models.LogLine;
import models.LogReport;

public class GmailSMTP implements EmailSender {
    public GmailSMTP() {
    }

    public void sendEmails(List<Email> emailList, LogReport logReport, EmailSenderConfigurationModel emailSenderConfigurationModel) {
        final String sender = emailSenderConfigurationModel.getSender();
        final String password = emailSenderConfigurationModel.getPassword();
        String host = emailSenderConfigurationModel.getHost();
        String port = emailSenderConfigurationModel.getPort();
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(sender, password);
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("javaloganalyzer@gmail.com"));
            message.setSubject("Log Analyzer Report");
            Multipart multipart = new MimeMultipart();
            MimeBodyPart textPart = new MimeBodyPart();
            String body = "Error\n";

            Iterator var14;
            String error;
            List<LogLine> logLineList = logReport.getErrorList();
            for(LogLine logLine: logLineList){
                body = body + logLine.getTimestamp() + " "+logLine.getMessage() +"\n";
            }

            textPart.setText(body);
            multipart.addBodyPart(textPart);
            message.setContent(multipart);
            System.out.println("sending...");
            var14 = emailList.iterator();

            while(var14.hasNext()) {
                Email email = (Email)var14.next();
                message.addRecipient(RecipientType.BCC, new InternetAddress(email.getEmail_address()));
                Transport.send(message);
            }

            System.out.println("Sent message successfully....");
        } catch (MessagingException var16) {
            var16.printStackTrace();
        }

    }
}
