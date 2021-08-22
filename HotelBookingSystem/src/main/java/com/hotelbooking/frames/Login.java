package com.hotelbooking.frames;

// Imports
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login {
    public Login(String userName, String userPassword) {
        // Creating the login frame
        JFrame loginFrame = new JFrame("Hotel Booking System | Login");
        loginFrame.setSize(400,400);
        
        JLabel loginLabel = new JLabel("Enter your login details:");
        loginLabel.setBounds(125,50,200,30);
        loginFrame.add(loginLabel);
       
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(100,120,100,30);
        loginFrame.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(180,120,100,30);
        loginFrame.add(usernameField);
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(100,170,100,30);
        loginFrame.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(180,170,100,30);
        loginFrame.add(passwordField);
        
        JLabel registerFirstLabel = new JLabel("Please register before logging in");
        registerFirstLabel.setBounds(100,210,300,30);
        loginFrame.add(registerFirstLabel);
        
        JButton goBackBtn = new JButton("Back");
        goBackBtn.setBounds(95,250,100,30);
        loginFrame.add(goBackBtn);
        goBackBtn.setBackground(Color.white);
        goBackBtn.setForeground(new java.awt.Color(30, 80, 188));
        
        goBackBtn.addActionListener((ActionEvent e) -> {
            // Invoking the home frame
            Home homeInstance = new Home();
            // Closing the login frame
            loginFrame.setVisible(false);
        });
    
        JButton submitLoginBtn = new JButton("Login");
        submitLoginBtn.setBounds(205,250,100,30);
        loginFrame.add(submitLoginBtn);
        submitLoginBtn.setBackground(new java.awt.Color(30, 80, 188));
        submitLoginBtn.setForeground(Color.white);
        
        submitLoginBtn.addActionListener((ActionEvent e) -> {
            // If the username and password fields are left empty, then show message dialog
            if(usernameField.getText().equals("") || passwordField.getText().equals("")) {
                JOptionPane.showMessageDialog(loginFrame, "Please enter the values!");   
            } 
            // Else if username and password matches the variables sent by the register frame, then show message dialog
            else if(usernameField.getText().equals(userName) && passwordField.getText().equals(userPassword)) {
                JOptionPane.showMessageDialog(loginFrame, "Successfully logged in!");                
                // Invoking the booking frame
                Booking bookingInstance = new Booking();
                // Closing the login frame
                loginFrame.setVisible(false);
            }
            // When the username and password does not match the variables send by the register frame, then show message dialog
            else {
                JOptionPane.showMessageDialog(loginFrame, "Failed to log in! Please check your values");
            }
        });
        
        // Setting the login frame options
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLayout(null);
        loginFrame.setVisible(true);
        loginFrame.setLocationRelativeTo(null);
    }
}
