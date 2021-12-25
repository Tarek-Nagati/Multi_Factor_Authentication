
package mfacoursework.services;

import java.util.Scanner;
import mfacoursework.models.UserModel;

/**
 * Service implementation responsible for authenticating 
 * users via Call.
 * 
 * @author TarekNagati
 */
public class AuthenticationServiceCallImplementation implements AuthenticationServiceStrategy {

    /**
     * Authenticate the user by performing a call.
     * @param user to authenticate
     * @return authentication outcome
     */
    @Override
    public boolean authenticate(UserModel user) {
        System.out.println("Calling " + user.getPhoneNumber() + "...");
        
        boolean providedCode = false;
        do {
            providedCode = requestVerificationCode(user);
        } while (!providedCode);
        
        return true;
    }

    /**
     * Request the user to provided the verification code provided in the Call.
     * @param user to request message from
     * @return verification code provided outcome
     */
    @Override
    public boolean requestVerificationCode(UserModel user) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        
        System.out.println("(FAKE CODE -->), please enter: 0000");
        System.out.println(" ");
        
        System.out.println("We gave you a verification code during our call. \nPlease write it below: ");
        
        boolean providedCode=false;
        do{
            input = sc.nextLine();
            if (input.equals("0000")) {
                System.out.println("Great! Verification code accepted!");
                return true;
            }else{
                System.out.println("Sorry, we didn't get that, please write down the verification code");
                return false;
            }
        }while(!providedCode);
    }
    
}
