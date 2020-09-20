package emailrepository.mysql.impl;

import emailrepository.mysql.DeleteEmail;
import java.sql.Connection;
import java.sql.Statement;
import models.DatabaseConfigurationModel;

public class DeleteEmailImpl extends DBConnection implements DeleteEmail {
    public DeleteEmailImpl() {
    }

    public void perform(int id, DatabaseConfigurationModel databaseConfigurationModel) {
        try {
            Connection con = super.createConnection(databaseConfigurationModel);
            Statement stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM users WHERE id=" + id + ";");
            this.closeConnection(con);
        } catch (Exception var5) {
            System.out.println(var5.getMessage());
        }

    }
}
