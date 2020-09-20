package emailRepository.mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    protected Connection createConnection() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return  DriverManager.getConnection("jdbc:mysql://localhost:3306/log_analyzer", "root", "");
        } catch (Exception e) {
            throw e;
        }
    }

    protected void closeConnection(Connection con) throws Exception {
        try {
            con.close();
        } catch (Exception e) {
            throw e;
        }
    }
}
