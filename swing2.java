import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class swing2 extends JFrame  implements ActionListener {

    private JLabel l1, l2, l3,l4;
    private JTextField tf;
    private JPasswordField pf;
    private JButton b1, b2;
    private JPanel p1;
    private JComboBox cb;





    public swing2() {
        setTitle("Classroom Management system--D10C");
        setSize(1500, 1500);


        l1 = new JLabel("Welcome!!");
        l1.setBounds(350, 110, 100, 100);
        add(l1);

        l2 = new JLabel("Username:");
        l2.setBounds(200, 345, 100, 75);
        add(l2);

        tf = new JTextField();
        tf.setBackground(Color.white);
        tf.setBounds(350, 360, 200, 40);
        add(tf);

        l3 = new JLabel("Password:");
        l3.setBounds(200, 465, 100, 75);
        add(l3);

        pf = new JPasswordField();
        pf.setBackground(Color.white);
        pf.setBounds(350, 480, 200, 40);
        add(pf);

        l4= new JLabel("Choose your identity");
        l4.setBounds(195,250,200,40);
        add(l4);

        String denomi[]={"--Choose--","Student","Parent","Teacher","Admin"};
        cb=new JComboBox(denomi);
        cb.setBounds(400,250,100,40);
        add(cb);


        b1 = new JButton("Login");
        b1.setBackground(Color.lightGray);
        b1.setBounds(350, 550, 100, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Clear");
        b2.setBackground(Color.lightGray);
        b2.setBounds(455, 550, 100, 40);
        b2.addActionListener(this);
        add(b2);

        p1 = new JPanel();
        p1.setBounds(150, 100, 480, 600);
        p1.setBackground(Color.white);
        add(p1);




        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String username = tf.getText();
            String password = new String(pf.getPassword());


            if (username.equals("2022.kshitij.hundre@ves.ac.in") && password.equals("2406") || username.equals("2022.mohit.kerkar@ves.ac.in") && password.equals("0512") || username.equals("2022.dev.gaonkar@ves.ac.in") && password.equals("1803")||username.equals("2022.sai.rane@ves.ac.in") && password.equals("1807")) {
                JOptionPane.showMessageDialog(this, "You have logged in successfully!!!!");
                // ikde main code yenar...konta tari class inherit kar
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Credentials. Please try again.");
            }
        } else if (e.getSource() == b2) {
            tf.setText("");
            pf.setText("");
        }

    }


    public static void main(String[] args) {

        new swing2();
    }
}


