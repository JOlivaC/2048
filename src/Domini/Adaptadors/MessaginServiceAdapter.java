/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.Adaptadors;

import Domini.Locators.ServiceLocator;

/**
 *
 * @author JOAN
 */
public class MessaginServiceAdapter implements IMessaginServiceAdapter {

    @Override
    public void enviarMissatge(String email, String msg) {
        ServiceLocator.getInstance().find("ServeiXXXX").enviarMissatge(email, msg);
    }
    
}
