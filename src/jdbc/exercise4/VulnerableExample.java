package jdbc.exercise4;

import java.sql.*;

public class VulnerableExample {

       /*
         CreateStatement leads to  vulnerability as the hacker can change the structure of the query by passing the conditions as true
     */

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/manufacturing";
        String username = "root";
        String password = "Ashok@789";
        int id =1;
        String query = "select * from products where id = '' OR '10' = '10'";

        try(Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);)
        {

               rs.next();
               System.out.println(rs.getInt(1) + ":" + rs.getString(2));

        }

        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}
