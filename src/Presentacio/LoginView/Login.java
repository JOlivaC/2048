/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.LoginView;

import Presentacio.Comuns.BotoOK;
import Presentacio.Comuns.BotoSortir;
import Presentacio.Comuns.FinestraAmbMsg;
import Presentacio.Comuns.MessageArea;
import Presentacio.Comuns.PanellSeparador;
import Presentacio.Comuns.TextMesCamp;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

/**
 *
 * @author JOAN
 */
public class Login extends FinestraAmbMsg{

    private JTextField UserName;
    private JPasswordField Pass;
    
    public Login(){
        this.setSize(400,400);
        this.setTitle("Login");
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        this.add(msg,BorderLayout.NORTH);
        
        JPanel Misc = new JPanel();
        Misc.setLayout(new BorderLayout());
        
        Misc.add(new BotoSortir(),BorderLayout.WEST);
        Misc.add(new BotoOK(),BorderLayout.EAST);
        
        this.add(Misc,BorderLayout.SOUTH);
        
        PanellSeparador Camps = new PanellSeparador();
        
        
        UserName = new JTextField();
        JLabel UserNameText = new JLabel("Usuari: ");       
        TextMesCamp User = new TextMesCamp(UserNameText,UserName);
        Camps.afegir(User);

        Pass = new JPasswordField();
        JLabel PassText = new JLabel("Password: ");
        TextMesCamp Cont = new TextMesCamp(PassText,Pass);
        
        Camps.afegir(Cont);
        
        this.add(Camps,BorderLayout.CENTER);
        this.pack();
    }
    
    public static void main(String argv[]){
        new Login().setVisible(true);
    }
}
