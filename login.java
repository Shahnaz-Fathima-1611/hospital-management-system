package hospital;

import javax.swing.*;
import java.awt.*;

public class login {
    login() {
        JFrame f = new JFrame("Login");
        f.setLayout(null);
        f.setLocation(300, 250);
        f.setSize(750, 300);
        f.getContentPane().setBackground(new Color(5, 0, 4));
        JLabel username = new JLabel("Username: ");
        username.setBounds(40,20,100,30);
        username.setForeground(new Color(235, 240, 239));
        username.setFont(new Font("Tahoma",Font.BOLD,16));
        f.add(username);
        JLabel password = new JLabel("Password: ");
        password.setBounds(40,70,100,30);
        password.setForeground(new Color(235, 240, 239));
        password.setFont(new Font("Helvetica",Font.BOLD,16));
        f.add(password);
        JTextField txtfield=new JTextField();
        txtfield.setBounds(150,20,150,30);
        f.add(txtfield);
        JPasswordField pwfield=new JPasswordField();
        pwfield.setBounds(150,70,150,30);
        f.add(pwfield);
        JButton b=new JButton("Login");
        b.setBounds(40,140,120,30);
        b.setFont(new Font("serif",Font.BOLD,15));
        b.setBackground(Color.WHITE);
        b.setForeground(Color.BLACK);
        f.add(b);
        f.setVisible(true);
    }

    public static void main(String[] arg) {
        new login();
    }

}
