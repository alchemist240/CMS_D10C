import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class feedback {
    JFrame f= new JFrame();

    JLabel l1,l2,l3;

    JTextField t1;

    JButton b;

    public feedback() {
        f.getContentPane().setLayout(null);

        f.setTitle("Parent--D10C");
        f.setPreferredSize(new Dimension(1500, 1500));
        Color Lightblue = new Color(166, 222, 174, 255);
        f.getContentPane().setBackground(Lightblue);
        f.pack();

        l1 = new JLabel("CLASSROOM-D10C");
        l1.setBounds(570, 22, 500, 90);
        l1.setFont(new Font("Monospaced", 3, 50));
        f.add(l1);

        l2 = new JLabel("Feedback");
        l2.setBounds(700, 140, 500, 90);
        l2.setFont(new Font("Monospaced", 2, 30));
        f.add(l2);

        l3 = new JLabel("Your feedback is really valuable!!  Write it down here.");
        l3.setBounds(40, 250, 1000, 90);
        l3.setFont(new Font("Monospaced", 2, 20));
        l3.setForeground(Color.black);
        f.add(l3);

        t1=new JTextField();
        t1.setBounds(40, 350, 750, 200);
        t1.setFont(new Font("Monospaced", 2, 20));
        Color a = new Color(225, 230, 225, 255);
        t1.setBackground(a);
        f.add(t1);

        b = new JButton("Submit Feedback");
        b.setFont(new Font("Monospaced", 1, 20));
        Color a1 = new Color(255, 255, 255, 255);
        b.setBackground(a1);
        b.setBounds(315, 610, 220, 40);
        b.addActionListener(this::actionPerformed);
        f.add(b);


        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            String feed = t1.getText();
           JOptionPane.showMessageDialog(f,"Thank you for your feedback! It us much appreciated.");
            t1.setText("");
        }
    }

    public static void main(String[] args) {

        new feedback();
    }
}
