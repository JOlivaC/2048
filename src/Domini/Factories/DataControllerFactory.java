/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.Factories;

import Data.DataJugador;
import Data.DataOrdenacioPuntuacio;
import Data.DataUsuariRegistrat;
import Domini.DataInterface.CtrlJugador;
import Domini.DataInterface.CtrlOrdenacioPuntuacio;
import Domini.DataInterface.CtrlUsuariRegistrat;

/**
 *
 * @author JOAN
 */
public class DataControllerFactory {
    private static DataControllerFactory instance = new DataControllerFactory();
    public static DataControllerFactory getInstance(){return instance;}
    private CtrlUsuariRegistrat CUR = new DataUsuariRegistrat();
    private CtrlJugador CJ = new DataJugador();
    private CtrlOrdenacioPuntuacio COP = new DataOrdenacioPuntuacio();
    public CtrlUsuariRegistrat getUsuariRegistratController(){
        return CUR;
    }
    
    public CtrlJugador getJugadorController(){
        return CJ;
    }
    
    public CtrlOrdenacioPuntuacio getOrdenacioPuntuacioController(){
       return COP; 
    }
}
