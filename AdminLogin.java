package bookbank;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminLogin extends JFrame implements ActionListener
{
    JLabel  L,L1,L2;
    JButton b,b2;
    JTextField t1,t2;
    JPasswordField ps;


    public AdminLogin()
    {
    	L=new JLabel("LOGIN");
        L1=new JLabel("USER NAME");
        L2=new JLabel("PASSWORD");
        b=new JButton("SIGN IN");
        b2=new JButton("BACK");
        t1=new JTextField(20);
        ps = new JPasswordField(20); 

        L.setBounds(155,20,100,30);
        L.setFont(new Font("Arial",Font.BOLD,30));
        L1.setBounds(100,60,100,30);
        t1.setBounds(100,95,200,30);
        L2.setBounds(100,140,100,30);
        ps.setBounds(100,170,200,30);
        b.setBounds(150,210,100,30);
        b2.setBounds(150,260,100,30);

        add(L);
        add(L1);
        add(t1);
        add(L2);
        add(ps);
        add(b);
        add(b2);
    
        setLayout(null);
        setVisible(true);
        setSize(400, 400);
        setLocation(500, 200);
        b.addActionListener(this);
        b2.addActionListener(this);

    }

    
    public void actionPerformed(ActionEvent ae)
    {
    	if(ae.getSource()==b)
    	{
	        String name=t1.getText();
	        String password=String.valueOf(ps.getPassword());
	       
	        if(name.equals("bookbank") && password.equals("bookbank123"))
	        {
	            AdminAccount s=new AdminAccount();
	            s.setSize(1750,1000);
	            s.setVisible(true);
	            s.setTitle(" USER REGISTER");
	            s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            this.dispose();
	        }
	        else
	        {
	            JOptionPane.showMessageDialog(AdminLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
	            t1.setText("");
	            ps.setText("");
	        }
    	}
    	else if(ae.getSource()==b2)
    	{
    		Start s=new Start();
            s.setSize(350,350);
            s.setVisible(true);
            s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();    	}
            
    }
    
    public static void main(String[] args) {
    	new AdminLogin();
    }
    
    
}
