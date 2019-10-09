/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasificadores;

import clasificadores.herramientasclasificadores.Herramientas;
import clasificadores.herramientasclasificadores.MatrizConfusion;
import clasificadores.herramientasclasificadores.Patron;
import java.util.ArrayList;

/**
 *
 * @author CRUZLEIJA
 */
public class Knn  implements Clasificador{
    private MatrizConfusion mc;
    private ArrayList<String> clases;
    private ArrayList<Patron> instancias;
    private int k;

    public Knn(int k) {
        this.mc =  null;
        this.clases = new ArrayList<>();
        this.k = k;
    }
     
    
    @Override
    public void entrenar(ArrayList<Patron> instancias) {
        this.instancias = (ArrayList<Patron>) instancias.clone();
        // generamos un arraylist de las clases involucradas
        for(Patron p: instancias){
           if(!this.clases.contains(p.getClase())){
                this.clases.add(p.getClase());
           }
       }
        
      
    }

    @Override
    public void clasificar(Patron patron) {
        instancias.sort(
                (a, b) -> new Double(Herramientas.calcularDistanciaEuclidiana(a, patron))
                        .compareTo(new Double(Herramientas.calcularDistanciaEuclidiana(b, patron)))
  
        );
        int contador[] = new int[this.clases.size()];
        // clasificar en base al numero de vecinos
        for(Patron aux: this.instancias){
            int i = this.clases.indexOf(aux.getClase());
            contador[i]++;
            if(contador[i]==this.k){
                // clasificar
                patron.setClaseResultante(this.clases.get(i));
                break;
            }
        }
       // TODO: VALIDACIÓN DE K 
        
    }

    @Override
    public void clasificar(ArrayList<Patron> patrones) {
       for(Patron p: patrones){
           clasificar(p);
       }
       this.mc = new MatrizConfusion(patrones);
    }

    /**
     * @return the mc
     */
    public MatrizConfusion getMc() {
        return mc;
    }
    
}
