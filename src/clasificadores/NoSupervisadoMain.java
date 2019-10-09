/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasificadores;

import clasificadores.herramientasclasificadores.Herramientas;
import clasificadores.herramientasclasificadores.Patron;

/**
 *
 * @author CRUZLEIJA
 */
public class NoSupervisadoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Herramientas.leerDatos(new int[]{1,1,1,1});
         CMeans cm = new CMeans(150);
         cm.entrenar(Herramientas.instancias);
         
    }
    
}
