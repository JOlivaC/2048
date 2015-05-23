/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.PartidaView;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author JOAN
 */
public class Controls extends JPanel{
    public Controls(){
       
       Fletxa f1 = new Fletxa();
       Fletxa f2 = new Fletxa();
       Fletxa f3 = new Fletxa();
       Fletxa f4 = new Fletxa();
       
       this.setLayout(new BorderLayout());
       
       f1.setHorizontalAlignment(JLabel.CENTER);
       this.add(f1,BorderLayout.NORTH);
       
       f2.setHorizontalAlignment(JLabel.CENTER);
       this.add(f2,BorderLayout.SOUTH);
       
       f3.setVerticalAlignment(JLabel.CENTER);
       this.add(f3,BorderLayout.EAST);
       
       f4.setVerticalAlignment(JLabel.CENTER);
       this.add(f4,BorderLayout.WEST);
    }
}
