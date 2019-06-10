/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author user
 */
public class IndependentMessageRenderer {

    @Autowired
    private MessageRenderer renderer;

    public void print() {
        renderer.printMessage();

    }
}
