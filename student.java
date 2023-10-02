import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class student extends JFrame {
    public JLabel intro,jl1,jl2,jl3,jl4,jl5,jl6;

    public JPanel pa1,pa2,pa3;

    public JButton bu1,bu2,bu3;


    public student() {

        getContentPane().setLayout(null);

        setTitle("Classroom Management system--D10C");
        setSize(1500, 1500);

        intro = new JLabel("CLASSROOM-D10C");
        intro.setBounds(590, 20, 400, 100);
        intro.setFont(new Font("Monospaced", 1, 40));
        add(intro);

        jl1 = new JLabel("Name : Kshitij Hundre ");
        jl1.setBounds(550, 150, 400, 60);
        jl1.setFont(new Font("Monospaced", 3, 20));
        add(jl1);

        jl2 = new JLabel("Roll No: 19");
        jl2.setBounds(550, 290, 400, 60);
        jl2.setFont(new Font("Monospaced", 3, 20));
        add(jl2);

        jl3 = new JLabel("Announcements!!");
        jl3.setBounds(1180, 100, 400, 60);
        jl3.setFont(new Font("Monospaced", 1, 25));
        Color a = new Color(185, 61, 86, 202);
        jl3.setForeground(a);
        add(jl3);

        jl4 = new JLabel("E-Mail ID: 2022.kshitij.hundre@ves.ac.in");
        jl4.setBounds(550, 220, 500, 60);
        jl4.setFont(new Font("Monospaced", 3, 20));
        add(jl4);

        jl5 = new JLabel("SELECT SUBJECT");
        jl5.setBounds(640, 490, 500, 60);
        jl5.setFont(new Font("Monospaced", 1, 25));
        jl5.setBackground(Color.blue);
        add(jl5);

        jl6 = new JLabel("About Institution");
        jl6.setBounds(120, 100, 400, 60);
        jl6.setFont(new Font("Monospaced", 1, 25));
        Color a1 = new Color(185, 61, 86, 202);
        jl6.setForeground(a1);
        add(jl6);




        pa1 = new JPanel();
        pa1.setBounds(10, 10, 480, 770);
        Color Lightblue = new Color(189, 213, 215);
        pa1.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.BLACK));
        pa1.setBackground(Lightblue);
        add(pa1);

        pa2 = new JPanel();
        pa2.setBounds(1050, 10, 480, 770);
        Color Lightblue1 = new Color(189, 213, 215);
        pa2.setBackground(Lightblue1);
        pa2.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.BLACK));
        add(pa2);



        bu1 = new JButton("DSA");
        bu1.setFont(new Font("Monospaced", 1, 20));
        bu1.setBackground(Lightblue);
        bu1.setBounds(540, 610, 110, 40);
        bu1.addActionListener(this::actionPerformed);
        add(bu1);

        bu2 = new JButton("DBMS");
        bu2.setFont(new Font("Monospaced", 1, 20));
        bu2.setBackground(Lightblue);
        bu2.setBounds(840, 610, 110, 40);
        bu2.addActionListener(this::actionPerformed);
        add(bu2);

        bu3 = new JButton("JAVA");
        bu3.setFont(new Font("Monospaced", 1, 20));
        bu3.setBackground(Lightblue);
        bu3.setBounds(690, 610, 110, 40);
        bu3.addActionListener(this::actionPerformed);
        add(bu3);

        pa3 = new JPanel();
        pa3.setBounds(500, 10, 540, 770);
        Color a2 = new Color(95, 144, 201);
        pa3.setBackground(a2);
        pa2.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.BLACK));
        add(pa3);


        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bu3) {
        JAVA z=new JAVA();
        }
        if (e.getSource() == bu1) {
            DSA z=new DSA();
        }
        if (e.getSource() == bu2) {
            DBMS z=new DBMS();
        }
    }

    public static void main(String[] args) {

        new student();
    }
}