/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048;

import Presentacio.Controladors.JugarPartidaController;
import Presentacio.Controladors.JugarPartidaControllerPerduda;
import Presentacio.Controladors.JugarPartidaControllerQuasiGuanyada;

/**
 *
 * @author JOAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length > 0){
            if (args[0].compareTo("Guanyar") == 0){
                new JugarPartidaControllerQuasiGuanyada();
            }
            else if (args[0].compareTo("Perdre") == 0){
                new JugarPartidaControllerPerduda();
            }
        }
        else new JugarPartidaController();
    }
    
}
