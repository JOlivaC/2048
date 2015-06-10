/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.Factories;

import Domini.Adaptadors.IMessaginServiceAdapter;
import Domini.Adaptadors.MessaginServiceAdapter;

/**
 *
 * @author JOAN
 */
public class AdaptersFactory {
    private static final AdaptersFactory instance = new AdaptersFactory();
    public static AdaptersFactory getInstance(){return instance;}
    
    private final IMessaginServiceAdapter i = new MessaginServiceAdapter();
    public IMessaginServiceAdapter getMessaginServiceAdapter(){
        return i;
    }
}
