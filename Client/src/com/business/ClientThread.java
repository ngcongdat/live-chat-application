/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.business;

import com.entity.Server;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    try {
      this.txtContent = txtContent;
      this.server = server;
      /*connect to server and get input/output stream here*/
      socket = new Socket(server.getHost(), server.getPort());
      dis = new DataInputStream(socket.getInputStream());
      dos = new DataOutputStream(socket.getOutputStream());
    } catch (IOException ex) {
      Logger.getLogger(ClientThread.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  @Override
  public void run() {
    /*receive message from server and output to txtContent*/
    try {
      while (true) {
        Object line = dis.readUTF();
        if (line != null) {
          txtContent.append("\n" + line);
        }
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public void send(Object line) throws Exception {
    /*send a message line to server*/
    dos.writeUTF(line.toString());
    txtContent.append("\nMe:" + line);
  }

}
