package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Win3 extends JFrame {
    JTextArea jta1 = new JTextArea(10, 25);
    JButton button = new JButton("Add some Text");

    public Win3() {
        super("Example");
        setSize(300, 300);
        setLayout(new FlowLayout());
        add(jta1);
        add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String txt = JOptionPane.showInputDialog(null, "Insert some text");
                jta1.append(txt);
            }
        });
    }
}
