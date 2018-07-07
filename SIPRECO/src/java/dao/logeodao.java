package dao;

import be.logeobe;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class logeodao {
    public logeodao(){
    }
    public int registrarusuariologin(logeobe o){
        int r=0;
        String sql="insert into logeo " 
                + "values ("+o.getId_logeo()+",'"+o.getNomb_logeo()+"',"
                + "'"+o.getApe_logeo()+"','"+o.getDni_logeo()+"','"+o.getPass_logeo()+"',"
                + "'"+o.getConf_pass_logeo()+"','"+o.getCorreo_logeo()+"','"+o.getTelf_logeo()+"',1)";
        Connection c=null;
        c= new basedatos().getMysql();
        try {
            Statement st = c.createStatement();
            r=st.executeUpdate(sql);
            st.close();
            c.close();
            st=null;
            c=null;
            
        } catch (SQLException ex) {
            Logger.getLogger(logeodao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;  
    }
}
