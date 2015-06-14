/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.Menus;

import Presentacio.Comuns.BotoOK;
import Presentacio.Comuns.BotoSortir;
import Presentacio.Comuns.Finestra;
import Presentacio.Comuns.PanellContenidor;
import Presentacio.Comuns.PanellSeparador;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

/**
 *
 * @author JOAN
 */
public class Jugar extends PanellContenidor {
    public Jugar(ActionListener JugarHandler,ActionListener SortirHandler){
        this.setLayout(new GridLayout());
        PanellSeparador ps = new PanellSeparador();

        ps.afegir(new BotoOK("Jugar",JugarHandler));
        ps.afegir(new BotoSortir(SortirHandler));
        
        this.add(ps);

    }
    

}
