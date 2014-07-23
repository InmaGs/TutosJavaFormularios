<%-- 
    Document   : datos-usuario
    Created on : 23-jul-2014, 9:50:47
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos Usuario</title>
    </head>
    <body>
        <h1>Datos de usuario obtenidos por medio de Model Driven</h1>
        <p>
            Nombre: <s:property value="nombre"/><br/>
            Username: <s:property value="username"/><br/>
            Password: <s:property value="password"/><br/>
            Edad: <s:property value="edad"/><br/>
            Fecha de Nacimiento: <s:property value="fechaNacimiento"/><br/>
        </p>
        <p>
            <a href="../index.jsp">Inicio</a>
        </p>
    </body>
</html>
