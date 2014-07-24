/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javatutoriales.struts2.formularios.actions;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
import java.io.File;

/**
 *
 * @author inmaculada.garcia
 */

//Anotamos, con dos posibles resultados:
@Namespace(value="/carga")
@Action(value="cargaArchivo", results={@Result(location="/carga/archivoCargado.jsp"),
                                       @Result(name="input", location="carga/formulario.jsp")})
public class CargaArchivo extends ActionSupport{
    
    private String autor;
    private File archivo; //Necesitamos este objeto para hacer referencia al archivo a subir.
    private String archivoFileName;
    private String archivoContentType;
    //Método execute:
    @Override
    public String execute() throws Exception{
        //File nuevoArchivo=new File("/", archivo.getName());
        //Con esto, colocamos el nuevo archivo en el directorio raíz ("/"), comprobando que
        //el nombre del archivo sea el mismo que el del archivo que subimos. Para ello se añaden
        //los getters necesarios.
        
        //Comento el comando anterior para poner este nuevo, de modo que se
        //obtenga el resultado de guardar el archivo con su nombre y tipo originales.
        File nuevoArchivo=new File("/",archivoFileName);
        archivo.renameTo(nuevoArchivo);
        return SUCCESS;
    }

    //Agregamos setters y getters correspondientes:
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor=autor;
    }
    
    //Es necesario?? El ejemplo no lo tiene...
    //public File getArchivo(){
    //    return archivo;
    //}
    
    public void setArchivo(File archivo){
        this.archivo=archivo;
    }
    
    //getters necesarios para guardar los archivos que se suben.
    public String getNombre()
    {
        return archivo.getName();
    }
    
    public String getRuta(){
        return archivo.getAbsolutePath();
    }
    
    //Añadimos los geters y setters para la conservación tanto del nombre como
    //el tipo de archivo guardado.
    public String getArchivoContentType(){
        return archivoContentType;
    }
    
    public void setArchivoContentType(String archivoContentType){
        this.archivoContentType=archivoContentType;
    }
    
    //Es necesrio?? El ejemplo no lo tiene.
    //public String getArchivoFileName(){
    //    return archivoFileName;
    //}
    
    public void setArchivoFileName(String archivoFileName){
        this.archivoFileName=archivoFileName;
    }
}
