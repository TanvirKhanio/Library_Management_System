package gui;

import javax.swing.*;

public class MainFrame extends JFrame {

    JButton addBookButton;
    JButton viewBookButton;
    JButton addMemberButton;
    JButton reportButton;
    JButton exitButton;

    public MainFrame() {

        setTitle("Library Management System");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel title = new JLabel("Library Management System");
        title.setBounds(140, 30, 250, 30);

        addBookButton = new JButton("Add Book");
        addBookButton.setBounds(150, 80, 200, 40);

        viewBookButton = new JButton("View Books");
        viewBookButton.setBounds(150, 130, 200, 40);

        addMemberButton = new JButton("Add Member");
        addMemberButton.setBounds(150, 180, 200, 40);

        reportButton = new JButton("Generate Report");
        reportButton.setBounds(150, 230, 200, 40);

        exitButton = new JButton("Exit");
        exitButton.setBounds(150, 280, 200, 40);

        add(title);
        add(addBookButton);
        add(viewBookButton);
        add(addMemberButton);
        add(reportButton);
        add(exitButton);

        exitButton.addActionListener(e -> {
            System.exit(0);
        });

        setVisible(true);
    }
}
