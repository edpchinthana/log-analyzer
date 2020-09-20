package emailrepository.mysql.impl;

import emailrepository.mysql.AddEmail;
import java.sql.Connection;
import java.sql.Statement;
import models.DatabaseConfigurationModel;
import models.Email;

public class AddEmailImpl extends DBConnection implements AddEmail {
    public AddEmailImpl() {
    }

    public void perform(Email email, DatabaseConfigurationModel databaseConfigurationModel) {
        try {
            Connection con = super.createConnection(databaseConfigurationModel);
            Statement stmt = con.createStatement();
            String var10001 = email.getName();
            stmt.executeUpdate("INSERT INTO `users`(`name`, `email_address`) VALUES ('" + var10001 + "','" + email.getEmail_address() + "')");
            super.closeConnection(con);
        } catch (Exception var5) {
            System.out.println(var5.getMessage());
        }

    }
}
