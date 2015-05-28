/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.UseCaseController;

import Comunicacio.InfoJugador;
import Comunicacio.InfoMoviment;
import Comunicacio.InfoPartidaNova;
import Excepcions.noHiHaPartides;
import Excepcions.pwdIncorrecte;
import Excepcions.userNameNoExisteix;
import Excepcions.usuariNoJugador;
import java.util.SortedSet;

/**
 *
 * @author JOAN
 */
public class CuJugarPartida {
    public CuJugarPartida(){
        
    }
    public void ferAutenticacio(String userN,String passwd) 
            throws pwdIncorrecte,userNameNoExisteix,usuariNoJugador{
        
        int raise = Stubs.FabricaStubs.Rand(0, 3);
        if (raise == 1) throw new pwdIncorrecte();
        else if (raise == 2) throw new userNameNoExisteix();
        else if (raise == 3) throw new usuariNoJugador();
    }
    public InfoPartidaNova crearPartida(){
        return Stubs.FabricaStubs.StubPartida();
    }
    public SortedSet<InfoJugador> ObtenirRanking() throws noHiHaPartides{
        if (Stubs.FabricaStubs.Rand(0,1) == 1) throw new noHiHaPartides();
        return Stubs.FabricaStubs.StubRanking();
        
    }
    public InfoMoviment ferMoviment(String tipusMov){
        return Stubs.FabricaStubs.StubMoviment();
    }
}
