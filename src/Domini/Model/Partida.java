/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.Model;

import Comunicacio.InfoMoviment;
import Comunicacio.InfoPartida;
import Comunicacio.InfoPartidaNova;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/**
 *
 * @author JOAN
 */
public class Partida {
    private int idPartida;
    private boolean estaAcabada;
    private boolean estaGuanyada;
    private int puntuacio;
    private Jugador jugadorPartidaActual;
    private Jugador jugadorPartidaJugada;
    private Set<Casella> casella;
    
    
    private void creaCaselles(Partida p){}
    private void setNombreCasellesBuides(int quantes){}
    private List<Casella> getCasellesSenseNumero(){return null;}
    private List<Casella> getCasellesAmbNumero(){return null;}
    public Vector<Vector<Casella>> getMatriuCaselles(){return null;}
    private InfoPartida getInfo(){return null;}
    public InfoPartidaNova getInfoPartidaNova(){return null;}
    private InfoMoviment getInfoMoviment(){return null;}
    public int getPuntuacio(){return 0;}
    private void ferComprovacions(){}
    private void comprovaPartidaGuanyada(){}
    private void comprovaPartidaPerduda(){}
    private void finalitzarPartida(){}
    private void preparaSeguentMoviment(){}
    private boolean existeixCasellaNumero(){return false;}
    private void mouCasella(Casella c1,Casella c2,boolean sumat){}
    private void moure(Vector<Casella> linea){}
    private void separar(Vector<Vector<Casella>> MatCasella,String TipusMov){}
    
    
    
}
