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
public class InfoPartidaNova {
    public int puntuacio;
    public int millorPuntuacioJug;
    public Set<InfoCasella>  caselles;
    public InfoPartidaNova(){}
    public InfoPartidaNova(int Puntuacio,int MillorPuntuacioJug,Set<InfoCasella> Caselles){
        puntuacio = Puntuacio;
        millorPuntuacioJug = MillorPuntuacioJug;
        caselles = Caselles;
    }
}
