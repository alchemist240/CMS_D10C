import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class SL {


    public SL(){
        String data[][] = {
                {"Dev Gaonkar", "14", "2022.dev.gaonkar@ves.ac.in"},
                {"Kshitij Hundre", "19", "2022.kshitij.hundre@ves.ac.in"},
                {"Mohit Kerkar", "24", "2022.mohit.kerkar@ves.ac.in"},
                {"Sai Rane", "46", "2022.sai.rane@ves.ac.in"},
                {"","",""},
                {"","",""},
                {"","",""}
        };

        String columnNames[] = {"Name", "Roll No.", "E-Mail"};

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        JFrame frame = new JFrame();
        frame.add(new JScrollPane(table));
        frame.setSize(700, 400);
        Color Lightblue = new Color(64, 181, 192);
        frame.setBackground(Lightblue);
        frame.setTitle("JAVA-MARKS");
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        new SL();
    }
}
