<%-- 
    Document   : datos-enviados
    Created on : 23-jul-2014, 10:42:39
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos Enviados</title>
    </head>
    <body>
        <h1>Recuperamos los datos introducidos en la página anterior</h1>
        <p>
            Nombre:
            <s:property value="nombre"/> 
        </p>
        <p>
            Correos asociados:
            <ul>
            <%-- El valor que queremos iterar es el array correos.
                correo es la variable que muestra el valor actual.
                status nos da información de la ordenación del elemento del array,
                se referencia después usando # --%>
                <s:iterator value="correos" var="correo" status="estatus">
                    <li><s:property value="#estatus.index"/> - <s:property value="correo"/></li>
                </s:iterator>
            </ul>
            <a href="../index.jsp">Inicio</a>
        </p>
       
    </body>
</html>
