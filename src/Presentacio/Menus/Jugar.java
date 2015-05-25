/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.Menus;

import Presentacio.Comuns.BotoOK;
import Presentacio.Comuns.BotoSortir;
import Presentacio.Comuns.Finestra;
import Presentacio.Comuns.PanellSeparador;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author JOAN
 */
public class Jugar extends Finestra {
    public Jugar(ActionListener JugarHandler,ActionListener SortirHandler){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        
        PanellSeparador ps = new PanellSeparador();

        ps.afegir(new BotoOK("Jugar",JugarHandler));
        ps.afegir(new BotoSortir(SortirHandler));
        
        this.add(ps);
        this.pack();
    }
    
    public static void main(String argv[]){
        //new Jugar().setVisible(true);
    }
}
