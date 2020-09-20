package operations.email;

import emailRepository.EmailRepository;
import emailRepository.mysql.MysqlEmailRepository;
import models.Email;

import java.util.List;

public class ViewEmails implements EmailMenuOperation{

    @Override
    public void execute() {
        EmailRepository emailRepository = new MysqlEmailRepository();

        System.out.println("Email Addresses");
        List<Email> emailList = emailRepository.getEmails();
        for(Email email: emailList){
            System.out.println(email.getId()+" "+email.getName()+" "+email.getEmail_address());
        }
    }
}
