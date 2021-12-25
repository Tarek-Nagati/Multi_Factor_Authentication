
package mfacoursework.enums;

/**
 * Custom data type (enum) which will hold all the possible 
 * authentication methods available for a user.
 * 
 * @author TarekNagati
 */
public enum AuthenticationMethod {
    
    SMS("sms"),
    CALL("call");

    public final String label;
    
    private AuthenticationMethod(String label) {
        this.label = label;
    }
    
}
