/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.Menus;

import Presentacio.Comuns.BotoOK;
import Presentacio.Comuns.BotoSortir;
import Presentacio.Comuns.FinestraAmbMsg;
import Presentacio.Comuns.MessageArea;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author JOAN
 */
public class VeureRanking extends FinestraAmbMsg{
    public VeureRanking(ActionListener FinalitzarHandler,ActionListener VeureRanking){
        this.setTitle("Partida");
        this.setLayout(new BorderLayout());
        this.add(msg,BorderLayout.CENTER);
        JPanel Menu = new JPanel(new BorderLayout());
        Menu.add(new BotoSortir(FinalitzarHandler),BorderLayout.WEST);
        Menu.add(new BotoOK("Veure Ranking",VeureRanking),BorderLayout.EAST);
        this.add(Menu,BorderLayout.PAGE_END);
        this.pack();
    }
    

}
