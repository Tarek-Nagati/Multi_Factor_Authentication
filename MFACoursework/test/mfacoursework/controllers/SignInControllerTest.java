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
public class SignInControllerTest {

    /**
     * Test of requestUsername method, of class SignInController.
     */
    @Test
    public void testRequestUsername() {
        System.out.println("requestUsername");

        ByteArrayInputStream in = new ByteArrayInputStream("testusername".getBytes());
        System.setIn(in);
        
        SignInController instance = new SignInController();
        String expResult = "testusername";
        String result = instance.requestUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of requestPassword method, of class SignInController.
     */
    @Test
    public void testRequestPassword() {
        System.out.println("requestPassword");

        ByteArrayInputStream in = new ByteArrayInputStream("testpassword".getBytes());
        System.setIn(in);
        
        SignInController instance = new SignInController();
        String expResult = "testpassword";
        String result = instance.requestPassword();
        assertEquals(expResult, result);
    }
    
}
