package jdbc.exercise3;

import java.sql.*;

public class UpdateUserEmail {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/manufacturing";
        String username = "root";
        String password = "Ashok@789";
        int id = 3;
        String email = "ashok@gmail.com";
        String query = "UPDATE userstable SET email = ? where id = ?";

        try(Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement st = con.prepareStatement(query);)
        {
            st.setString(1, email);
            st.setInt(2, id);
            int count = st.executeUpdate();
            System.out.println(count + " row(s) updated");


        }

        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}
