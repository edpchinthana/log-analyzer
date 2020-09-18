package emailRepository.mysql;

import java.sql.Connection;
import java.sql.Statement;

public class DeleteEmail extends ManageConnection {

    public void perform(int id) {
        try {
            Connection con = super.createConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM users WHERE id=" + id + ";");
            this.closeConnection(con);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
