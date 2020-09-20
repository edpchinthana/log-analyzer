package emailrepository;

import java.util.List;
import models.DatabaseConfigurationModel;
import models.Email;

public interface EmailRepository {
    List<Email> getEmails(DatabaseConfigurationModel var1);

    void addEmail(Email var1, DatabaseConfigurationModel var2);

    void deleteEmail(int var1, DatabaseConfigurationModel var2);
}