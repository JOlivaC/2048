/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.PartidaView;

import Comunicacio.InfoCasella;
import Comunicacio.InfoPartidaNova;
import Presentacio.Comuns.BotoSortir;
import Presentacio.Comuns.PanellAmbMsg;
import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.EAST;
import static java.awt.BorderLayout.SOUTH;
import static java.awt.EventQueue.invokeLater;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Set;
import static java.util.logging.Logger.getLogger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import static javax.swing.UIManager.setLookAndFeel;

/**
 *
 * @author JOAN
 */
public class Partida extends PanellAmbMsg {

    private Tauler Partida;
    private Controls Botons;
    private JLabel Puntuacio;
    private JLabel MillorPuntuacio;
    /**
     * Creates new form Partida
     */
    public Partida() {

 
    }
    public Partida(InfoPartidaNova infoPN,ActionListener TancarHandler,ActionListener Moure) {
        initOwnComponents(TancarHandler,Moure,infoPN.millorPuntuacioJug);
        mostrarEstatPartida(infoPN.puntuacio,infoPN.caselles);
    }
    public void SetNumero(int Fila,int Columna,Integer Numero){
        Partida.SetNumero(Fila, Columna, Numero);
    }

    
    private void initOwnComponents(ActionListener TancarHandler,ActionListener Moure,int MillorP){

        
        setLayout(new BorderLayout());
        
        Partida = new Tauler();
        Botons = new Controls(Moure);
      
        
        Puntuacio = new JLabel("Puntuacio: 0");
        Puntuacio.setHorizontalAlignment(JLabel.CENTER);
        MillorPuntuacio = new JLabel("Millor Puntuacio: " + MillorP);
        MillorPuntuacio.setHorizontalAlignment(JLabel.CENTER);
        JPanel PanellPuntuacio = new JPanel();
        PanellPuntuacio.setLayout(new BorderLayout());
        
        JPanel PanellInterior = new JPanel();
        PanellInterior.add(Puntuacio);
        PanellInterior.add(MillorPuntuacio);
        
        PanellPuntuacio.add(PanellInterior, CENTER);
        
    
        
        JPanel JocIControls = new JPanel();
        JocIControls.setLayout(new GridLayout());
        
        JocIControls.add(Partida);
        JocIControls.add(Botons);
        
        JPanel Principal = new JPanel();
        Principal.setLayout(new BorderLayout());
        
        Principal.add(PanellPuntuacio, SOUTH);
        Principal.add(JocIControls, CENTER);
        
        this.add(Principal, CENTER);
                
        
    
        JPanel Misc = new JPanel();
        Misc.setLayout(new BorderLayout());
        
        BotoSortir Sortir = new BotoSortir(TancarHandler);
        Misc.add(Sortir, EAST);
        
        this.add(Misc, SOUTH);
        
        
        
        
    
    }
    public void Acabar(){
        
    }
    public void mostrarEstatPartida(int puntuacio,Set<InfoCasella> InfoC) {
        setPuntuacio(puntuacio);
        Partida.SetCaselles(InfoC);
    }
    
    private void setPuntuacio(int p){
        Puntuacio.setText("Puntuacio:" + p);
    }
    
    public String getTipusMov(){
        return Botons.getTipusMov();
    }

}
   

