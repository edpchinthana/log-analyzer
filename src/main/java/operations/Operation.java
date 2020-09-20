package operations;

import configurations.ConfigurationRepository;
import emailrepository.EmailRepository;
import emailsender.EmailSender;
import input.Input;
import logrepository.LogRepository;
import output.Output;

public interface Operation {
    void execute(Input input,
                 Output output,
                 ConfigurationRepository configurationRepository,
                 EmailRepository emailRepository,
                 LogRepository logRepository,
                 EmailSender emailSender);
}
