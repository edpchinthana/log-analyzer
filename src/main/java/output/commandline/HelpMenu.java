package output.commandline;

import output.Output;

public class HelpMenu{
    final int itemCount = 4;
    public void perform() {
        System.out.println("------------------------------ Help Menu ------------------------------");
        System.out.println("        1. Analyze Log");
        System.out.println("        2. Emails");
        System.out.println("        3. Exit");

        System.out.println("Which option do you want to proceed?");

    }


}
