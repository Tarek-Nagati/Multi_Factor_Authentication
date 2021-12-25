
package mfacoursework.models;

import mfacoursework.enums.AuthenticationMethod;

/**
 * The UserModel class (user's data) that will hold the
 * required details of the User such as:
 * - username
 * - password
 * - phoneNumber
 * 
 * @author TarekNagati
 */
public class UserModel {
    
    private String username;
    private String password;
    private String phoneNumber;
    
    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserModel(String username, String password, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
