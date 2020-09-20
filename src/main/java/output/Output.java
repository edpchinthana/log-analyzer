package output;

import models.Email;
import models.LogReport;

import java.util.List;

public interface Output {
    void showMessage(String message);
    void showMenu();
    void showException(Exception exception);
    void viewEmails(List<Email> emailList);
    void showSummary(LogReport logReport);
}