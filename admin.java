import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class admin extends JFrame {

JLabel intro1,i;

JButton bu1,bu2,bu3;

JPanel p;

    public admin()  {

        getContentPane().setLayout(null);

        setTitle("Admin--D10C");
        setPreferredSize(new Dimension(1500, 1500));
        Color Lightblue = new Color(189, 213, 215);
        getContentPane().setBackground(Lightblue);
        pack();

        intro1 = new JLabel("CLASSROOM-D10C");
        intro1.setBounds(570, 22, 500, 90);
        intro1.setFont(new Font("Monospaced", 10, 50));
        add(intro1);

        i = new JLabel("ADMIN");
        i.setBounds(680, 190, 500, 90);
        i.setFont(new Font("Monospaced", 3, 50));
        add(i);

        bu1 = new JButton("STUDENT INFO");
        bu1.setFont(new Font("Monospaced", 1, 20));
        Color l = new Color(206, 147, 216, 255);
        bu1.setBackground(l);
        bu1.setBounds(660, 350, 200, 40);
        bu1.addActionListener(this::actionPerformed);
        add(bu1);

        bu2 = new JButton("TEACHER INFO");
        bu2.setFont(new Font("Monospaced", 1, 20));
        Color l1 = new Color(206, 147, 216, 255);
        bu2.setBackground(l1);
        bu2.setBounds(660, 450, 200, 40);
        bu2.addActionListener(this::actionPerformed);
        add(bu2);

        bu3 = new JButton("PARENT INFO");
        bu3.setFont(new Font("Monospaced", 1, 20));
        Color l2 = new Color(206, 147, 216, 255);
        bu3.setBackground(l2);
        bu3.setBounds(660, 550, 200, 40);
        bu3.addActionListener(this::actionPerformed);
        add(bu3);

        p=new JPanel();
        p.setBounds(610, 170, 315, 470);
        p.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.BLACK));
        Color l4 = new Color(211, 224, 225, 255);
        p.setBackground(l4);
        add(p);


        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bu1) {
            SL X=new SL();
        }
        if (e.getSource() == bu2) {
            TI X=new TI();
        }
        if (e.getSource() == bu3) {
            PI X=new PI();
        }
    }



    public static void main(String[] args) {

        new admin();
    }


}
