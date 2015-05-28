/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.RankingView;

import Comunicacio.InfoJugador;
import Presentacio.Comuns.BotoOK;
import Presentacio.Comuns.FinestraAmbMsg;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.SortedSet;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author JOAN
 */
public class Ranking extends FinestraAmbMsg {
    private TaulaRanking taula;

    public Ranking(ActionListener Sortir){
        this.setTitle("Ranking");
        this.setLayout(new BorderLayout());
        this.add(msg,BorderLayout.NORTH);
        
        BotoOK OK = new BotoOK(Sortir);
        JPanel Sud = new JPanel(new BorderLayout());
        Sud.add(OK,BorderLayout.EAST);
        
        this.add(Sud,BorderLayout.SOUTH);
        
        taula = new TaulaRanking();
        this.add(taula,BorderLayout.CENTER);
        this.pack();
        
    }
    
    public void MostrarRanking(SortedSet<InfoJugador> info){
        Iterator<InfoJugador> it = info.iterator();
        while (it.hasNext()){
            InfoJugador act = it.next();
            taula.Insereix(act.Nom, String.valueOf((int)act.Puntuacio));
        }
    }
    
    public static void main(String argv[]){
        //new Ranking().setVisible(true);
    }
}
