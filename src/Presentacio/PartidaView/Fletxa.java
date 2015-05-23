/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.PartidaView;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Polygon;
import java.awt.Stroke;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author JOAN
 */
public class Fletxa extends JButton {
    private float Rotacio;
    public Fletxa(float Rotacio){
        this.setLayout(new GridLayout());
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setOpaque(false);
        //this.setText("hoal");
        this.Rotacio = Rotacio;
    }
    private void PintarFletxa(Graphics g){

    }
    
    private Polygon CrearFletxa(){
        Polygon ret = new Polygon();
        ret.addPoint(2, 0);
        ret.addPoint(0, 4);
        ret.addPoint(1, 4);
        ret.addPoint(1, 8);
        ret.addPoint(3, 8);
        ret.addPoint(3, 4);
        ret.addPoint(4, 4);
        ret.translate(-2, -4);
        return ret;
    }
    
    public void paint(Graphics g){
            super.paint(g);
            Graphics2D g2d = (Graphics2D) g;
            //g2d.drawOval(0, 0, this.getWidth(), this.getHeight());
            g2d.setColor(new Color(0,0,0, (float) 0.5));
            int min = Math.min(this.getWidth(), this.getHeight());
            
            Polygon p = CrearFletxa();
           
            g2d.rotate(Math.toRadians(Rotacio),p.getBounds2D().getCenterX(),p.getBounds2D().getCenterY());
            g2d.translate(g2d.getClip().getBounds().getCenterX(), g2d.getClip().getBounds().getCenterY());
            g2d.scale(min / 4, min / 8);

            g2d.fillPolygon(p);

            
    }
}
