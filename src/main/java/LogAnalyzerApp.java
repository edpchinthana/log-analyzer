import configurations.ConfigurationRepository;
import emailrepository.EmailRepository;
import emailsender.EmailSender;
import input.Input;
import logrepository.LogRepository;
import operations.Operation;
import operations.OperationFactory;
import output.Output;

public class LogAnalyzerApp {
    public void runApp(Input input,
                       Output output,
                       ConfigurationRepository configurationRepository,
                       EmailRepository emailRepository,
                       LogRepository logRepository,
                       EmailSender emailSender
                       ){
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = null;
        while(true){
            output.showMenu();
            operationFactory.getInstance(input.readNumber());
            operation.execute(input, output,
                    configurationRepository,
                    emailRepository,
                    logRepository,
                    emailSender);
        }
    }
}
