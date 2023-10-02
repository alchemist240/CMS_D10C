import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class DSA {

    JFrame f= new JFrame();

    JLabel intro1,pn,sn,id,no,br,s;

    JButton bu1,bu2;

    JPanel p,p1;


    public DSA(){

        f.getContentPane().setLayout(null);
        Color a = new Color(95, 144, 201);

        f.setTitle("DSA--D10C");
        f.setPreferredSize(new Dimension(1500, 1500));
        Color Lightblue = new Color(189, 213, 215);
        f.getContentPane().setBackground(Lightblue);
        f.pack();

        intro1 = new JLabel("CLASSROOM-D10C");
        intro1.setBounds(570, 22, 500, 90);
        intro1.setFont(new Font("Monospaced", 10, 50));
        f.add(intro1);

        pn = new JLabel("Subject name: DSA");
        pn.setBounds(50, 180, 400, 50);
        pn.setFont(new Font("Monospaced", 3, 20));
        f.add(pn);

        sn = new JLabel("Student Name: Kshitij Hundre");
        sn.setBounds(50, 240, 450, 50);
        sn.setFont(new Font("Monospaced", 3, 20));
        f.add(sn);

        id= new JLabel("E-Mail ID: 2022.kshitij.hundre@ves.ac.in");
        id.setBounds(50, 300, 550, 50);
        id.setFont(new Font("Monospaced", 3, 20));
        f.add(id);

        no= new JLabel("Roll NO : 19");
        no.setBounds(1135, 180, 300, 50);
        no.setFont(new Font("Monospaced", 3, 20));
        f.add(no);

        br= new JLabel("Teacher Name: MR Jitendra Madhvi");
        br.setBounds(1135, 240, 400, 50);
        br.setFont(new Font("Monospaced", 3, 20));
        f.add(br);

        s = new JLabel("DSA");
        s.setBounds(750, 500, 500, 60);
        s.setFont(new Font("Monospaced", 3, 30));
        s.setForeground(a);
        f.add(s);

        bu1 = new JButton("Fetch Marks");
        bu1.setFont(new Font("Monospaced", 1, 20));
        bu1.setBackground(a);
        bu1.setBounds(540, 610, 200, 40);
        bu1.addActionListener(this::actionPerformed);
        f.add(bu1);

        bu2 = new JButton("Assignments");
        bu2.setFont(new Font("Monospaced", 1, 20));
        bu2.setBackground(a);
        bu2.setBounds(840, 610, 200, 40);
        f.add(bu2);

        p=new JPanel();
        p.setBounds(10, 10, 1520, 400);
        p.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.BLACK));
        p.setBackground(a);
        f.add(p);

        p1=new JPanel();
        p1.setBounds(500, 480, 580, 250);
        p1.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3,a));
        Color a1 = new Color(208, 208, 218, 250);
        p1.setBackground(a1);
        f.add(p1);






        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bu1) {
            FMDS x = new FMDS();
        }
    }

    public static void main(String[] args) {

        new DSA();
    }

}
