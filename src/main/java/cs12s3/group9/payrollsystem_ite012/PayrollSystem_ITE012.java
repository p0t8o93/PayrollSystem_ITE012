/*
 * 
 */

package cs12s3.group9.payrollsystem_ite012;

/**
 *
 * @author Group 9
 */

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

class LoginMenu extends JFrame {
    
    public LoginMenu() {
        // Login Menu
        Label username = new Label("Enter Username:");
        Label password = new Label("Enter Password:");
        
        TextField input_usrname = new TextField();
        JPasswordField input_passwd = new JPasswordField();
        
        Button login_btn = new Button("Login");
        
        //Locations
        username.setBounds(100,80,90,25);
        input_usrname.setBounds(100,110,175,25);
        
        password.setBounds(100,140,90,25);
        input_passwd.setBounds(100,170,175,25);
        
        login_btn.setBounds(100,200,90,20);
        //Adding the content
        add(username);
        add(input_usrname);
        add(password);
        add(input_passwd);
        add(login_btn);
        
        // setting the frame and window size
        setTitle("Payroll System");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}

public class PayrollSystem_ITE012 {
    public static void main(String[] args) {
        new LoginMenu();
       
    }
}
