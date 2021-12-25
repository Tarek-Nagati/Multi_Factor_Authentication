
package mfacoursework.controllers;

import java.util.Scanner;
import mfacoursework.enums.AuthenticationMethod;
import mfacoursework.models.UserModel;
import mfacoursework.services.AuthenticationServiceCallImplementation;
import mfacoursework.services.AuthenticationServiceSMSImplementation;
import mfacoursework.services.DatabaseServiceImplementation;
import mfacoursework.services.SignInServiceImplementation;
import mfacoursework.services.AuthenticationServiceStrategy;
import mfacoursework.services.DatabaseServiceStrategy;
import mfacoursework.services.SignInServiceStrategy;

/**
 * Controller responsible for interacting with the user regarding their authentication
 * by requesting the preferred authentication method.
 * User should choose between SMS or Call and the correct functionality
 * should authenticate the user.
 * 
 * @author TarekNagati
 */
public class AuthenticationController {
    
    //DatabaseServiceStrategy database = new DatabaseServiceImplementation();
    
    /**
     * create object from the AuthenticationServiceStrategy Interface 
     * to hold the implementation that will be used to authenticate the user
     */
    AuthenticationServiceStrategy authService = null;
    
    Scanner sc = new Scanner(System.in);
    String input;
    
    /**
     * Main function of the  Class where the Authentication process should
     * start from.
     * The user's details are loaded from the SignIn Service where they have been saved after
     * signing in and then the user is asked to choose an authentication method
     * and the correct functionality should be used.
     * @return 
     */
    public boolean startAuthenticationProcess(){
        
        // get user that has successfully entered the username and password to obtain phone number
        UserModel tempUser = SignInServiceImplementation.getTempUser();    
        
        // use enum to have a varibale store the authentication method
        AuthenticationMethod authenticationMethodChosen; 
        // request the User to choose preferred Authentiction method
        authenticationMethodChosen = requestAuthenticationMethod();
        
        return authenticate(authenticationMethodChosen,tempUser);
    }
    
    /**
     * Method to request from the User the authentication method they prefer to 
     * be authenticated by. 
     * Print message to the user and request input. (SMS or Call)
     * 
     * @return enum of Authentication Method
     */
    public AuthenticationMethod requestAuthenticationMethod(){
        
        System.out.println("Please choose Authentication Method: (Choose a number) \n 1.SMS \n 2.CALL");
       
        boolean hasSelectedMethod = false;
        
        do{
            input = sc.nextLine();
            switch (input) {
                case "1":
                    hasSelectedMethod = true;
                    return AuthenticationMethod.SMS;
                case "2":
                    hasSelectedMethod = true;
                    return AuthenticationMethod.CALL;
                default:
                    System.out.println("Sorry I didn't get that, please try again. \n Select 1(SMS) or 2(CALL).");
                    break;
            }
        }while(!hasSelectedMethod);
        return null;
    }
    
    /**
     * Method which will authenticate the user after selecting the
     * preferred authentication method.
     * Based on the method selected the correct authentication Service is called and created
     * and the authentication takes place.
     * 
     * @param method authentication method preferred
     * @param tempUser which has the user's phone number, 
     * to send a verification code to authenticate
     * @return 
     */
    public boolean authenticate(AuthenticationMethod method, UserModel tempUser){
        
        System.out.println("Authentication Method Selected: " + method.label);
        
        switch(method){
            case SMS:
                authService = new AuthenticationServiceSMSImplementation();
                break;
            case CALL:
                authService = new AuthenticationServiceCallImplementation();
                break;
        }
        return authService.authenticate(tempUser);
    }
    
}