package com.hotelbooking.frames;

// Imports
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class BookingDetails {
    public BookingDetails(String bookingName, String bookingPrice) {
        // Creating the booking details frame
        JFrame bDetailsFrame = new JFrame("Hotel Booking System | " + bookingName);
        bDetailsFrame.setSize(600,400);
        
        JLabel bookingTitle = new JLabel("You are booking " + bookingName);
        bookingTitle.setBounds(20, 0, 400, 50);
        bDetailsFrame.add(bookingTitle);     
        
        JButton goBackBtn = new JButton("Back");
        goBackBtn.setBounds(400,10,100,30);
        bDetailsFrame.add(goBackBtn);
        goBackBtn.setBackground(Color.white);
        goBackBtn.setForeground(new java.awt.Color(30, 80, 188));
        
        goBackBtn.addActionListener((ActionEvent e) -> {
            Booking bookingInstance = new Booking();
            bDetailsFrame.setVisible(false);
        });
        
        JPanel p1=new JPanel(); 
        p1.setLayout(null);
        
        JPanel p2=new JPanel(); 
        p2.setLayout(null);
        
        JPanel p3=new JPanel();  
        p3.setLayout(null);
        
        // Creating a tabbedpane with panels "Room Details", "Customer Details", "Order Summary'
        JTabbedPane tp=new JTabbedPane();  
        tp.setBounds(10,60,560,290);  
        tp.add("Room Details",p1);  
        tp.add("Customer Details",p2);  
        tp.add("Order Summary",p3);    
        bDetailsFrame.add(tp);
        
        tp.setEnabledAt(0, false);
        tp.setEnabledAt(1, false);
        tp.setEnabledAt(2, false);
        
        // Room Details panel (panel 1)
        JLabel roomnoLabel = new JLabel("Please enter the number of rooms:");
        roomnoLabel.setBounds(10,10,250,30);
        p1.add(roomnoLabel);
            
        // Creating a combo box to pick the number of rooms
        JComboBox t1 = new JComboBox();
        t1.addItem ("1");
        t1.addItem("2");
        t1.addItem("3");
        t1.addItem("4");
        t1.setSelectedItem(1);
        t1.setBounds (220,10,120,30);
        p1.add(t1);
        
        JLabel peoplenoLabel = new JLabel("Please enter the number of people:");
        peoplenoLabel.setBounds(10,60,250,30);
        p1.add(peoplenoLabel);
        
        // Creating a combo box to pick the number of people
        JComboBox t2 = new JComboBox();
        t2.addItem ("1");
        t2.addItem("2");
        t2.addItem("3");
        t2.addItem("4 or more");
        t2.setSelectedItem(1);
        t2.setBounds (220,60,120,30);
        p1.add(t2);   
        
        JLabel daysLabel = new JLabel("Please enter the number of days:");
        daysLabel.setBounds(10,110,250,30);
        p1.add(daysLabel);
        
        // Creating a combo box to pick the number of days
        JComboBox t3 = new JComboBox();
        t3.addItem ("1");
        t3.addItem("2");
        t3.addItem("3");
        t3.addItem("4");
        t3.setSelectedItem(1);
        t3.setBounds (220,110,120,30);
        p1.add(t3);  

        JLabel bFacilitiesLabel = new JLabel("Other Facilities (₹500 per facility):");
        bFacilitiesLabel.setBounds(10,140,250,40);
        p1.add(bFacilitiesLabel);

        JCheckBox wifi1 = new JCheckBox("WiFi");
        wifi1.setBounds(10,170,200,20);
        p1.add(wifi1);
       
        JCheckBox bfast1 = new JCheckBox("Breakfast");
        bfast1.setBounds(10,190,200,20);
        p1.add(bfast1);

        JCheckBox gym1 = new JCheckBox("Gym");
        gym1.setBounds(10,210,200,20);  
        p1.add(gym1);
        
        JCheckBox pool1 = new JCheckBox("Swimming Pool");
        pool1.setBounds(10,230,200,20);  
        p1.add(pool1);
        
        JButton nextBtn1 = new JButton("Next");
        nextBtn1.setBounds(430,220,100,30);
        p1.add(nextBtn1);
        nextBtn1.setBackground(new java.awt.Color(30, 80, 188));
        nextBtn1.setForeground(Color.white);
        
        // Customer Details panel (panel 2)
        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setBounds(10,10,250,30);
        p2.add(firstNameLabel);

        JTextField firstNameField = new JTextField();
        firstNameField.setBounds(110,10,150,30);
        p2.add(firstNameField);
        
        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setBounds(280,10,250,30);
        p2.add(lastNameLabel);

        JTextField lastNameField = new JTextField();
        lastNameField.setBounds(380,10,150,30);
        p2.add(lastNameField);

        JLabel cnoLabel = new JLabel("Contact Number:");
        cnoLabel.setBounds(10,45,250,30);
        p2.add(cnoLabel);

        JTextField cnoField = new JTextField();
        cnoField.setBounds(110,45,150,30);
        p2.add(cnoField);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(280,45,250,30);
        p2.add(ageLabel);

        JTextField ageField = new JTextField();
        ageField.setBounds(380,45,150,30);
        p2.add(ageField);        

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(10,80,250,30);
        p2.add(addressLabel);
        JTextArea addressTextArea = new JTextArea();
        
        addressTextArea.setLineWrap(true);
        addressTextArea.setWrapStyleWord(true);
        JScrollPane scrollableTextArea = new JScrollPane(addressTextArea);  
        scrollableTextArea.setBounds(110,80,150,65);
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
        p2.add(scrollableTextArea);
        
        JLabel GenderLabel = new JLabel("Gender:");
        GenderLabel.setBounds(10,150,250,30);
        p2.add(GenderLabel);

        // Creating radio buttons to select the gender of the customer
        JRadioButton gender1 = new JRadioButton("Male");
        JRadioButton gender2 = new JRadioButton("Female");
        JRadioButton gender3 = new JRadioButton("Other");
        gender1.setBounds(60,150,250,30);
        gender2.setBounds(60,180,250,30);
        gender3.setBounds(60,210,250,30);
        ButtonGroup genderbg = new ButtonGroup();        
        genderbg.add(gender1);
        genderbg.add(gender2);
        genderbg.add(gender3);
        p2.add(gender1);
        p2.add(gender2);
        p2.add(gender3);
        
        JButton prevBtn2 = new JButton("Previous");
        prevBtn2.setBounds(320,220,100,30);
        p2.add(prevBtn2);
        prevBtn2.setBackground(Color.white);
        prevBtn2.setForeground(new java.awt.Color(30, 80, 188));
        
        prevBtn2.addActionListener((ActionEvent e) -> {
            tp.setSelectedIndex(0);
        });
        
        JButton nextBtn2 = new JButton("Next");
        nextBtn2.setBounds(430,220,100,30);
        p2.add(nextBtn2);
        nextBtn2.setBackground(new java.awt.Color(30, 80, 188));
        nextBtn2.setForeground(Color.white);
        
        // Order Summary panel (panel 3)
        // Left Section
        JLabel itemLabel = new JLabel("Items");
        itemLabel.setBounds(40,10,250,30);
        p3.add(itemLabel);
        
        JLabel totalRoomsLabel = new JLabel("Total rooms cost");
        totalRoomsLabel.setBounds(10,40,250,30);
        p3.add(totalRoomsLabel);
        
        JLabel totalDaysLabel = new JLabel("Total days cost");
        totalDaysLabel.setBounds(10,60,250,30);
        p3.add(totalDaysLabel);
        
        JLabel totalFacilitiesLabel = new JLabel("Total facilitiies cost ");
        totalFacilitiesLabel.setBounds(10,80,250,30);
        p3.add(totalFacilitiesLabel);
        
        JLabel taxLabel = new JLabel("Tax");
        taxLabel.setBounds(10,100,250,30);
        p3.add(taxLabel);
        
        JLabel maintainenceLabel = new JLabel("Maintenance");
        maintainenceLabel.setBounds(10,120,250,30);
        p3.add(maintainenceLabel);
        
        JLabel orderTotalLabel = new JLabel("Booking Total Cost");
        orderTotalLabel.setBounds(10,160,250,30);
        p3.add(orderTotalLabel);
        
        // Middle Section
        JLabel itemQtyLabel = new JLabel("Quantity");
        itemQtyLabel.setBounds(165,10,250,30);
        p3.add(itemQtyLabel);
        
        JLabel totalRoomsQtyLabel = new JLabel("1");
        totalRoomsQtyLabel.setBounds(180,40,250,30);
        p3.add(totalRoomsQtyLabel);
        
        JLabel totalDaysQtyLabel = new JLabel("1");
        totalDaysQtyLabel.setBounds(180,60,250,30);
        p3.add(totalDaysQtyLabel);
        
        JLabel totalFacilitiesQtyLabel = new JLabel("0");
        totalFacilitiesQtyLabel.setBounds(180,80,250,30);
        p3.add(totalFacilitiesQtyLabel);
        
        JLabel taxQtyLabel = new JLabel("-");
        taxQtyLabel.setBounds(180,100,250,30);
        p3.add(taxQtyLabel);
        
        JLabel maintainenceQtyLabel = new JLabel("-");
        maintainenceQtyLabel.setBounds(180,120,250,30);
        p3.add(maintainenceQtyLabel);
        
        // Right section
        JLabel itemCostLabel = new JLabel("Total Cost");
        itemCostLabel.setBounds(250,10,250,30);
        p3.add(itemCostLabel);
        
        JLabel rs1Label = new JLabel("₹");
        rs1Label.setBounds(250,40,250,30);
        p3.add(rs1Label);
        
        JLabel totalRoomsCostLabel = new JLabel("0");
        totalRoomsCostLabel.setBounds(260,40,250,30);
        p3.add(totalRoomsCostLabel);
        
        JLabel rs2Label = new JLabel("₹");
        rs2Label.setBounds(250,60,250,30);
        p3.add(rs2Label);
        
        JLabel totalDaysCostLabel = new JLabel("0");
        totalDaysCostLabel.setBounds(260,60,250,30);
        p3.add(totalDaysCostLabel);
        
        JLabel rs3Label = new JLabel("₹");
        rs3Label.setBounds(250,80,250,30);
        p3.add(rs3Label);
        
        JLabel totalFacilitiesCostLabel = new JLabel("0");
        totalFacilitiesCostLabel.setBounds(260,80,250,30);
        p3.add(totalFacilitiesCostLabel);
        
        JLabel rs4Label = new JLabel("₹");
        rs4Label.setBounds(250,100,250,30);
        p3.add(rs4Label);
        
        JLabel taxCostLabel = new JLabel("400");
        taxCostLabel.setBounds(260,100,250,30);
        p3.add(taxCostLabel);
        
        JLabel rs5Label = new JLabel("₹");
        rs5Label.setBounds(250,120,250,30);
        p3.add(rs5Label);
        
        JLabel maintainenceCostLabel = new JLabel("200");
        maintainenceCostLabel.setBounds(260,120,250,30);
        p3.add(maintainenceCostLabel);
        
        JLabel rs6Label = new JLabel("₹");
        rs6Label.setBounds(250,160,250,30);
        p3.add(rs6Label);
        
        JLabel totalCostLabel = new JLabel("0");
        totalCostLabel.setBounds(260,160,250,30);
        p3.add(totalCostLabel);
        
        // Buttons
        JButton prevBtn3 = new JButton("Previous");
        prevBtn3.setBounds(320,220,100,30);
        p3.add(prevBtn3);
        
        prevBtn3.addActionListener((ActionEvent e) -> {
            // Change the panel of the tabbedpane
            tp.setSelectedIndex(1);
        });
        
        JButton bookBtn = new JButton("Book");
        bookBtn.setBounds(430,220,100,30);
        p3.add(bookBtn);
        bookBtn.setBackground(new java.awt.Color(30, 80, 188));
        bookBtn.setForeground(Color.white);
        
        // Panel 1 next button action listener
        nextBtn1.addActionListener((ActionEvent e) -> {
            // Trying the code below to test for errors
            try {
                // Creating integer variable totalFaciltiesNumber to get the total count of all the facilities ticked true in the checkbox section
                int totalFaciltiesCount = 0;
                // If the wifi checkbox is ticked true, increase the facilities count
                if(wifi1.isSelected()) 
                    totalFaciltiesCount += 1;
                // If the bfast checkbox is ticked true, increase the facilities count
                if(bfast1.isSelected()) 
                    totalFaciltiesCount += 1;
                // If the gym checkbox is ticked true, increase the facilities count
                if(gym1.isSelected())
                    totalFaciltiesCount += 1;
                // If the pool checkbox is ticked true, increase the facilities count
                if(pool1.isSelected())
                    totalFaciltiesCount+=1;
                
                // Setting the total facilities quantity label to the total faciltiies count
                totalFacilitiesQtyLabel.setText(String.valueOf(totalFaciltiesCount));
                
                // Setting the total rooms quantity label to the total rooms count
                totalRoomsQtyLabel.setText(String.valueOf(t1.getSelectedItem()));
                
                // Setting the total days quantity label to the total days count
                totalDaysQtyLabel.setText(String.valueOf(t3.getSelectedItem()));

                // Updating the total rooms cost based on the quantity of rooms * the booking price
                int totalRoomsFinalCost = Integer.parseInt(totalRoomsQtyLabel.getText()) * Integer.parseInt(bookingPrice);
                totalRoomsCostLabel.setText(String.valueOf(totalRoomsFinalCost));

                // Updating the total days cost based on the quantity of days * 1500 (because 1500 is the room cost)
                int totalDaysFinalCost = Integer.parseInt(totalDaysQtyLabel.getText()) * 1500;
                totalDaysCostLabel.setText(String.valueOf(totalDaysFinalCost));

                // Updating the total facilities cost based on the quantity of faciltiies * 500 (because 500 is the cost per facility)
                int totalFacilitiesFinalCost = Integer.parseInt(totalFacilitiesQtyLabel.getText()) * 500;
                totalFacilitiesCostLabel.setText(String.valueOf(totalFacilitiesFinalCost));

                // Finally, updating the final booking cost to the sum of all the other costs
                int totalFinalCost = totalRoomsFinalCost + totalDaysFinalCost + totalFacilitiesFinalCost + Integer.parseInt(taxCostLabel.getText()) + Integer.parseInt(maintainenceCostLabel.getText()); ;
                totalCostLabel.setText(String.valueOf(totalFinalCost));
                
                // Change the panel of the tabbedframe
                tp.setSelectedIndex(1);
               
                // If the final cost is less than the booking price (which generally should not be the case, show message dialog and then throw an error
                if(totalFinalCost < Integer.parseInt(bookingPrice)) {
                    throw new ArithmeticException("An error has occurred!");
                }
            }
            // Catching artithematic exceptions
            catch (ArithmeticException arErr) {
                JOptionPane.showMessageDialog(bDetailsFrame, "An error has occurred!\nPlease book again!"); 
                // Invoking the booking frame
                Booking bookingInstance = new Booking();
                // Closing the booking details frame
                bDetailsFrame.setVisible(false);
            }
        });
        
        // Panel 2 Next button action listener
        nextBtn2.addActionListener((ActionEvent e) -> {
            // If all the fields in this panel are not filled, show message dialog
            if(firstNameField.getText().equals("") || lastNameField.getText().equals("") || cnoField.getText().equals("") || ageField.getText().equals("") || addressTextArea.getText().equals("") || genderbg.getSelection()==null) {
                JOptionPane.showMessageDialog(bDetailsFrame, "Please enter the values!");   
            } 
            // Otherwise, change the panel of the tabbedpanel
            else {              
                tp.setSelectedIndex(2);
            }
        });
        
        // Panel 3 Book button action listener
        bookBtn.addActionListener((ActionEvent e) -> {
            // Showing message dialog that booking is successful 
            JOptionPane.showMessageDialog(bDetailsFrame, "You have booked " + bookingName + " for ₹" + totalCostLabel.getText() + "!\n Please check your email for your reciept!");
            // Invoking the booking frame
            Booking bookingInstance = new Booking();
            // Closing the booking details frame
            bDetailsFrame.setVisible(false);
        });
        
        // Setting the booking details option
        bDetailsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bDetailsFrame.setLayout(null);
        bDetailsFrame.setVisible(true);
        bDetailsFrame.setLocationRelativeTo(null);
    }
}
