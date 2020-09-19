package emailRepository.mysql;

import models.Email;

import java.sql.Connection;
import java.sql.Statement;

public class AddEmail extends DBConnection {

    public void perform(Email email) {
        try {
            Connection con = super.createConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO `users`(`name`, `email_address`) VALUES ('" + email.getName() + "','" + email.getEmail_address() + "')");
            super.closeConnection(con);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
