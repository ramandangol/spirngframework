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
public class TodayFortune implements Fortune{

    @Override
    public String getFortune() {
        return "Today is your good luck";
     }
    
}
