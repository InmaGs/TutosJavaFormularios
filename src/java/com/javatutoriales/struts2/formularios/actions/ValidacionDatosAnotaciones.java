/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Copio el archivo ValidacionDatos y luego agrego las anotaciones necesarias:

package com.javatutoriales.struts2.formularios.actions;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
// Añadimos la clase que gestiona las validaciones:
import com.opensymphony.xwork2.validator.annotations.*;


/**
 *
 * @author inmaculada.garcia
 */

@Namespace(value="/validaciones")
@Action(value="validacionDatosAnotaciones", results={@Result(location="/validaciones/alta-exitosa.jsp"),
                                          @Result(name="input",location="/validaciones/formularioAnotaciones.jsp")})

public class ValidacionDatosAnotaciones extends ActionSupport{
    
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
    //Aquí ponemos las validaciones que son planas(no tienen que ver en cómo introducimos los datos)
    @Validations(expressions =
    {
        @ExpressionValidator(expression = "!nombre.equals(username)",                 
                message = "El nombre de usuario y el username no deben ser iguales.")
            // NOTA: A mí no me funciona del todo bien. Reconoce que los dos campos son iguales, 
            // pero no se imprime el mensaje.
    })
    public String execute() throws Exception{
        System.out.println("nombre: "+nombre);
        System.out.println("username: "+username);
        System.out.println("password: "+password);
        System.out.println("email: "+email);
        System.out.println("edad: "+edad);
        System.out.println("telefono: "+telefono);
        
        return SUCCESS;
    }
    
    //Para introducir errores que no se contemplan en la plantilla, nos valemos
    //del siguiente método:
    @Override
    public void validate(){
        //Aquí comprobamos que el username introducido no esté ya usado. Aquí se
        //pone un literal, pero normalmente esto se obtendría de una base de datos.
        if("user".equals(username))
        {
            //En los atributos, especificaremos el campo y el mensaje:
            addFieldError("username","El username ya está en uso");
        }
        
        if("ejemplo@correo.com".equals(email)){
            addFieldError("emal","El correo ya está en uso");
        }
    }
        
    //Las validaciones pueden colocarse tanto en el set como en el get:
    
    public String getNombre(){
        return nombre;
    }
    
    @RequiredStringValidator(message="El nombre de usuario es un campo obligatorio.")
    @StringLengthFieldValidator(minLength="4", maxLength="12", message="El nombre de usuario debe tener entre "
            + "4 y 12 caracteres")
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getUsername(){
        return username;
    }
    
    @RequiredStringValidator(message="El username es un campo obligatorio.")
    public void setUsername(String username){
        this.username=username;
    }
    
    public String getPassword(){
        return password;
    }
    
    @RequiredStringValidator(message="El password es un campo obligatorio.")
    @RegexFieldValidator(regex = "^\\w*(?=\\w*\\d)(?=\\w*[a-z])(?=\\w*[A-Z])\\w*$", 
            message = "La contraseña debe ser alfanumérica, debe tener al menos una letra mayúscula, "
                    + "una letra minúscula, y al menos un número.")
    public void setPassword(String password){
        this.password=password;
    }
    
    public String getEmail(){
        return email;
    }
    
    @RequiredStringValidator(message="El e-mail es un campo obligatorio.")
    @EmailValidator(message = "El correo electrónico está en un formato inválido.")
    public void setEmail(String email){
        this.email=email;
    }
    
    public int getEdad(){
        return edad;
    }
    
    //@ConversionErrorFieldValidator(message = "La edad debe contener solo números enteros.")
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    @StringLengthFieldValidator(minLength="9", maxLength="9", message="Teléfono no válido.")
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
}