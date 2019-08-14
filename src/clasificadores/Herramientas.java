/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasificadores;

/**
 *
 * @author CRUZLEIJA
 */
public class Herramientas {
    
    
    public static double calcularDistanciaEuclidiana(Patron a, Patron b){
        double aux = 0;
        for (int x=0;x<a.getVector().length;x++){
            aux+=Math.pow((a.getVector()[x]-b.getVector()[x]),2);
        }
        return Math.sqrt(aux);
        
        
    }
    
}
