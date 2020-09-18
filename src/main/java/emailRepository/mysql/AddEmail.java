package emailRepository.mysql;

import models.Email;

import java.sql.Connection;
import java.sql.Statement;

public class AddEmail extends ManageConnection{

    public void perform(Email email) {
        try {
            Connection con = super.createConnection();
            Statement stmt = con.createStatement();
            String var10001 = email.getName();
            stmt.executeUpdate("INSERT INTO `users`(`name`, `email_address`) VALUES ('" + var10001 + "','" + email.getEmail_address() + "')");
            super.closeConnection(con);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
