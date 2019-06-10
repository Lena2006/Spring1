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
public class HelloMessage implements Message {
      private String text;

    public HelloMessage(String text) {
        this.text = "Hello " + text;
    }

    public String getText() {
        return text;
    }
  
}
