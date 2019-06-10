/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author user
 */
public class Main {
   public static void main(String[] arg) {
       ApplicationContext context = new
           ClassPathXmlApplicationContext("com.mycompany\\context.xml");
       IndependentMessageRenderer rendererIndependency = context.getBean(IndependentMessageRenderer.class);
       rendererIndependency.print();
   }
}
