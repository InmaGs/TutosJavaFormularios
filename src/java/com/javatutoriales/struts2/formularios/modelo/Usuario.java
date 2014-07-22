/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javatutoriales.struts2.formularios.modelo;

import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author inmaculada.garcia
 */

// Hacemos que la clase implemente la interfaz capaz de convertir un objeto en un conjunto de bits y 
// luego recuperarlo: enviarlo a través de la red, guardarlo en un fichero y luego reconstruirlo para
// leerlo.
public class Usuario implements Serializable {
    
    //Agregamos algunos atributos:
    private String nombre;
    private String username;
    private String password;
    private int edad;
    private Date fechaNacimiento;
    
    //Agregamos constructores:
    public Usuario(){
        //éste se queda vacío.
    }
    
    public Usuario(String nombre, String username, String password, int edad, Date fechaNacimiento){
        this.nombre=nombre;
        this.username=username;
        this.password=password;
        this.edad=edad;
        this.fechaNacimiento=fechaNacimiento;
    }
    
    //Añadimos a la clase los getters y setters:
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public Date getFechaNacimiento(){
        return fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento=fechaNacimiento;
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
    
}
