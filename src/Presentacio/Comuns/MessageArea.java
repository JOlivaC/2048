/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.Comuns;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author JOAN
 */
public class MessageArea extends JPanel {
    private JLabel Contingut;
    public MessageArea(){
        /*this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);*/
        Border lineBorder = BorderFactory.createTitledBorder("Missatges");
        Contingut = new JLabel();
        Contingut.setHorizontalAlignment(JLabel.CENTER);
        Contingut.setVerticalAlignment(JLabel.CENTER);
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 1;
        this.add(Contingut,c);
        this.setBorder(lineBorder);
    }
    
    public void SetText(String text){
        Contingut.setText(text);
    }
}
