/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

/**
 *
 * @author user
 */
public class MessageRendererErrorImpl implements MessageRenderer {

    private Message message;

    public MessageRendererErrorImpl(Message message) {
        this.message = message;
    }

    public void printMessage() {
        System.err.println(message.getText());

    }
}
