/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe_part1mav;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class POE_part1mav {

    public static void main(String[] args) {
   JOptionPane.showMessageDialog(null,"Welcome to the login page" );
    
   String Firstname = JOptionPane.showInputDialog(null,"Input First name");
   String Surname = JOptionPane.showInputDialog(null,"Input Surname");
   String Username = JOptionPane.showInputDialog(null,"Input Username");
   String Password = JOptionPane.showInputDialog(null,"Input Password");   
   
   Login_registration reglog = new  Login_registration(Firstname,Surname,Username,Password);
   
    // Display message with username 
        JOptionPane.showMessageDialog(null, "This is your username: " + Username);

        // Display a thank you message 
        JOptionPane.showMessageDialog(null, "Thank you for loging in");
    }
    
}
    

