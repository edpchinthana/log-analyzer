package emailrepository.mysql;

import models.DatabaseConfigurationModel;
import models.Email;

public interface AddEmail {
    void perform(Email var1, DatabaseConfigurationModel var2);
}
