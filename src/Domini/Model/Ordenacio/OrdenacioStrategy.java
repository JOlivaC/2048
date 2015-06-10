/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.Model.Ordenacio;

import Comunicacio.InfoJugador;
import Domini.Model.Jugador;
import Excepcions.noHiHaPartides;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author JOAN
 */
public abstract class OrdenacioStrategy implements IOrdenacioStrategy {
    public  SortedSet<InfoJugador> ordenarPuntuacio(Set<Jugador> sj) throws noHiHaPartides{
        SortedSet<InfoJugador> result = new TreeSet<>();
        boolean HiHaPartides = false;
        for (Jugador j: sj){
            if (j.AlgunaPartidaJugada() && !HiHaPartides) HiHaPartides = true;
            
            float Puntuacio = ObtenirPuntuacio(j);
            String userName = j.getUserName();
            result.add(new InfoJugador(userName,Puntuacio));
            
        }
        if (!HiHaPartides) throw new noHiHaPartides();
        return result;
        
    }
    
    protected abstract float ObtenirPuntuacio(Jugador j);
}
