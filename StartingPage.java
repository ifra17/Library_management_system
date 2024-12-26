//package bookbank;
//
//
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//// import javax.swing.border.Border;
//
//class Start extends JFrame implements ActionListener
//{
//    JButton b1,b2;
//    
//    public Start()
//    {
//        b1=new JButton("USER");
//        b2=new JButton("ADMIN");
//        b1.setBounds(100, 90,150 , 50);
//        b2.setBounds(100, 170,150 , 50);
//        add(b1);
//        add(b2);
//        setLayout(null);
//        b1.addActionListener(this);
//        b2.addActionListener(this);
//        
//        setLocation(500,200);
//    }
//    public void actionPerformed(ActionEvent ae) 
//    { 
//        if(ae.getSource()==b1)
//        {
//        	SignUpLogin l=new SignUpLogin();
//            l.setSize(350,350);
//            l.setVisible(true);
//        }
//        else
//        {
//            AdminLogin f =new AdminLogin();
//            f.setSize(400,400);
//            f.setVisible(true);
//            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        }
//    }
//}
//public class StartingPage
//{
//    public static void main(String args[])
//    {
//        Start s=new Start();
//        s.setSize(350,350);
//        s.setVisible(true);
//        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//}


package bookbank;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Start extends JFrame implements ActionListener {
    JButton b1, b2;
    Image backgroundImage;

    public Start() {
        // Load the background image
        backgroundImage = new ImageIcon("./images/startingPageImage.jpg").getImage();

        // Setting up the frame
        setTitle("BookBank - Choose Your Role");
        setSize(350, 350);
        setLocationRelativeTo(null); // Center the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout()); // Using GridBagLayout for better control

        // Creating a panel with a background image
        BackgroundPanel panel = new BackgroundPanel();
        panel.setLayout(new GridBagLayout());

        // Initializing buttons
        b1 = new JButton("USER");
        b2 = new JButton("ADMIN");

        // Customizing buttons
        Font buttonFont = new Font("Arial", Font.BOLD, 16);
        b1.setFont(buttonFont);
        b2.setFont(buttonFont);
        b1.setPreferredSize(new Dimension(150, 50));
        b2.setPreferredSize(new Dimension(150, 50));

        // Adding action listeners
        b1.addActionListener(this);
        b2.addActionListener(this);

        // Setting button colors
        b1.setBackground(new Color(135, 206, 250)); // Light sky blue color
        b1.setForeground(Color.WHITE);
        b2.setBackground(new Color(255, 99, 71)); // Tomato color
        b2.setForeground(Color.WHITE);

        // Adding buttons to the panel with constraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Adding padding
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(b1, gbc);

        gbc.gridy = 1;
        panel.add(b2, gbc);

        // Adding the panel to the frame
        add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            SignUpLogin l = new SignUpLogin();
            l.setSize(350, 350);
            l.setVisible(true);
        } else if (ae.getSource() == b2) {
            AdminLogin f = new AdminLogin();
            f.setSize(400, 400);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

    // Custom JPanel class to draw the background image
    class BackgroundPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}

public class StartingPage {
    public static void main(String[] args) {
        // Running the application
        SwingUtilities.invokeLater(() -> {
            Start s = new Start();
            s.setVisible(true);
        });
    }
}

//
