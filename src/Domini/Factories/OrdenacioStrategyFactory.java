/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.Factories;

import Domini.Model.Ordenacio.IOrdenacioStrategy;
import Domini.Model.Ordenacio.OrdPuntMillor;

/**
 *
 * @author JOAN
 */
public class OrdenacioStrategyFactory {
    private static OrdenacioStrategyFactory instance = new OrdenacioStrategyFactory();
    public static OrdenacioStrategyFactory getInstance(){return instance;}
    
    public IOrdenacioStrategy creaOrdenacioPuntuacio(){
        return new OrdPuntMillor();
    }
}
