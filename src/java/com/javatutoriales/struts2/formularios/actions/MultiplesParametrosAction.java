/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javatutoriales.struts2.formularios.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
import java.util.Map;
import org.apache.struts2.interceptor.ParameterAware;

/**
 *
 * @author inmaculada.garcia
 */

//Anotaciones:
@Namespace(value="/multiparametros")
@Action(value="multiparametros", results={@Result(location="/multiparametros/parametros.jsp")})

public class MultiplesParametrosAction extends ActionSupport implements ParameterAware{
    
    //Definimos variable que almacena la referencia al mapa:
    private Map<String, String[]> parametros; 
    
    //Método execute
    @Override
    public String execute() throws Exception{
        return SUCCESS;
    }
        
    //Métodos que establece los valores de los parámetros:
    public void setParameters(Map<String, String[]> parametros){
        this.parametros=parametros;
    }
    
    public Map<String, String[]> getParametros(){
        return parametros;
    }
}
