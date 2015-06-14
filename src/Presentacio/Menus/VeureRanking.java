/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.Menus;

import Presentacio.Comuns.BotoOK;
import Presentacio.Comuns.BotoSortir;
import Presentacio.Comuns.PanellAmbMsg;
import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.EAST;
import static java.awt.BorderLayout.PAGE_END;
import static java.awt.BorderLayout.WEST;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author JOAN
 */
public class VeureRanking extends PanellAmbMsg{
    public VeureRanking(ActionListener FinalitzarHandler,ActionListener VeureRanking){
        this.setLayout(new BorderLayout());
        this.add(msg, CENTER);
        JPanel Menu = new JPanel(new BorderLayout());
        Menu.add(new BotoSortir(FinalitzarHandler), WEST);
        Menu.add(new BotoOK("Veure Ranking",VeureRanking), EAST);
        this.add(Menu, PAGE_END);
    }
    

}
