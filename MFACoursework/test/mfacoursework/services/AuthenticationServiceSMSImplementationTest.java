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
public class AuthenticationServiceSMSImplementationTest {
    
    public AuthenticationServiceSMSImplementationTest() {
    }

    /**
     * Test of requestVerificationCode method, of class AuthenticationServiceSMSImplementation.
     */
    @Test
    public void testRequestVerificationCodeSuccess() {
        System.out.println("requestVerificationCode");
        
        ByteArrayInputStream in = new ByteArrayInputStream("1111".getBytes());
        System.setIn(in);
        
        UserModel user = null;
        AuthenticationServiceSMSImplementation instance = new AuthenticationServiceSMSImplementation();
        boolean expResult = true;
        boolean result = instance.requestVerificationCode(user);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of requestVerificationCode method, of class AuthenticationServiceSMSImplementation.
     */
    @Test
    public void testRequestVerificationCodeFail() {
        System.out.println("requestVerificationCode");
        
        ByteArrayInputStream in = new ByteArrayInputStream("9999".getBytes());
        System.setIn(in);
        
        UserModel user = null;
        AuthenticationServiceSMSImplementation instance = new AuthenticationServiceSMSImplementation();
        boolean expResult = false;
        boolean result = instance.requestVerificationCode(user);
        assertEquals(expResult, result);
    }
    
}
