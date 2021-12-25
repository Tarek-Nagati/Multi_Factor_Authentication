/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfacoursework.services;

import java.util.ArrayList;
import mfacoursework.models.UserModel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TarekNagati
 */
public class DatabaseServiceImplementationTest {
    
    public DatabaseServiceImplementationTest() {
    }

    /**
     * Test of getUsers method, of class DatabaseServiceImplementation.
     */
    @Test
    public void testGetUsersSuccess() {
        System.out.println("getUsers");
        DatabaseServiceImplementation instance = new DatabaseServiceImplementation();
        ArrayList<UserModel> expResult = new ArrayList<>();
        expResult.add(new UserModel("tarek","passwordtarek","12345678"));
        expResult.add(new UserModel("paul","passwordpaul","123456789"));
        expResult.add(new UserModel("chris","passwordchris","1234561"));
        ArrayList<UserModel> result = instance.getUsers();
        assertEquals(expResult.get(0).getUsername(), result.get(0).getUsername()); // compare first users' username
    }
    
}
