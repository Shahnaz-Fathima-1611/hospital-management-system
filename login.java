package hospital.management.system;

import hospital.management.system.conn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener
{
    JTextField txtfield;

    JPasswordField pwfield;

    JButton b;


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
        password.setFont(new Font("Tahoma",Font.BOLD,16));
        f.add(password);


        txtfield=new JTextField();
        txtfield.setBounds(150,20,150,30);
        f.add(txtfield);


        pwfield=new JPasswordField();
        pwfield.setBounds(150,70,150,30);
        f.add(pwfield);


        b=new JButton("Login");
        b.setBounds(40,140,120,30);
        b.setFont(new Font("serif",Font.BOLD,15));
        b.addActionListener(this);
        f.add(b);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()== b)
        {
            try{
                conn c= new conn();
                String user= txtfield.getText();
                String pass= pwfield.getText();

                String q="select * from login where ID= '"+user+"' and PW '"+pass+"'";
                ResultSet resultSet=c.statement.executeQuery(q);

                if(resultSet.next()){
                    new test();
                    setVisible(false);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Invalid");
                }


            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else{
            System.exit(10);
        }
    }


    public static void main(String[] arg) {
        new login();
    }


}
