/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.Model;

import Comunicacio.InfoJugador;
import Domini.DataInterface.CtrlOrdenacioPuntuacio;
import Domini.Factories.DataControllerFactory;
import Domini.Factories.OrdenacioStrategyFactory;
import Domini.Model.Ordenacio.IOrdenacioStrategy;
import Excepcions.noHiHaPartides;
import java.util.Set;
import java.util.SortedSet;

/**
 *
 * @author JOAN
 */
public class Joc2048 {
    private int idPartida;
    private IOrdenacioStrategy Ordenacio;
    
    private static Joc2048 instance = new Joc2048();
    public static Joc2048 getInstance(){ return instance;}
    
    
    public int getIdPartida(){
       return idPartida; 
    }
    public void actualitzaIdPartida(){idPartida++;}
    public void assignaOrdenacioPuntuacio(){
        CtrlOrdenacioPuntuacio cop = DataControllerFactory.getInstance().getOrdenacioPuntuacioController();
        IOrdenacioStrategy op = cop.get();
        if (op == null) op = OrdenacioStrategyFactory.getInstance().creaOrdenacioPuntuacio();
        Ordenacio = op;
    }
    public SortedSet<InfoJugador> OrdenaPerPuntuacio(Set<Jugador> sj) throws noHiHaPartides{
        return Ordenacio.ordenarPuntuacio(sj);
    }
}
