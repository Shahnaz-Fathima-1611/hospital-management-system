package hospital.management.system;
import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Room extends JFrame{
    JTable table;
    Room()
    {
        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(182, 114, 212));
        panel.setLayout(null);
        add(panel);

        table=new JTable();
        table.setBounds(40,100,500,400);
        table.setBackground(new Color(182, 114, 212));
        panel.add(table);

        try{
            conn c=new conn();
            String q="Select * from Room";
            ResultSet rs= c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        JLabel label1=new JLabel("Room No");
        label1.setBounds(42,70,80,15);
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
        label1.setForeground(new Color(82,10,115));
        panel.add(label1);

        JLabel label2=new JLabel("Availability");
        label2.setBounds(170,70,80,15);
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
        label2.setForeground(new Color(82,10,115));
        panel.add(label2);

        JLabel label3=new JLabel("Price");
        label3.setBounds(295,70,80,15);
        label3.setFont(new Font("Tahoma",Font.BOLD,14));
        label3.setForeground(new Color(82,10,115));
        panel.add(label3);

        JLabel label4=new JLabel("Room Type");
        label4.setBounds(420,70,80,15);
        label4.setFont(new Font("Tahoma",Font.BOLD,14));
        label4.setForeground(new Color(82,10,115));
        panel.add(label4);

        JButton back=new JButton("back");
        back.setBounds(200,500,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);
        setSize(900,600);
        setLayout(null);
        setLocation(250,90);
        setVisible(true);
    }
    public static void main(String[] arg)
    {
        new Room();

    }
}
