package emailrepository;

import java.util.List;
import models.DatabaseConfigurationModel;
import models.Email;

public interface EmailRepository {
    List<Email> getEmails(DatabaseConfigurationModel databaseConfigurationModel);

    void addEmail(Email var1, DatabaseConfigurationModel databaseConfigurationModel);

    void deleteEmail(int var1, DatabaseConfigurationModel databaseConfigurationModel);
}