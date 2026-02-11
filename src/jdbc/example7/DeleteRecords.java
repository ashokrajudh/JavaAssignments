package jdbc.example7;

import java.sql.*;

public class DeleteRecords {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/manufacturing";
        String username = "root";
        String password = "Ashok@789";
        String cutoffDate = "2021-01-01";


        String query = "DELETE FROM employees WHERE joining_date < ?";

        try (
                Connection con = DriverManager.getConnection(url, username, password);
                PreparedStatement ps = con.prepareStatement(query)
        ) {

            ps.setString(1, cutoffDate);
            int count = ps.executeUpdate();
            System.out.println(count + " row(s) deleted.");



        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
