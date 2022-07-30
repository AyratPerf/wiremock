package Objects.DataBaseObjects;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Check {
    public boolean checker(String firstName, String lastName, int series, int number) {
        String url = "jdbc:postgresql://localhost:5432/JavaDB";
        String user = "postgres", password = "admin";
        String sql = "SELECT * FROM public.\"BlackList\" " +
                "WHERE firstname LIKE '" + firstName +
                "' AND lastname LIKE '" + lastName +
                "' AND series = " + series +
                "AND number = " + number +
                " ;";
        boolean isInBL = false;
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            try {
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if(rs == null) {
                    isInBL = false;
                } else {
                    isInBL = true;
                }
                rs.close();
                stmt.close();
            } finally {
                connection.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Check.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isInBL;
    }
}