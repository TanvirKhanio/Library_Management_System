package gui;

import exception.InvalidDataException;
import file.FileManager;

import javax.swing.*;

public class UpdateMemberPanel extends JFrame {

    JTextField idField;
    JTextField nameField;
    JButton updateButton;

    public UpdateMemberPanel() {

        setTitle("Update Member");
        setSize(400, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel idLabel = new JLabel("New Member ID:");
        idLabel.setBounds(50, 40, 100, 30);

        idField = new JTextField();
        idField.setBounds(150, 40, 180, 30);

        JLabel nameLabel = new JLabel("New Name:");
        nameLabel.setBounds(50, 90, 100, 30);

        nameField = new JTextField();
        nameField.setBounds(150, 90, 180, 30);

        updateButton = new JButton("Update Member");
        updateButton.setBounds(120, 150, 160, 35);

        add(idLabel);
        add(idField);
        add(nameLabel);
        add(nameField);
        add(updateButton);

        updateButton.addActionListener(e -> {

            String id = idField.getText();
            String name = nameField.getText();

            if (id.trim().isEmpty() || name.trim().isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please enter Member ID and New Name."
                );

            } else {

                try {

                    int memberId = Integer.parseInt(id.trim());

                    FileManager file = new FileManager();

                    String data = memberId + ", " + name.trim();

                    file.updateMember(memberId, data);

                    JOptionPane.showMessageDialog(
                            this,
                            "Member updated successfully."
                    );

                    idField.setText("");
                    nameField.setText("");

                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Member ID must be a number."
                    );

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