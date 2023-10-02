import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class FMDS {


    public FMDS(){
        String data[][] = {
                {"Test 1", "16-7-23", "20/20"},
                {"Test 2", "28-7-23", "14/20"},
                {"Test 3", "12-8-23", "17/20"},
        };

        String columnNames[] = {"Test NO.", "Date", "Marks"};

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        JFrame frame = new JFrame();
        frame.add(new JScrollPane(table));
        frame.setSize(500, 400);
        Color Lightblue = new Color(64, 181, 192);
        frame.setBackground(Lightblue);
        frame.setTitle("DSA-MARKS");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new FMDS();
    }
}