import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Parent  {

  JFrame f= new JFrame();

  JLabel intro1,pn,sn,id,no,br,yr,s;

  JButton bu1,bu2,bu3,bu4;

  JPanel p,p1;



  public Parent() {

    f.getContentPane().setLayout(null);

    f.setTitle("Parent--D10C");
    f.setPreferredSize(new Dimension(1500, 1500));
    Color Lightblue = new Color(189, 213, 215);
    f.getContentPane().setBackground(Lightblue);
    f.pack();

    intro1 = new JLabel("CLASSROOM-D10C");
    intro1.setBounds(570, 22, 500, 90);
    intro1.setFont(new Font("Monospaced", 10, 50));
    f.add(intro1);

    pn = new JLabel("Parent Name: MR Maruti Hundre");
    pn.setBounds(50, 180, 400, 50);
    pn.setFont(new Font("Monospaced", 3, 20));
    f.add(pn);

    sn = new JLabel("Ward / Student Name: Kshitij Hundre");
    sn.setBounds(50, 240, 450, 50);
    sn.setFont(new Font("Monospaced", 3, 20));
    f.add(sn);

    id= new JLabel("E-Mail ID: 2022.kshitij.hundre@ves.ac.in");
    id.setBounds(50, 300, 550, 50);
    id.setFont(new Font("Monospaced", 3, 20));
    f.add(id);

    no= new JLabel("Roll NO : 19");
    no.setBounds(1150, 180, 300, 50);
    no.setFont(new Font("Monospaced", 3, 20));
    f.add(no);

    br= new JLabel("Branch : INFT");
    br.setBounds(1150, 240, 300, 50);
    br.setFont(new Font("Monospaced", 3, 20));
    f.add(br);

    yr= new JLabel("Year : SE");
    yr.setBounds(1150, 300, 300, 50);
    yr.setFont(new Font("Monospaced", 3, 20));
    f.add(yr);

    s = new JLabel("SELECT SUBJECT");
    s.setBounds(625, 500, 500, 60);
    s.setFont(new Font("Monospaced", 3, 30));
    s.setBackground(Color.blue);
    f.add(s);

    bu1 = new JButton("DSA");
    bu1.setFont(new Font("Monospaced", 1, 20));
    Color a = new Color(95, 144, 201);
    bu1.setBackground(a);
    bu1.setBounds(540, 610, 110, 40);
    bu1.addActionListener(this::actionPerformed);
    f.add(bu1);

    bu2 = new JButton("DBMS");
    bu2.setFont(new Font("Monospaced", 1, 20));
    bu2.setBackground(a);
    bu2.setBounds(840, 610, 110, 40);
    bu2.addActionListener(this::actionPerformed);
    f.add(bu2);

    bu3 = new JButton("JAVA");
    bu3.setFont(new Font("Monospaced", 1, 20));
    bu3.setBackground(a);
    bu3.setBounds(690, 610, 110, 40);
    bu3.addActionListener(this::actionPerformed);
    f.add(bu3);

    bu4 = new JButton("Feedback");
    bu4.setFont(new Font("Monospaced", 1, 20));
    bu4.setBackground(a);
    bu4.setBounds(660, 700, 160, 40);
    bu4.addActionListener(this::actionPerformed);
    f.add(bu4);

    p=new JPanel();
    p.setBounds(10, 10, 1520, 400);
    p.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.BLACK));
    p.setBackground(a);
    f.add(p);

    p1=new JPanel();
    p1.setBounds(500, 480, 500, 300);
    p1.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3,Color.BLACK));
    Color a1 = new Color(208, 208, 218, 250);
    p1.setBackground(a1);
    f.add(p1);


    f.setVisible(true);

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
      feedback z=new feedback();
    }
  }

  public static void main(String[] args) {

    new Parent();
  }

}


