package emailsender;

import java.util.List;
import models.Email;
import models.EmailSenderConfigurationModel;
import models.LogLine;
import models.LogReport;

public interface EmailSender {
    void sendEmails(List<Email> emailList, LogReport logReport, EmailSenderConfigurationModel emailSenderConfigurationModel);
}