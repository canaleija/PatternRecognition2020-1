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
public interface ClasificadorSupervisado {
    
    void entrenar(ArrayList<Patron> instancias);
    void clasificar();
}
