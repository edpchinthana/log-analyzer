package output.commandline;

import models.Email;
import output.Output;

import java.util.List;

public class CommandLineOutput implements Output {
    @Override
    public void showMessage(String message) {
        ShowMessage showMessage = new ShowMessageImpl();
        showMessage.perform(message);
    }

    @Override
    public void showMenu() {
        ShowMenu showMenu = new ShowMenuImpl();
        showMenu.perform();
    }

    @Override
    public void showException(Exception exception) {
        ShowException showException = new ShowExceptionImpl();
        showException.perform(exception);
    }

    @Override
    public void viewEmails(List<Email> emailList) {
        ViewEmails viewEmails = new ViewEmailsImpl();
        viewEmails.perform(emailList);
    }
}