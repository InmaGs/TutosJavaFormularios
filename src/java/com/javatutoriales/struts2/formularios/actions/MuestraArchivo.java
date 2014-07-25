/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javatutoriales.struts2.formularios.actions;

import java.io.FileInputStream; // Clase que crea un flujo de entrada para leer el archivo 
                                // y poderlo enviar al cliente
import java.io.InputStream; // Para que pueda funcionar la variable que contiene los bits
                            // del fichero para descargar
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
import org.apache.struts2.ServletActionContext; //Método que carga la ruta del archivo
/**
 *
 * @author inmaculada.garcia
 */

//Anotamos la clase:
@Namespace(value="/descarga")
// Hay que indicar en el resultado que es un flujo de datos(stream). 
// Como parámetros se especifíca el tipo de archivo
@Action(value="muestraArchivo", results={@Result(type="stream", params=
        {"contentType","application/pdf"})})
public class MuestraArchivo extends ActionSupport {
    
    //Declaramos la variable que va a "guardar" el archivo a descargar
    private InputStream inputStream; // Se nombra así, pq es más sencillo, pero si se nombrara 
                                     // de otra manera, habría que declararlo en la configuración
                                     // del result.
    @Override
    public String execute() throws Exception{
        // Definimos la ruta de acceso en el que se encontrará el archivo. Como esa ruta es
        // relativa, dependiendo del servidor en que se encuentre, se hace uso de la clase 
        // ServletContext y su método getRealPath, indicando el recurso del que queremos
        // saber esa ruta, iniciando desde la raíz de la aplicación (directorio "web").
        String ruta=ServletActionContext.getServletContext().getRealPath("/Ingenieria de software.pdf");
        // Asignamos a la variable la ruta, con el método que permite leer el archivo:
        inputStream=new FileInputStream(ruta);
        return SUCCESS;
    }

    //Declaramos el getter del archivo de descarga:
    public InputStream getInputStream(){
        return inputStream;
    }
    
}
