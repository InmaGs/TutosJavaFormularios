<%-- 
    Document   : datos
    Created on : 23-jul-2014, 10:22:57
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Correos electrónicos</title>
    </head>
    <body>
        <h1>Subida de múltiples valores de un sólo parámetro</h1>
        <p>
            <s:form action="envioCorreo">
                <s:textfield name="nombre" label="Nombre" />
                <%-- Aunque sean 5 campos diferentes, deben tener el mismo name, ya
                    que se refieren al mismo objeto. Así se recibirán sus valores
                    como un solo conjunto de datos --%>
                <s:textfield name="correos" label="Correo 1" />
                <s:textfield name="correos" label="Correo 2" />
                <s:textfield name="correos" label="Correo 3" />
                <s:textfield name="correos" label="Correo 4" />
                <s:textfield name="correos" label="Correo 5" />
                <s:submit value="Enviar" />
            </s:form>
        </p>
    </body>
</html>
