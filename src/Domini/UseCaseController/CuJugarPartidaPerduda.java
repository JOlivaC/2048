/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.UseCaseController;

import Comunicacio.InfoPartidaNova;
import Domini.Model.Joc2048;

/**
 *
 * @author JOAN
 */
public class CuJugarPartidaPerduda extends CuJugarPartida{
    public InfoPartidaNova crearPartida(){
        int id = Joc2048.getInstance().getIdPartida();
        id ++;
        Domini.Model.Partida p = new Domini.Model.Partida(id,jugador);
        Joc2048.getInstance().actualitzaIdPartida();
        Joc2048.getInstance().assignaOrdenacioPuntuacio();
        
        jugador.setPartidaActual(p);
        
        partida = p;
            p.setCaselles(Stubs.FabricaStubs.StubCasellesGuanyades());

            
           p.setCaselles(Stubs.FabricaStubs.StubCasellesPerdudes());
        return p.getInfoPartidaNova();
    }
}
