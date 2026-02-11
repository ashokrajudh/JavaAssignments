package jdbc;

import java.sql.*;

public class MultipleColumnUpdate {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/manufacturing";
        String username = "root";
        String password = "Ashok@789";
        String cutoffDate = "2021-01-01";
        int  id = 2;
        String email = "updateemail@gmail.com";
        String phoneNumber = "9778676676555";



        String updateQuery = "UPDATE userstable SET email = ?, phonenumber = ? WHERE id = ?";
        String selectQuery = "SELECT id, username, email, phonenumber FROM userstable WHERE id = ?";

        try (
                Connection con = DriverManager.getConnection(url, username, password);
                PreparedStatement updatePS = con.prepareStatement(updateQuery);
                PreparedStatement selectPS = con.prepareStatement(selectQuery);

        ) {

            updatePS.setString(1, email);
            updatePS.setString(2, phoneNumber);
            updatePS.setInt(3, id);
            int count = updatePS.executeUpdate();
            System.out.println(count + " row(s) deleted.");

            selectPS.setInt(1,id);
            ResultSet rs = selectPS.executeQuery();
            if(rs.next())
            {
                String currentEmail = rs.getString("email");
                String currentPhoneNumber = rs.getString("phonenumber");

                if(email.equals(currentEmail) && currentPhoneNumber.equals(phoneNumber))
                {
                    System.out.println("Updated Successfully");
                }
                else
                {
                    System.out.println("Not Updated Correctly");
                }
            }




        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
