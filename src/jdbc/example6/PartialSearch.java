package jdbc.example6;

import java.sql.*;

public class PartialSearch {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/manufacturing";
        String username = "root";
        String password = "Ashok@789";

        String query = "select * from products where productname LIKE ?";

        try (
                Connection con = DriverManager.getConnection(url, username, password);
                PreparedStatement ps = con.prepareStatement(query)
        ) {

            ps.setString(1, "%Table%");
            ResultSet rs = ps.executeQuery();

            System.out.println("Products matching '%LapTop%':");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("productname"));
            }



        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
