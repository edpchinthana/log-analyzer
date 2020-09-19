package emailRepository.mysql;

import models.Email;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GetEmails extends DBConnection {

    public List<Email> perform() {
        List<Email> emailsList = new ArrayList();

        try {
            Connection con = this.createConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, name, email_address FROM users");

            while(rs.next()) {
                Email email = new Email(rs.getInt(1), rs.getString(2), rs.getString(3));
                emailsList.add(email);
            }

            this.closeConnection(con);
            return emailsList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return emailsList;
        }
    }
}
