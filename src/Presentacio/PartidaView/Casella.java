/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.PartidaView;

import static java.awt.Color.black;
import static java.awt.Color.white;
import java.awt.Graphics;
import java.awt.GridLayout;
import static java.lang.String.valueOf;
import javax.swing.JLabel;

/**
 *
 * @author JOAN
 */
public class Casella extends JLabel {
    private Integer Numero;
    public Casella(){
        this.setLayout(new GridLayout());
        this.setHorizontalAlignment(CENTER);
        this.setVerticalAlignment(CENTER);
        this.setOpaque(false);
        Numero = null;
    }
    
    public void setNumero(Integer n){
        Numero = n;
        if (Numero == null){
            this.setText("");
        }
        else{
            this.setText(valueOf(Numero));
        }
    }
    
    private void PintarNumero(Graphics g){
        if (Numero != null){
            
        }
    }
    @Override
    public void paint(Graphics g){
        g.setColor(white);
        g.fillRect(0,0,this.getWidth(),this.getHeight());
        g.setColor(black);
        g.drawRect(0,0,this.getWidth(),this.getHeight());
        super.paint(g);
        
    }
}
