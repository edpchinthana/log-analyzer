package operations;

import models.ConfigurationModel;
import output.Output;
import output.commandline.CommandLineOutput;

public class ExitOperation implements Operation{

    @Override
    public void execute(ConfigurationModel configurationModel) {
        Output output = new CommandLineOutput();
        output.showMessage("bye....");
        System.exit(0);
    }
}
