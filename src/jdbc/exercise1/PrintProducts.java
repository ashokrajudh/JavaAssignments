package jdbc.exercise1;

import java.sql.*;

public class PrintProducts {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/manufacturing";
        String username = "root";
        String password = "Ashok@789";
        String query = "select * from products";

        try(Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement st = con.prepareStatement(query);
        ResultSet rs = st.executeQuery(query);)
        {

            while(rs.next()) {
                System.out.println(rs.getInt(1) + ":" + rs.getString(2));
            }
        }

        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}
