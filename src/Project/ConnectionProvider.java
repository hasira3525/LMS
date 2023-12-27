
package Project;
import java.sql.*;
import javax.swing.JOptionPane;


public class ConnectionProvider {
    
    public static Connection con;
    
    public static Connection createDbConnection()
    {
        try{
        String dbpath="jdbc:mysql://localhost:3306/lms";
        con =DriverManager.getConnection(dbpath,"root","");
        return con;
        }
        catch(SQLException e){
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
        return con;
    }
    /*public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("")
        }
        catch(Exception e)
        {}
    }*/
    
}
