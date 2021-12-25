/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfacoursework.services;

import java.util.Scanner;
import mfacoursework.models.UserModel;

/**
 * Service implementation responsible for authenticating users
 * via SMS.
 * @author TarekNagati
 */
public class AuthenticationServiceSMSImplementation implements AuthenticationServiceStrategy{

    /**
     * Authenticate the user by sending an SMS.
     * @param user to authenticate
     * @return authentication outcome
     */
    @Override
    public boolean authenticate(UserModel user) {
        System.out.println("Sending message to " + user.getPhoneNumber() + "..."); 
        
        boolean providedCode = false;
        do {
            providedCode = requestVerificationCode(user);
        } while (!providedCode);
        
        return true;
    }
    
    /**
     * Request the user to provided the verification code sent by SMS.
     * @param user to request message from
     * @return verification code provided outcome
     */
    @Override
    public boolean requestVerificationCode(UserModel user) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        
        System.out.println("(FAKE CODE -->), please enter: 1111");
        System.out.println(" ");
        System.out.println("We have sent you a verification code via SMS. \nPlease write it below: ");

        boolean providedCode=false;
        do{
            input = sc.nextLine();
            if (input.equals("1111")) {
                System.out.println("Great! Verification code accepted!");
                return true;
            }else{
                System.out.println("Sorry, we didn't get that, please write down the verification code");
                return false;
            }
        }while(!providedCode);
    }
    
    
    
}
