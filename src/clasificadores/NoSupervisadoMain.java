/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasificadores;

import clustering.CMeansMemo;
import clasificadores.herramientasclasificadores.Herramientas;
import clasificadores.herramientasclasificadores.Patron;
import java.util.ArrayList;

/**
 *
 * @author CRUZLEIJA
 */
public class NoSupervisadoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Herramientas.leerDatos();
         CMeansMemo cm = new CMeansMemo(3);
         cm.entrenar(Herramientas.instancias,new int[]{0,98,149});
         ArrayList<Patron> aux = (ArrayList<Patron>)Herramientas.instancias.clone();
         cm.clasificar(aux);
         
    }
    
}
