package mfacoursework;

import mfacoursework.controllers.AuthenticationController;
import mfacoursework.controllers.SignInController;
import mfacoursework.controllers.WelcomeController;

/**
 * Launcher for the whole application; Creates objects from  
 * the corresponding classes to run all the required functions.
 * The launcher will:
 * - Welcoming the user to start Sign in process 
 * - The Sign in process will request the username and the password 
 *   and check the user's data
 * - The authentication process starts the second authentication factor   
 * 
 * @author TarekNagati
 */
public class Launcher {

    /**
     * The main method where the application starts.
     * @param args 
     */
    public static void main(String[] args) {

        WelcomeController welcomeController = new WelcomeController();

        String choice = welcomeController.welcome();

        switch (choice) {
            case "signin":
                singInProcess();
                break;
            case "stop_signin":
                System.out.println("Okay then, goodbye!");
                break;
            case "":
                System.out.println("Error");
                break;
            default:
                break;
        }
    }
    
    /**
     * Start sign-in process until user is signed in. the method creates an
     * object from the SignInController class 
     */
    public static void singInProcess() {
        SignInController signInController = new SignInController();
        
        boolean signedIn = false;
        do {
            signedIn = signInController.startSignProcess();
        } while (!signedIn);
        
        if(signedIn){
            authenticationProcess();
        }
    }
    
    /**
     * The authentication process starts the second authentication factor 
     * the method creates an object from the AuthenticationController class
     */
    public static void authenticationProcess(){
        AuthenticationController authenticationController = new AuthenticationController();
        
        boolean authenticated = false;
        do {
            authenticated = authenticationController.startAuthenticationProcess();
        } while (!authenticated);
        
        System.out.println("User authenticated successfully! Welcome!");
    }

}
