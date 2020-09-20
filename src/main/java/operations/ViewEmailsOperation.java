package operations;

import emailrepository.EmailRepository;
import emailrepository.mysql.MysqlEmailRepository;
import models.ConfigurationModel;
import models.Email;
import output.Output;
import output.commandline.CommandLineOutput;

import java.util.List;

public class ViewEmailsOperation implements Operation{
    @Override
    public void execute(ConfigurationModel configurationModel) {
        Output output =  new CommandLineOutput();
        EmailRepository emailRepository = new MysqlEmailRepository();

        List<Email> emailList = emailRepository.getEmails(configurationModel.getDatabaseConfiguration());
        output.showMessage("\n---View Email---");
        output.viewEmails(emailList);
        output.showMessage("\n");
    }
}
