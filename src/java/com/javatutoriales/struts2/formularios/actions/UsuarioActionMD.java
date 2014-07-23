/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javatutoriales.struts2.formularios.actions;

import com.javatutoriales.struts2.formularios.modelo.Usuario; //Para la toma de datos
import com.opensymphony.xwork2.ActionSupport; //Para usar el ActionSupport.
import com.opensymphony.xwork2.ModelDriven; //Para usar el interceptor de ModelDriven.
import org.apache.struts2.convention.annotation.*; //Para usar las anotaciones.

/**
 *
 * @author inmaculada.garcia
 */
//Anotamos la clase:
@Namespace(value="/modeldriven")//Cambiamos el namespace, ya que el action tiene 
                                //el mismo nombre, para diferenciar de UsuarioAction.
@Action(value="datosUsuario", results={@Result(location="/modeldriven/datos-usuario.jsp")})

//La clase Usuario será la que se tome como modelo de ésta.
public class UsuarioActionMD extends ActionSupport implements ModelDriven <Usuario> {

    //Creamos el objeto modelo:
    private Usuario usuario = new Usuario();
    
    //Implementamos el método que nos devuelve los datos del objeto.
    public Usuario getModel(){
        return usuario;
    }
    
    //Definimos el execute:
    @Override
    public String execute() throws Exception{
        return SUCCESS;
    }
}
