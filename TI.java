import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TI {


    public TI(){
        String data[][] = {
                {"121841", "SNEHA PAKLE", "DBMS"},
                {"121842", "JITENDRA MADHVI", "DSA"},
                {"121843", "KADER SHEIKH", "JAVA"},

                {"","",""},
                {"","",""},
                {"","",""}
        };

        String columnNames[] = {"TEACHER ID", "TEACHER NAME", "SUBJECT"};

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        JFrame frame = new JFrame();
        frame.add(new JScrollPane(table));
        frame.setSize(700, 400);
        Color Lightblue = new Color(64, 181, 192);
        frame.setBackground(Lightblue);
        frame.setTitle("TEACHERS INFO");
        frame.setVisible(true);


    }

    public static void main(String[] args) {

        new TI();
    }
}

