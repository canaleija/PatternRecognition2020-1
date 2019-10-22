/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clustering;

import clasificadores.Clasificador;
import clasificadores.herramientasclasificadores.Herramientas;
import clasificadores.herramientasclasificadores.Patron;
import clasificadores.herramientasclasificadores.PatronRepresentativo;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author CRUZLEIJA
 */
public class CMeans implements Clasificador{

    private int c;
    private PatronRepresentativo[] centroides;

    public CMeans(int c) {
        if(c>15){
        this.c = 15;
        }else{
        this.c = c;
      
        }
         this.centroides = new PatronRepresentativo[c];
    }
    
    
    @Override
    public void entrenar(ArrayList<Patron> instancias) {
        // generar los centroides aleatorios iniciales no repetidos
        Random ran = new Random();
        int pos = ran.nextInt(instancias.size());
        centroides[0]= new PatronRepresentativo(instancias.get(pos));
        centroides[0].setClase(""+0);
        
        //centroides[0].setClase(""+0);
        int con = 1;
        while(con<this.c){
           pos = ran.nextInt(instancias.size());
           if(!existe(instancias.get(pos),con)){
               // agregar el centroide nuevo
               centroides[con]= new PatronRepresentativo(instancias.get(pos));
               centroides[con].setClase(""+con);
               con++;
               
           }        
        }
      
    }
    
     public void entrenar(ArrayList<Patron> instancias, int [] pos) {
         
         for (int i = 0; i < pos.length;i++){
             this.centroides[i] = new PatronRepresentativo(instancias.get(pos[i]));
             this.centroides[i].setClase(""+i);
         }
      
    }

    @Override
    public void clasificar(Patron patron) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clasificar(ArrayList<Patron> patrones) {
        PatronRepresentativo[] nuevos;
        int ii = 0;
        // se clasifica
        do{
            // imprimir los centroides
            System.out.println("-------------");
        for(int i=0;i<this.centroides.length;i++){
        System.out.println(this.centroides[i].toString()+" ----> "+centroides[i].getContador());
        }
             clasificamos(patrones);
            // volvemos a calcular centroides
             nuevos = reAjustarCentroides(patrones); 
        //System.out.println(++ii);
        }while(sonDiferentes(nuevos));
        
        
    }

    private boolean existe(Patron get, int i) {
        for(int x=0; x<i;x++){
            if(this.centroides[x].equals(get)){
                return true;
            }
        }
        return false;
    }

    private void clasificamos(ArrayList<Patron> patrones) {
        for(Patron aux:patrones){
            double distC = Herramientas.calcularDistanciaEuclidiana(aux,this.centroides[0]);
            aux.setClaseResultante(this.centroides[0].getClase());
           
// recorremos los patrones 
            for(int x=1;x<this.centroides.length;x++){
                double daux = Herramientas.calcularDistanciaEuclidiana(aux,this.centroides[x]);
                if(daux<distC){
                    distC = daux;
                    aux.setClaseResultante(this.centroides[x].getClase());
                   
                }
                             
             }  
        }
             
    }

    private PatronRepresentativo[] reAjustarCentroides(ArrayList<Patron> patrones) {
        PatronRepresentativo[] nuevos = new PatronRepresentativo[centroides.length]; 
              
        // si se determina que son diferentes susituimos a los actuales.
             
            for(Patron aux: patrones){
           
            int i = Integer.parseInt(aux.getClase());
            if(nuevos[i]==null){
            nuevos[i] = new PatronRepresentativo(aux);
            nuevos[i].setClase(""+i);
            
            }else{
            nuevos[i].acumular(aux);
            }
        }
         for(int x=0; x< nuevos.length;x++)
             nuevos[x].actualizar();
     
        
        return nuevos;
    }

    private boolean sonDiferentes(PatronRepresentativo[] nuevos) {
        // si se determina que son diferentes susituimos a los actuales.
        for(int x=0; x< nuevos.length;x++){
            if(!nuevos[x].equals(centroides[x])){
                centroides = nuevos.clone() ;
                return true;
            }
        }
        
        return false;
    }
    
    
    
}
