<%@page import="br.alumnobr"%>
<%@page import="be.alumnobe"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="estilos/style_tablas.css">
<link rel="stylesheet" href="font-awesome-4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="estilos/style_modal.css">
<%
    List<alumnobe>Listar;
    alumnobr ar = new alumnobr();
    Listar = ar.ListarAlumnos();
%>
<body>
    <div id="main-container">
  <table>
            <thead>
                <tr>
                    <td>CÓDIGO</td>
                    <td>NOMBRE</td>
                    <td>APELLIDO</td>
                    <td>DNI</td>
                    <td>DIRECCIÓN</td>
                    <td>TELÉFONO</td>
                    <td>CORREO ELECTRÓNICO</td>
                    <td>CICLO</td>
                    <td>PONDERADO</td>
                    <td>MODIFICAR</td>
                    <td>ELIMINAR</td>
                </tr>
            </thead>
            </tbody>
            <%
            for(alumnobe ae:Listar){
                %>
                <tr id="color">
                <td><%=ae.getCod_alumno()%></td>
                <td><%=ae.getNomb_alumno()%></td>
                <td><%=ae.getApel_alumno()%></td>
                <td><%=ae.getDni_alumno()%></td>
                <td><%=ae.getDir_alumno()%></td>
                <td><%=ae.getTelf_alumno()%></td>
                <td><%=ae.getCor_alumno()%></td>
                <td><%=ae.getCiclo_alumno()%></td>
                <td><%=ae.getPond_alumno()%></td>
                <td></td>
                <td><a   href="EliminarAlumno.jsp?cod_alu=<%=ae.getCod_alumno()%>"><i style="color: red" class="fa fa-times" aria-hidden="true"></i>
</td>
                
            </tr>
                <%
            }
        %>
        <%
            
        %>
            </tbody>
        </table>  
</div>
             
</body>

