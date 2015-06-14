/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.Locators;

/**
 *
 * @author JOAN
 */
import java.util.*;
import java.io.*;
 
public class LocatorReader {
  private String IP;
  private int PORT;
 
  public void Read() throws IOException {
        Properties p = new Properties();
        p.load(new FileInputStream("Address.ini"));
        IP = p.getProperty("IP");
        PORT = Integer.valueOf(p.getProperty("PORT"));
    }
  
  public String getIP(){return IP;}
  public int getPort(){return PORT;}
}
