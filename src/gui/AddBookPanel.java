package gui;

import exception.InvalidDataException;
import file.FileManager;

import javax.swing.*;

public class AddBookPanel extends JFrame {

    JTextField idField;
    JTextField titleField;
    JTextField authorField;
    JButton addButton;

    public AddBookPanel() {

        setTitle("Add Book");
        setSize(400, 300);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel idLabel = new JLabel("Book ID:");
        idLabel.setBounds(50, 40, 100, 30);

        idField = new JTextField();
        idField.setBounds(150, 40, 180, 30);

        JLabel titleLabel = new JLabel("Book Title:");
        titleLabel.setBounds(50, 90, 100, 30);

        titleField = new JTextField();
        titleField.setBounds(150, 90, 180, 30);

        JLabel authorLabel = new JLabel("Author:");
        authorLabel.setBounds(50, 140, 100, 30);

        authorField = new JTextField();
        authorField.setBounds(150, 140, 180, 30);

        addButton = new JButton("Add Book");
        addButton.setBounds(130, 200, 140, 35);

        add(idLabel);
        add(idField);

        add(titleLabel);
        add(titleField);

        add(authorLabel);
        add(authorField);

        add(addButton);

        addButton.addActionListener(e -> {

            String id = idField.getText();
            String title = titleField.getText();
            String author = authorField.getText();

            if (id.trim().isEmpty() || title.trim().isEmpty() || author.trim().isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please enter Book ID, Title and Author."
                );

            } else {

                try {

                    FileManager file = new FileManager();

                    String data = id.trim() + ", " + title.trim() + ", " + author.trim();

                    file.addBook(data);

                    JOptionPane.showMessageDialog(
                            this,
                            "Book added successfully."
                    );

                    idField.setText("");
                    titleField.setText("");
                    authorField.setText("");

                } catch (InvalidDataException ex) {

                    JOptionPane.showMessageDialog(
                            this,
                            ex.getMessage()
                    );
                }
            }
        });

        setVisible(true);
    }
}