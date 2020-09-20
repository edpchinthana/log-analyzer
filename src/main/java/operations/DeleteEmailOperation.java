package operations;

import emailrepository.EmailRepository;
import emailrepository.mysql.MysqlEmailRepository;
import input.Input;
import input.commandline.CommandLineInput;
import models.ConfigurationModel;
import models.Email;
import output.Output;
import output.commandline.CommandLineOutput;

import java.util.List;

public class DeleteEmailOperation implements Operation {
    @Override
    public void execute(ConfigurationModel configurationModel) {
        Input input = new CommandLineInput();
        Output output =  new CommandLineOutput();
        EmailRepository emailRepository = new MysqlEmailRepository();

        List<Email> emailList = emailRepository.getEmails(configurationModel.getDatabaseConfiguration());
        output.showMessage("\n---View Email---");
        output.viewEmails(emailList);
        output.showMessage("\nEnter id to delete : ");
        int id = input.readNumber();
        emailRepository.deleteEmail(id, configurationModel.getDatabaseConfiguration());
        output.showMessage("Entered email was deleted succesfully..");
    }
}
