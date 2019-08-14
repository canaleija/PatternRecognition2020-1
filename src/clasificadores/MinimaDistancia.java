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
        ArrayList<PatronRepresentativo> representativos = new ArrayList<>();
        // agregamos el primer representativo 
        representativos.add(new PatronRepresentativo(instancias.get(0)));
        
        
    }

    @Override
    public void clasificar() {
       
    }
    
}
