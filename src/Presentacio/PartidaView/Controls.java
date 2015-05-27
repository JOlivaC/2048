/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.PartidaView;

import Presentacio.Comuns.PanellMatriu;
import Presentacio.PartidaView.Fletxa.Fletxa;
import javax.swing.JPanel;
import Presentacio.PartidaView.Fletxa.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author JOAN
 */
public class Controls extends JPanel{
    private Fletxa LastHit;
    private Fletxa esquerra;
    private Fletxa amunt;
    private Fletxa avall;
    private Fletxa dreta;
    
    public Controls(ActionListener Moure){
       
       ActionListener l[] = new ActionListener[2];
       l[0] = Moure;
       
       l[1] = new MoureEsquerra();
       esquerra = new Esquerra(l);
       
       l[1] = new MoureAmunt();
       amunt = new Amunt(l);
       
       l[1] = new MoureAvall();
       avall = new Avall(l);
       
       l[1] = new MoureDreta();
       dreta = new Dreta(l);
       
       LastHit = null;
       this.setLayout(new GridLayout());
       PanellMatriu PM = new PanellMatriu();
       PM.Add(esquerra,0,1);
       PM.Add(amunt,1,0);
       PM.Add(avall,1,2);
       PM.Add(dreta,2,1);
       
       this.add(PM);
    }
    
    public String getTipusMov(){
        if (LastHit != null){
            return LastHit.getTipusMov();
        }
        else return null;
    }
    
    private class MoureDreta implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e) {
            LastHit = dreta;
        }  
    }
    
    private class MoureEsquerra implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           LastHit = esquerra;
        }  
    }
    
    private class MoureAmunt implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           LastHit = amunt;
        }  
    }
    
    private class MoureAvall implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           LastHit = avall;
        }  
    }
}
