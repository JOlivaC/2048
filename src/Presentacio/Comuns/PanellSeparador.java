/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.Comuns;

import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author JOAN
 */
public class PanellSeparador extends JPanel {
    private BoxLayout l;
    private JPanel Central;
    private static final int Separacio = 10;
    public PanellSeparador(){
        

        this.setLayout(new GridBagLayout());
        
        
        Central = new JPanel();
        l = new BoxLayout(Central,BoxLayout.Y_AXIS);
        Central.setLayout(l);
        this.add(Central);
        Central.add(Box.createVerticalStrut(Separacio));
       
    }
   
    public void afegir(Component c){
        
        JPanel j = new JPanel(new GridLayout());
        j.add(c);
        Central.add(j);
        Central.add(Box.createVerticalStrut(Separacio));

    }
}
