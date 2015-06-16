/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.Model;

import Comunicacio.InfoCasella;
import java.util.Random;

/**
 *
 * @author JOAN
 */
public class Casella {
    private Integer numero;
    private int numeroFila;
    private int numeroColumna;
    private Partida partida;
    
    public Casella(int numFila,int numColumna,Partida p){
        this.numeroFila = numFila;
        this.numeroColumna = numColumna;
        this.partida = p;
        this.numero = null;
    }
    
    public void initNumero(){
        int num = new Random().nextInt(4) + 1;
        if (num%2 != 0) ++num;
        this.numero = num;
    }
    
    public Integer getNumero(){return this.numero;}
    
    public void setNumero(Integer numero) {this.numero = numero;}
    
    public void  setNumeroBuit() {this.numero = null;}
    
    public Integer getFila(){return this.numeroFila;}
    
    public Integer getColumna(){return this.numeroColumna;}
    
    public InfoCasella getInfo(){
        return new InfoCasella(this.numeroFila,this.numeroColumna,this.numero);
    }
    /* operacio delegada per comprovar si dues caselles tenen el mateix numero */
    public boolean MateixNumero(Casella c){
        int i = this.numero;
        int j = c.numero;
        return i == j;
    }
    
    public boolean teNumero(){
        return (this.numero != null);
    }
}
