/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.raman;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Bladestorm
 */
public class SpringMainApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Sports sp = context.getBean("sportid",Sports.class);
        System.out.println(sp.getGameName());
        context.close();
    }
    
}
