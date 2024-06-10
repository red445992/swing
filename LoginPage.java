
package registration;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;


public class LoginPage implements ActionListener {
    JFrame frame = new JFrame("login Form");
    
    JButton login = new JButton("login");
    JButton reset = new JButton("Reset");
    
    JLabel usernameLabel = new JLabel("UserName:");
    JLabel passLabel = new JLabel("Password:");
    JLabel message = new JLabel();
    
    JTextField usernameField = new JTextField();
    JPasswordField passField = new JPasswordField();
    
    
    HashMap<String,String> DATA = new HashMap<String,String>();
    public LoginPage(HashMap<String,String> logdata){
        DATA = logdata;
        
        usernameLabel.setBounds(50,100,100,50);
        passLabel.setBounds(50,150,100,50);
        message.setBounds(50,300,300,50);
        message.setFont(new Font("TimesNewRoman",Font.BOLD,25));
        
        
        usernameField.setBounds(150,110,200,25);
        passField.setBounds(150,160,200,25);
        
        login.setBounds(70,200,100,25);
        login.addActionListener(this);
        
        reset.setBounds(170,200,100,25);
        reset.addActionListener(this);
        
        frame.add(login);
        frame.add(reset);
        frame.add(usernameField);
        frame.add(passField);
        frame.add(message);
        frame.add(usernameLabel);
        frame.add(passLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        
        frame.setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==reset){
            usernameField.setText("");
            passField.setText("");
        }
        if(e.getSource()==login){
            String user = usernameField.getText();
            String pass = String.valueOf(passField.getPassword());
            
            if(DATA.containsKey(user)) {
                if(DATA.get(user).equals(pass)){
                    message.setForeground(Color.green);
                    message.setText("login successful");
                    frame.dispose();
                    WelcomePage w = new WelcomePage();
                }else{
                    message.setForeground(Color.red);
                    message.setText("Wrong Password");
                }
            }else{
                    message.setForeground(Color.red);
                    message.setText("Username not found");
            }
            
             }
        
    }
}
