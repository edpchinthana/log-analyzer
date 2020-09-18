package output.commandline;

import output.Output;

public class CommandlineUserInput implements Output {

    public void displayHelpMenu() {
        HelpMenu helpMenu = new HelpMenu();
        helpMenu.perform();
    }

    public void displayEmailMenu() {
        EmailMenu emailMenu = new EmailMenu();
        emailMenu.perform();
    }

    public void displayFilePath() {
        FilePath filePath = new FilePath();
        filePath.perform();
    }

    public void displaySummary() {
        Summary summary = new Summary();
        summary.perform();
    }
}
