package jdbc.exercise4;

import java.sql.*;

public class VunerableFix {

    /*
         PreparedStatement leads to fix the vulnerability as the hacker cannot change the structure of the query
     */

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/manufacturing";
        String username = "root";
        String password = "Ashok@789";
        int id =1;
        String query = "select * from products where id =?";

        try(Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement st = con.prepareStatement(query);)

        {
               st.setInt(1,id);
               ResultSet rs = st.executeQuery();
               rs.next();
               System.out.println(rs.getInt(1) + ":" + rs.getString(2));

        }

        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}



