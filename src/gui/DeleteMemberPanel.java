package gui;

import file.FileManager;

import javax.swing.*;

public class DeleteMemberPanel extends JFrame {

    JTextField idField;
    JButton deleteButton;

    public DeleteMemberPanel() {

        setTitle("Delete Member");
        setSize(400, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel idLabel = new JLabel("Member ID:");
        idLabel.setBounds(50, 40, 100, 30);

        idField = new JTextField();
        idField.setBounds(150, 40, 180, 30);

        deleteButton = new JButton("Delete Member");
        deleteButton.setBounds(120, 100, 160, 35);

        add(idLabel);
        add(idField);
        add(deleteButton);

        deleteButton.addActionListener(e -> {

            String id = idField.getText();

            if (id.trim().isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please enter Member ID."
                );

            } else {

                try {

                    int memberId = Integer.parseInt(id.trim());

                    FileManager file = new FileManager();

                    boolean deleted = file.deleteMember(memberId);

                    if (deleted) {

                        JOptionPane.showMessageDialog(
                                this,
                                "Member deleted successfully."
                        );

                    } else {

                        JOptionPane.showMessageDialog(
                                this,
                                "Member not found."
                        );
                    }

                    idField.setText("");

                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Member ID must be a number."
                    );
                }
            }
        });

        setVisible(true);
    }
}