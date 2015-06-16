/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.Model;

import Comunicacio.InfoCasella;
import Comunicacio.InfoMoviment;
import Comunicacio.InfoPartida;
import Comunicacio.InfoPartidaNova;
import Domini.Factories.MatIteratorFactory;
import Domini.Model.Iterador.CasellaMatIterador;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Vector;

/**
 *
 * @author JOAN
 */
public class Partida {
    private int idPartida;
    private boolean estaAcabada;
    private boolean estaGuanyada;
    private int puntuacio;
    private Jugador jugadorPartidaActual;
    private Jugador jugadorPartidaJugada;
    private Set<Casella> casella;

    public Partida(int id, Jugador jugador) {
        jugadorPartidaActual = jugador;
        idPartida = id;
        puntuacio = 0;
        estaAcabada = false;
        estaGuanyada = false;
        this.creaCaselles();
    }
    
    
    private void creaCaselles(){
        this.casella = new HashSet();
        for(int numFila = 1; numFila <= 4; ++numFila)
            for (int numColumna = 1; numColumna <=4; ++numColumna) {
                Casella c = new Casella(numFila,numColumna,this);
                this.casella.add(c);
            }
        
        this.setNombreCasellesBuides(2);
    }
    
    private void setNombreCasellesBuides(int quantes){
        List<Casella> casellesBuides = getCasellesSenseNumero();
        if (quantes <= casellesBuides.size()){
            for (int i = 0; i < quantes; ++i) {
                int index = new Random().nextInt(casellesBuides.size());
                casellesBuides.get(index).initNumero();
                casellesBuides.remove(index);
            }
        }
    }
    
    private List<Casella> getCasellesSenseNumero(){
        List<Casella> result = new ArrayList();
        for (Casella c: this.casella) {
            if (!c.teNumero()) result.add(c);
        }
        return result;
    }
    
    private List<Casella> getCasellesAmbNumero(){
        List<Casella> result = new ArrayList();
        for (Casella c: this.casella) {
            if (c.teNumero()) result.add(c);
        }
        return result;
    }
    
    /* Canviat el tipus per array de java */
    public Casella[][] getMatriuCaselles(){
        Casella[][] result = new Casella[4][4];
        for (Casella c: this.casella) {
            result[c.getFila()-1][c.getColumna()-1] = c;
        }
        return result;
    }
    
    private InfoPartida getInfo(){
        Set<InfoCasella> infoCaselles = new HashSet();
        List<Casella> casellesAmbNumero = getCasellesAmbNumero();
        for (Casella c: casellesAmbNumero) infoCaselles.add(c.getInfo());
        return new InfoPartida(this.puntuacio,infoCaselles);
    }
    
    public InfoPartidaNova getInfoPartidaNova(){
        InfoPartida infoP = getInfo();
        return new InfoPartidaNova(infoP.puntuacio,this.jugadorPartidaActual.getMillorPuntuacio(),infoP.caselles);
    }
    
    private InfoMoviment getInfoMoviment(){
        InfoPartida infoP = getInfo();
        return new InfoMoviment(this.estaGuanyada,this.estaAcabada,infoP.puntuacio,infoP.caselles);
    }
    
    public InfoMoviment realitzaMoviment(String tipusMov){
        ferMoviment(tipusMov);
        ferComprovacions();
        return getInfoMoviment();
    }
    
    private void ferMoviment(String tipusMov){
        Casella[][] matCasella = getMatriuCaselles();
        Set<Vector<Casella>> elements = separar(matCasella,tipusMov);
        for (Vector<Casella> linea: elements) {
            
            moure(toVec(linea));
        }
    }
    /* Operacio d'ajuda per transformar Vector a array */
    private static Casella[] toVec(Vector<Casella> in){
        Casella[] ret = new Casella[in.size()];
        for (int i = 0; i < in.size(); i ++){
            ret[i] = in.get(i);
        }
        return ret;
    }
    
    public int getPuntuacio(){
        return this.puntuacio;
    }
    
    private void ferComprovacions(){
        comprovaPartidaGuanyada();
        if (this.estaGuanyada) this.jugadorPartidaActual.enviarMissatge(this.idPartida, this.puntuacio);
        else {
            this.comprovaPartidaPerduda();
            if (this.estaAcabada) finalitzarPartida();
            else preparaSeguentMoviment();
        }
    }
    
    private void comprovaPartidaGuanyada(){
        if (existeixCasellaNumero(2048)) {
            this.estaAcabada = true;
            this.estaGuanyada = true;
        }
    }
    
