package emailsender;

import models.LogReport;

public interface EmailFormatter {
    String getEmailBody(LogReport logReport);
}
