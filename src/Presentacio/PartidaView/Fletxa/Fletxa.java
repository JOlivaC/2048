/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.PartidaView.Fletxa;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Polygon;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author JOAN
 */
public abstract class Fletxa extends JButton {
    private static final Polygon p = CrearFletxa(); 

    public Fletxa(ActionListener Moure[]){
        for (ActionListener l: Moure)
            this.addActionListener(l);
        this.setLayout(new GridLayout());
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setOpaque(false);
    }
    public void AddHandler(ActionListener l){
        this.addActionListener(l);
    }
    private void PintarFletxa(Graphics g){

    }
    public abstract String getTipusMov();
    public abstract float getRotacio();
    
    private static Polygon CrearFletxa(){
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
            g2d.setColor(new Color(0,0,0, (float) 0.5));
            int min = Math.min(this.getWidth(), this.getHeight());
           
            g2d.rotate(Math.toRadians(getRotacio()),p.getBounds2D().getCenterX(),p.getBounds2D().getCenterY());
            g2d.translate(g2d.getClip().getBounds().getCenterX(), g2d.getClip().getBounds().getCenterY());
            g2d.scale(min / 4, min / 8);

            g2d.fillPolygon(p);

            
    }
}
