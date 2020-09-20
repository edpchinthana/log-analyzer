import configurations.ConfigurationRepository;
import configurations.impl.ConfigurationRepositoryImpl;
import emailrepository.EmailRepository;
import emailsender.EmailSender;
import input.Input;
import input.commandline.CommandLineInput;
import logrepository.LogRepository;
import models.ConfigurationModel;
import operations.Operation;
import operations.OperationFactory;
import output.Output;
import output.commandline.CommandLineOutput;

import java.io.IOException;
import java.text.ParseException;

public class LogAnalyzerApp {
    public void runApp() throws IOException, ParseException {
        ConfigurationRepository configurationRepository = new ConfigurationRepositoryImpl();
        Output output = new CommandLineOutput();
        Input input = new CommandLineInput();

        ConfigurationModel configurationModel = null;
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = null;

        configurationModel = configurationRepository.importConfiguration();

        while(true){
            output.showMenu();
            operation = operationFactory.getInstance(input.readNumber());
            operation.execute(configurationModel);
        }
    }
}
