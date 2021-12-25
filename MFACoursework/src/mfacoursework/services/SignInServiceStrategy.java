
package mfacoursework.services;
import mfacoursework.models.UserModel;

/**
 * Service responsible for handling the user credentials
 * and executing the sign-in functionality.
 * 
 * @author TarekNagati
 */
public interface SignInServiceStrategy {
    
    public boolean checkCredentials(UserModel user);
    
}
