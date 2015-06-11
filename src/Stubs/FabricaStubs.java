/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stubs;

import Comunicacio.InfoCasella;
import Comunicacio.InfoJugador;
import Comunicacio.InfoMoviment;
import Comunicacio.InfoPartidaNova;
import Domini.Model.Jugador;
import Domini.Model.Partida;
import Domini.Model.UsuariRegistrat;
import static java.lang.Math.random;
import static java.lang.Math.round;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author JOAN
 */
public abstract class FabricaStubs {
    public static InfoMoviment StubMoviment(){
        InfoMoviment ret = new InfoMoviment();
        ret.caselles = StubCaselles();
        ret.estaAcabada = Rand(0,1) == 1;
        ret.estaGuanyada = Rand(0,1) == 1;
        ret.puntuacio = Rand(0, 10_000);
        return ret;
    }
    public static SortedSet<InfoJugador> StubRanking(){
       
        Comparator<InfoJugador> t = (InfoJugador o1, InfoJugador o2) -> {
            if (o1.Puntuacio > o2.Puntuacio) return -1;
            else return 1;
        };
        
         SortedSet<InfoJugador> ret = new TreeSet<>(t); 
        
         
        int max = 10_000;
        int over = Rand(1,100);
        for (int i = 0; i < over; i++){      
            ret.add(StubJugador(max));
            max = (int) ret.last().Puntuacio;
        }
        return ret;
        
    }
    public static UsuariRegistrat StubUsuariRegistrat(){
        UsuariRegistrat u = new UsuariRegistrat();
        u.setUsername("2048");
        u.setPwd("2048");
        return u;
    }
    
    public static Set<Partida> StubPartides(){
        Set<Partida> ret = new HashSet<>();
        int i = Rand(0,100);
        for (int j = 0; j < i; j++){
            ret.add(StubPartidaReal());
        }
        return ret;
    }
    
    public static Jugador StubJugador(){
        Jugador j = new Jugador();
        j.setMillorPuntuacio(Rand(1,10000));
        j.setUsername("manel");
        j.setPartidaJugada(StubPartides());
        return j;
    }
    public static Partida StubPartidaReal(){
        Partida p = new Partida(0,null);
        p.setEstaAcabada(true);
        p.setPuntuacio(Rand(0,10000));
        return p;        
    }
    public static Set<Jugador> StubRankingDesordenat(){
       
        
         Set<Jugador> ret = new HashSet<>(); 
        
         
        int max = 10_000;
        int over = Rand(1,100);
        for (int i = 0; i < over; i++){      
            ret.add(StubJugador());
        }
        return ret;
        
    }
    private static InfoJugador StubJugador(int MaxPuntuacio){
        InfoJugador ret = new InfoJugador();
        ret.Nom = "Manel";
        ret.Puntuacio = Rand(MaxPuntuacio / 2,MaxPuntuacio);
        return ret;
    }
    public static InfoPartidaNova StubPartida(){
       InfoPartidaNova ret = new InfoPartidaNova();
       ret.millorPuntuacioJug = 1;
       ret.puntuacio = 0;
       ret.caselles = StubCaselles();
       return ret;
    }
    
    public static Set<InfoCasella> StubCaselles(){
        Set<InfoCasella> ret = new HashSet<>();
        for (int i = 1;i <= 4; i++) for (int j = 1; j <= 4; j++){
            if (Rand(1,2) == 1){
               ret.add(StubCasella(i,j));
            }
        }
        return ret;
    }
    public static InfoCasella StubCasella(int i,int j){
        InfoCasella ret = new InfoCasella();
        ret.i = i;
        ret.j = j;
        ret.numero = Rand(1,10);
        return ret;
    }
    
    public static int Rand(int min,int max){
        double r = random();
        return (int) (min + round((max - min) * r));
    }
}
