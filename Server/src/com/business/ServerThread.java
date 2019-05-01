/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.business;

import com.entity.Server;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/**
 *
 * @author tiny
 */
public class ServerThread implements Runnable {

   
    private ServerSocket server;
    private Server chatServer;
    private Socket socket; 

    public ServerThread(Server chatServer) {
        /*start the server and ready to receive connection from client*/
    }

    @Override
    public void run() {
        /*Wait for client's connection, accept the connection and handle the connection*/

    }
    
    /*contain the list of ClientHandler */
    public static HashMap<String,ClientHandler> clients = new HashMap<>();

}
