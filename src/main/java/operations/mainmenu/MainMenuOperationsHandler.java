package operations.mainmenu;

import input.Input;
import input.commandline.CommandLineInput;
import operations.Operation;
import output.Output;
import output.commandline.CommandlineUserOutput;

public class MainMenuOperationsHandler implements Operation {

    @Override
    public void runApplication(){
        Output output = new CommandlineUserOutput();
        Input input = new CommandLineInput();
        MainMenuOperationFactory mainMenuOperationFactory = new MainMenuOperationFactory();
        output.displayHelpMenu();
        MainMenuOperation mainMenuOperation = mainMenuOperationFactory.getInstance(input.readMenuItem(4));
        mainMenuOperation.execute();
    }
}