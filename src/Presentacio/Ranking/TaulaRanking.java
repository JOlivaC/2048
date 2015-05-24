/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.Ranking;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author JOAN
 */
public class TaulaRanking extends JPanel{
    private static final String NomsHeaders[] = {"Nom Jugador","Puntuacio"};
    private JTable taula;
    public TaulaRanking(){
            Border lineBorder = BorderFactory.createTitledBorder("Ranking");
            this.setBorder(lineBorder);
            this.setOpaque(false);
            taula = new JTable();
            DefaultTableModel t = (DefaultTableModel)taula.getModel();
            t.setColumnIdentifiers(NomsHeaders);
            this.setLayout(new GridLayout());
            JScrollPane scrollPane = new JScrollPane(taula); 
            this.add(scrollPane);
          
    }
    

}
