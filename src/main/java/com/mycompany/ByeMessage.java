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
public class ByeMessage implements Message {

    private String text;

    public ByeMessage(String text) {
        this.text = "Bye " + text;
    }

    public String getText() {
        return text;
    }

}
