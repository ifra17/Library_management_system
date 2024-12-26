package bookbank;



import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

import java.sql.*;
import java.util.*;
import java.io.*;

public class AddBooks extends JFrame implements ActionListener
{
    JButton b1,b2;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6;
    JLabel L1,L2,L3,L4,L5,L6,L7;

    public AddBooks()
    {
        L1=new JLabel("BOOK ID");
        L2=new JLabel("BOOPK NAME");
        L3=new JLabel("AUTHOR");
        L4=new JLabel("GENRE");
        L5=new JLabel("PRICE");
        L6=new JLabel("COPIES");
        L7=new JLabel("ADD BOOKS");
        
        tf1=new JTextField(20);
        tf2=new JTextField(20);
        tf3=new JTextField(20);
        tf4=new JTextField(20);
        tf5=new JTextField(20);
        tf6=new JTextField(20);
        
        b1=new JButton("ADD BOOKS");
        b2=new JButton("BACK");
        L7.setFont(new Font("Arial",Font.BOLD,30));

        L7.setBounds(550,25,300,50);
        L1.setBounds(260,90,300,55);
        L2.setBounds(260,160,300,55);
        L3.setBounds(260,230,300,55);
        L4.setBounds(260,300,300,55);
        L5.setBounds(260,370,300,55);
        L6.setBounds(260,440,300,55);
       

        tf1.setBounds(780,90,300,55);
        tf2.setBounds(780,160,300,55);
        tf3.setBounds(780,230,300,55);
        tf4.setBounds(780,300,300,55);
        tf5.setBounds(780,370,300,55);
        tf6.setBounds(780,440,300,55);
        
        b1.setBounds(300,540,300,70);
        b2.setBounds(700,540,300,70);

        
        add(L1);  
        add(L2);  
        add(L3);  
        add(L4);  
        add(L5);  
        add(L6);  
        add(L7); 

        add(tf1);
        add(tf2);
        add(tf3);
        add(tf4);
        add(tf5);
        add(tf6);
        
        add(b1); 
        add(b2);
        
        setLayout(null);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
        
//        b1.addActionListener(new ActionListener() {
//        	public void actionPerformed(ActionEvent e) {
//				 try{
//					// Step 1: Load the MySQL JDBC driver
//					    Class.forName("com.mysql.cj.jdbc.Driver");
//		
//					    // Step 2: Create the connection object
//					    Connection con = DriverManager.getConnection(
//						    "jdbc:mysql://localhost:3306/bookbank", "root", "");
//		
//					    // Step 3: Create the statement object
//					    Statement stmt = con.createStatement();
//		
//					    // Step 4: Execute query
//					    String q = "INSERT INTO Books VALUES(?,?,?,?,?,?)";
//					    
//					    //get the preparedStatement object
//					    PreparedStatement pstmt=con.prepareStatement(q);
//					    
//					    String book_id= tf1.getText();
//					    String bname= tf2.getText();
//					    String author= tf3.getText();
//					    String genre= tf4.getText();
//					    String price= tf5.getText();
//					    String no_of_copies= tf6.getText();
//					    
//					    pstmt.setString(1,book_id);
//					    pstmt.setString(2,bname);
//					    pstmt.setString(3,author);
//					    pstmt.setString(4,genre);
//					    pstmt.setString(5,price);
//					    pstmt.setString(6,no_of_copies);
//					    
//					    pstmt.executeUpdate();
//					    JOptionPane.showMessageDialog(AddBooks.this, "book adder successfully","Error", JOptionPane.ERROR_MESSAGE);
//	            
//	        	} catch(Exception ee) {
//	        		System.out.println("Invalid");
//	        	}
//        		
//        	}
//        });
//
        public void actionPerformed(ActionEvent ae) 
        {
            if(ae.getSource()==b1)
            {
            	 try{
 					// Step 1: Load the MySQL JDBC driver
 					    Class.forName("com.mysql.cj.jdbc.Driver");
 		
 					    // Step 2: Create the connection object
 					    Connection con = DriverManager.getConnection(
 						    "jdbc:mysql://localhost:3306/bookbank", "root", "");
 		
 					    // Step 3: Create the statement object
 					    Statement stmt = con.createStatement();
 		
 					    // Step 4: Execute query
 					    String q = "INSERT INTO Books VALUES(?,?,?,?,?,?)";
 					    
 					    //get the preparedStatement object
 					    PreparedStatement pstmt=con.prepareStatement(q);
 					    
 					    String book_id= tf1.getText();
 					    String bname= tf2.getText();
 					    String author= tf3.getText();
 					    String genre= tf4.getText();
 					    String price= tf5.getText();
 					    String no_of_copies= tf6.getText();
 					    
 					    pstmt.setString(1,book_id);
 					    pstmt.setString(2,bname);
 					    pstmt.setString(3,author);
 					    pstmt.setString(4,genre);
 					    pstmt.setString(5,price);
 					    pstmt.setString(6,no_of_copies);
 					    
 					    pstmt.executeUpdate();
 					    JOptionPane.showMessageDialog(AddBooks.this, "book added successfully","Error", JOptionPane.ERROR_MESSAGE);
 	            
 	        	} catch(Exception ee) {
 	        		System.out.println("Invalid");
 	        	}
            }
            else if(ae.getSource()==b2)
            {
            	AdminAccount f =new AdminAccount();
                f.setSize(1700,1700);
                f.setVisible(true);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            }
           
            
        }
       
        
         
    
    public static void main(String args[])
    {
        AddBooks s=new AddBooks();
        s.setSize(1750,1000);
        s.setVisible(true);
        s.setTitle(" USER REGISTER");
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

