package emailRepository;

import java.util.List;
import models.Email;

public interface EmailRepository {
    List<Email> getEmails();

    void addEmail(Email email);

    void deleteEmail(int id);

}