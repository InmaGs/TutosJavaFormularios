<%-- 
    Document   : nuevo-usuario
    Created on : 22-jul-2014, 13:15:50
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page Nuevo Usuario</title>
    </head>
    <body>
        <h1>Nuevo Usuario</h1>
        <p>
            <%-- Iniciamos el formulario para obtener datos que serán enviados por medio del action
                para ser procesados--%>
            <s:form action="datosUsuario">
                <%--Añadimos los campos del formulario: --%>
                <s:textfield name="nombre" label="Nombre"/>
                <s:textfield name="username" label="Username"/>
                <s:password name="password" label="Password"/>
                <s:textfield name="edad" label="Edad"/>
                <s:textfield name="fechaNacimiento" label="Fecha de Nacimiento"/>
                <s:submit value="Enviar"/>
            </s:form>
        </p>
        <p>
            <a href="index.jsp">Inicio</a>
        </p>
    </body>
</html>
