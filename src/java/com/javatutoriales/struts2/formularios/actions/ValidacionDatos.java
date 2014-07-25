/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javatutoriales.struts2.formularios.actions;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
/**
 *
 * @author inmaculada.garcia
 */

//Anotaciones:
@Namespace(value="/validaciones")
@Action(value="validacionDatos", results={@Result(location="/validaciones/alta-exitosa.jsp"),
                                          @Result(name="input",location="/validaciones/formulario.jsp")})
                                          //Añadimos otro resultado, input, en caso de errores

public class ValidacionDatos extends ActionSupport {
    
    //Definimos los setters y getters adecuados para los parámetros del formulario
    private String nombre;
    private String username;
    private String password;
    private String email;
    private int edad;
    private String telefono;
    
    //Escribimos el método execute, que en este caso se encarga de escribir los valores recibidos
    //de los parámetros.
    
    @Override
    public String execute() throws Exception{
        System.out.println("nombre: "+nombre);
        System.out.println("username: "+username);
        System.out.println("password: "+password);
        System.out.println("email: "+email);
        System.out.println("edad: "+edad);
        System.out.println("telefono: "+telefono);
        
        return SUCCESS;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username=username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password=password;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
}
