/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.DataInterface;

import Domini.Model.Jugador;
import java.util.Set;

/**
 *
 * @author JOAN
 */
public interface CtrlJugador {
    public Jugador getJugador(String UserN);
    public Set<Jugador> getAll();
}
