/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clustering;

import clasificadores.herramientasclasificadores.Patron;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author CRUZLEIJA
 */
public class ImagenesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Image io = ImageManager.openImage();
        JFrameImagen frame1 = new JFrameImagen(io);
        ArrayList<Patron> instancias = ImageAdapter.obtenerInstancias(io);
        CMeansMemo cmm = new CMeansMemo(150);
        cmm.entrenar(instancias);
        cmm.clasificar(instancias);
        Image nueva = ImageAdapter.generarImagenClusterizada(cmm.getCentroides(),instancias,new Dimension(io.getWidth(null),io.getHeight(null)));
        JFrameImagen frame2 = new JFrameImagen(nueva);
    }
    
}
