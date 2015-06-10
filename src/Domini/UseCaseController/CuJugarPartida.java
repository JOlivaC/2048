/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.UseCaseController;

import Comunicacio.InfoJugador;
import Comunicacio.InfoMoviment;
import Comunicacio.InfoPartidaNova;
import Domini.DataInterface.CtrlJugador;
import Domini.Factories.DataControllerFactory;
import Domini.Model.Joc2048;
import Domini.Model.Jugador;
import Excepcions.noHiHaPartides;
import Excepcions.pwdIncorrecte;
import Excepcions.userNameNoExisteix;
import Excepcions.usuariNoJugador;
import Presentacio.PartidaView.Partida;
import static Stubs.FabricaStubs.Rand;
import static Stubs.FabricaStubs.StubMoviment;
import static Stubs.FabricaStubs.StubPartida;
import static Stubs.FabricaStubs.StubRanking;
import java.util.SortedSet;

/**
 *
 * @author JOAN
 */
public class CuJugarPartida {
    private Domini.Model.Partida partida;
    private Jugador jugador;
    public CuJugarPartida(){
        
    }
    public void ferAutenticacio(String userN,String passwd) 
            throws pwdIncorrecte,userNameNoExisteix,usuariNoJugador{
        
            new CuLogin().login(userN, passwd);
            
            CtrlJugador cj = DataControllerFactory.getInstance().getJugadorController();
            jugador = cj.getJugador(userN);
        /* Stub 
        int raise = Rand(0, 3);
        if (raise == 1) throw new pwdIncorrecte();
        else if (raise == 2) throw new userNameNoExisteix();
        else if (raise == 3) throw new usuariNoJugador();
        */
        
    }
    public InfoPartidaNova crearPartida(){
        int id = Joc2048.getInstance().getIdPartida();
        id ++;
        Domini.Model.Partida p = new Domini.Model.Partida(id,jugador);
        Joc2048.getInstance().actualitzaIdPartida();
        Joc2048.getInstance().assignaOrdenacioPuntuacio();
        
        jugador.setPartidaActual(p);
        
        partida = p;
        
        return p.getInfoPartidaNova();
    }
    public SortedSet<InfoJugador> ObtenirRanking() throws noHiHaPartides{
        /*if (Rand(0,1) == 1) throw new noHiHaPartides();
        return StubRanking();*/
        
        return new CuConsultarRanking().ConsultarRanking();
        
    }
    public InfoMoviment ferMoviment(String tipusMov){
        //return StubMoviment();
        return partida.realitzaMoviment(tipusMov);
    }
}
