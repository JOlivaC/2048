/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.Menus;

import Presentacio.Comuns.BotoOK;
import Presentacio.Comuns.BotoSortir;
import Presentacio.Comuns.PanellSeparador;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author JOAN
 */
public class Jugar extends JFrame {
    public Jugar(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        
        PanellSeparador ps = new PanellSeparador();

        ps.afegir(new JButton("Jugar"));
        ps.afegir(new BotoSortir());
        
        this.add(ps);
        this.pack();
    }
    
    public static void main(String argv[]){
        new Jugar().setVisible(true);
    }
}
