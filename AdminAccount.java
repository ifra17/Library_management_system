package bookbank;



import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;


public class AdminAccount extends JFrame implements ActionListener
{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
    JLabel L1;
    public AdminAccount() 
    {
        L1=new JLabel("ADMIN ACCOUNT");
        b1=new JButton("ADD BOOKS");
        b2=new JButton("VIEW BOOKS");
        b3=new JButton("ISSUE BOOKS");
        b4=new JButton("AVAILABLE BOOKS");
        b5=new JButton("SEARCH BOOK");
        b6=new JButton("VIEW CUSTOMER");
        b7=new JButton("ISSUED BOOKS");
        b8=new JButton("RETURNED BOOKS");
        b9=new JButton("UNRETURNED BOOKS");
        b10=new JButton("HISTORY");
        b11=new JButton("LOG OUT");

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
        if(ae.getSource()==b2)
        {
            ViewBooks vb =new ViewBooks();
            vb.setSize(1750,1000);
            vb.setVisible(true);
            vb.setTitle(" USER REGISTER");
            vb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        else if(ae.getSource()==b3)
        {
        	Issue a =new Issue();
        	a.setSize(400,400);
        	a.setVisible(true);
            a.setTitle(" USER REGISTER");
            a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();

        }
        else if(ae.getSource()==b11)
        {
            Start as=new Start();
            as.setSize(350,350);
            as.setVisible(true);
            as.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
        else if(ae.getSource()==b1)
        {
        	AddBooks as=new AddBooks();
            as.setSize(1700,1700);
            as.setVisible(true);
            as.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
        else if(ae.getSource()==b5)
        {
        	SearchBookAdmin as=new SearchBookAdmin();
            as.setSize(400,400);
           
            as.setVisible(true);
            as.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
        else if(ae.getSource()==b7)
        {
        	TablePrint t=new TablePrint();
        }
        else if(ae.getSource()==b4)
        {
            TotalBooks t=new TotalBooks();
        }
        else if(ae.getSource()==b9)
        {
        	TablePrint t=new TablePrint();
        }
        else if(ae.getSource()==b6)
        {
        	CustomerPrint t=new CustomerPrint();
        }
        else if(ae.getSource()==b10)
        {
        	CustomerPrint t=new CustomerPrint();
        }
        
    }
    public static void main(String args[])
    {
        AdminAccount s=new AdminAccount();
        s.setSize(1750,1000);
        s.setVisible(true);
        s.setTitle(" USER REGISTER");
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
