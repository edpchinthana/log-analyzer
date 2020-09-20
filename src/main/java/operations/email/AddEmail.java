package operations.email;

import emailRepository.EmailRepository;
import emailRepository.mysql.MysqlEmailRepository;
import input.Input;
import input.commandline.CommandLineInput;
import models.Email;

public class AddEmail implements EmailMenuOperation{

    @Override
    public void execute() {
        Email email = null;
        Input input = new CommandLineInput();
        EmailRepository emailRepository = new MysqlEmailRepository();

        System.out.println("Enter username");
        String username = input.readName();

        System.out.println("Enter email address");
        String emailAddress = input.readEmail();

        email = new Email(username, emailAddress);
        emailRepository.addEmail(email);
    }
}
