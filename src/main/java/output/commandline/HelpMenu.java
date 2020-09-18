package output.commandline;

import output.Output;

public class HelpMenu{

    public void perform() {

        final int menuNumber = 4;

        System.out.println("------------------------------ Help Menu ------------------------------");
        System.out.println("        1. Analyze Log");
        System.out.println("        2. Display Summary");
        System.out.println("        3. Emails");
        System.out.println("        4. Exit");

        System.out.println("Which option do you want to proceed?");

    }

}