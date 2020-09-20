package emailrepository.mysql;

import emailrepository.EmailRepository;
import emailrepository.mysql.impl.AddEmailImpl;
import emailrepository.mysql.impl.DeleteEmailImpl;
import emailrepository.mysql.impl.GetEmailsImpl;
import java.util.List;
import models.DatabaseConfigurationModel;
import models.Email;

public class MysqlEmailRepository implements EmailRepository {

    public List<Email> getEmails(DatabaseConfigurationModel databaseConfigurationModel) {
        GetEmails getEmails = new GetEmailsImpl();
        return getEmails.perform(databaseConfigurationModel);
    }

    public void addEmail(Email email, DatabaseConfigurationModel databaseConfigurationModel) {
        AddEmail addEmail = new AddEmailImpl();
        addEmail.perform(email, databaseConfigurationModel);
    }

    public void deleteEmail(int id, DatabaseConfigurationModel databaseConfigurationModel) {
        DeleteEmail deleteEmail = new DeleteEmailImpl();
        deleteEmail.perform(id, databaseConfigurationModel);
    }
}