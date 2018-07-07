
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class logindao {

    public logindao() {
    }
    public int logear(String usu, String pass){
        Connection co;
        co = new basedatos().getMysql();
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        int nivel =0;
        sql = "select nivel from logeo where id_log='"+usu+"' and pass_log='"+pass+"'";
        try {
            pst=co.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                nivel = rs.getInt(1);
            }
            co.close();
            rs.close();
            pst.close();
            co=null;
            rs=null;
            pst=null;
        } catch (SQLException ex) {
            Logger.getLogger(logindao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nivel;
    }
}
