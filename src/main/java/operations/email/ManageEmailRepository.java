package operations.email;

import input.Input;
import input.commandline.CommandLineInput;
import operations.mainmenu.MainMenuOperation;
import output.Output;
import output.commandline.CommandlineUserOutput;

public class ManageEmailRepository implements MainMenuOperation {
    @Override
    public void execute() {
        Output output = new CommandlineUserOutput();
        Input input = new CommandLineInput();
        EmailMenuOperationFactory emailMenuOperationFactory = new EmailMenuOperationFactory();

        output.displayEmailMenu();
        EmailMenuOperation operation = emailMenuOperationFactory.getInstance( input.readMenuItem(5));
        operation.execute();

    }
}
