package emailRepository.mysql;

import java.util.List;

import emailRepository.EmailRepository;
import models.Email;

public class MysqlEmailRepository implements EmailRepository {

    public List<Email> getEmails() {
        GetEmails getEmails = new GetEmails();
        return getEmails.perform();
    }

    public void addEmail(Email email) {
        AddEmail addEmail = new AddEmail();
        addEmail.perform(email);

    }

    public void deleteEmail(int id) {
        DeleteEmail deleteEmail = new DeleteEmail();
        deleteEmail.perform(id);
    }
}