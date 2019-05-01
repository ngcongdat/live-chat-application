/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.business;

import com.entity.Client;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.swing.JTextArea;

/**
 *
 * @author tiny
 */
public class ClientHandler implements Runnable {

    private DataInputStream dis;
    private DataOutputStream dos;
    private Socket socket;
    private Client client;
    private JTextArea txtContent;

    /*provide the setter and getter here*/
    
     public ClientHandler(Socket socket) {
        this.socket = socket;
         
    }
    
     public ClientHandler(Socket socket,Client client ) {
        this.socket = socket;
        this.client = client;
         
    }
     
    public ClientHandler(Socket socket,Client client,JTextArea txtContent) {
        this.socket = socket;
        this.client = client;
        this.txtContent = txtContent;
    }
    
    @Override
    public void run() {
        /*Handler connection for individual client connection*/
    }

    public void send(Object line) throws Exception {
        /*send message to client*/
    }
    
}
