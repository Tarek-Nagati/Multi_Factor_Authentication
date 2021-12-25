/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfacoursework.services;

import mfacoursework.models.UserModel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TarekNagati
 */
public class SignInServiceImplementationTest {
   

    /**
     * Test of checkCredentials method, of class SignInServiceImplementation.
     * correct username and correct password
     */
    @Test
    public void testCheckCredentialsSuccess() {
        System.out.println("checkCredentials: correct username and password");
        UserModel user = new UserModel("paul","passwordpaul","123456789");
        SignInServiceImplementation instance = new SignInServiceImplementation();
        boolean expResult = true;
        boolean result = instance.checkCredentials(user);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkCredentials method, of class SignInServiceImplementation.
     * incorrect username and correct password
     */
    @Test
    public void testCheckCredentialsWrongUsername() {
        System.out.println("checkCredentials: wrong username and correct password");
        UserModel user = new UserModel("wrong_username","passwordpaul","123456789");
        SignInServiceImplementation instance = new SignInServiceImplementation();
        boolean expResult = false;
        boolean result = instance.checkCredentials(user);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkCredentials method, of class SignInServiceImplementation.
     * correct username and incorrect password
     */
    @Test
    public void testCheckCredentialsWrongPassword() {
        System.out.println("checkCredentials: correct username and wrong password");
        UserModel user = new UserModel("paul","wrong_password","123456789");
        SignInServiceImplementation instance = new SignInServiceImplementation();
        boolean expResult = false;
        boolean result = instance.checkCredentials(user);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkCredentials method, of class SignInServiceImplementation.
     * incorrect username and incorrect password
     */
    @Test
    public void testCheckCredentialsWrongBothCredentials() {
        System.out.println("checkCredentials: wrong username and wrong password");
        UserModel user = new UserModel("wrong_username","wrong_password","123456789");
        SignInServiceImplementation instance = new SignInServiceImplementation();
        boolean expResult = false;
        boolean result = instance.checkCredentials(user);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkCredentials method, of class SignInServiceImplementation.
     * This test will fail due to the NullPointerException error. 
     * username and  password are NOT NULL
     */
    @Test
    public void testCheckCredentialsNull() {
        System.out.println("checkCredentials: null object");
        UserModel user = null;
        SignInServiceImplementation instance = new SignInServiceImplementation();
        boolean expResult = false;
        boolean result = instance.checkCredentials(user);
        assertEquals(expResult, result);
    }
    
}
