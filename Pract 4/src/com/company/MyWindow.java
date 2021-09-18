package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyWindow extends JFrame {
    public static int x;
    public int x1=0,x2=0;
    String last = "N/A", win = "DRAW";
    private JButton but1 = new JButton("AC Milan");
    private JButton but2 = new JButton("Real Madrid");
    private JLabel labelRes = new JLabel("Result: "+x1+" X "+x2);
    private JLabel labelScore = new JLabel("Last Scorer: "+ last);
    private JLabel labelWin = new JLabel("Winner: " + win);

    public MyWindow(){
        super("Football match");
        this.setBounds(100,100,300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2));
        ButtonGroup group = new ButtonGroup();
        group.add(but1);
        group.add(but2);
        container.add(but1);
        container.add(but2);
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x1+=1;
                labelRes.setText("Result: "+x1+" X "+x2);
                Win(x1,x2);
                last = "AC Milan";
                labelScore.setText("Last Scorer: "+ last);
            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x2+=1;
                labelRes.setText("Result: "+x1+" X "+x2);
                Win(x1,x2);
                last = "Real Madrid";
                labelScore.setText("Last Scorer: "+ last);
            }
        });
        container.add(labelRes);
        container.add(labelWin);
        container.add(labelScore);
    }
    public void Win(int x1, int x2){
        if(x1>x2){
            win = "AC Milan";
        } else if(x1==x2){
            win = "DRAW";
        } else {
            win = "Real Madrid";
        }
        labelWin.setText("Winner: " + win);
    }

}
