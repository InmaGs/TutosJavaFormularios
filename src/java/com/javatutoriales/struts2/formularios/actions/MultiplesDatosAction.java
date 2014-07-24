/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javatutoriales.struts2.formularios.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
import java.util.Set;

/**
 *
 * @author inmaculada.garcia
 */
//Anotamos la clase:
@Namespace(value="/multidatos")
@Action(value="envioCorreo",results={@Result(location="/multidatos/datos-enviados.jsp")})

public class MultiplesDatosAction extends ActionSupport {
    //Definimos el objeto que nos permite obtener los múltiples valores, un array:
    private Set<String> correos;
    private String nombre;
    
    //Definimos el método execute:
    @Override
    public String execute() throws Exception{
        return SUCCESS;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    //Definimos los setters y getters para los datos introducidos en datos.jsp:
    public Set<String> getCorreos(){
        return correos;
    }
    
    public void setCorreos(Set<String> correos){
        this.correos=correos;
    }
    
    
    

    
    
}
