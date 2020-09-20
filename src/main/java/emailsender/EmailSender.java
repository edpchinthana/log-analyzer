package emailsender;

import models.Email;
import models.EmailSenderConfigurationModel;
import models.LogReport;

import java.util.List;

public interface EmailSender {
    void sendEmails(List<Email> emailList, LogReport logReport, EmailSenderConfigurationModel emailSenderConfigurationModel);
}