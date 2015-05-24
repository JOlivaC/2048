/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.PartidaView;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author JOAN
 */
public class Tauler extends JPanel {
    private Casella MatCaselles[][];
    
    public Tauler(){
        this.setLayout(new GridLayout(4,4));
        MatCaselles = new Casella[4][4];
        for (int i = 0; i < MatCaselles.length; i ++){
            for (int j = 0; j < MatCaselles[i].length; j++){
                MatCaselles[i][j] = new Casella();
                MatCaselles[i][j].setNumero(i * 4 + j);
                this.add(MatCaselles[i][j]);
            }
        }
          
    }
    
    public void SetNumero(int fila,int columna,Integer numero){
        MatCaselles[fila-1][columna-1].setNumero(numero);
    }
    
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.black);
        g.drawRect(0,0,this.getWidth() - 1,this.getHeight() - 1);
    }
}
