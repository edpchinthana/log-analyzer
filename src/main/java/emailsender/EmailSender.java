package emailsender;

import java.util.List;
import models.Email;

public interface EmailSender {
    void sendEmails(List<Email> var1, List<String> var2);
}