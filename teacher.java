import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class teacher extends JFrame implements ActionListener {

JLabel intro,pn,sn,id,s;

JPanel p,p1,p2;

JButton bu1,bu2,bu3,bu4;

teacher(){
    getContentPane().setLayout(null);
    Color Lightblue = new Color(206, 147, 216, 255);
    setTitle("Teacher--D10C");
    setSize(1500, 1500);

    intro = new JLabel("Teacher LOGIN");
    intro.setBounds(590, 20, 400, 100);
    intro.setFont(new Font("Monospaced", 1, 40));
    add(intro);

    pn = new JLabel("Teacher Name: ");
    pn.setBounds(50, 180, 400, 50);
    pn.setFont(new Font("Monospaced", 3, 20));
    add(pn);

    sn = new JLabel("Subject:");
    sn.setBounds(50, 240, 450, 50);
    sn.setFont(new Font("Monospaced", 3, 20));
    add(sn);

    id= new JLabel("Teacher E-Mail ID: ");
    id.setBounds(50, 300, 550, 50);
    id.setFont(new Font("Monospaced", 3, 20));
    add(id);

    s = new JLabel("SELECT SUBJECT");
    s.setBounds(625, 480, 500, 60);
    s.setFont(new Font("Monospaced", 3, 30));
    s.setBackground(Color.blue);
    add(s);

    bu1 = new JButton("DSA");
    bu1.setFont(new Font("Monospaced", 1, 20));
    Color a = new Color(95, 144, 201);
    bu1.setBackground(Lightblue);
    bu1.setBounds(540, 590, 110, 40);
    bu1.addActionListener(this::actionPerformed);
    add(bu1);

    bu2 = new JButton("DBMS");
    bu2.setFont(new Font("Monospaced", 1, 20));
    bu2.setBackground(Lightblue);
    bu2.setBounds(840, 590, 110, 40);
    bu2.addActionListener(this::actionPerformed);
    add(bu2);

    bu3 = new JButton("JAVA");
    bu3.setFont(new Font("Monospaced", 1, 20));
    bu3.setBackground(Lightblue);
    bu3.setBounds(690, 590, 110, 40);
    bu3.addActionListener(this::actionPerformed);
    add(bu3);

    bu4 = new JButton("Students INFO");
    bu4.setFont(new Font("Monospaced", 1, 20));
    bu4.setBackground(Lightblue);
    bu4.setBounds(648, 670, 200, 40);
    bu4.addActionListener(this::actionPerformed);
    add(bu4);

    p=new JPanel();
    p.setBounds(10, 10, 1520, 350);
    p.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.BLACK));
    p.setBackground(Lightblue);
    add(p);

    p1=new JPanel();
    p1.setBounds(500, 480, 500, 300);
    p1.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3,Color.BLACK));
    Color a1 = new Color(228, 231, 228, 255);
    p1.setBackground(a1);
    add(p1);

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
        if (e.getSource() == bu4) {
            SL z=new SL();
        }
    }

    public static void main(String[] args) {

        new teacher();
    }

}
