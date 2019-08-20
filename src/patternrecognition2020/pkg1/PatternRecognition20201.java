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
        // TODO code application logic here
        Patron a = new Patron(new double[]{11.5,5.7,4.8},"a");
        Patron b1 = new Patron(new double[]{1,1,1},"b");
        Patron b2 = new Patron(new double[]{1,1,1},"b");
        Patron b3 = new Patron(new double[]{1,1,1},"b");
        Patron b4 = new Patron(new double[]{1,1,1},"b");
        Patron c = new Patron(new double[]{2,4,6},"c");
        Patron c1 = new Patron(new double[]{12,14,16},"c");
        
        ArrayList<Patron> aux = new ArrayList<>();
        aux.add(c);
        aux.add(b3);
        aux.add(b4);
        aux.add(a);
        aux.add(b2);
        aux.add(c1);
        aux.add(b1);
        
        MinimaDistancia md = new MinimaDistancia();
        md.entrenar(aux);
        
        System.out.println(aux.equals(a));
    }
    
}
