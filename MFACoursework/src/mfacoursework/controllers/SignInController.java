
package mfacoursework.controllers;

import java.util.Scanner;
import mfacoursework.models.UserModel;
import mfacoursework.services.SignInServiceImplementation;
import mfacoursework.services.SignInServiceStrategy;

/**
 * Controller which will be used to start the Sign in
 * procedure. This will be done by requesting the username  
 * and password from the user. 
 * Afterwards the details will be
 * checked and the user should be authenticated using a 
 * different class.
 * 
 * @author TarekNagati
 */
public class SignInController {
    
    SignInServiceStrategy signInService = new SignInServiceImplementation(); // INJECT - An object to use checkCredentials Method
    
    Scanner sc = new Scanner(System.in);
    String input;
    
    /**
     * Main method of the Class for interacting with the user about the sign in process.
     * The method will request the username and password of the user and call the sign in 
     * method on that user.
     * 
     * @return true for successful signing in , false for unsuccessful
     */
    public boolean startSignProcess(){
        
        String username = requestUsername();
        String password = requestPassword();
        
        UserModel user = new UserModel(username,password);
        
        if(signIn(user)){
            return true;
        }else{
            return false;
        }
    }
    /**
     * Method will ask the user to provide a username
     * @return the username received
     */
    public String requestUsername(){
        String username = "";
        System.out.println("Please provide username: ");
        boolean providedUsername = false;
        do{
            input = sc.nextLine();
            if (!input.equals("")) {
                providedUsername = true;
                username = input;
            }else{
                System.out.println("Please provide your username: ");
            }
        }while(!providedUsername);
        return username;
    }
    
    /**
     * Method will ask the user to provide a password
     * @return the password received
     */
    public String requestPassword(){
        String password = "";
        System.out.println("Please provide password: ");
        boolean providedPassword = false;
        do{
            input = sc.nextLine();
            if (!input.equals("")) {
                providedPassword = true;
                password = input;
            }else{
                System.out.println("Please provide your password: ");
            }
        }while(!providedPassword);
        return password;
    }
    
    /**
     * Method will check the user's details which provided
     * in the UserModel class.
     * Call the SignIn Service using the userModel created.
     * @return true if the signing is successful
     */
    public boolean signIn(UserModel user){
        if(signInService.checkCredentials(user)){
            System.out.println("Credentials Correct!");
            return true;
        }else{
            System.out.println("Incorrect credentials!");
            return false;
        }
    }
}
