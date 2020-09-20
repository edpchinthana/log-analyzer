package emailrepository.mysql.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import models.DatabaseConfigurationModel;

public class DBConnection {
    public DBConnection() {
    }

    protected Connection createConnection(DatabaseConfigurationModel databaseConfigurationModel) throws Exception {
        String host = databaseConfigurationModel.getHost();
        String port = databaseConfigurationModel.getPort();
        String user = databaseConfigurationModel.getUser();
        String password = databaseConfigurationModel.getPassword();
        String dbName = databaseConfigurationModel.getDbName();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + dbName, user, password);
        } catch (Exception var8) {
            throw var8;
        }
    }

    protected void closeConnection(Connection con) throws Exception {
        try {
            con.close();
        } catch (Exception var3) {
            throw var3;
        }
    }
}
