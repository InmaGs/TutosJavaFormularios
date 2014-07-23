<%-- 
    Document   : datos
    Created on : 23-jul-2014, 12:07:40
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="../scripts/jquery-1.6.2.js"></script>
        <script type="text/javascript">
            $(document).ready(function () 
            {
                $("#btnAgregar").click(function() 
                {
                    var num = $("input[type=text]").length;
                    var numeroSiguiente = num + 1;
                    var elementoNuevo = $("#valor" + num).clone().attr('id', 'valor'+numeroSiguiente).attr("name", "valor"+numeroSiguiente);
                    var etiquetaNueva = $("label[for=valor"+num+"]").clone().attr("for", "valor"+numeroSiguiente).text("Valor " + numeroSiguiente + ": ");
                           
                    $("#valor" + num).after(elementoNuevo);
                    elementoNuevo.before(etiquetaNueva);
                    etiquetaNueva.before("<br />");
                });
            });
        </script>
        <title>Parámetros</title>
    </head>
    <body>
        <h1>Introducción de datos de parámetros de los que desconocemos su tipo</h1>
        <p>
            <%-- Iniciamos el formulario. El atributo theme nos permite definir la estructura
                del formulario--%>
            <s:form action="multiparametros" theme="simple">
                <s:label for="valor1" value="Valor 1: "/> <%-- De este modo hay que añadir el label 
                                                                de forma manual para el textfield.
                                                                El for hará referencia al id--%>
                <s:textfield id="valor1" name="valor1"/><br/>
                <s:submit value="Enviar"/>               
            </s:form>
                <%-- Agregamos un botón que permita agregar más cajas de texto como la anterior,
                    se hace por medio de jquery (de lo que no tengo ni idea) y su código es lo que está
                    en las etiquetas superiores de script--%>                
            <button id="btnAgregar">Agregar Elemento</button>
        </p>
        <p>
            <a href="../index.jsp">Inicio</a>
        </p>
    </body>
</html>
