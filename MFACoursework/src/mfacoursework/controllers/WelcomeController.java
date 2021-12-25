
package mfacoursework.controllers;

import java.util.Scanner;

/**
 * Controller which will check if the user wants to
 * connect to the system.
 * 
 * @author TarekNagati
 */
public class WelcomeController {
    
    public String welcome(){
        Scanner sc = new Scanner(System.in);
        String input = "";
        
        System.out.println("Welcome! Would you like to sign in? (y/n)");
        boolean startSignIn = false;
        
        do{
            input = sc.nextLine(); // GET USER INPUT
            if (input.equals("y") || input.equals("Y")) { // CHECK IF USER INPUT IS Y
                startSignIn = true;
                return "signin";
            }else if(input.equals("n") || input.equals("N")){ // CHECK IF USER INPUT IS N
                return "stop_signin";
            }else{ // IF USER INPUT IS SOMETHING ELSE
                System.out.println("Sorry I didn't get that, would you like to sign in? (y/n)");
            }
        }while(!startSignIn);
        return "signin";
    }
}


