/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.Factories;

import Domini.Model.Casella;
import Domini.Model.Iterador.Amunt;
import Domini.Model.Iterador.Avall;
import Domini.Model.Iterador.CasellaMatIterador;
import Domini.Model.Iterador.Dreta;
import Domini.Model.Iterador.Esquerra;
import java.util.Vector;

/**
 *
 * @author JOAN
 */
public class MatIteratorFactory {
    private static final MatIteratorFactory instance = new MatIteratorFactory();
    public static MatIteratorFactory getInstance(){return instance;}
    
    public CasellaMatIterador getCasellesMatIterador(String TipusMov,Vector<Vector<Casella>> MatCasella){
       if ("Amunt".equals(TipusMov)) return new Amunt(MatCasella); 
       else if ("Avall".equals(TipusMov)) return new Avall(MatCasella);
       else if ("Dreta".equals(TipusMov)) return new Dreta(MatCasella);
       else if ("Esquerra".equals(TipusMov)) return new Esquerra(MatCasella);
       else return null;
    }
    
}
