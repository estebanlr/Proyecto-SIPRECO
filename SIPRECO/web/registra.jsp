<%@page import="br.logeobr"%>
<%@page import="be.logeobe"%>

<%
    logeobe ge = new logeobe();
    int usuario = Integer.parseInt(request.getParameter("id_log"));
    ge.setId_logeo(usuario);
    ge.setNomb_logeo(request.getParameter("nomb_log"));
    ge.setApe_logeo(request.getParameter("ape_log"));
    int documento = Integer.parseInt(request.getParameter("dni_log"));
    ge.setDni_logeo(documento);
    ge.setPass_logeo(request.getParameter("pass_log"));
    ge.setConf_pass_logeo(request.getParameter("conf_pass_log"));
    ge.setCorreo_logeo(request.getParameter("correo_log"));
    int telefono = Integer.parseInt(request.getParameter("telf_log"));
    ge.setTelf_logeo(telefono);
    logeobr br= new logeobr();
    br.NuevoUsuarioLogeo(ge);
%>