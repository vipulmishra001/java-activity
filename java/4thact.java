import javax.swing.*;
import java.awt.*;
import java.io.*;

public class TableDisplay extends JFrame {
    public TableDisplay() {
        setTitle("Table Display");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use GridLayout for table-like structure
        setLayout(new GridLayout(0, 1)); // rows auto, 1 column per line

        try {
            BufferedReader br = new BufferedReader(new FileReader("Table.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                // Split by commas
                String[] elements = line.split(",");

                // Panel for each row
                JPanel rowPanel = new JPanel(new GridLayout(1, elements.length));
                for (String element : elements) {
                    rowPanel.add(new JLabel(element.trim(), JLabel.CENTER));
                }
                add(rowPanel);
            }

            br.close();
        } catch (IOException e) {
            add(new JLabel("Error reading file!", JLabel.CENTER));
        }
    }

    public static void main(String[] args) {
        new TableDisplay().setVisible(true);
    }
}
