package com.hotelbooking.frames;

// Imports
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Register {
    public Register() {
        // Creating the register frame
        JFrame registerFrame = new JFrame("Hotel Booking System | Register");
        registerFrame.setSize(400,400);
        
        JLabel loginLabel = new JLabel("Enter your registration details:");
        loginLabel.setBounds(100,50,200,30);
        registerFrame.add(loginLabel);
        
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(100,100,100,30);
        registerFrame.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(180,100,100,30);
        registerFrame.add(usernameField);
       
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(100,140,100,30);
        registerFrame.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(180,140,100,30);
        registerFrame.add(emailField);
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(100,180,100,30);
        registerFrame.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(180,180,100,30);
        registerFrame.add(passwordField);
        
        JButton goBackBtn = new JButton("Back");
        goBackBtn.setBounds(95,250,100,30);
        registerFrame.add(goBackBtn);
        goBackBtn.setBackground(Color.white);
        goBackBtn.setForeground(new java.awt.Color(30, 80, 188));
        
        goBackBtn.addActionListener((ActionEvent e) -> {
            // Invoking the home frame
            Home homeInstance = new Home();
            // Closing the register frame
            registerFrame.setVisible(false);
        });
    
        JButton submitRegisterBtn = new JButton("Register");
        submitRegisterBtn.setBounds(205,250,100,30);
        registerFrame.add(submitRegisterBtn);
        submitRegisterBtn.setBackground(new java.awt.Color(30, 80, 188));
        submitRegisterBtn.setForeground(Color.white);
        
        submitRegisterBtn.addActionListener((ActionEvent e) -> {
            // If the username, email and password fields are left empty, display message dialog
            if(usernameField.getText().equals("") || emailField.getText().equals("") || passwordField.getText().equals("")) {
                JOptionPane.showMessageDialog(registerFrame, "Please enter the values!");   
            } 
            // If the username and password matches, display message dialog
            else {
                JOptionPane.showMessageDialog(registerFrame, "Successfully registered! Please log in!");   
                // Invoking login frame and passing the username and password
                Login loginInstance = new Login(usernameField.getText(), passwordField.getText());
                // Closing the register frame
                registerFrame.setVisible(false);
            }            
        });

        // Setting the register frame options
        registerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registerFrame.setLayout(null);
        registerFrame.setVisible(true);
        registerFrame.setLocationRelativeTo(null);
    }
    
}
