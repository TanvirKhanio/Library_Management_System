package gui;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class MainFrame extends JFrame {

    JButton addBookButton;
    JButton viewBookButton;
    JButton addMemberButton;
    JButton reportButton;
    JButton exitButton;

    public MainFrame() {

        setTitle("Library Management System");
        getContentPane().setBackground(new Color(240, 244, 248));
        setSize(500, 550);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel title = new JLabel("Library Management System");
        title.setBounds(140, 30, 300, 30);

        addBookButton = new JButton("Add Book");
        addBookButton.setBackground(new Color(52, 152, 219));
        addBookButton.setForeground(Color.WHITE);
        addBookButton.setFocusPainted(false);
        addBookButton.setBounds(150, 80, 200, 40);

        viewBookButton = new JButton("View Books");
        viewBookButton.setBackground(new Color(65, 170, 24));
        viewBookButton.setForeground(Color.WHITE);
        viewBookButton.setFocusPainted(false);
        viewBookButton.setBounds(150, 130, 200, 40);

        addMemberButton = new JButton("Add Member");
        addMemberButton.setBackground(new Color(231, 76, 60));
        addMemberButton.setForeground(Color.WHITE);
        addMemberButton.setFocusPainted(false);
        addMemberButton.setBounds(150, 180, 200, 40);

        JButton updateMemberButton = new JButton("Update Member");
        updateMemberButton.setBackground(new Color(243, 156, 18));
        updateMemberButton.setForeground(Color.WHITE);
        updateMemberButton.setFocusPainted(false);
        updateMemberButton.setBounds(150, 280, 200, 40);

        JButton deleteMemberButton = new JButton("Delete Member");
        deleteMemberButton.setBackground(new Color(98, 2, 30));
        deleteMemberButton.setForeground(Color.WHITE);
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
        viewMemberButton.setBackground(new Color(16, 24, 113));
        viewMemberButton.setForeground(Color.WHITE);
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
        reportButton.setBackground(new Color(142, 68, 173));
        reportButton.setForeground(Color.WHITE);
        reportButton.setFocusPainted(false);
        reportButton.setBounds(150, 380, 200, 40);


        reportButton.addActionListener(e -> {
            new ReportPanel();
        });

        exitButton = new JButton("Exit");
        exitButton.setBackground(new Color(52, 58, 64));
        exitButton.setForeground(Color.WHITE);
        exitButton.setFocusPainted(false);
        exitButton.setBounds(150, 430, 200, 40);

        add(title);
        add(addBookButton);
        add(viewBookButton);
        add(addMemberButton);
        add(reportButton);
        add(exitButton);

        // Add Book button
        addBookButton.addActionListener(e -> {
            new AddBookPanel();
        });
        viewBookButton.addActionListener(e -> {
            new ViewBookPanel();
        });

        // Exit button
        exitButton.addActionListener(e -> {
            System.exit(0);
        });

        setVisible(true);
    }
}