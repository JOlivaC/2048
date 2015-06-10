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

/**
 *
 * @author JOAN
 */
public interface IOrdenacioStrategy {
    public  SortedSet<InfoJugador> ordenarPuntuacio(Set<Jugador> sj) throws noHiHaPartides;
}
