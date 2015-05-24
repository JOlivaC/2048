/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.Menus;

import Presentacio.Comuns.BotoSortir;
import Presentacio.Comuns.FinestraAmbMsg;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author JOAN
 */
public class VeureRanking extends FinestraAmbMsg{
    public VeureRanking(){
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(msg,BorderLayout.CENTER);
        JPanel Menu = new JPanel(new BorderLayout());
        Menu.add(new BotoSortir(),BorderLayout.WEST);
        Menu.add(new JButton("Veure Ranking"),BorderLayout.EAST);
        this.add(Menu,BorderLayout.PAGE_END);
        this.pack();
    }
    
    public static void main(String argv[]){
        new VeureRanking().setVisible(true);
    }
}
