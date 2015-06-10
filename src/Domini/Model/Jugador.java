/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.Model;

import Domini.Adaptadors.IMessaginServiceAdapter;
import Domini.Factories.AdaptersFactory;
import java.util.Set;

/**
 *
 * @author JOAN
 */
public class Jugador extends UsuariRegistrat {
    private String email;
    private int millorPuntuacio;
    private Partida PartidaActual;
    private Set<Partida> PartidaJugada;
    
    public void setPartidaActual(Partida p){PartidaActual = p;}
    public String getNom(){return this.nom;}
    public int getMillorPuntuacio(){return millorPuntuacio;}
    public float getPuntuacioMitjana(){
        int Total = 0;
        for (Partida p : PartidaJugada){
            Total += p.getPuntuacio();
        }
        if (PartidaJugada.isEmpty()) return 0;
        else return ((float)Total / PartidaJugada.size());

    }
    public boolean AlgunaPartidaJugada(){return !PartidaJugada.isEmpty();}
    public void enviarMissatge(int idPartida,int puntuacio){
        IMessaginServiceAdapter imsa = AdaptersFactory.getInstance().getMessaginServiceAdapter();
        String msg = String.valueOf(idPartida) + "," + String.valueOf(puntuacio);
        imsa.enviarMissatge(email, msg);
    }
    public void acabarPartida(){
        int puntuacio = PartidaActual.getPuntuacio();
        if (puntuacio > millorPuntuacio) millorPuntuacio = puntuacio;
        
        PartidaJugada.add(PartidaActual);
        PartidaActual = null;
    }
}
