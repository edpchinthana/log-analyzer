package emailrepository.mysql;

import java.util.List;
import models.DatabaseConfigurationModel;
import models.Email;

public interface GetEmails {
    List<Email> perform(DatabaseConfigurationModel var1);
}