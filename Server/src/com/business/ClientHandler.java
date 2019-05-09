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

  public Client getClient() {
    return client;
  }

  public void setTxtContent(JTextArea txtContent) {
    this.txtContent = txtContent;
  }

  /*provide the setter and getter here*/
  public ClientHandler(Socket socket) {
    this.socket = socket;

  }

  public ClientHandler(Socket socket, Client client) {
    this.socket = socket;
    this.client = client;

  }

  public ClientHandler(Socket socket, Client client, JTextArea txtContent) {
    this.socket = socket;
    this.client = client;
    this.txtContent = txtContent;
  }

  @Override
  public void run() {
    try {
      /*Handler connection for individual client connection*/
      dis = new DataInputStream(socket.getInputStream());
      dos = new DataOutputStream(socket.getOutputStream());
      while (true) {
        Object line = dis.readUTF();
        if (line != null) {
          txtContent.append("\n" + client.getUsername() + ":" + line);
        }
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public void send(Object line) throws Exception {
    /*send message to client*/
    dos.writeUTF("Server:" + line.toString());
    txtContent.append("\nMe:" + line);
  }

}
