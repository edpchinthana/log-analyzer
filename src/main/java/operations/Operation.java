package operations;

import configurations.ConfigurationRepository;
import emailrepository.EmailRepository;
import emailsender.EmailSender;
import input.Input;
import logrepository.LogRepository;
import models.ConfigurationModel;
import output.Output;

public interface Operation {
    void execute(ConfigurationModel configurationModel);
}
