/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfacoursework.controllers;

import java.io.ByteArrayInputStream;
import mfacoursework.enums.AuthenticationMethod;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TarekNagati
 */
public class AuthenticationControllerTest {

    /**
     * Test of requestAuthenticationMethod method, of class AuthenticationController.
     */
    @Test
    public void testRequestAuthenticationMethodforSMS() {
        System.out.println("requestAuthenticationMethod: Test (1) for SMS. ");

        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes()); // simulate keybaord - user input
        System.setIn(in);
        
        AuthenticationController instance = new AuthenticationController();
        AuthenticationMethod expResult = AuthenticationMethod.SMS;
        AuthenticationMethod result = instance.requestAuthenticationMethod();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of requestAuthenticationMethod method, of class AuthenticationController.
     */
    @Test
    public void testRequestAuthenticationMethodforCall() {
        System.out.println("requestAuthenticationMethod: Test (2) for CALL.");

        ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
        System.setIn(in);
        
        AuthenticationController instance = new AuthenticationController();
        AuthenticationMethod expResult = AuthenticationMethod.CALL;
        AuthenticationMethod result = instance.requestAuthenticationMethod();
        assertEquals(expResult, result);
    }
   
}
