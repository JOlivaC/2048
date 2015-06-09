/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.Model;

import java.util.Set;

/**
 *
 * @author JOAN
 */
public class Jugador {
    private String email;
    private int millorPuntuacio;
    private Partida PartidaActual;
    private Set<Partida> PartidaJugada;
    
    public void setPartidaActual(Partida p){}
    public String getNom(){return null;}
    public int getMillorPuntuacio(){return millorPuntuacio;}
    public float getPuntuacioMitjana(){return 0;}
    public boolean AlgunaPartidaJugada(){return false;}
    public void enviarMissatge(int idPartida,int puntuacio){}
    public void acabarPartida(){}
}
