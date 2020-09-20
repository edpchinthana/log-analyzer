package emailrepository.mysql.impl;

import emailrepository.mysql.GetEmails;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.DatabaseConfigurationModel;
import models.Email;

public class GetEmailsImpl extends DBConnection implements GetEmails {
    public GetEmailsImpl() {
    }

    public List<Email> perform(DatabaseConfigurationModel databaseConfigurationModel) {
        ArrayList emailsList = new ArrayList();

        try {
            Connection con = this.createConnection(databaseConfigurationModel);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, name, email_address FROM users");

            while(rs.next()) {
                Email email = new Email(rs.getInt(1), rs.getString(2), rs.getString(3));
                emailsList.add(email);
            }

            this.closeConnection(con);
            return emailsList;
        } catch (Exception var7) {
            System.out.println(var7.getMessage());
            return emailsList;
        }
    }
}
