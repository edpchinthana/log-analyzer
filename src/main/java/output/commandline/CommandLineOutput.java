package output.commandline;

import output.Output;

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
}