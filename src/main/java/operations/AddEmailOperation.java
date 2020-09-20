package operations;

import configurations.ConfigurationRepository;
import emailrepository.EmailRepository;
import emailrepository.mysql.MysqlEmailRepository;
import emailsender.EmailSender;
import input.Input;
import input.commandline.CommandLineInput;
import input.validation.ValidateEmailAddress;
import input.validation.ValidateEmailAddressImpl;
import logrepository.LogRepository;
import models.ConfigurationModel;
import models.Email;
import output.Output;
import output.commandline.CommandLineOutput;

public class AddEmailOperation implements Operation {
    @Override
    public void execute(ConfigurationModel configurationModel) {
        Input input = new CommandLineInput();
        Output output =  new CommandLineOutput();
        ValidateEmailAddress validateEmailAddress = new ValidateEmailAddressImpl();
        EmailRepository emailRepository = new MysqlEmailRepository();

        output.showMessage("\n---Add Email---");
        output.showMessage("Enter username : ");
        String username = input.readString();
        output.showMessage("Enter email address : ");
        String emailAddress = input.readString();

        if(validateEmailAddress.validate(emailAddress)){
            Email email = new Email(username, emailAddress);
            emailRepository.addEmail(email, configurationModel.getDatabaseConfiguration());
            output.showMessage("Email was added to the database..");
        }
    }
}
