package com.hotelbooking.frames;

// Imports
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class About {
    public About() {   
        // Creating the about frame 
        JFrame aboutFrame = new JFrame("Hotel Booking System | About");
        aboutFrame.setSize(400,400);
        
        // Top section
        JLabel aboutProjectText = new JLabel("About The Project");
        aboutProjectText.setBounds(140, 10, 150, 30);
        aboutFrame.add(aboutProjectText);
        
        JTextArea textArea = new JTextArea("Hotel Booking System is an application which helps \nit's users get the best deals on their preferred \nhotels. \n\nDevelopment: \nBuilt With Java Swing"); 
        textArea.setEditable(false);
        JScrollPane scrollableTextArea = new JScrollPane(textArea);  
        scrollableTextArea.setBounds(30, 50, 320, 110);
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
        aboutFrame.add(scrollableTextArea);  
        
        // Bottom section
        JLabel aboutDevelopersText = new JLabel("Developers");
        aboutDevelopersText.setBounds(150, 180, 150, 30);
        aboutFrame.add(aboutDevelopersText);
        
        JLabel aboutGodnonText = new JLabel("Godnon Praver Dsilva - 4SO19CS056");
        aboutGodnonText.setBounds(80, 210, 250, 30);
        aboutFrame.add(aboutGodnonText);
        
        JLabel aboutErrolText = new JLabel("Errol Ken Pereira - 4SO19CS050");
        aboutErrolText.setBounds(80, 230, 250, 30);
        aboutFrame.add(aboutErrolText);
        
        JLabel aboutjasonText = new JLabel("Jason Neil Pinto - 4SO19CS063");
        aboutjasonText.setBounds(80, 250, 250, 30);
        aboutFrame.add(aboutjasonText);
        
        JLabel aboutGlenvinText = new JLabel("Glenvin Anil Rosario - 4SO19CS055");
        aboutGlenvinText.setBounds(80, 270, 250, 30);
        aboutFrame.add(aboutGlenvinText);
        
        JButton goBackBtn = new JButton("Back");
        goBackBtn.setBounds(140,310,100,30);
        aboutFrame.add(goBackBtn);
        goBackBtn.setBackground(Color.white);
        goBackBtn.setForeground(new java.awt.Color(30, 80, 188));
        
        goBackBtn.addActionListener((ActionEvent e) -> {
            Home homeInstance = new Home();
            aboutFrame.setVisible(false);
        });
        
        // Setting the about frame options
        aboutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aboutFrame.setLayout(null);
        aboutFrame.setVisible(true);
        aboutFrame.setLocationRelativeTo(null);
    }
}

