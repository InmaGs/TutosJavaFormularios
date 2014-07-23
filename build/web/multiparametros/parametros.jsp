<%-- 
    Document   : parametros
    Created on : 23-jul-2014, 14:03:49
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Obtener Parametros</title>
    </head>
    <body>
        <h1>Resultado de Obtener parámetros</h1>
        <p>
            <s:iterator value="parametros" var="parametro">
                <%-- A través de la propiedad *.key obtenemos el aceso al Map y
                    a través de *.value[] al valor del elemento actual--%>
                <s:property value="#parametro.key"/>:<s:property value="#parametro.value[0]"/><br/>
            </s:iterator>
        </p>
        <p>
            <a href="../index.jsp">Inicio</a>
        </p>
    </body>
</html>
