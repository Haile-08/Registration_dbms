package regist;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class rep extends JFrame {
    
       JLabel reg         = new JLabel();
       JLabel newpas      = new JLabel();
       JLabel compas      = new JLabel();
       
       JPasswordField newpast  = new JPasswordField();
       JPasswordField compast  = new JPasswordField();
       
       JButton submit = new JButton(); 
       JButton rese   = new JButton();
    rep(){
        
        reg.setText("Registration Form"); 
        reg.setFont(new Font("Arial", Font.PLAIN, 30)); 
        reg.setBounds(280, 30, 300, 35);
        add(reg);
        
        newpas.setText("New password"); 
        newpas.setFont(new Font("Arial", Font.PLAIN, 20));  
        newpas.setBounds(80, 50, 200, 100);
        add(newpas);
        
        newpast.setFont(new Font("Arial", Font.PLAIN, 15)); 
        newpast.setBounds(290, 87, 150, 25);
        add(newpast);
        
        compas.setText("comferm password"); 
        compas.setFont(new Font("Arial", Font.PLAIN, 20));  
        compas.setBounds(80, 100, 200, 100);
        add(compas);
        
        compast.setFont(new Font("Arial", Font.PLAIN, 15)); 
        compast.setBounds(290, 140, 150, 25);
        add(compast);
        
        submit.setText("Submit"); 
        submit.setFont(new Font("Arial", Font.PLAIN, 17));  
        submit.setBounds(100, 410, 100,20);
        add(submit);
        
        rese.setText("Reset"); 
        rese.setFont(new Font("Arial", Font.PLAIN, 17));  
        rese.setBounds(220, 410, 100,20);
        add(rese);
        
      rese.addActionListener(new ActionListener(){
            
               public void actionPerformed(ActionEvent e){
                    String def = ""; 
                     newpast.setText(def); 
                     compast.setText(def); 
            
            }
        });
        setTitle("Covid19 Trr");
        setSize(900,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.yellow);
        setLayout(null);
        setVisible(true);  
    }
}
