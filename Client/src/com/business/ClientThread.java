/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.business;

import com.entity.Server;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Serializable;
import java.net.Socket;
import javax.swing.JTextArea;

/**
 *
 * @author tiny
 */
public class ClientThread implements Runnable, Serializable {

    //for I/O
    private DataInputStream dis;
    private DataOutputStream dos;
    private Socket socket;
    private Server server;
    private JTextArea txtContent;

    /*provide setter and getter here*/
    
    public ClientThread(Server server, JTextArea txtContent) {
        /*connect to server and get input/output stream here*/
        
    }

    @Override
    public void run() {
        /*receive message from server and output to txtContent*/

    }
    
    public void send(Object line) throws Exception {
        /*send a message line to server*/
    }

}