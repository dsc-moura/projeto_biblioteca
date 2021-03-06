
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conectar {
    
    private static String Driver ="";
    private static String Url = "";
    private static String User = "";
    private static String Pas = "";
    
    public static Connection getConnection(){
        try {
            Class.forName(Driver);
            return DriverManager.getConnection(Url, User, Pas);           
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("erro");
        }
    }
    
    public static void closeConnection (Connection con){
        try {
            if(con != null){
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        closeConnection(con);
        try {
            if(stmt != null){            
                stmt.close();
            }
            } catch (SQLException ex) {
                Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    public static void closeConnection (Connection con, PreparedStatement stmt, ResultSet rs){
        closeConnection(con, stmt);      
        try {
            if(rs != null){
               rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    
    
    
    
    
}
    
        
    
    

