/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domini.DataInterface.CtrlJugador;
import Domini.Model.Jugador;
import java.util.Set;

/**
 *
 * @author JOAN
 */
public class DataJugador implements CtrlJugador {

    @Override
    public Jugador getJugador(String UserN) {
        return Stubs.FabricaStubs.StubJugador();
    }

    @Override
    public Set<Jugador> getAll() {
        return Stubs.FabricaStubs.StubRankingDesordenat();
    }
    
}
