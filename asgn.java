

import javax.swing.*;
import java.awt.*;

public class asgn extends JFrame {

    JLabel a1,a2,a3,a4,a5,a6,a7,a8,a9;

    JButton b1,b2,b3;

    JPanel p;

    public asgn(){

        getContentPane().setLayout(null);

        setTitle("Classroom Management system--D10C");
        setSize(1500, 1500);

        a1 = new JLabel("CLASSROOM-D10C");
        a1.setBounds(590, 20, 400, 100);
        a1.setFont(new Font("Monospaced", 1, 40));
        add(a1);

        a2 = new JLabel("Assignments");
        a2.setBounds(655, 150, 400, 100);
        a2.setFont(new Font("Monospaced", 3, 30));
        add(a2);

        a3 = new JLabel("Assignment 1");
        a3.setBounds(400, 350, 400, 100);
        a3.setFont(new Font("Monospaced", 3, 24));
        add(a3);

        a4 = new JLabel("Assignment 2");
        a4.setBounds(400, 430, 400, 100);
        a4.setFont(new Font("Monospaced", 3, 24));
        add(a4);

        a5 = new JLabel("Assignment 3");
        a5.setBounds(400, 510, 400, 100);
        a5.setFont(new Font("Monospaced", 3, 24));
        add(a5);

        a6 = new JLabel("Status");
        a6.setBounds(690, 290, 400, 100);
        a6.setFont(new Font("Monospaced", 3, 24));
        add(a6);

        a7 = new JLabel("Completed");
        a7.setBounds(690, 350, 400, 100);
        a7.setFont(new Font("Monospaced", 3, 24));
        a7.setForeground(Color.GREEN);
        add(a7);

        a8 = new JLabel("Incomplete");
        a8.setBounds(690, 430, 400, 100);
        a8.setFont(new Font("Monospaced", 3, 24));
        a8.setForeground(Color.red);
        add(a8);

        a9 = new JLabel("Completed");
        a9.setBounds(690, 510, 400, 100);
        a9.setFont(new Font("Monospaced", 3, 24));
        a9.setForeground(Color.GREEN);
        add(a9);

        a6 = new JLabel("Turn IN / Pull out");
        a6.setBounds(900, 290, 400, 100);
        a6.setFont(new Font("Monospaced", 3, 24));
        add(a6);

        b1 = new JButton("Pull out");
        b1.setFont(new Font("Monospaced", 1, 20));
        Color a = new Color(95, 144, 201);
        b1.setBackground(a);
        b1.setBounds(960, 375, 160, 40);
        //b1.addActionListener(this::actionPerformed);
        add(b1);

        b2 = new JButton("Turn in");
        b2.setFont(new Font("Monospaced", 1, 20));
        Color a1 = new Color(95, 144, 201);
        b2.setBackground(a1);
        b2.setBounds(960, 460, 160, 40);
        //b1.addActionListener(this::actionPerformed);
        add(b2);

        b3 = new JButton("Pull out");
        b3.setFont(new Font("Monospaced", 1, 20));
        Color a2 = new Color(95, 144, 201);
        b3.setBackground(a2);
        b3.setBounds(960, 545, 160, 40);
        //b1.addActionListener(this::actionPerformed);
        add(b3);

        p=new JPanel();
        p.setBounds(390, 280, 800, 350);
        Color a3 = new Color(203, 211, 218);
        p.setBackground(a3);
        p.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.BLACK));
        add(p);



        setVisible(true);
    }


    public static void main(String[] args) {

        new asgn();
    }


}
