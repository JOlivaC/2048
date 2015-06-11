/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domini.DataInterface.CtrlUsuariRegistrat;
import Domini.Model.UsuariRegistrat;

/**
 *
 * @author JOAN
 */
public class DataUsuariRegistrat implements CtrlUsuariRegistrat {

    @Override
    public UsuariRegistrat getUsuariRegistrat(String UserN) {
        return Stubs.FabricaStubs.StubUsuariRegistrat();        
    }
    
}
