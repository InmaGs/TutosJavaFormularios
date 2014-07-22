<%-- 
    Document   : datos-usuario
    Created on : 22-jul-2014, 13:52:22
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page Datos Usuario</title>
    </head>
    <body>
        <h1>Mostramos los datos de usuario introducidos anteriormente</h1>
        <p>
            Nombre: <s:property value="usuario.nombre"/><br/>
            Username: <s:property value="usuario.username"/><br/>
            Password: <s:property value="usuario.password"/><br/>
            Edad: <s:property value="usuario.edad"/><br/>
            Fecha de Nacimiento: <s:property value="usuario.fechaNacimiento"/><br/>
        </p>
    </body>
</html>
