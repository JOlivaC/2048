/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comunicacio;

/**
 *
 * @author JOAN
 */
public class InfoJugador implements Comparable{
    public String Nom;
    public float Puntuacio;
    public InfoJugador(){}
    public InfoJugador(String nom,float puntuacio){Nom = nom; Puntuacio = puntuacio;}
    


    @Override
    public int compareTo(Object o) {
        InfoJugador ij = (InfoJugador) o;
        
        if (Puntuacio > ij.Puntuacio) return 1;
        else return -1;
                

    }
}
