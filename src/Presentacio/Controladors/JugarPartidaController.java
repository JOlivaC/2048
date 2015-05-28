/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.Controladors;

import Comunicacio.InfoJugador;
import Comunicacio.InfoMoviment;
import Comunicacio.InfoPartidaNova;
import Excepcions.noHiHaPartides;
import Excepcions.pwdIncorrecte;
import Excepcions.userNameNoExisteix;
import Excepcions.usuariNoJugador;
import Presentacio.Menus.VeureRanking;
import Presentacio.RankingView.Ranking;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.SortedSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JOAN
 */
public class JugarPartidaController {
    private Presentacio.LoginView.Login VistaLogin;
    private Presentacio.Menus.Jugar VistaMenuJugar;
    private Presentacio.PartidaView.Partida VistaPartida;
    private Presentacio.RankingView.Ranking VistaRanking;
    private Domini.UseCaseController.CuJugarPartida CUJugarPartida;
    private Presentacio.Menus.VeureRanking VistaMenuRanking;
    
    public JugarPartidaController(){
        VistaLogin = new Presentacio.LoginView.Login(new HandleLogin(),new HandleSortirLogin());
        VistaLogin.Show();
        CUJugarPartida = new Domini.UseCaseController.CuJugarPartida(); 
    }
    public void PrLogin(String UserN,String passwd){
        try {
            CUJugarPartida.ferAutenticacio(UserN, passwd);
            VistaLogin.tancar();
            MostrarMenu();
        } catch (pwdIncorrecte ex) {
            VistaLogin.MostraMsg("El password es incorrecte");
        } catch (userNameNoExisteix ex) {
            VistaLogin.MostraMsg("El username " + UserN + " no es correspon a un jugador");
        } catch (usuariNoJugador ex) {
            VistaLogin.MostraMsg("El username " + UserN + " no correspon a un jugador");
        }
    }
    
    public void PrSortirLogin(){
        VistaLogin.tancar();
    }
     public void PrSortirMenu(){
        VistaMenuJugar.tancar();
    }
    
    public void PrJugarPartida(){
        VistaMenuJugar.tancar();
        InfoPartidaNova infoPN = CUJugarPartida.crearPartida();
        VistaPartida = new Presentacio.PartidaView.Partida(infoPN,new HandleSortirPartida(),new HandleMoure());
        VistaPartida.Show();
        
    }
   
    
    public void PrSortirPartida(){
        VistaPartida.tancar();
 
    }
    
    public void PrVeureRanking(){
        VistaMenuRanking.tancar();
        SortedSet<InfoJugador> infoR;
        
        VistaRanking = new  Presentacio.RankingView.Ranking(new HandleSortirRanking());
        VistaRanking.Show();
        try {
            infoR = CUJugarPartida.ObtenirRanking();
            VistaRanking.MostrarRanking(infoR);
           
        } catch (noHiHaPartides ex) {
            VistaRanking.MostraMsg("No hi ha partides Jugades al sistema");
        }
              
    }
    
    public void PrOkRanking(){
        VistaRanking.tancar();
        MostrarMenu();
    }
    
    public void PrMoviment(String TipusMov){
        InfoMoviment infoM = CUJugarPartida.ferMoviment(TipusMov);
        VistaPartida.mostrarEstatPartida(infoM.puntuacio, infoM.caselles);
        if (infoM.estaAcabada){
            String msg;
            if (infoM.estaGuanyada) msg = "Partida guanyada! Amb una puntuacio de " + infoM.puntuacio;
            else msg = "Partida perduda";
            
            VistaPartida.tancar();
            MostrarMenuRanking(msg);
        }
    }
    
    public void PrFinalitzar(){
        VistaMenuRanking.tancar();
    }
    
    private void MostrarMenuRanking(String msg){
        VistaMenuRanking = new VeureRanking(new HandleSortirMenuRanking(),new HandleVeureRanking());
        VistaMenuRanking.MostraMsg(msg);
        VistaMenuRanking.Show();
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

        @Override
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
    
    private class HandleMoure implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            PrMoviment(VistaPartida.getTipusMov());
        } 
    }
    private class HandleVeureRanking implements ActionListener{
        public void actionPerformed(ActionEvent e){
            PrVeureRanking();
        }
    }
    
    private class HandleSortirMenuRanking implements ActionListener{
        public void actionPerformed(ActionEvent e){
            PrFinalitzar();
        }
    }
    
    
    private class HandleSortirRanking implements ActionListener{
        public void actionPerformed(ActionEvent e){
            PrOkRanking();
        }
    }
}
