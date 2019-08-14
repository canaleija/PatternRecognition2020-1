/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternrecognition2020.pkg1;

import clasificadores.Herramientas;
import clasificadores.Patron;
import clasificadores.PatronRepresentativo;

/**
 *
 * @author CRUZLEIJA
 */
public class PatternRecognition20201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Patron a = new Patron(new double[]{11.5,5.7,4.8},"");
        Patron b = new Patron(new double[]{1,1,1},"");
        Patron c = new Patron(new double[]{12,113,14},"");
        PatronRepresentativo aux = new PatronRepresentativo(c);
        aux.acumular(b);
        aux.acumular(a);
        aux.actualizar();
        
        System.out.println(Herramientas.calcularDistanciaEuclidiana(a, b));
    }
    
}
