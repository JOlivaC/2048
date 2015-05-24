/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.RankingView;

import Presentacio.Comuns.BotoOK;
import Presentacio.Comuns.FinestraAmbMsg;
import Presentacio.Comuns.MessageArea;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author JOAN
 */
public class Ranking extends FinestraAmbMsg {
    private TaulaRanking taula;

    public Ranking(){
        this.setSize(400,400);
        this.setTitle("Ranking");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.add(msg,BorderLayout.NORTH);
        
        BotoOK OK = new BotoOK();
        JPanel Sud = new JPanel(new BorderLayout());
        Sud.add(OK,BorderLayout.EAST);
        
        this.add(Sud,BorderLayout.SOUTH);
        
        taula = new TaulaRanking();
        this.add(taula,BorderLayout.CENTER);
        this.pack();
        
    }
    
    public static void main(String argv[]){
        new Ranking().setVisible(true);
    }
}
