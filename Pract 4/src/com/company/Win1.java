package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Win1 extends JFrame {
    JTextField jta = new JTextField(10);
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    Win1() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,100);
        add(jta);
        jta.setForeground(Color.PINK);
        jta.setFont(fnt);
        jta.setText("Lol4k");
        setVisible(true);
    }

}
