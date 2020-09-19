package operations;
import output.commandline.HelpMenu;
import operations.loganalyzer.InputOperation;
import operations.loganalyzer.PrintMenuOperation;

public class MainOperation {
    public static void main(String []args) {
        boolean shouldContinue = true;
        while(true) {
            //call to print menu
            CommandlineUserInput menu = new CommandlineUserInput();
            menu.displayHelpMenu();

            //switch in input
            InputOperation input = new InputOperation();
            input.checkInput();

            //email

            //Email manage part

            //call to exit

        }
    }
}
