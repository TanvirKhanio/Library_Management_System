# Library Management System

A simple Java-based Library Management System developed using Java Swing, Object-Oriented Programming, and File Handling.

## Project Overview

The Library Management System is a desktop application designed to manage books and library members efficiently.

The system provides a graphical user interface (GUI) and stores data using text files.

## Features

- Add Book
- View Books
- Update Books
- Delete Books
- Add Member
- View Members
- Update Member
- Delete Member
- Input Validation
- Duplicate Member ID Prevention
- Custom Exception Handling
- File-based Data Persistence
- Error and Success Messages
- Library Report Generation
- Java Swing GUI

## OOP Concepts

This project demonstrates the four major principles of Object-Oriented Programming:

### Encapsulation
Private fields and getter/setter methods are used in the model classes.

### Abstraction
The `Person` class is implemented as an abstract class.

### Inheritance
The `Member` class inherits from the `Person` class.

### Polymorphism
The `displayInfo()` method is overridden in the `Member` class.

## Technologies Used

- Java
- Java Swing
- File Handling
- IntelliJ IDEA
- Git
- GitHub

## Project Structure

```text
Library_Management_System
│
├── src
│   ├── exception
│   │   └── InvalidDataException.java
│   │
│   ├── file
│   │   └── FileManager.java
│   │
│   ├── gui
│   │   ├── AddBookPanel.java
│   │   ├── AddMemberPanel.java
│   │   ├── DeleteMemberPanel.java
│   │   ├── MainFrame.java
│   │   ├── ReportPanel.java
│   │   ├── UpdateMemberPanel.java
│   │   ├── ViewBookPanel.java
│   │   └── ViewMemberPanel.java
│   │
│   ├── model
│   │   ├── Book.java
│   │   ├── Member.java
│   │   └── Person.java
│   │
│   └── Main.java
│
├── books.txt
├── members.txt
├── library_report.txt
└── README.md