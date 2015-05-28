/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.PartidaView;

import Comunicacio.InfoCasella;
import static java.awt.Color.black;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Set;
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
        for (Casella[] MatCaselle : MatCaselles) {
            for (int j = 0; j < MatCaselle.length; j++) {
                MatCaselle[j] = new Casella();
                //MatCaselles[i][j].setNumero(i * 4 + j);
                this.add(MatCaselle[j]);
            }
        }
          
    }
    
    public void SetNumero(int fila,int columna,Integer numero){
        MatCaselles[fila-1][columna-1].setNumero(numero);
    }
    
    public void SetCaselles(Set<InfoCasella> infoC){
        ClearCaselles();
        for (InfoCasella i: infoC){
            MatCaselles[i.i - 1][i.j - 1].setNumero(i.numero);
        }
    }
    private void ClearCaselles(){
        for (Casella[] m : MatCaselles) for (Casella c : m) {
            c.setNumero(null);
        }
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(black);
        g.drawRect(0,0,this.getWidth() - 1,this.getHeight() - 1);
    }
}
