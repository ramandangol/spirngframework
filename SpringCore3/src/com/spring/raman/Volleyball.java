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
public class Volleyball implements Sports {

    private Fortune fortuneService;

    public Volleyball(Fortune thefortuneService) {
        fortuneService = thefortuneService;

    }

    @Override
    public String getGameName() {
        return "This is Volleyball Game";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

}
