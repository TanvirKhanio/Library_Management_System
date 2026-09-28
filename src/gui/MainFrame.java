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
        setSize(500, 550);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel title = new JLabel("Library Management System");
        title.setBounds(140, 30, 300, 30);

        addBookButton = new JButton("Add Book");
        addBookButton.setFocusPainted(false);
        addBookButton.setBounds(150, 80, 200, 40);

        viewBookButton = new JButton("View Books");
        viewBookButton.setFocusPainted(false);
        viewBookButton.setBounds(150, 130, 200, 40);

        addMemberButton = new JButton("Add Member");
        addMemberButton.setFocusPainted(false);
        addMemberButton.setBounds(150, 180, 200, 40);

        JButton updateMemberButton = new JButton("Update Member");
        updateMemberButton.setFocusPainted(false);
        updateMemberButton.setBounds(150, 280, 200, 40);

        JButton deleteMemberButton = new JButton("Delete Member");
        deleteMemberButton.setFocusPainted(false);
        deleteMemberButton.setBounds(150, 330, 200, 40);

        add(deleteMemberButton);

        deleteMemberButton.addActionListener(e -> {
            new DeleteMemberPanel();
        });

        add(updateMemberButton);

        updateMemberButton.addActionListener(e -> {
            new UpdateMemberPanel();
        });

        JButton viewMemberButton = new JButton("View Members");
        viewMemberButton.setFocusPainted(false);
        viewMemberButton.setBounds(150, 230, 200, 40);

        add(viewMemberButton);

        viewMemberButton.addActionListener(e -> {
            new ViewMemberPanel();
        });
        addMemberButton.addActionListener(e -> {
            new AddMemberPanel();
        });


        reportButton = new JButton("Generate Report");
        reportButton.setFocusPainted(false);
        reportButton.setBounds(150, 380, 200, 40);


        reportButton.addActionListener(e -> {
            new ReportPanel();
        });

        exitButton = new JButton("Exit");
        exitButton.setFocusPainted(false);
        exitButton.setBounds(150, 430, 200, 40);

        add(title);
        add(addBookButton);
        add(viewBookButton);
        add(addMemberButton);
        add(reportButton);
        add(exitButton);

        addBookButton.addActionListener(e -> {
            new AddBookPanel();
        });
        viewBookButton.addActionListener(e -> {
            new ViewBookPanel();
        });

        exitButton.addActionListener(e -> {
            System.exit(0);
        });

        setVisible(true);
    }
}