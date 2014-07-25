/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javatutoriales.struts2.formularios.actions;

import org.apache.struts2.convention.annotation.*;
import com.opensymphony.xwork2.ActionSupport;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.awt.Color; //para usar el color
import java.io.ByteArrayInputStream; //para que struts pueda leer la imagen
import java.io.ByteArrayOutputStream; //para recuperar los bytes de la imagen
import javax.imageio.ImageIO; //para tratar la imagen

/**
 *
 * @author inmaculada.garcia
 */
@Namespace(value="/descarga")
@Action(value="generaImagenes", results={@Result(type="stream", params=
        {"inputName","imagenDinamica", //El nombre de la imagen generada
         "contentType","image/png"})}) //El tipo de imagen generada
public class GeneradorImagenes extends ActionSupport{
    
    //Creamos una variable de tipo InputStream, ya que vamos a crear un flujo de datos.
    
    private InputStream imagenDinamica;
    
    //getter del flujo de datos de la imagen:
    @Override
    public String execute() throws Exception{
        //Generamos la imagen de forma dinámica y se guarda de forma que al enviarse, el 
        //navegador pueda entenderla.
        
        //Indicamos las dimensiones de la imagen. Se marcan como final para asegurar que 
        //su valor no cambia durante la ejecución del método.
        final int ANCHO_IMAGEN = 260;
        final int ALTO_IMAGEN = 130;
        
        //Creamos un objeto que permite manipular las imágenes. Se usa la clase 
        //BufferedImage, que recibe como parámetros las dimensiones de la imágen y el tipo
        BufferedImage imagen = new BufferedImage(ANCHO_IMAGEN,ALTO_IMAGEN, BufferedImage.TYPE_INT_RGB);
        
        //Ahora, usamos el método setRGB para "pintar" la imagen. Recibe como parámetros la posición del
        //pixel que queremos pintar y su color en valor hexadecimal. Para ello necesitamos dos bucles, uno
        //que recorra todas las filas de la imagen y otro para las columnas. Con la clase Color, pintaremos 
        //cada pixel. Recibe los valores del rojo, verde y azul y la transparencia. Como los valores van del
        // 0 al 255, para que no se exceda el rango, se usa el operador módulo %. Finalmente, pasamos el método
        //getRGB() para convertir el conjunto de esos valores al color que estableceremos.
        for(int alto=0; alto<ALTO_IMAGEN; alto++)
        {
            for(int ancho=0; ancho<ANCHO_IMAGEN; ancho++)
            {
                imagen.setRGB(ancho, alto, new Color((ancho*alto)%255,(ancho*alto)%255,
                    (ancho*alto)%255,255).getRGB());
            }
        }
        
        //Aqui convertimos el conjunto de los colores en un formato que puede entender el navegador.
        //Para ello, la clase ImageIO, a través del método write, lo transforma a jpg, png, gif y bmp.
        //Recibe como parámetros la imagen, el formato y un OutputStream (recupera los bytes de la imagen)
        ByteArrayOutputStream bytesImagen=new ByteArrayOutputStream();
        ImageIO.write(imagen, "png", bytesImagen);
        
        //Usamos el arreglo de bytes anterior para tratar la imagen, almacenando la informacion
        imagenDinamica= new ByteArrayInputStream(bytesImagen.toByteArray());
        
        return SUCCESS;
    }
    
    public InputStream getImagenDinamica(){
        return imagenDinamica;
    }
            
}
