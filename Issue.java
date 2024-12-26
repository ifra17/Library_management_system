package bookbank;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JTextField;
//
//public class Issue extends JFrame implements ActionListener {
//
//    JLabel L1, L2;
//    JButton b1, b2;
//    JTextField t1, t2;
//
//    public Issue() {
//
//        L1 = new JLabel("Customer Id");
//        L2 = new JLabel("Book Id");
//
//        b1 = new JButton("ISSUE");
//        b2 = new JButton("BACK");
//
//        t1 = new JTextField(20);
//        t2 = new JTextField(20);
//
//        L1.setBounds(120, 50, 100, 15);
//        t1.setBounds(120, 75, 200, 30);
//
//        L2.setBounds(120, 110, 100, 15);
//        t2.setBounds(120, 130, 200, 30);
//
//        b1.setBounds(120, 190, 100, 30);
//        b2.setBounds(120, 240, 100, 30);
//
//        add(L1);
//        add(t1);
//        add(L2);
//        add(t2);
//        add(b1);
//        add(b2);
//
//        setLayout(null);
//        setVisible(true);
//        setSize(400, 400);
//        setLocation(400, 200);
//
//        b1.addActionListener(this);
//        b2.addActionListener(this);
//    }
//
//    public static void main(String[] args) {
//        new Issue();
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent ae) {
//        if (ae.getSource() == b1) {
//            String cid = t1.getText();
//            String bid = t2.getText();
//
//            try {
//                // Step 1: Load the MySQL JDBC driver
//                Class.forName("com.mysql.cj.jdbc.Driver");
//
//                // Step 2: Create the connection object
//                Connection con = DriverManager.getConnection(
//                        "jdbc:mysql://localhost:3306/bookbank", "root", "");
//
//                // Step 3: Create the prepared statement object
//                String q = "INSERT INTO statustable VALUES(?,?,?)";
//                PreparedStatement pstmt = con.prepareStatement(q);
//
//                pstmt.setString(1, cid);
//                pstmt.setString(2, bid);
//                pstmt.setString(3, "unreturned");
//
//                pstmt.executeUpdate();
//                JOptionPane.showMessageDialog(this, "Book added successfully", "Success",
//                        JOptionPane.INFORMATION_MESSAGE);
//
//            } catch (ClassNotFoundException | SQLException ee) {
//                JOptionPane.showMessageDialog(this, "Error: " + ee.getMessage(), "Error",
//                        JOptionPane.ERROR_MESSAGE);
//            }
//        }
//        else if (ae.getSource() == b2)
//        {
//        	  	AdminAccount vb =new AdminAccount();
//	            vb.setSize(1750,1000);
//	            vb.setVisible(true);
//	            vb.setTitle(" USER REGISTER");
//	            vb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	            this.dispose();
//            
//        }
//    }
//}
//


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Issue extends JFrame implements ActionListener {

    JLabel L1, L2;
    JButton b1, b2;
    JTextField t1, t2;

    public Issue() {

        L1 = new JLabel("Customer Id");
        L2 = new JLabel("Book Id");

        b1 = new JButton("ISSUE");
        b2 = new JButton("BACK");

        t1 = new JTextField(20);
        t2 = new JTextField(20);

        L1.setBounds(120, 50, 100, 15);
        t1.setBounds(120, 75, 200, 30);

        L2.setBounds(120, 110, 100, 15);
        t2.setBounds(120, 130, 200, 30);

        b1.setBounds(120, 190, 100, 30);
        b2.setBounds(120, 240, 100, 30);

        add(L1);
        add(t1);
        add(L2);
        add(t2);
        add(b1);
        add(b2);

        setLayout(null);
        setVisible(true);
        setSize(400, 400);
        setLocation(400, 200);

        b1.addActionListener(this);
        b2.addActionListener(this);
    
        setLocation(500,200);
    }
//    b1.addActionListener(new ActionListener() {
//    	public void actionPerformed(ActionEvent e) {
//			 try{
//				// Step 1: Load the MySQL JDBC driver
//				    Class.forName("com.mysql.cj.jdbc.Driver");
//	
//				    // Step 2: Create the connection object
//				    Connection con = DriverManager.getConnection(
//					    "jdbc:mysql://localhost:3306/bookbank", "root", "");
//	
//				    // Step 3: Create the statement object
//				    Statement stmt = con.createStatement();
//	
//				    // Step 4: Execute query
//				    String q = "INSERT INTO statustable VALUES(?,?,?)";
//				    
//				    //get the preparedStatement object
//				    PreparedStatement pstmt=con.prepareStatement(q);
//				    
//				    String cid= t1.getText();
//				    String bid= t2.getText();
//				   
//				    
//				    pstmt.setString(1,cid);
//				    pstmt.setString(2,bid);
//				    pstmt.setString(3,"not returned");
//				    
//				    
//				    
//				    pstmt.executeUpdate();
//				    
//				    JOptionPane.showMessageDialog(Issue.this, "book Issued successfully","Error", JOptionPane.ERROR_MESSAGE);
//            
//        	} catch(Exception ee) {
//        		System.out.println("Invalid");
//        	}
//    		
//    	}
//    });}
        
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
    				    String q = "INSERT INTO statustable VALUES(?,?,?)";
    				    
    				    //get the preparedStatement object
    				    PreparedStatement pstmt=con.prepareStatement(q);
    				    
    				    String cid= t1.getText();
    				    String bid= t2.getText();
    				   
    				    
    				    pstmt.setString(1,cid);
    				    pstmt.setString(2,bid);
    				    pstmt.setString(3,"not returned");
    				    
    				    
    				    
    				    pstmt.executeUpdate();
    				    
    				    JOptionPane.showMessageDialog(Issue.this, "book Issued successfully","Error", JOptionPane.ERROR_MESSAGE);
                
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

    public static void main(String[] args) {
        new Issue();
    }

	
    
}

