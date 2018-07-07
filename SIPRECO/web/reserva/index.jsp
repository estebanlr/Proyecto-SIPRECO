
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <%
            HttpSession sesion =request.getSession();
            String usuario;
            String nivel;
            if(sesion.getAttribute("id_log")!=null && sesion.getAttribute("nivel")!=null){
                usuario=sesion.getAttribute("id_log").toString();
                nivel=sesion.getAttribute("nivel").toString(); 
            }
        %>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Menu Simple con HTML Y CSS</title>
        <link rel="stylesheet" type="text/css" href="font-awesome-4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="style_R_alumno.css">
</head>
<body>
	<header>
		<nav class="navegacion">
			<ul class="menu">
				<li><a href="#"><i class="fa fa-bars" aria-hidden="true"></i></a></li>
				<li><a href="#"><i class="fa fa-users" aria-hidden="true"></i>  ALUMNOS</a>
                                <ul class="submenu">
                                <li><a href="#">REGISTRAR</a></li>
                                <li><a href="#">MODIFICAR</a></li>
                                <li><a href="#">ELIMINAR</a></li>
                                </ul>
                                </li>
                                <li><a href="#"><i class="fa fa-user-secret" aria-hidden="true"></i>  DOCENTES</a>
                                <ul class="submenu1">
                                <li><a href="#">REGISTRAR</a></li>
                                <li><a href="#">MODIFICAR</a></li>
                                <li><a href="#">ELIMINAR</a></li>
                                </ul>
                                </li>
				<li><a href="#"><i class="fa fa-bookmark" aria-hidden="true"></i>  CURSOS</a>
                                <ul class="submenu2">
                                <li><a href="#">REGISTRAR</a></li>
                                <li><a href="#">MODIFICAR</a></li>
                                <li><a href="#">ELIMINAR</a></li>
                                </ul>
				</li>
				<li><a href="#" ><i class="fa fa-university" aria-hidden="true"></i>  UNIVERSIDADES</a>
                                <ul class="submenu3">
                                <li><a href="#">REGISTRAR</a></li>
                                <li><a href="#">MODIFICAR</a></li>
                                <li><a href="#">ELIMINAR</a></li>
                                </ul>
                                </li>
                                <li class="item-r" ><a href="index.html?cerrar=true"  ><i class="fa fa-lock" aria-hidden="true">
                                        </i>CERRAR SESION</a></li>

			</ul>
		</nav>
	</header>
</body>
</html>