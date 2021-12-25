/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfacoursework.services;

import java.io.ByteArrayInputStream;
import mfacoursework.models.UserModel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TarekNagati
 */
public class AuthenticationServiceCallImplementationTest {
    
    public AuthenticationServiceCallImplementationTest() {
    }


    /**
     * Test of requestVerificationCode method, of class AuthenticationServiceCallImplementation.
     */
    @Test
    public void testRequestVerificationCodeSuccess() {
        System.out.println("requestVerificationCode");
        
        // This will be the "simulated" input from the user
        ByteArrayInputStream in = new ByteArrayInputStream("0000".getBytes());
        // put the input in the System in
        System.setIn(in);
        
        UserModel user = null;
        AuthenticationServiceCallImplementation instance = new AuthenticationServiceCallImplementation();
        boolean expResult = true;
        boolean result = instance.requestVerificationCode(user);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of requestVerificationCode method, of class AuthenticationServiceCallImplementation.
     */
    @Test
    public void testRequestVerificationCodeFail() {
        System.out.println("requestVerificationCode");
        
        ByteArrayInputStream in = new ByteArrayInputStream("9999".getBytes());
        System.setIn(in);
        
        UserModel user = null;
        AuthenticationServiceCallImplementation instance = new AuthenticationServiceCallImplementation();
        boolean expResult = false;
        boolean result = instance.requestVerificationCode(user);
        assertEquals(expResult, result);
    }
    
}
