/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.Serializable;

/**
 *
 * @author tiny
 */
public class Server implements Serializable {
    
    // Declare instances
    private String host;
    private int port;

    // Contructors
    public Server() {
    }

    public Server(String host, int port) {
        this.host = host;
        this.port = port;
    }

    // Setter - Getter
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
    
}
