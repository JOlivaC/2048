/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.Locators;

import Serveis.mailService;

/**
 *
 * @author JOAN
 */
public class ServiceLocator {
    private static ServiceLocator instance = new ServiceLocator();
    public static ServiceLocator getInstance(){return instance;}
    
    public mailService find(String nom){
        return new mailService() {

            @Override
            public void enviarMissatge(String email, String msg) {
                
            }
        };
    }
    

}
