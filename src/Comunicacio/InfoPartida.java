/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comunicacio;

import java.util.Set;

/**
 *
 * @author JOAN
 */
public class InfoPartida {
    public int puntuacio;
    public Set<InfoCasella> caselles;
    public InfoPartida(){}
    public InfoPartida(int Puntuacio,Set<InfoCasella> Caselles){
        puntuacio = Puntuacio;
        caselles = Caselles;
    }
}
