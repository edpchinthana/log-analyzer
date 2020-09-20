package emailrepository.mysql;

import models.DatabaseConfigurationModel;

public interface DeleteEmail {
    void perform(int var1, DatabaseConfigurationModel var2);
}