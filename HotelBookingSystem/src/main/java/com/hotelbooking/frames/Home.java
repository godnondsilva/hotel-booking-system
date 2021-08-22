package com.hotelbooking.frames;

// Imports
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Home {  
    public Home() {    
        // Creating the home frame
        JFrame homeFrame = new JFrame("Hotel Booking System | Home");
        homeFrame.setSize(400,400);
        homeFrame.setBackground(new java.awt.Color(255, 255, 255));
        
        JLabel homeTitleText = new JLabel("Hotel Booking System");
        homeTitleText.setBounds(140, 0, 250, 100);
        homeFrame.add(homeTitleText); 
        
        JLabel welcomeTitleText = new JLabel("Welcome!");
        welcomeTitleText.setBounds(170, 50, 250, 100);
        homeFrame.add(welcomeTitleText); 
        
        JButton registerBtn = new JButton("Register");
        registerBtn.setBounds(150,150,100,30);
        homeFrame.add(registerBtn);
        registerBtn.setBackground(new java.awt.Color(30, 80, 188));
        registerBtn.setForeground(Color.white);

        registerBtn.addActionListener((ActionEvent e) -> {
            // Invoke the register frame
            Register registerInstance = new Register();
            // Close the home frame
            homeFrame.setVisible(false);
        });
        
        JButton aboutBtn  = new JButton("About");
        aboutBtn.setBounds(150,200,100,30);    
        homeFrame.add(aboutBtn);
        aboutBtn.setBackground(new java.awt.Color(30, 80, 188));
        aboutBtn.setForeground(Color.white);
        
        aboutBtn.addActionListener((ActionEvent e) -> {
            // Invoke the about frame
            About aboutInstance = new About();
            // Close the home frame
            homeFrame.setVisible(false);
        });
           
        JButton exitBtn  = new JButton("Exit");
        exitBtn.setBounds(150,250,100,30);    
        homeFrame.add(exitBtn);
        exitBtn.setBackground(new java.awt.Color(30, 80, 188));
        exitBtn.setForeground(Color.white);
        
        exitBtn.addActionListener((ActionEvent e) -> {
            // Close the home frame
            homeFrame.setVisible(false);
        });
        
        // Setting the home frame options
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setLayout(null);
        homeFrame.setVisible(true);
        homeFrame.setLocationRelativeTo(null);
    }
    
}