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
            <%-- Si queremos que los errores se encuentren en un listado todos los
                errores del formulario, añadimos la siguiente etiqueta--%>
            <s:fielderror />
            
            <s:form action="validacionDatos">
                <%-- El atributo required establece si los campos son obligatorios o no. 
                    por defecto, cuando no se especifica, su valor es false--%>
                <s:textfield name="nombre" label="Nombre" required="true"/>
                <s:textfield name="username" label="Username" required="true"/>
                <s:password name="password" label="Password" required ="true"/>
                <s:textfield name="email" label="E-mail" required="true"/>
                <s:textfield name="edad" label="Edad" required="true"/>
                <s:textfield name="telefono" label="Teléfono"/>
                <s:submit value="Enviar" />
            </s:form>
        </p>
        <p>
            <a href="../index.jsp">Inicio</a>
        </p>
    </body>
</html>
