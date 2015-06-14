/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.Locators;

import Serveis.mailService;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JOAN
 */
public class ServiceLocator {
    private static ServiceLocator instance = new ServiceLocator();
    public static ServiceLocator getInstance(){return instance;}
    private static final String DEFAULT_IP = "localhost";
    private static final int DEFAULT_Port = 1234;
    public mailService find(String nom){
        String IP;
        int Port;
        LocatorReader LR = new LocatorReader();
        try {
            LR.Read();
            IP = LR.getIP();
            Port = LR.getPort();
        } catch (IOException ex) {
            IP = DEFAULT_IP;
            Port = DEFAULT_Port;
        }
        return new mailService(IP,Port);
    }
    
}
