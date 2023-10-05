import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PI {


    public PI(){
        String data[][] = {
                {"121849", "SHAILESH KERKAR", "MOHIT KERKAR","9874245506"},
                {"121848", "PRAMOD GAONKAR", "DEV GAONKAR","7738952644"},
                {"121847", "MARUTI HUNDRE", "KSHITIJ HUNDRE","9892945602"},
                {"121846", "YOGESH RANE", "SAI RANE","8182653962"},
                {"","",""},
                {"","",""},
                {"","",""}
        };

        String columnNames[] = {"PARENT ID", "PARENT NAME", "STUDENT NAME","CONTACT INFO"};

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        JFrame frame = new JFrame();
        frame.add(new JScrollPane(table));
        frame.setSize(700, 400);
        Color Lightblue = new Color(64, 181, 192);
        frame.setBackground(Lightblue);
        frame.setTitle("PARENT INFO");
        frame.setVisible(true);


    }

    public static void main(String[] args) {

        new PI();
    }
}