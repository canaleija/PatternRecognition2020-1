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
public class PatronRepresentativo extends Patron {
    private int contador;
   
    public PatronRepresentativo(Patron a){
        super(a.getVector().length);
        this.contador=0;
        acumular(a);
      
      
    }

    public  void acumular(Patron a) {
       for (int x=0;x<a.getVector().length;x++){
            super.getVector()[x]+=a.getVector()[x];
        }
       this.contador++;
    }
    
    public void actualizar(){
        for (int x=0;x<super.getVector().length;x++){
            super.getVector()[x]/=this.contador;
        }
        this.contador = 0;
    }
    
    
}
