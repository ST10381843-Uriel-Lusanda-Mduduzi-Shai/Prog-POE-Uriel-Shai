/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mychatapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 
public class UserLoginTest {
    
    public UserLoginTest() {
    }

    @Test
    public void testCheckUsername() {
        String Username = "kyl_1";
        UserLogin login = new UserLogin();
        
        assertTrue(login.checkUsername(Username));
    }

    @Test
    public void testCheckPasswordComplexity() {
        String Password = "Ch&&sec@ke99!";
        UserLogin login = new UserLogin();
        
        assertTrue(login.checkPasswordComplexity(Password));
    }

    @Test
    public void testCheckCellPhoneNumber() {
        String Pnumber = "+27662345678";
        UserLogin login = new UserLogin();
        
        assertTrue(login.checkCellPhoneNumber(Pnumber));
    }

    @Test
    public void testRegisterUser() {
        String Username = "kyl_1";
        String Password = "Ch&&sec@ke99!";
        UserLogin login = new UserLogin();
        String result = login.registerUser(Username, Password);
        
        assertEquals("User has been registeres successfully",result);
    }

    @Test
    public void testLoginUser() {
        String Username = "kyl_1";
        String Password = "Ch&&sec@ke99!";
        UserLogin login = new UserLogin();
        
        assertTrue(login.loginUser(Username, Password));
    }

    @Test
    public void testReturnLoginUser() {
        String Username = "kyl_1";
        String Password = "Ch&&sec@ke99!";
        UserLogin login = new UserLogin();
        
        assertEquals("A successful login",login.returnLoginUser(Username, Password));
    }
    
}
