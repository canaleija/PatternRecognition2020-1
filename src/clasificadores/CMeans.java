/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasificadores;

import clasificadores.herramientasclasificadores.Patron;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author CRUZLEIJA
 */
public class CMeans implements Clasificador{

    private int c;
    private Patron[] centroides;

    public CMeans(int c) {
        if(c>15){
        this.c = 15;
        }
        this.c = c;
        this.centroides = new Patron[c];
    }
    
    
    @Override
    public void entrenar(ArrayList<Patron> instancias) {
        // generar los centroides aleatorios iniciales no repetidos
        Random ran = new Random();
        int pos = ran.nextInt(instancias.size());
        centroides[0]= new Patron(instancias.get(pos));
        int con = 1;
        while(con<this.c){
           pos = ran.nextInt(instancias.size());
           if(!existe(instancias.get(pos),con)){
               // agregar el centroide nuevo
               centroides[con] = new Patron(instancias.get(pos));
               con++;
               System.out.println(con);
           }        
        }
        System.out.println();
    }

    @Override
    public void clasificar(Patron patron) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clasificar(ArrayList<Patron> patrones) {
//        // se clasifica
//        do{
//           // clasificamos(patrones);
//            // volvemos a calcular centroides
//            Patron[] nuevos = new Patron[c];
//        
//        }while(sonDiferentes(nuevos));
    }

    private boolean existe(Patron get, int i) {
        for(int x=0; x<i;x++){
            if(this.centroides[x].equals(get)){
                return true;
            }
        }
        return false;
    }
    
    
    
}
