import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class FMDB {


    public FMDB(){
        String data[][] = {
                {"Test 1", "16-7-23", "19/20"},
                {"Test 2", "20-7-23", "-ABSENT-"},
                {"Test 3", "28-7-23", "09/20"},
        };

        String columnNames[] = {"Test NO.", "Date", "Marks"};

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        JFrame frame = new JFrame();
        frame.add(new JScrollPane(table));
        frame.setSize(500, 400);
        Color Lightblue = new Color(64, 181, 192);
        frame.setBackground(Lightblue);
        frame.setTitle("DBMS-MARKS");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new FMDB();
    }
}