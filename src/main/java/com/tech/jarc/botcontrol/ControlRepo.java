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
public class ControlRepo {
    
    public int executeControlRepo(){
        double status = this.randomValue();
        int range = 0;
        
        if(status >= 0 && status <= 0.3){
            range = 0;
        }else{
           if(status >= 0.31 && status <= 0.5){
             range = 1;  
           }else{
               if(status >= 0.51 && status <= 0.7){
                   range = 2;
               }else{
                   if(status >= 0.71 && status <= 1.0){
                       range = 3;
                   }
               }
           }   
        }
        
        return 4;
    }
    
    private double randomValue(){
        double rand = 0;
        Math.random();
        System.out.println("Random is: "+rand);
        return rand;
    }
}
