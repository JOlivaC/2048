/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.DataInterface;

import Domini.Factories.OrdenacioStrategyFactory;
import Domini.Model.Ordenacio.IOrdenacioStrategy;

/**
 *
 * @author JOAN
 */
public interface CtrlOrdenacioPuntuacio {
    public IOrdenacioStrategy get();
}
