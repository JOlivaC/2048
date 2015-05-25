/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.Controladors;

import Presentacio.PartidaView.Fletxa.Fletxa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author JOAN
 */
public class JugarPartidaController {
    private Presentacio.LoginView.Login VistaLogin;
    private Presentacio.Menus.Jugar VistaMenuJugar;
    private Presentacio.PartidaView.Partida VistaPartida;
    
    public JugarPartidaController(){
        VistaLogin = new Presentacio.LoginView.Login(new HandleLogin(),new HandleSortirLogin());
        VistaLogin.Show();
    }
    public void PrLogin(String UserN,String passwd){
        VistaLogin.tancar();
        MostrarMenu();
    }
    public void PrSortirLogin(){
        VistaLogin.tancar();
    }
    
    public void PrJugarPartida(){
        VistaMenuJugar.tancar();
        // Crear Partida
        //Crear Partida
        VistaPartida = new Presentacio.PartidaView.Partida(new HandleSortirPartida(),new HandleMoure());
        VistaPartida.Show();
        
    }
    public void PrSortirMenu(){
        VistaMenuJugar.tancar();
    }
    
    public void PrSortirPartida(){
        VistaPartida.tancar();
    }
    
    public void PrMoviment(String TipusMov){
        System.out.print(TipusMov);
    }
    
    private void MostrarMenu(){
        VistaMenuJugar = 
                new Presentacio.Menus.Jugar(new HandleJugar(),new HandleSortirMenu());
        VistaMenuJugar.setVisible(true);
        
    }
    
    
    
    private class HandleLogin implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            PrLogin(VistaLogin.getUserName(),VistaLogin.getPassword());
        }
        
    }
    private class HandleSortirLogin implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            PrSortirLogin();
        }
        
    }
    
    private class HandleJugar implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            PrJugarPartida();
        }
        
    }
    private class HandleSortirMenu implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            PrSortirMenu();
        }
        
    }
    
    private class HandleSortirPartida implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            PrSortirPartida();
        }
        
    }
    
    public class HandleMoure implements ActionListener{
        private Fletxa raiser;
        public void addFletxa(Fletxa f){
            raiser = f;
        }
        public void actionPerformed(ActionEvent e) {
            PrMoviment(raiser.getTipusMov());
        } 
    }
}
