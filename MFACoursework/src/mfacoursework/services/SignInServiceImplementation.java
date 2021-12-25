
package mfacoursework.services;

import java.util.ArrayList;
import mfacoursework.enums.AuthenticationMethod;
import mfacoursework.models.UserModel;

/**
 *Service Sign-in Implementation where the handling of the 
 * user details is achieved and checked if correct by comparing
 * with the data acquired from database.
 * 
 * @author TarekNagati
 */
public class SignInServiceImplementation implements SignInServiceStrategy {
    
    // INJECTED DATABASE SERVICE
    DatabaseServiceStrategy database = new DatabaseServiceImplementation();
    
    /**
     * Temporary user details that have successfully entered username and password.
     * Hold details while waiting for verification using MFA.
     */
    static UserModel tempUser; // global static variable

    /**
     * Checks user's credentials against the Database and determine if the users exists and
     * has provided the correct information.
     * @param user to check
     * @return sign-in outcome
     */
    @Override
    public boolean checkCredentials(UserModel user) {
        
        ArrayList<UserModel> users = database.getUsers();
        
        boolean foundUser = false;
        
        for (UserModel userFromDatabase : users){ //look for each User in the Arraylist (which is from database) if exists
            if(userFromDatabase.getUsername().equals(user.getUsername())&& // compare userFromDatabase with user
                    userFromDatabase.getPassword().equals(user.getPassword())){
                foundUser = true;
                
                tempUser = new UserModel(user.getUsername(),user.getPassword(),
                        userFromDatabase.getPhoneNumber());
            }
        }
        return foundUser;
    }
    
    /**
     * After the user has signed in, receive the user that has been signed in. 
     * @return 
     */
    public static UserModel getTempUser(){
        return tempUser;
    }
    
}
