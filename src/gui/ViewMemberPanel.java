package gui;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ViewMemberPanel extends JFrame {

    JTextArea memberArea;

    public ViewMemberPanel() {

        setTitle("View Members");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        memberArea = new JTextArea();
        memberArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(memberArea);

        add(scrollPane);

        try {

            FileReader reader = new FileReader("members.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;

            while ((line = br.readLine()) != null) {
                memberArea.append(line + "\n");
            }

            br.close();

        } catch (IOException e) {

            memberArea.setText("Error reading members.");
        }

        setVisible(true);
    }
}