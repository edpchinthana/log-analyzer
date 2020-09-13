package emailRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Email;

public class MysqlEmailRepository implements EmailRepository {
    public MysqlEmailRepository() {

    }

    //todo : implement singleton class
    private Connection createConnection() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/log_analyzer", "root", "");
        } catch (Exception e) {
            throw e;
        }
    }

    private void closeConnection(Connection con) throws Exception {
        try {
            con.close();
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Email> getEmails() {
        ArrayList emailsList = new ArrayList();

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

    public void addEmail(Email email) {
        try {
            Connection con = this.createConnection();
            Statement stmt = con.createStatement();
            String var10001 = email.getName();
            stmt.executeUpdate("INSERT INTO `users`(`name`, `email_address`) VALUES ('" + var10001 + "','" + email.getEmail_address() + "')");
            this.closeConnection(con);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void deleteEmail(int id) {
        try {
            Connection con = this.createConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM users WHERE id=" + id + ";");
            this.closeConnection(con);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void updateEmail(Email email) {
        //todo : implement updateEmail function
    }
}