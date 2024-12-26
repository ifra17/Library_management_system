package bookbank;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
// import javax.swing.border.Border;

public class SignUpLogin extends JFrame implements ActionListener
{
    JButton b1,b2,b3;
    public SignUpLogin()
    {
        b1=new JButton("REGISTER");
        b2=new JButton("LOGIN");
        b3=new JButton("Back");
        setBackground(Color.green);
        
        b1.setBounds(100, 70,150 , 45);
        b2.setBounds(100, 125,150 , 45);
        b3.setBounds(100, 180,150 , 45);
        add(b1);
        add(b2);
        add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        setLayout(null);
        setLocation(500,200);

    }
    public void actionPerformed(ActionEvent ae) 
    { 
        if(ae.getSource()==b2)
        {
            Login l=new Login("sundaram");
            l.setSize(500,500);
            l.setVisible(true);
            l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }

        else  if(ae.getSource()==b1)
        {
            Register r =new Register();
            r.setSize(520,480);
            r.setVisible(true);
            r.setTitle(" USER REGISTER");
            r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        else
        {
            this.dispose();
        }
    }
    public static void main(String args[])
    {
    	SignUpLogin s= new SignUpLogin();
    	s.setSize(400,400);
        s.setVisible(true);
        s.setTitle(" Sign up Login");
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

