package com.hotelbooking.frames;

// Imports
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Booking {
    public Booking() {        
        // Creating the booking frame
        JFrame bookingFrame = new JFrame("Hotel Booking System | Booking");
        bookingFrame.setSize(400,400);
        
        JLabel homeTitleText = new JLabel("Welcome!");
        homeTitleText.setBounds(50, 10, 100, 50);
        bookingFrame.add(homeTitleText);    
        
        JLabel findHotelsLabel = new JLabel("Find your favourite hotels from the list below:");
        findHotelsLabel.setBounds(50, 30, 400, 50);
        bookingFrame.add(findHotelsLabel);  
        
        // Creating a menu bar for the user profile, with a menu item "Sign out"
        JMenuBar menuBar = new JMenuBar();  
        JMenu menu = new JMenu("User Profile");    
        JMenuItem signOutItem = new JMenuItem("Sign Out");  
        menu.add(signOutItem);
        menuBar.add(menu);  
        bookingFrame.setJMenuBar(menuBar);
        menuBar.setBackground(new java.awt.Color(30, 80, 188));
        menu.setForeground(Color.white);
          
        signOutItem.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(bookingFrame, "You have signed out! \nPlease register again to continue!");
            // Invoking the home instance if the user signs out
            Home gomeInstance = new Home();
            // Closing the booking frame
            bookingFrame.setVisible(false);
        });
        
        // Hotel 1 Panel
        JPanel hotelOnePanel=new JPanel();  
        hotelOnePanel.setBounds(40,80,300,70);    
        hotelOnePanel.setBackground(Color.white);
        hotelOnePanel.setLayout(null);
        bookingFrame.add(hotelOnePanel); 
        
        JLabel hotelOneLabel = new JLabel("Oceanview Beach Resort | Rating: 4 star");
        hotelOneLabel.setBounds(10,0,350,50);
        hotelOnePanel.add(hotelOneLabel); 
        
        JLabel hotelOnePriceLabel = new JLabel("Price: ₹");
        hotelOnePriceLabel.setBounds(10,20,100,50);
        hotelOnePanel.add(hotelOnePriceLabel);
        
        JLabel hotelOnePriceValue = new JLabel("6000");
        hotelOnePriceValue.setBounds(55,20,250,50);
        hotelOnePanel.add(hotelOnePriceValue);        
        
        JButton hotelOneBtn = new JButton("Book");
        hotelOneBtn.setBounds(190, 40, 80, 20);
        hotelOnePanel.add(hotelOneBtn);
        hotelOneBtn.setBackground(new java.awt.Color(30, 80, 188));
        hotelOneBtn.setForeground(Color.white);
        
        hotelOneBtn.addActionListener((ActionEvent e) -> {
            // Invoking the booking details frame and passing the hotel name and price to the booking details frame
            BookingDetails bookingDetailsInstance = new BookingDetails(hotelOneLabel.getText(), hotelOnePriceValue.getText());
            // Closing the booking frame
            bookingFrame.setVisible(false);
        });
        
        // Hotel 2 panel
        JPanel hotelTwoPanel=new JPanel();  
        hotelTwoPanel.setBounds(40,160,300,70);    
        hotelTwoPanel.setBackground(Color.white);
        hotelTwoPanel.setLayout(null);
        bookingFrame.add(hotelTwoPanel); 
        
        JLabel hotelTwoLabel = new JLabel("Wangshu Inn | Rating: 5 star");
        hotelTwoLabel.setBounds(10,0,350,50);
        hotelTwoPanel.add(hotelTwoLabel); 
        
        JLabel hotelTwoPriceLabel = new JLabel("Price: ₹");
        hotelTwoPriceLabel.setBounds(10,20,100,50);
        hotelTwoPanel.add(hotelTwoPriceLabel);
        
        JLabel hotelTwoPriceValue = new JLabel("8000");
        hotelTwoPriceValue.setBounds(55,20,250,50);
        hotelTwoPanel.add(hotelTwoPriceValue); 
        
        JButton hotelTwoBtn = new JButton("Book");
        hotelTwoBtn.setBounds(190, 40, 80, 20);
        hotelTwoPanel.add(hotelTwoBtn);
        hotelTwoBtn.setBackground(new java.awt.Color(30, 80, 188));
        hotelTwoBtn.setForeground(Color.white);
        
        hotelTwoBtn.addActionListener((ActionEvent e) -> {
            // Invoking the booking details frame and passing the hotel name and price to the booking details frame
            BookingDetails bookingDetailsInstance = new BookingDetails(hotelTwoLabel.getText(), hotelTwoPriceValue.getText());
            // Closing the booking frame
            bookingFrame.setVisible(false);
        });
        
        // Hotel 3 panel
        JPanel hotelThreePanel=new JPanel();  
        hotelThreePanel.setBounds(40,240,300,70);    
        hotelThreePanel.setBackground(Color.white);
        hotelThreePanel.setLayout(null);
        bookingFrame.add(hotelThreePanel); 
        
        JLabel hotelThreeLabel = new JLabel("Angels Share Suite | Rating: 3 star");
        hotelThreeLabel.setBounds(10,0,350,50);
        hotelThreePanel.add(hotelThreeLabel); 
        
        JLabel hotelThreePriceLabel = new JLabel("Price: ₹");
        hotelThreePriceLabel.setBounds(10,20,100,50);
        hotelThreePanel.add(hotelThreePriceLabel);
        
        JLabel hotelThreePriceValue = new JLabel("4000");
        hotelThreePriceValue.setBounds(55,20,250,50);
        hotelThreePanel.add(hotelThreePriceValue); 
        
        JButton hotelThreeBtn = new JButton("Book");
        hotelThreeBtn.setBounds(190, 40, 80, 20);
        hotelThreePanel.add(hotelThreeBtn);
        hotelThreeBtn.setBackground(new java.awt.Color(30, 80, 188));
        hotelThreeBtn.setForeground(Color.white);
        
        hotelThreeBtn.addActionListener((ActionEvent e) -> {
            // Invoking the booking details frame and passing the hotel name and price to the booking details frame
            BookingDetails bookingDetailsInstance = new BookingDetails(hotelThreeLabel.getText(), hotelThreePriceValue.getText());
            // Closing the booking frame
            bookingFrame.setVisible(false);
        });
        
        // Setting the booking frame options
        bookingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bookingFrame.setLayout(null);
        bookingFrame.setVisible(true);
        bookingFrame.setLocationRelativeTo(null);
    }
}
