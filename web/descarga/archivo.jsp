<%-- 
    Document   : archivo
    Created on : 25-jul-2014, 11:16:16
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Descarga de Archivos</title>
    </head>
    <body>
        <h1>Archivo a descargar</h1>
        <%-- La siguiente etiqueta marca el vínculo de la descarga --%>
        <s:a action="muestraArchivo" namespace="/descarga">Ver archivo</s:a>
    </body>
</html>
