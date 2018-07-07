

<%@page import="br.alumnobr"%>
<%@page import="be.alumnobe"%>
<%
    alumnobe abe = new alumnobe();
    int alumnoid = Integer.parseInt(request.getParameter("cod_alu"));
    abe.setCod_alumno(alumnoid);
    abe.setNomb_alumno(request.getParameter("nomb_alu"));
    abe.setApel_alumno(request.getParameter("apel_alu"));
    int documentoalu = Integer.parseInt(request.getParameter("dni_alu"));
    abe.setDni_alumno(documentoalu);
    abe.setDir_alumno(request.getParameter("dir_alu"));
    int telefonoalu =Integer.parseInt(request.getParameter("telf_alu"));
    abe.setTelf_alumno(telefonoalu);
    abe.setCor_alumno(request.getParameter("cor_alu"));
    abe.setCiclo_alumno(request.getParameter("ciclo_alu"));
    abe.setPond_alumno(request.getParameter("pond_alu"));
    alumnobr abr= new alumnobr();
    abr.nuevoAlumno(abe);
%>