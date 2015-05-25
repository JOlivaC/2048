/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.PartidaView.Fletxa;

import Presentacio.Controladors.JugarPartidaController;

/**
 *
 * @author JOAN
 */
public class Avall extends Fletxa {
    private static final String TipusMov = "Avall";
    
    public Avall(JugarPartidaController.HandleMoure Moure) {
        super(Moure);
    }

    @Override
    public String getTipusMov() {
       return TipusMov;
    }

    @Override
    public float getRotacio() {
        return 180;
    }
    
}
