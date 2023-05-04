/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servertictactoe;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class ServerHandller extends  {
    DataInputStream dis;
    PrintStream ps;
    ServerSocket serverSocket ;
    Socket s;
    static Vector<ServerHandller> ClinetsNum = new Vector <ServerHandller>();
    
    
    
    ServerHandller() {
        try {
           
            serverSocket = new ServerSocket(5005);
            acceptClients();
        } catch (IOException ex) {
            Logger.getLogger(ServerHandller.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
}
    private void acceptClients(){
        new Thread() {
            @Override
            public void run() {
                while (true){
                    try {
                        s = serverSocket.accept();
                        //ClinetsNum.add(this);
                    } catch (IOException ex) {
                        Logger.getLogger(ServerHandller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

             
            }
        }.start();
    
    
    }
}

