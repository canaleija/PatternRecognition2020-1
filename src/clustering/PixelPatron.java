/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clustering;

import clasificadores.herramientasclasificadores.Patron;

/**
 *
 * @author CRUZLEIJA
 */
public class PixelPatron extends Patron {
    
    private int x;
    private int y;
            
    
    public PixelPatron(double[] vector, String clase,int x,int y) {
        super(vector, clase);
        this.x = x;
        this.y = y;
        
    }
    
    
    public PixelPatron(int n, int x, int y) {
        super(n);
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }
    
}
