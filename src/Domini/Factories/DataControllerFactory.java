/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.Factories;

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
    private CtrlUsuariRegistrat CUR;
    private CtrlJugador CJ;
    private CtrlOrdenacioPuntuacio COP;
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
