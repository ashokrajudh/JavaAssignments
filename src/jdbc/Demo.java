package jdbc;
import java.sql.*;

public class Demo {

    public static void main(String[] args) throws Exception {

          String url = "jdbc:mysql://localhost:3306/student";
          String username = "root";
          String password = "Ashok@789";
          int id = 5;
          String studentName = "Rakesh";
          String query = "INSERT INTO student (id, student_name) VALUES (?,?)";

          //Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection(url, username, password);
          PreparedStatement st = con.prepareStatement(query);
          st.setInt(1, id);
          st.setString(2, studentName);
          int count = st.executeUpdate();
          System.out.println(count + " row/s affected");

          st.close();
          con.close();

    }
}
