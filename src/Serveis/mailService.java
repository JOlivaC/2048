/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serveis;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JOAN
 */
public class mailService {
    private String IP;
    private int port;
    public mailService(String IP,int port){
        this.IP = IP;
        this.port = port;
    }
    public void enviarMissatge(String email,String msg) throws IOException{
	Socket clientSocket; 
        clientSocket = new Socket();
        clientSocket.connect(new InetSocketAddress(IP, port), 1000);
	DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
	outToServer.writeBytes(email + "\n" + msg);
	clientSocket.close();	
    }
	
}

