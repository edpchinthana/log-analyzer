package output.commandline;

import output.Output;

public class CommandlineUserOutput implements Output {

    @Override
    public void displayHelpMenu() {
        HelpMenu helpMenu = new HelpMenu();
        helpMenu.perform();
    }

    @Override
    public void displayEmailMenu() {
        EmailMenu emailMenu = new EmailMenu();
        emailMenu.perform();
    }

    @Override
    public void displayFilePath() {
        FilePath filePath = new FilePath();
        filePath.perform();
    }

    @Override
    public void displaySummary() {
        Summary summary = new Summary();
        summary.perform();
    }
}
