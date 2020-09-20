package output;

import models.Email;
import models.LogReport;

import java.util.List;

public interface Output {
    void showMessage(String message);
    void showMenu();
    void showException(String message);
    void viewEmails(List<Email> emailList);
    void showSummary(LogReport logReport);
}