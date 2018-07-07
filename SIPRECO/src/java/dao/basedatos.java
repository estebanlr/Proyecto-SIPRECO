package dao;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class basedatos {
    private String url;
    private String usr;
    private String pwd;
    
    public basedatos(){
        url="";
        usr="";
        pwd="";
    }
    public Connection getMysql(){
        url="jdbc:mysql://localhost:3306/sowadlazaro";
        usr="root";
        pwd="DATABASE";
        
        Connection c= null;
        
        try {
            DriverManager.registerDriver(new Driver());
            c=DriverManager.getConnection(url, usr, pwd);
        } catch (SQLException ex) {
            Logger.getLogger(basedatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  c;
    }
            
}
