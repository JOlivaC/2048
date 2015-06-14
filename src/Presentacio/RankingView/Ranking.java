/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.RankingView;

import Comunicacio.InfoJugador;
import Presentacio.Comuns.BotoOK;
import Presentacio.Comuns.PanellAmbMsg;
import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.EAST;
import static java.awt.BorderLayout.NORTH;
import static java.awt.BorderLayout.SOUTH;
import java.awt.event.ActionListener;
import static java.lang.String.valueOf;
import java.util.Iterator;
import java.util.SortedSet;
import javax.swing.JPanel;

/**
 *
 * @author JOAN
 */
public class Ranking extends PanellAmbMsg {
    private TaulaRanking taula;

    public Ranking(ActionListener Sortir){
        this.setLayout(new BorderLayout());
        this.add(msg, NORTH);
        
        BotoOK OK = new BotoOK(Sortir);
        JPanel Sud = new JPanel(new BorderLayout());
        Sud.add(OK, EAST);
        
        this.add(Sud, SOUTH);
        
        taula = new TaulaRanking();
        this.add(taula, CENTER);
        
    }
    
    public void MostrarRanking(SortedSet<InfoJugador> info){
        Iterator<InfoJugador> it = info.iterator();
        while (it.hasNext()){
            InfoJugador act = it.next();
            taula.Insereix(act.Nom, valueOf((int)act.Puntuacio));
        }
    }
    
}
