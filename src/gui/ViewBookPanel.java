package gui;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ViewBookPanel extends JFrame {

    JTextArea bookArea;

    public ViewBookPanel() {

        setTitle("View Books");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        bookArea = new JTextArea();
        bookArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(bookArea);

        add(scrollPane);

        try {

            FileReader reader = new FileReader("books.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;

            while ((line = br.readLine()) != null) {
                bookArea.append(line + "\n");
            }

            br.close();

        } catch (IOException e) {

            bookArea.setText("Error reading books.");
        }

        setVisible(true);
    }
}