    private void comprovaPartidaPerduda(){
        List<Casella> casellesSenseNum = getCasellesSenseNumero();
        if (casellesSenseNum.size() == 0) {
            boolean movPossible = false;
            boolean colParell = false;
            Casella[][] matCasella= getMatriuCaselles();
            for (int i = 0; i < matCasella.length && !movPossible; ++i) {
                int j = 0;
                for (; j < matCasella[0].length && !movPossible; j+=2) {
                    if ((j-1 > 0) && matCasella[i][j].MateixNumero(matCasella[i][j-1])) movPossible = true;
                    if ((j+1 < matCasella[0].length) && matCasella[i][j].MateixNumero(matCasella[i][j+1])) movPossible = true;
                    if ((i-1 > 0) && matCasella[i][j].MateixNumero(matCasella[i-1][j])) movPossible = true;
                    if ((i+1 < matCasella[0].length) && matCasella[i][j].MateixNumero(matCasella[i+1][j])) movPossible = true;
                }
                if (colParell) j = 1;
                else j = 0;
                colParell = !colParell;
            }
            this.estaAcabada = !movPossible;
        }
    }
    
    private void finalitzarPartida() {
        this.jugadorPartidaActual.acabarPartida();
        this.jugadorPartidaJugada = jugadorPartidaActual;
        this.jugadorPartidaActual = null;
    }
    
    private void preparaSeguentMoviment() {
        setNombreCasellesBuides(1);
    }
    
    private boolean existeixCasellaNumero(int numero){
        List<Casella> casellesAmbNumero = getCasellesAmbNumero();
        for (Casella c : casellesAmbNumero)
            if (c.getNumero() == numero) return true;
        return false;
    }
    
    private void mouCasella(Casella c1,Casella c2){
        Integer i = c1.getNumero();
        Integer j = c2.getNumero();
        c1.setNumero(j);
        c2.setNumero(i);
    }
    
    private void moure(Casella[] linea){
        boolean sumat = false;
        for (int i = 1; i < linea.length; ++i) {
            if (linea[i].teNumero()) {
                boolean fi = false;
                int k = i-1;
                while (!fi) {
                    if (linea[k].teNumero()) {
                        fi = true;
                        if (linea[i].MateixNumero(linea[k]) && !sumat) {
                            this.puntuacio = puntuacio + linea[i].getNumero() * 2;
                            linea[k].setNumero(linea[k].getNumero()*2);
                            linea[i].setNumeroBuit();
                            sumat = true;
                        }
                        else {
                            mouCasella(linea[i],linea[k+1]);
                            sumat = false;
                        }
                    }
                    if (!linea[k].teNumero() && k == 0) {
                        fi = true;
                        mouCasella(linea[i],linea[k]);
                        sumat = false;
                    }
                    k--;
                }
                
            }

        }
    }
    
    private Set<Vector<Casella>> separar(Casella[][] matCasella,String tipusMov) {
        Vector<Vector<Casella>> matVecCasella = new Vector(4);
        /* Transformar Array a tipus de retorn */
        for (int i = 0; i < matCasella.length; ++i) {
            Vector<Casella> colVec = new Vector(4);
            for (int j = 0; j < matCasella[0].length; ++j) {
                colVec.add(j, matCasella[i][j]);
            }
            matVecCasella.add(i, colVec);
        }
        CasellaMatIterador myCasMatIterator= MatIteratorFactory.getInstance().getCasellesMatIterador(tipusMov, matVecCasella);
        myCasMatIterator.primer();
        boolean fiConjunts = false;
        Set<Vector<Casella>> ret = new HashSet();
        while(!fiConjunts) {
            boolean fiElements = false;
            Vector<Casella> linea = new Vector(4);
            int i = 0;
            while (!fiElements) {
                Casella cas = myCasMatIterator.getElement();
                linea.add(i,cas);
                i++;
                fiElements = myCasMatIterator.segY();
            }
            myCasMatIterator.primerY();
            fiConjunts = myCasMatIterator.segX();
            ret.add(linea);
        }
        
        return ret;
    }

    /**
     * @param estaAcabada the estaAcabada to set
     */
    public void setEstaAcabada(boolean estaAcabada) {
        this.estaAcabada = estaAcabada;
    }

    /**
     * @param estaGuanyada the estaGuanyada to set
     */
    public void setEstaGuanyada(boolean estaGuanyada) {
        this.estaGuanyada = estaGuanyada;
    }

    /**
     * @param puntuacio the puntuacio to set
     */
    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }
    
    public void setCaselles(Set<Casella> sc){
        this.casella = sc;
    }
    
    
    
}
