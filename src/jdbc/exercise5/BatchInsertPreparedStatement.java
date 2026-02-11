package jdbc.exercise5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchInsertPreparedStatement {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/manufacturing";
        String username = "root";
        String password = "Ashok@789";

        String query = "INSERT INTO products (id, productname) VALUES (?,?)";

        Object[][] products = {{6,"WashingMachine"}, {7,"Guitar"}, {8,"Keyboard"}, {9,"Mouse"}, {10,"WatterBottle"}};

        try (
                Connection con = DriverManager.getConnection(url, username, password);
                PreparedStatement ps = con.prepareStatement(query)
        ) {

            for (Object[] product : products) {
                ps.setInt(1, (int) product[0]);
                ps.setString(2, (String) product[1]);
                ps.addBatch();
            }

            int[] counts = ps.executeBatch();
            System.out.println("Inserted " + counts.length + " rows successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
