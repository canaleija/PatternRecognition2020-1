/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasificadores;

import clasificadores.herramientasclasificadores.Patron;
import java.util.ArrayList;

/**
 *
 * @author CRUZLEIJA
 */
public interface Clasificador {
    
    void entrenar(ArrayList<Patron> instancias);
    void clasificar(Patron patron);
    void clasificar(ArrayList<Patron> patrones);
}
