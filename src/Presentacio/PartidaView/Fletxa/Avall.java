/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.PartidaView.Fletxa;

import Presentacio.Controladors.JugarPartidaController;
import java.awt.event.ActionListener;

/**
 *
 * @author JOAN
 */
public class Avall extends Fletxa {
    private static final String TipusMov = "Avall";
    
    public Avall(ActionListener Moure[]) {
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
