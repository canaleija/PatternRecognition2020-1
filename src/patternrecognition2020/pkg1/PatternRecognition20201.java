/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternrecognition2020.pkg1;

import clasificadores.Herramientas;
import clasificadores.MinimaDistancia;
import clasificadores.Patron;
import clasificadores.PatronRepresentativo;
import java.util.ArrayList;

/**
 *
 * @author CRUZLEIJA
 */
public class PatternRecognition20201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Herramientas.leerDatos(new int[]{1,1,1,1});
        
        MinimaDistancia md = new MinimaDistancia();
        md.entrenar(Herramientas.instancias);
        md.clasificar(Herramientas.instancias);
        System.out.println(md.getMc().toString());
    }
    
}
