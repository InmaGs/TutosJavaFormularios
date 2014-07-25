/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Se copia la clase MuestraArchivo, ya que es prácticamente igual. los cambios
//realizados, están comentados.

package com.javatutoriales.struts2.formularios.actions;

import java.io.FileInputStream; 
import java.io.InputStream; 
import java.io.File;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
import org.apache.struts2.ServletActionContext; 
/**
 *
 * @author inmaculada.garcia
 */

//Anotamos la clase:
@Namespace(value="/descarga")
// Si queremos que el archivo 
// sea descargado añadimos el contentDisposition incluyendo el nombre que tomará el archivo
// en el momento de la descarga. Si no se especifica, el archivo se visualizará
// en el navegador.
// Agregamos también el parámetro que nos idicará el tamaño del archivo
@Action(value="descargaArchivo", results={@Result(type="stream", params=
        {"contentType","application/pdf",
         "contentDisposition","attachment;filename=\"tutorial.pdf\"",
         "contentLenght","${bytesArchivo}"})})
//Aquí se ha puesto un nombre estático para la descarga del documento. Se puede poner 
//dinámicamente a través de filename=\"${nombreArchivo}"\, siendo nombreArchivo el 
//nombre del archivo que se obtendrá a través de su getter correspondiente, igual que
//ocurre con bytesArchivo.
public class DescargaArchivo extends ActionSupport {
    
    private InputStream inputStream; 
    @Override
    public String execute() throws Exception{

        String ruta=ServletActionContext.getServletContext().getRealPath("/Ingenieria de software.pdf");
        
        // Declaramos un archivo de tipo File que obtiene la ruta del archivo y el FileInputStream lo que lee
        // es un objeto que representa al archivo
        File archivo=new File(ruta);
        //Obtenemos la longitud del archivo:
        bytesArchivo= archivo.length();
        
        inputStream=new FileInputStream(ruta);
                
        return SUCCESS;
    }

    public InputStream getInputStream(){
        return inputStream;
    }
    
    //Declaramos la variable y el getter que va a obtener el tamaño del archivo
    private long bytesArchivo;
    
    public long getBytesArchivo(){
        return bytesArchivo;
    }
    
}