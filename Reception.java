package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//JButton bt1;

class Reception extends JFrame {
    Reception(){
        JPanel panel1= new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,160,1525,670);
        panel1.setBackground(new Color(162,42,42));

        add(panel1);

        JPanel panel2= new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(3,5,1525,150);
        panel2.setBackground(new Color(163,126,46));
        add(panel2);

        JButton bt1= new JButton(("Add New Patient"));
        bt1.setBounds(30,5,200,30);
        bt1.setBackground(new Color(246,215,118));
        panel1.add(bt1);
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 //new New_patient();
            }
        });

        JButton bt2 = new JButton("Room");
        bt2.setBounds(30,50,200,30);
        bt2.setBackground(new Color(246,215,118));
        panel1.add(bt2);
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 //new Room();
            }
        });

        JButton bt3 = new JButton("All Employee Info");
        bt3.setBounds(30,95,200,30);
        bt3.setBackground(new Color(246,215,118));
        panel1.add(bt3);
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //new emp_info();
            }
        });

        JButton bt4 = new JButton("Patient Info");
        bt4.setBounds(30,140,200,30);
        bt4.setBackground(new Color(246,215,118));
        panel1.add(bt4);
        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Patient_info();
            }
        });

        JButton bt5 = new JButton("Patient Discharge");
        bt5.setBounds(30,180,200,30);
        bt5.setBackground(new Color(246,215,118));
        panel1.add(bt5);
        bt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Patient_discharge();
            }
        });

        JButton bt6 = new JButton("Logout");
        bt6.setBounds(30,220,200,30);
        bt6.setBackground(new Color(246,215,118));
        panel1.add(bt6);
        bt6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setSize(1950,1090);
        getContentPane().setBackground(new Color(225,225,225));
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Reception();
    }
}
