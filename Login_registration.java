/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_part1mav;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class Login_registration {
    String Firstname ;
    String Surname ;
    String Username ;
    String Password ;
    
// put all the methods i create 
    public Login_registration(String Firstname, String Surname, String Username, String Password) {
        this.Firstname = Firstname;
        this.Surname = Surname;
        this.Username = Username;
        this.Password = Password;
        checkUsername(Username);
        checkPassword(Password);
        
    }
// for sorting
    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
   public static boolean checkUsername (String username){
       if(username.length()<= 5 && username.contains("_")) {
            JOptionPane.showMessageDialog(null, "username succesfully captured");
       }
     else {
            JOptionPane.showMessageDialog(null, "username must contain 5 characters and an underscore");
            username = JOptionPane.showInputDialog (null, "Enter username that has an underscore and is less than  5 letters long");
       }
       return username.length() <= 5 && username.contains ("_");
    } 
     // Method to check password
public static void checkPassword(String password) {
   

    boolean isValid = true;

    // Check length
    if (password.length() < 8) {
        JOptionPane.showMessageDialog(null, "The password must be at least 8 characters long.");
        isValid = false;
    }

    // Check for uppercase letter, digit, and special character
    boolean hasUppercase = false;
    boolean hasDigit = false;
    boolean hasSpecialChar = false;

    for (char character : password.toCharArray()) {
        if (Character.isUpperCase(character)) {
            hasUppercase = true;
        } else if (Character.isDigit(character)) {
            hasDigit = true;
        } else if ("!@#$%^&*()-_+={}[]|\\:;\"'<>,.?/".indexOf(character) != -1) {
            hasSpecialChar = true;
        }
    }

    // Check if all criteria are met
    if (!hasUppercase || !hasDigit || !hasSpecialChar) {
        JOptionPane.showMessageDialog(null, "The password must contain at least one uppercase letter, one digit, and one special character.");
        isValid = false;
    }

    //  user must enter another password if criteria are not met
    if (!isValid) {
        password = JOptionPane.showInputDialog(null, "Please enter another password");
        checkPassword(password); // Recursive call to check the new password
    } else {
        JOptionPane.showMessageDialog(null, "Password successfully captured.");
    }
}
}    

