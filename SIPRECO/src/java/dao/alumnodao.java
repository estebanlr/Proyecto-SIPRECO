
package dao;

import be.alumnobe;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class alumnodao {

    public alumnodao() {
    }
    public int registrarAlumno(alumnobe a ){
        int r=0;
        String sql="insert into alumno " 
                + "values ("+a.getCod_alumno()+",'"+a.getNomb_alumno()+"',"
                + "'"+a.getApel_alumno()+"','"+a.getDni_alumno()+"','"+a.getDir_alumno()+"',"
                + "'"+a.getTelf_alumno()+"','"+a.getCor_alumno()+"','"+a.getCiclo_alumno()+"','"+a.getPond_alumno()+"')";
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
//------------------------------------------------------------------------------------------
 public int Eliminar(alumnobe a){
        int r=0;
        String sql="delete from alumno "
                + "where cod_alu="+a.getCod_alumno();
        Connection c=null;
        try {
            c = new basedatos().getMysql();
            Statement st=c.createStatement();
            
            r=st.executeUpdate(sql);//insertar,eliminar,modificar
            //r=st.executeQuery(sql); enviar un select
            st.close();
            c.close();
            st=null;
            c=null;
            //gargabecollector 
            
        } catch (SQLException ex) {
            Logger.getLogger(alumnodao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
 //------------------------------------------------------------------------------------------
        public int Actualizar(alumnobe a){
        int r=0;
        String sql="update alumno set "
                + "nomb_alu='"+a.getNomb_alumno()+"',"
                + "apel_alu='"+a.getApel_alumno()+"',"                
                + "dni_alu='"+a.getDni_alumno()+"',"
                + "dir_alu='"+a.getDir_alumno()+"',"
                + "telf_alu='"+a.getTelf_alumno()+"',"
                + "cor_alu='"+a.getCor_alumno()+"',"
                + "ciclo_alu='"+a.getCiclo_alumno()+"',"
                + "pond_alu='"+a.getPond_alumno()+"',"
                + "where cod_alu="+a.getCod_alumno();
        Connection c=null;
        try {
            c = new basedatos().getMysql();
            Statement st=c.createStatement();
            r=st.executeUpdate(sql);//insertar,eliminar,modificar
            //r=st.executeQuery(sql); enviar un select
            st.close();
            c.close();
            st=null;
            c=null;
            //gargabecollector 
            
        } catch (SQLException ex) {
            Logger.getLogger(alumnodao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
    
    public List<alumnobe> listarAlumno(){
        String sql="select cod_alu,nomb_alu,apel_alu,dni_alu,dir_alu,telf_alu,telf_alu,cor_alu,ciclo_alu,pond_alu from alumno";
        List<alumnobe> lista= new ArrayList();
        alumnobe a=null;
        try {
            Connection c= new basedatos().getMysql();
            Statement st = c.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                a=new alumnobe();
                //int x=rs.getInt("idcliente");
                //String y = rs.getString("nombre");
                a.setCod_alumno(rs.getInt("cod_alu"));
                a.setNomb_alumno(rs.getString("nomb_alu"));
                a.setApel_alumno(rs.getString("apel_alu"));
                a.setDni_alumno(rs.getInt("dni_alu"));
                a.setDir_alumno(rs.getString("dir_alu"));
                a.setTelf_alumno(rs.getInt("telf_alu"));
                a.setCor_alumno(rs.getString("cor_alu"));
                a.setCiclo_alumno(rs.getString("ciclo_alu"));
                a.setPond_alumno(rs.getString("pond_alu"));
                
                lista.add(a);
            }//ResultSet devuelve datos -
            //RS.NEXT VA ALA PRIMERA FILA
            st.close();
            rs.close();
            c.close();
            rs=null;
            st=null;
            c=null;
        } catch (SQLException ex) {
            Logger.getLogger(alumnodao.class.getName()).log(Level.SEVERE, null, ex);
        }
       return  lista;
    }    
    
}
