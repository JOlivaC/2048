/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.LoginView;

import Presentacio.Comuns.BotoOK;
import Presentacio.Comuns.BotoSortir;
import Presentacio.Comuns.FinestraAmbMsg;
import Presentacio.Comuns.PanellSeparador;
import Presentacio.Comuns.TextMesCamp;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author JOAN
 */
public class Login extends FinestraAmbMsg{

    private JTextField UserName;
    private JPasswordField Pass;
    
    public Login(ActionListener OKHandler,ActionListener SortirHandler){

        this.setTitle("Login");
        this.setLayout(new BorderLayout());

        this.add(msg,BorderLayout.NORTH);
        
        JPanel Misc = new JPanel();
        Misc.setLayout(new BorderLayout());
        
        Misc.add(new BotoSortir(SortirHandler),BorderLayout.WEST);
        Misc.add(new BotoOK(OKHandler),BorderLayout.EAST);
        
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
    
    public String getUserName(){
        return UserName.getText();
    }
    
    public String getPassword(){
        return String.valueOf(Pass.getPassword());
    }
    
    public static void main(String argv[]){
        //new Login().setVisible(true);
    }
}
