package regist;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class re extends JFrame{
    
    JLabel reg         = new JLabel();
    JLabel fullname    = new JLabel();
    JLabel email       = new JLabel();
    JLabel mobile      = new JLabel();
    JLabel gender      = new JLabel();
    JLabel dateofbirth = new JLabel();
    JLabel country     = new JLabel();
    
    JTextField fullnamet = new JTextField();
    JTextField emailt    = new JTextField();
    JTextField mobilet   = new JTextField();
    JTextField countryt  = new JTextField();
    
    JRadioButton male   = new  JRadioButton(); 
    JRadioButton female = new  JRadioButton();
    
    JComboBox date   = new JComboBox(); 
    JComboBox month  = new JComboBox(); 
    JComboBox year   = new JComboBox();
    
    JTextArea out  = new JTextArea();
    
    JButton sub   = new JButton(); 
    JButton reset = new JButton();
    JButton v = new JButton();
    
    Connection con = null;
    Statement stmt = null;
    ResultSet  rs = null;
    PreparedStatement pst = null;
    
    String dates[] 
        = { "1", "2", "3", "4", "5", 
            "6", "7", "8", "9", "10", 
            "11", "12", "13", "14", "15", 
            "16", "17", "18", "19", "20", 
            "21", "22", "23", "24", "25", 
            "26", "27", "28", "29", "30", 
            "31" }; 
     String months[] 
        = { "Jan", "feb", "Mar", "Apr", 
            "May", "Jun", "July", "Aug", 
            "Sup", "Oct", "Nov", "Dec" }; 
    String years[] 
        = {   "1993", "1994", "1995", "1996", "1997", "1998", 
            "1999", "2000", "2001", "2002", 
            "2003", "2004", "2005", "2006", 
            "2007", "2008", "2009", "2010", 
            "2011", "2012","2013" };
    boolean x ;
    boolean y ;
    
    
    
    re(){
       
        reg.setText("Registration Form"); 
        reg.setFont(new Font("Arial", Font.PLAIN, 30)); 
        reg.setBounds(280, 30, 300, 35);
        add(reg);; 
        
        fullname.setText("Full Name"); 
        fullname.setFont(new Font("Arial", Font.PLAIN, 20));  
        fullname.setBounds(80, 50, 100, 100);
        add(fullname);
        
        fullnamet.setFont(new Font("Arial", Font.PLAIN, 15)); 
        fullnamet.setBounds(230, 87, 150, 25);
        add(fullnamet);
        
        email.setText("Email"); 
        email.setFont(new Font("Arial", Font.PLAIN, 20));  
        email.setBounds(80, 100, 100, 100);
        add(email);
        
        emailt.setFont(new Font("Arial", Font.PLAIN, 15)); 
        emailt.setBounds(230, 140, 150, 25);
        add(emailt);
        
        mobile.setText("Mobile"); 
        mobile.setFont(new Font("Arial", Font.PLAIN, 20));  
        mobile.setBounds(80, 150, 100, 100);
        add(mobile);
        
        mobilet.setFont(new Font("Arial", Font.PLAIN, 15)); 
        mobilet.setBounds(230, 190, 150, 25);
        add(mobilet);
        
        gender .setText("Gender "); 
        gender .setFont(new Font("Arial", Font.PLAIN, 20));  
        gender .setBounds(80, 190, 100, 100);
        add(gender );
        
        male.setText("Male"); 
        male.setFont(new Font("Arial", Font.PLAIN, 15)); 
        male.setSelected(x); 
        male.setSize(75, 20); 
        male.setLocation(230, 230); 
        add(male); 
  
        female .setText("Female"); 
        female.setFont(new Font("Arial", Font.PLAIN, 15)); 
        female.setSelected(y); 
        female.setSize(80, 20); 
        female.setLocation(300, 230); 
        add(female); 
        
        dateofbirth.setText("date of birth"); 
        dateofbirth.setFont(new Font("Arial", Font.PLAIN, 20));  
        dateofbirth.setBounds(80, 230, 150, 100);
        add(dateofbirth );
        
        
        date = new JComboBox(dates); 
        date.setFont(new Font("Arial", Font.PLAIN, 15)); 
        date.setSize(50, 20); 
        date.setLocation(230, 270); 
        add(date); 
  
        month = new JComboBox(months); 
        month.setFont(new Font("Arial", Font.PLAIN, 15)); 
        month.setSize(60, 20); 
        month.setLocation(290, 270); 
        add(month); 
  
        year = new JComboBox(years); 
        year.setFont(new Font("Arial", Font.PLAIN, 15)); 
        year.setSize(60, 20); 
        year.setLocation(360, 270); 
        add(year); 
        
        country.setText("Country "); 
        country.setFont(new Font("Arial", Font.PLAIN, 20));  
        country.setBounds(80, 290, 150, 100);
        add(country);
        
        countryt.setFont(new Font("Arial", Font.PLAIN, 15)); 
        countryt.setBounds(230, 330, 150, 25);
        add(countryt);
        
        sub.setText("Next"); 
        sub.setFont(new Font("Arial", Font.PLAIN, 17));  
        sub.setBounds(100, 410, 100,20);
        add(sub);
        
        reset.setText("Reset"); 
        reset.setFont(new Font("Arial", Font.PLAIN, 17));  
        reset.setBounds(220, 410, 100,20);
        add(reset);
        
        v.setText("View"); 
        v.setFont(new Font("Arial", Font.PLAIN, 17));  
        v.setBounds(330, 410, 100,20);
        add(v);

        
        out.setFont(new Font("Arial", Font.PLAIN, 20));  
        out.setBounds(450, 80, 330, 380);
        add(out);
        
        
        v.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){ 
                        
                         String data1; 
                         String data   = "Full Name : "  + fullnamet.getText() + "\n"+ "Mobile : " + mobilet.getText() + "\n" + "Email : " + emailt.getText() + "\n"; 
                         
                     if (male.isSelected()){
                    
                             data1 = "Gender : Male" + "\n"; }
                     else{
                             data1 = "Gender : Female" + "\n"; }
                     
                        String data2 = "date of birth : " + (String)date.getSelectedItem() + "/" + (String)month.getSelectedItem() + "/" + (String)year.getSelectedItem() + "\n"; 
  
                       String data3 = "Country : " + countryt.getText(); 
                    out.setText(data + data1 + data2 + data3); 
                    out.setEditable(false); 
  
            } 
        
            
        });
        
        sub.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                
                     String s1 = fullnamet.getText();
                     String s2 = emailt.getText();
                     String s3 = mobilet.getText();
                     String  s4;
                     if(male.isSelected()){
                          s4 = "M";
                     }else{
                          s4 = "F";
                     }
                     String s5 =  (String)date.getSelectedItem() + "/" + (String)month.getSelectedItem() + "/" + (String)year.getSelectedItem(); 
                     String s6 =  countryt.getText();
                    
                     try{
                     
                         Class.forName("org.sqlite.JDBC");
                         con=DriverManager.getConnection("jdbc:sqlite:Regist.db");
                         stmt = con.createStatement();
                         String sql = "INSERT INTO USER(FULLNAME,EMAIL,MOBILE,GENDER,DATEOFBIRTH,COUNTRY)"+"VALUES ('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"')";
                         String sqly = "CREATE TABLE USER"+"(ID CHAR(200),"+"FULLNAME CHAR (500),"+"EMAIL CHAR(500),"+"MOBILE CHAR(500),"+"GENDER CHAR(500),"+"DATEOFBIRTH CHAR(500),"+"COUNTRY CHAR(500),"+"PASSWORD CHAR(500),"+"PATIENTCONDITION CHAR(500))";
                         stmt.executeUpdate(sql);
                         stmt.executeUpdate(sqly);
                         stmt.close();
                          con.close();
                         
                     }catch(Exception ey){
                     
                         System.out.println(ey.getMessage());
                     }   
                
                    new rep();
                    dispose();
            }
        });
        
         reset.addActionListener(new ActionListener(){
            
               public void actionPerformed(ActionEvent e){
                    String def = ""; 
                     fullnamet.setText(def); 
                     emailt.setText(def); 
                     mobilet.setText(def); 
                     countryt.setText(def); 
                     out.setText(def); 
                     date.setSelectedIndex(0); 
                     month.setSelectedIndex(0); 
                     year.setSelectedIndex(0); 
            
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
