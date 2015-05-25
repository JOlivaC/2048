/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.PartidaView;

import Presentacio.PartidaView.Fletxa.Fletxa;
import Presentacio.Controladors.JugarPartidaController.HandleMoure;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import Presentacio.PartidaView.Fletxa.*;

/**
 *
 * @author JOAN
 */
public class Controls extends JPanel{
    public Controls(HandleMoure Moure){
       
       Fletxa f1 = new Esquerra(Moure);
       Fletxa f2 = new Amunt(Moure);
       Fletxa f3 = new Avall(Moure);
       Fletxa f4 = new Dreta(Moure);
       
       this.setLayout(new GridBagLayout());
       
       //f1.setHorizontalAlignment(JLabel.CENTER);
       JPanel p = new JPanel();
       p.setLayout(new GridBagLayout());
       GridBagLayout g;
       GridBagConstraints t;
       t = new GridBagConstraints();
       t.fill = GridBagConstraints.BOTH;
       t.weightx = 1;
       t.weighty = 1;
       t.gridx = 0;
       t.gridy = 1;
    
       p.add(f1,t);
       
       //f2.setHorizontalAlignment(JLabel.CENTER);
       t = new GridBagConstraints();
       t.fill = GridBagConstraints.BOTH;
       t.weightx = 1;
       t.weighty = 1;
       t.gridx = 1;
       t.gridy = 0;
       p.add(f2,t);
       
       //f3.setVerticalAlignment(JLabel.CENTER);
       t = new GridBagConstraints();
       t.fill = GridBagConstraints.BOTH;
       t.weightx = 1;
       t.weighty = 1;
       t.gridx = 1;
       t.gridy = 2;
       p.add(f3,t);
       
       //f4.setVerticalAlignment(JLabel.CENTER);
       t = new GridBagConstraints();
       t.fill = GridBagConstraints.BOTH;   
       t.weightx = 1;
       t.weighty = 1;
       t.gridx = 2;
       t.gridy = 1;
       p.add(f4,t);
       
       t = new GridBagConstraints();
       t.fill = GridBagConstraints.BOTH;   
       t.weightx = 1;
       t.weighty = 1;
       t.gridheight = 1;
       t.gridwidth = 1;
       t.gridx = 0;
       t.gridy = 0;
       //this.add(new JPanel(),t);
       
       t = new GridBagConstraints();
       t.fill = GridBagConstraints.BOTH;   
       t.weightx = 1;
       t.weighty = 1;
       t.gridheight = 1;
       t.gridwidth = 1;
       t.gridx = 1;
       t.gridy = 1;
       this.add(p,t);
       
       t = new GridBagConstraints();
       t.fill = GridBagConstraints.BOTH;   
       t.weightx = 1;
       t.weighty = 1;
       t.gridheight = 2;
       t.gridwidth = 1;
       t.gridx = 2;
       t.gridy = 2;
       //this.add(new JPanel(),t);
    }
}
