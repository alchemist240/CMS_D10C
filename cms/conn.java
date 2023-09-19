package cms;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {

    Connection c;
    Statement s;

    conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///CLASSROOM","root","x7@dF50f");
            s = c.createStatement();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
