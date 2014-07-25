<%-- 
    Document   : formularioAnotaciones
    Created on : 24-jul-2014, 11:26:36
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
        <h1>Formulario para validaciones con Anotaciones</h1>
        <p>
            <%-- Copio la página formulario, pero adaptandola a la clase
                ValidacionDatosAnotaciones--%>
            <s:fielderror />
            <s:actionerror />
            
            <s:form action="validacionDatosAnotaciones">
                <%-- El atributo required establece si los campos son obligatorios o no. 
                    por defecto, cuando no se especifica, su valor es false--%>
                <s:textfield name="nombre" label="Nombre" required="true"/>
                <s:textfield name="username" label="Username" required="true"/>
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
