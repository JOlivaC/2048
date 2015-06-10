/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.Model.Ordenacio;

import Domini.Model.Jugador;

/**
 *
 * @author JOAN
 */
public class OrdPuntMillor extends OrdenacioStrategy{

    @Override
    protected float ObtenirPuntuacio(Jugador j) {
       return j.getMillorPuntuacio();
    }
    
}
