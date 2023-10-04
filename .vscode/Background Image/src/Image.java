import javax.swing.*;
public class Image extends JFrame {
    JFrame frame;
    JLabel displayfield;
    ImageIcon image;

    public void Image(){
         frame = new JFrame("Image display Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            image = new ImageIcon(getClass().getResource("image 1.JPG"));
            displayfield= new JLabel(image);
            frame.add(displayfield);
        } catch (Exception e) {
            System.out.println("Image Cannot be found!");
        }
        frame.setSize(400,400);
        frame.setVisible(true);


    }
    public static void main(String[] args){


    }
}