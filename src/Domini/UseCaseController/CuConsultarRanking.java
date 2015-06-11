/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.UseCaseController;

import Comunicacio.InfoJugador;
import Domini.DataInterface.CtrlJugador;
import Domini.Factories.DataControllerFactory;
import Domini.Model.Joc2048;
import Domini.Model.Jugador;
import Excepcions.noHiHaPartides;
import java.util.Set;
import java.util.SortedSet;

/**
 *
 * @author JOAN
 */
public class CuConsultarRanking {
    public SortedSet<InfoJugador> ConsultarRanking() throws noHiHaPartides{
        CtrlJugador CJ = DataControllerFactory.getInstance().getJugadorController();
        Set<Jugador> SJ = CJ.getAll();
        return Joc2048.getInstance().OrdenaPerPuntuacio(SJ);
    }
}
