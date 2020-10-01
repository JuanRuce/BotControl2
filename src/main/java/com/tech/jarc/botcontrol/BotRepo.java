/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.jarc.botcontrol;

/**
 *
 * @author jruiz
 */
public class BotRepo {
    
    ControlRepo repo;
    public BotRepo(){
        repo = new ControlRepo();
    }
    
    public int getControlRepo(){
        int crp = 0;
        crp = repo.executeControlRepo();
        System.out.println("Repo is: "+crp);
        return crp;
    }
}
