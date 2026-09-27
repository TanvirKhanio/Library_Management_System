package gui;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReportPanel extends JFrame {

    JTextArea reportArea;

    public ReportPanel() {

        setTitle("Library Report");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        reportArea = new JTextArea();
        reportArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(reportArea);

        add(scrollPane);

        String report = "";

        int bookCount = 0;
        int memberCount = 0;

        report = report + "========================================\n";
        report = report + "          LIBRARY MANAGEMENT REPORT\n";
        report = report + "========================================\n\n";

        report = report + "BOOKS\n";
        report = report + "----------------------------------------\n";

        try {

            FileReader reader = new FileReader("books.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;

            while ((line = br.readLine()) != null) {

                if (!line.trim().isEmpty()) {
                    report = report + line + "\n";
                    bookCount++;
                }
            }

            br.close();

        } catch (IOException e) {

            report = report + "No book data found.\n";
        }

        report = report + "\nTotal Books: " + bookCount + "\n\n";

        report = report + "MEMBERS\n";
        report = report + "----------------------------------------\n";

        try {

            FileReader reader = new FileReader("members.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;

            while ((line = br.readLine()) != null) {

                if (!line.trim().isEmpty()) {
                    report = report + line + "\n";
                    memberCount++;
                }
            }

            br.close();

        } catch (IOException e) {

            report = report + "No member data found.\n";
        }

        report = report + "\nTotal Members: " + memberCount + "\n";

        report = report + "\n========================================\n";

        reportArea.setText(report);

        try {

            FileWriter writer = new FileWriter("library_report.txt");

            writer.write(report);

            writer.close();

        } catch (IOException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Error saving report."
            );
        }

        setVisible(true);
    }
}