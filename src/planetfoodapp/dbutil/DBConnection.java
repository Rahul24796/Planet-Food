
package planetfoodapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pawan
 */
public class DBConnection {
    
    private static Connection conn;
    static
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","planetfood","student");
            System.out.println("Connection opened!");
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,"DB Error in opening connection in DBconnection","Error!",JOptionPane.ERROR_MESSAGE);
           e.printStackTrace();
        }  
    }
    public static Connection getConnection()
    {
        return conn;
        
    }
    public static void  closeConnection()
    {
        try
        {
            conn.close();
            System.out.println("Connection close!");
        }
        catch(SQLException s)
            {
                JOptionPane.showMessageDialog(null,"some problem in DataBase","Error!",JOptionPane.ERROR_MESSAGE);
                        s.getStackTrace();
            }
    }
}
