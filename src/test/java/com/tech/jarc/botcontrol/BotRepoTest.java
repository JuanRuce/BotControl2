/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.jarc.botcontrol;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jruiz
 */
public class BotRepoTest {
    
    public BotRepoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getControlRepo method, of class BotRepo.
     */
    @org.junit.Test
    public void testGetControlRepo() {
        System.out.println("getControlRepo");
        BotRepo instance = new BotRepo();
        int expResult = 4;
        int result = instance.getControlRepo();
        assertEquals(expResult, result);
        if (result != expResult){
         fail("The test case is a prototype.");
        }
    }
    
}
