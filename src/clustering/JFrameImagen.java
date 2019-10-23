/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clustering;

import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

/**
 *
 * @author CRUZLEIJA
 */
public class JFrameImagen extends JFrame {

    public JFrameImagen(Image io) {
        JLabel label = new JLabel(new ImageIcon(io));
        add(label);
        setSize(io.getWidth(this),io.getHeight(this));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    
}
