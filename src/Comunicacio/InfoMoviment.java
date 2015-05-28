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
public class InfoMoviment {
    public boolean estaGuanyada;
    public boolean estaAcabada;
    public int puntuacio;
    public Set<InfoCasella> caselles;
    public InfoMoviment(){}
    public InfoMoviment(boolean EstaGuanyada,boolean EstaAcabada,int Puntuacio,Set<InfoCasella> Caselles){
        estaGuanyada = EstaGuanyada;
        estaAcabada = EstaAcabada;
        puntuacio = Puntuacio;
        caselles = Caselles;
    }
}
