package operations;
import output.commandline.CommandlineUserInput;
import operations.loganalyzer.InputOperation;

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


        }
    }
}
