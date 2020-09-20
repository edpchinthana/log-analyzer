package emailsender.gmail;

import emailsender.EmailFormatter;
import emailsender.EmailFormatterImpl;
import emailsender.EmailSender;
import models.Email;
import models.EmailSenderConfigurationModel;
import models.LogReport;

import javax.mail.*;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class GmailSMTP implements EmailSender {

    public void sendEmails(List<Email> emailList, LogReport logReport, EmailSenderConfigurationModel emailSenderConfigurationModel) {
        final String sender = emailSenderConfigurationModel.getSender();
        final String password = emailSenderConfigurationModel.getPassword();
        final EmailFormatter emailFormatter = new EmailFormatterImpl();

        String host = emailSenderConfigurationModel.getHost();
        String port = emailSenderConfigurationModel.getPort();
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        Session session = Session.getInstance(properties, new Authenticator() {

            @Override
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
            String body =  emailFormatter.getEmailBody(logReport);

            Iterator var14;

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
        } catch (MessagingException var16) {
            var16.printStackTrace();
        }

    }
}
