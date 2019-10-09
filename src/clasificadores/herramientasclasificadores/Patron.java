/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasificadores.herramientasclasificadores;

/**
 *
 * @author CRUZLEIJA
 */
public class Patron {
    
    private double vector[];
    private String clase;
    private String claseResultante;

    public Patron(int n) {
        this.vector = new double[n];
        this.clase = "Desconocida";
        this.claseResultante = "Desconocida";
    }

    public Patron(double[] vector, String clase) {
        this.vector = vector;
        this.clase = clase;
        this.claseResultante = "Desconocida";
    }
    
    public Patron (Patron aux){
        this.clase = aux.getClase();
        this.vector = aux.getVector().clone();
         this.claseResultante = "Desconocida";
    }

    public double[] getVector() {
        return vector;
    }

    public void setVector(double[] vector) {
        this.vector = vector;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    /**
     * @return the claseResultante
     */
    public String getClaseResultante() {
        return claseResultante;
    }

    /**
     * @param claseResultante the claseResultante to set
     */
    public void setClaseResultante(String claseResultante) {
        this.claseResultante = claseResultante;
    }
    
    
//    @Override
//    public boolean equals(Object obj) {
//        Patron aux = (Patron)obj;
//        String nombre = getClase();
//        return nombre.equals(aux.getClase());
//        
//    }
    
        @Override
    public boolean equals(Object obj) {
      Patron aux = (Patron) obj;
      for(int x=0 ;x<this.vector.length;x++){
          if(this.vector[x]!=aux.getVector()[x]){
          return false;
          }
      }
      
      return true;
        
    }
    
    
    
}
