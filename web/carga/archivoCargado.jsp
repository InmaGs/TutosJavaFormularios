<%-- 
    Document   : archivoCargado
    Created on : 24-jul-2014, 14:29:48
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carga de Archivos</title>
    </head>
    <body>
        <h1>Resultado de la carga de archivos</h1>
        <p>
            Nombre: <s:property value="nombre"/><br/>
            Ruta: <s:property value="ruta"/><br/>
            Autor: <s:property value="autor"/><br/>
            <%-- Añadimos lo siguiente, ya que se ha modificado el action para que
                se pueda obtener también el tipo de archivo cargado--%>
            Tipo de Contenido: <s:property value="archivoContentType"/>
        </p>
        <p>
            <a href="../index.jsp">Inicio</a>
        </p>
    </body>
</html>
