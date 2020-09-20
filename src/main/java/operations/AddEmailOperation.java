package operations;

import configurations.ConfigurationRepository;
import emailrepository.EmailRepository;
import emailsender.EmailSender;
import input.Input;
import logrepository.LogRepository;
import output.Output;

public class AddEmailOperation implements Operation {
    @Override
    public void execute(Input input,
                        Output output,
                        ConfigurationRepository configurationRepository,
                        EmailRepository emailRepository,
                        LogRepository logRepository,
                        EmailSender emailSender) {
        output.showMessage("\n---Add Email---");
        output.showMessage("Enter username : ");
        String username = input.readString();
        output.showMessage("Enter email address : ");
        String email = input.readString();


    }
}
