<%@page import="dao.logindao"%>
<%@page session="true" %>
<%
            logindao lo = new logindao();
        if (request.getParameter("btningresar")!=null){
            String usuario=request.getParameter("txtusuario");
            String contra=request.getParameter("txtcontra");
            HttpSession sesion = request.getSession();
            switch(lo.logear(usuario, contra)){
                case 1:
                    sesion.setAttribute("id_log", usuario);
                    sesion.setAttribute("nivel", 1);
                    response.sendRedirect("nmodal.html");
                    break;
                    default:
                        %> 
                        <script>alert("USUARIO NO EXISTE O CONTRASEA INVALIDA");</script> 
                        <% 
                    break;       
            }
        }
        if(request.getParameter("cerrar")!=null){
            session.invalidate();
        }
        %>
