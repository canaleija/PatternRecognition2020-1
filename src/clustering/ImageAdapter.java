/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clustering;

import clasificadores.herramientasclasificadores.Patron;
import clasificadores.herramientasclasificadores.PatronRepresentativo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author CRUZLEIJA
 */
public class ImageAdapter {
           
    public static ArrayList<Patron> obtenerInstancias(Image io){
        ArrayList<Patron> aux = new ArrayList<>();
        BufferedImage bi = ImageManager.toBufferedImage(io);
        for(int x=0; x< bi.getWidth();x++){
            for(int y=0; y <bi.getHeight();y++){
                Color color = new Color(bi.getRGB(x, y));
                PixelPatron pp = new PixelPatron(new double[]{color.getRed(),
                                                              color.getGreen(),
                                                              color.getBlue()} ,"", x, y);
                aux.add(pp);
            }
        }
        return aux;
    }
    
    public static Image generarImagenClusterizada(PatronRepresentativo[] r,ArrayList<Patron>instancias, Dimension dim){
     Image ir = null;
     BufferedImage biaux = new BufferedImage((int)dim.getWidth(),(int)dim.getHeight(), BufferedImage.TYPE_INT_RGB);
     // recorremos las instancias
     for(Patron aux: instancias){
         PixelPatron pxp = (PixelPatron)aux;
         String clase = pxp.getClase();
         double vector [] = new double[]{0,0,0};
         representativos:for(PatronRepresentativo pr: r){
             if(clase.equals(pr.getClase())){
             vector = pr.getVector();
                break representativos;
             }        
            
         }
         // seteamos el nuevo color
         
         biaux.setRGB(pxp.getX(),pxp.getY(), new Color((int)vector[0],(int) vector[1],(int) vector[2]).getRGB());
     }
    
     return ImageManager.toImage(biaux);
    }
    
}
