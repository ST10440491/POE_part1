/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe_part1mav;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class Login_registrationIT {
    
    public Login_registrationIT() {
    }

    /**
     * Test of getFirstname method, of class Login_registration.
     */
    @org.junit.jupiter.api.Test
    public void testGetFirstname() {
        System.out.println("getFirstname");
        Login_registration instance = null;
        String expResult = "";
        String result = instance.getFirstname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstname method, of class Login_registration.
     */
    @org.junit.jupiter.api.Test
    public void testSetFirstname() {
        System.out.println("setFirstname");
        String Firstname = "";
        Login_registration instance = null;
        instance.setFirstname(Firstname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurname method, of class Login_registration.
     */
    @org.junit.jupiter.api.Test
    public void testGetSurname() {
        System.out.println("getSurname");
        Login_registration instance = null;
        String expResult = "";
        String result = instance.getSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSurname method, of class Login_registration.
     */
    @org.junit.jupiter.api.Test
    public void testSetSurname() {
        System.out.println("setSurname");
        String Surname = "";
        Login_registration instance = null;
        instance.setSurname(Surname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class Login_registration.
     */
    @org.junit.jupiter.api.Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Login_registration instance = null;
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class Login_registration.
     */
    @org.junit.jupiter.api.Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String Username = "";
        Login_registration instance = null;
        instance.setUsername(Username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Login_registration.
     */
    @org.junit.jupiter.api.Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Login_registration instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Login_registration.
     */
    @org.junit.jupiter.api.Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String Password = "";
        Login_registration instance = null;
        instance.setPassword(Password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUsername method, of class Login_registration.
     */
    @org.junit.jupiter.api.Test
    public void testCheckUsername() {
        System.out.println("checkUsername");
        String username = "kyl_1";
        boolean expResult = true;
        boolean result = Login_registration.checkUsername(username);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkPassword method, of class Login_registration.
     */
    @org.junit.jupiter.api.Test
    public void testCheckPassword() {
        System.out.println("checkPassword");
        String password = "Ch&&sec@ke99!";
        Login_registration.checkPassword(password);
        
    }
  @org.junit.jupiter.api.Test
    public void testCheckUsername1() {
        System.out.println("checkUsername");
        String username = "kyle!!!!!!!";
        boolean expResult = true;
        boolean result = Login_registration.checkUsername(username);
        assertEquals(expResult, result);
        
    }  
}
