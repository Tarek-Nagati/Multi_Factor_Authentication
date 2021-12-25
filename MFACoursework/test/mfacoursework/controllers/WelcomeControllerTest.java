/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfacoursework.controllers;

import java.io.ByteArrayInputStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TarekNagati
 */
public class WelcomeControllerTest {
    
    public WelcomeControllerTest() {
    }
    
    /**
     * Test of welcome method, of class WelcomeController.
     */
    @Test
    public void testWelcomeForSignIn1() {
        System.out.println("welcome");

        ByteArrayInputStream in = new ByteArrayInputStream("y".getBytes());
        System.setIn(in);
        
        WelcomeController instance = new WelcomeController();
        String expResult = "signin";
        String result = instance.welcome();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of welcome method, of class WelcomeController.
     */
    @Test
    public void testWelcomeForSignIn2() {
        System.out.println("welcome");

        ByteArrayInputStream in = new ByteArrayInputStream("Y".getBytes());
        System.setIn(in);
        
        WelcomeController instance = new WelcomeController();
        String expResult = "signin";
        String result = instance.welcome();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of welcome method, of class WelcomeController.
     */
    @Test
    public void testWelcomeForStopSignIn1() {
        System.out.println("welcome");

        ByteArrayInputStream in = new ByteArrayInputStream("n".getBytes());
        System.setIn(in);
        
        WelcomeController instance = new WelcomeController();
        String expResult = "stop_signin";
        String result = instance.welcome();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of welcome method, of class WelcomeController.
     */
    @Test
    public void testWelcomeForStopSignIn2() {
        System.out.println("welcome");

        ByteArrayInputStream in = new ByteArrayInputStream("N".getBytes());
        System.setIn(in);
        
        WelcomeController instance = new WelcomeController();
        String expResult = "stop_signin";
        String result = instance.welcome();
        assertEquals(expResult, result);
    }
    
}
