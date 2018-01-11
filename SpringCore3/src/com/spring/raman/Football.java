/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.raman;

/**
 *
 * @author Bladestorm
 */
public class Football implements Sports{

    @Override
    public String getGameName() {
        return "This is Football";
    }

    @Override
    public String getFortune() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
