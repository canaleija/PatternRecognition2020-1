/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasificadores;

import java.util.ArrayList;

/**
 *
 * @author CRUZLEIJA
 */
public class MinimaDistancia implements ClasificadorSupervisado {

    @Override
    public void entrenar(ArrayList<Patron> instancias) {
        ArrayList<PatronRepresentativo> representativos = new ArrayList<PatronRepresentativo>();
        // agregamos el primer representativo 
        representativos.add(new PatronRepresentativo(instancias.get(0)));
        // recorrer todas las instancias 
        for (int x=1; x<instancias.size();x++){
            Patron aux = instancias.get(x);
            // es verificar la existencia o no el representativo
            int pos = representativos.indexOf(aux);
            if(pos!=-1){
                
                 // ACUMULAR AL REPRESENTATIVO QUE LE CORRESPONDA
                
                representativos.get(pos).acumular(aux);
              
                
            }else {
           // crear un nuevo patron representativo
                // agregamos el primer representativo 
                representativos.add(new PatronRepresentativo(aux));
            }
        }
        for(PatronRepresentativo aux: representativos){
            aux.actualizar();
        }
        
        System.out.println();
        
    }

    @Override
    public void clasificar() {
       
    }

   
}
