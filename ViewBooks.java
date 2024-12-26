package bookbank;


import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewBooks extends JFrame implements ActionListener
{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
    JLabel L1;
    public ViewBooks()
    {
        L1=new JLabel("SELECT GENRE");
        b1=new JButton("Adventure");
        b2=new JButton("Education");
        b3=new JButton("Crime and mystery");
        b4=new JButton("Historical");
        b5=new JButton("Horror");
        b6=new JButton("Romance");
        b7=new JButton("Science");
        b8=new JButton("Fiction");
        b9=new JButton("Kids");
        b10=new JButton("Other");
        b11=new JButton("BACK");
        
        L1.setBounds(550,25,300,50);
        b1.setBounds(260,90,300,70);
        b2.setBounds(260,190,300,70);
        b3.setBounds(260,300,300,70);
        b4.setBounds(260,410,300,70);
        b5.setBounds(260,520,300,70);

        b6.setBounds(780,90,300,70);
        b7.setBounds(780,190,300,70);
        b8.setBounds(780,300,300,70);
        b9.setBounds(780,410,300,70);
        b10.setBounds(780,520,300,70);

        b11.setBounds(520,600,300,70);

        L1.setFont(new Font("Arial",Font.BOLD,30));

        add(L1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);

        setLayout(null);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        
    }

    public void actionPerformed(ActionEvent ae) 
    {
       
        if(ae.getSource() == b2) 
        {
        	new View("education");
        }
        else if(ae.getSource() == b1) 
        {
        	new View("Adventure");
        }
        else if(ae.getSource() == b3) 
        {
        	new View("Crime and mystery");
        }
        else if(ae.getSource() == b4) 
        {
        	new View("Historical");
        }
        else if(ae.getSource() == b5) 
        {
        	new View("Horror");
        }
        else if(ae.getSource() == b6) 
        {
        	new View("Romance");
        }
        else if(ae.getSource() == b7) 
        {
        	new View("Science");
        }
        else if(ae.getSource() == b8) 
        {
        	new View("Fiction");
        }
        else if(ae.getSource() == b9) 
        {
        	new View("Kids");
        }
        else if(ae.getSource() == b10) 
        {
        	new View("Other");
        }
        else if(ae.getSource() == b11) 
        {
        	 AdminAccount as=new AdminAccount();
             as.setSize(1700,1700);
             as.setVisible(true);
             as.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             this.dispose();
        }
        
        
    }
     public static void main(String args[])
     {
         ViewBooks vb =new ViewBooks();
         vb.setSize(1750,1000);
         vb.setVisible(true);
         vb.setTitle(" USER REGISTER");
         vb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
}

