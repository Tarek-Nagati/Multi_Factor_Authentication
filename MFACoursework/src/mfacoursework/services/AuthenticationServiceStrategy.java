/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfacoursework.services;

import mfacoursework.models.UserModel;

/**
 * The Service responsible for authenticating users via
 * a authentication methods.
 * 
 * @author TarekNagati
 */
public interface AuthenticationServiceStrategy {
   
     
    /**
     * Method which will authenticate the user provided.
     * @param user to authenticate
     * @return authentication outcome
     */
    public boolean authenticate(UserModel user);
    
    
    /**
     * Request the Verification Code from the user, depends on
     * authentication implementation.
     * @param user to request code from
     * @return verification code provided
     */
    public boolean requestVerificationCode(UserModel user);
    
}
