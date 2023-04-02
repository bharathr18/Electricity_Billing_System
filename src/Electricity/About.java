package Electricity;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame implements ActionListener {

    JButton b1;
    JLabel l1;
    Font f, f1, f2;
    TextArea t1;
    String s;

    public About()
    {
        setLayout(null);
        JButton b1 = new JButton("Exit");
        add(b1);
        b1.setBounds(180, 430, 120,20);
        b1.addActionListener(this);

        Font f = new Font("RALEWAY", Font.BOLD, 180);
        setFont(f);

        s = "                       About Project                \n" +
            "Java Programming Course: Learn Development Of JAVA Projects Using\n" +
            "JSP,JDBC, Servlets, Swing, Spring Boot,Maven,Hibernate\n" +
            "JSP,JDBC, Servlets, Swing, Spring Boot,Maven,Hibernate\n" +
            "Java Programming Course: Learn Development Of JAVA Projects Using\n";
    }

    public void actionPerformed(ActionEvent e)
    {

    }

    public static void main(String args[])
    {

    }
}
