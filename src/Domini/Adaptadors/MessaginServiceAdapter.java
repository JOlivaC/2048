/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.Adaptadors;

import Domini.Locators.ServiceLocator;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JOAN
 */
public class MessaginServiceAdapter implements IMessaginServiceAdapter {

    @Override
    public void enviarMissatge(String email, String msg) {
            /* Correm un thread per no esperar la conexió */
            new Thread(new SendMsg(email,msg)).start();
    }
    
    private class SendMsg implements Runnable{
        private String email;
        private String msg;
        public SendMsg(String email,String msg){this.email = email;this.msg = msg;}
        @Override
        public void run() {
            try {
                ServiceLocator.getInstance().find("ServeiXXXX").enviarMissatge(email, msg);
            } catch (IOException ex) {
                
            }
        }
        
    }
    
}
