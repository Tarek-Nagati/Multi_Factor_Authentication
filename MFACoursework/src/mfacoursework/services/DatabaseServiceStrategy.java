
package mfacoursework.services;

import java.util.ArrayList;
import mfacoursework.models.UserModel;

/**
 * Service responsible for retrieving data from
 * a database.
 * (Data could be retrieved from various sources such as
 * Firebase or local storage etc.)
 * 
 * @author TarekNagati
 */
public interface DatabaseServiceStrategy {
    
     /**
     * Method to retrieve all Users from the database.
     * @return List of Users
     */
    public ArrayList<UserModel> getUsers();
    
}
