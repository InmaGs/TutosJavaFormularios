<%-- 
    Document   : formulario
    Created on : 23-jul-2014, 14:19:26
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validaciones</title>
    </head>
    <body>
        <h1>Formulario para validaciones</h1>
        <p>
            <s:form action="validacionDatos">
                <s:textfield name="nombre" label="Nombre"/>
                <s:textfield name="username" label="Username"/>
                <s:password name="password" label="Password"/>
                <s:textfield name="email" label="E-mail"/>
                <s:textfield name="edad" label="Edad"/>
                <s:textfield name="telefono" label="Teléfono"/>
                <s:submit value="Enviar" />
            </s:form>
        </p>
        <p>
            <a href="../index.jsp">Inicio</a>
        </p>
    </body>
</html>
