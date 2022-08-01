package Objects.DataBaseObjects;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Check {
    public boolean checker(String firstName, String lastName, int series, int number) {
        String us1 = firstName + lastName + series + number, us2 = "";
        String url = "jdbc:postgresql://localhost:5432/JavaDB";
        String user = "postgres", password = "admin";
        String sql = "SELECT * FROM public.\"BlackList\" " +
                "WHERE firstname LIKE '" + firstName +
                "' AND lastname LIKE '" + lastName +
                "' AND series = " + series +
                "AND \"number\" = " + number +
                " ;";
        boolean isInBL = false;
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            try {
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    String fn = rs.getString("firstname");
                    String ln = rs.getString("lastname");
                    int ser = rs.getInt("series");
                    int num = rs.getInt("number");
                    us2 = fn + ln + ser + num;
                }
                isInBL = us1.equals(us2);
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