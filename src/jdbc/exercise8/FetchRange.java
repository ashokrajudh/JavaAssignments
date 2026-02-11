package jdbc.exercise8;

import java.sql.*;

public class FetchRange {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/manufacturing";
        String username = "root";
        String password = "Ashok@789";
        double minPrice = 200.0;
        double maxPrice = 400.0;


        String query = "SELECT id, productname, price FROM products WHERE price BETWEEN ? AND ?";;

        try (
                Connection con = DriverManager.getConnection(url, username, password);
                PreparedStatement ps = con.prepareStatement(query)
        ) {

            ps.setDouble(1, minPrice);
            ps.setDouble(2, maxPrice);
            ResultSet rs = ps.executeQuery();
            System.out.println("Products with price between " + minPrice + " and " + maxPrice + ":");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("productname");
                double price = rs.getDouble("price");
                System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
