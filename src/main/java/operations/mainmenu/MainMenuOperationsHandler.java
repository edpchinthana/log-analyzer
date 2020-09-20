package operations.mainmenu;

import input.Input;
import input.commandline.CommandLineInput;
import operations.Operation;
import output.Output;
import output.commandline.CommandlineUserOutput;

import java.io.IOException;
import java.text.ParseException;

public class MainMenuOperationsHandler implements Operation {

    @Override
    public void runApplication() throws IOException, ParseException {
        Output output = new CommandlineUserOutput();
        Input input = new CommandLineInput();
        MainMenuOperationFactory mainMenuOperationFactory = new MainMenuOperationFactory();
        output.displayHelpMenu();
        MainMenuOperation mainMenuOperation = mainMenuOperationFactory.getInstance(input.readMenuItem(4));
        mainMenuOperation.execute();
    }
}
