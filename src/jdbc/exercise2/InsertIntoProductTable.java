package jdbc.exercise2;

import java.sql.*;

public class InsertIntoProductTable {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/manufacturing";
        String username = "root";
        String password = "Ashok@789";
        String query = "INSERT INTO products(id, productname) VALUES (?, ?)";
        int id = 5;
        String productname = "Sofa";

        try(Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement st = con.prepareStatement(query);)
        {

            st.setInt(1, id);
            st.setString(2, productname);
            int count = st.executeUpdate();
            System.out.println(count + " rows effected");
        }

        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}
