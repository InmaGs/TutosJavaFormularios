/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Añadimos las acciones que ocurrirán al pulsar el botón aceptar del formulario 
// en la página nuevo-usuario.jsp

package com.javatutoriales.struts2.formularios.actions;

//Importamos las clases que vamos a necesitar:
import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;
import com.javatutoriales.struts2.formularios.modelo.Usuario;
import org.apache.struts2.convention.annotation.*;

/**
 *
 * @author inmaculada.garcia
 */

// Usamos las anotaciones para declarar el action:
@Namespace(value="/")
@Action(value="datosUsuario",results={@Result(name="success", location="/datos-usuario.jsp")})
// Generamos la clase:
public class UsuarioActions extends ActionSupport{
    //Declaramos las variables que vamos a necesitar:
    
    private String nombre;
    private String username;
    private String password;
    private int edad;
    private Date fechaNacimiento;
    
    //Declaramos los setters que van a coger los datos introducidos en el formulario:    
    @Override
    public String execute() throws Exception{
        usuario=new Usuario();
        usuario.setNombre(nombre);
        usuario.setUsername(username);
        usuario.setPassword(password);
        usuario.setEdad(edad);
        usuario.setFechaNacimiento(fechaNacimiento);
        
        return SUCCESS;
    } 
        // Agregamos una variable y un método que almacene los datos de usuario
    // para poder enviarlos a otra página:
    
    public Usuario usuario;
    
    public Usuario getUsuario(){
        return usuario;
    }
    
    // Creamos el método execute que haga funcionar el action:
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento=fechaNacimiento;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setUsername(String username){
        this.username=username;
    }
    
    public void setPassword(String password){
        this.password=password;
    }
    

}
