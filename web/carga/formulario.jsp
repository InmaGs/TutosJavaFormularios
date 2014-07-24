<%-- 
    Document   : formulario
    Created on : 24-jul-2014, 14:06:43
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
        <h1>Formulario para carga de archivos</h1>
        <p>
            <%-- Añadimos una etiqueta de error --%>
            <s:actionerror/>
            <s:form action="cargaArchivo" enctype="multipart/form-data">
                <%-- La siguiente etiqueta se encarga de gestionar la subida
                    de los archivos--%>
                <s:file name="archivo" label="Archivo"/>
                <s:textfield name="autor" label="Autor:"/>
                <s:submit value="Enviar"/>
            </s:form>
        </p>
        <p>
            <a href="../index.jsp">Inicio</a>
        </p>
    </body>
</html>
