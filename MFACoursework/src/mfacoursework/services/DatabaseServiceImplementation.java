
package mfacoursework.services;

import java.util.ArrayList;
import mfacoursework.enums.AuthenticationMethod;
import mfacoursework.models.UserModel;

/**
 * Service responsible for retrieving data from a
 * database.
 * (For coursework - this is a fake ArrayList holding Users data)
 * 
 * @author TarekNagati
 */
public class DatabaseServiceImplementation implements DatabaseServiceStrategy {

    /**
     * Method to retrieve all Users from the database.
     * @return List of Users
     */
    @Override
    public ArrayList<UserModel> getUsers() {
        // generate list of fake users (data)
        ArrayList<UserModel> users = new ArrayList<>();
        users.add(new UserModel("tarek","passwordtarek","12345678"));
        users.add(new UserModel("paul","passwordpaul","123456789"));
        users.add(new UserModel("chris","passwordchris","1234561"));
        return users;
    }
    
}
