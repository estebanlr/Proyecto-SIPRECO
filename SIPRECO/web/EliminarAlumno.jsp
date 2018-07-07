

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page  import="dao.basedatos"%>
<%
    
        
        int cod = Integer.parseInt(request.getParameter("cod_alu"));
        String sql="delete from alumno "
                + "where cod_alu="+cod;
        Connection c=null;
       
            c = new basedatos().getMysql();
            PreparedStatement ps;
            Statement st=c.createStatement();
             ps=c.prepareStatement(sql);
            ps.executeUpdate(sql);
            response.sendRedirect("nmodal.html");
            st.close();
            c.close();
            st=null;
            c=null;
%>
