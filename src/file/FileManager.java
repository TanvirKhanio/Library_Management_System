package file;
import exception.InvalidDataException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    // implementation of Create of CRUD
    public void addBook(String data) throws InvalidDataException {
        if (data.isEmpty()) {
            throw new InvalidDataException("Book data cannot be empty.");
        }
        try {
            FileWriter writer = new FileWriter("books.txt", true);
            writer.write(data + "\n");
            writer.close();
            System.out.println("Book added successfully.");
        } catch (IOException e) {
            System.out.println("Having an ERROR to save book.");
        }
    }
    public void addMember(String data) throws InvalidDataException {

        if (data.isEmpty()) {
            throw new InvalidDataException("Member data cannot be empty.");
        }

        try {

            String[] parts = data.split(",");
            int newId = Integer.parseInt(parts[0].trim());
            FileReader reader = new FileReader("members.txt");
            String line;
            boolean exists = false;
            while (true) {
                String currentData = "";
                int character;
                while ((character = reader.read()) != -1) {
                    if (character == '\n') {
                        break;
                    }
                    currentData = currentData + (char) character;
                }
                if (currentData.isEmpty() && character == -1) {
                    break;
                }
                if (currentData.startsWith(newId + ",")) {
                    exists = true;
                    break;
                }
                if (character == -1) {
                    break;
                }
            }
            reader.close();
            if (exists) {
                throw new InvalidDataException("Member ID already exists.");
            }
            FileWriter writer = new FileWriter("members.txt", true);
            writer.write(data + "\n");
            writer.close();
            System.out.println("Member added successfully.");
        } catch (NumberFormatException e) {
            throw new InvalidDataException("Member ID must be a number.");
        } catch (IOException e) {
            System.out.println("Error saving member.");
        }
    }

    //implntn of Read of CRUD
    public void showBooks() {
        try {
            FileReader reader = new FileReader("books.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading books.");
        }
    }
    public void updateBook(int id, String newData) throws InvalidDataException {
        if (newData.isEmpty()) {
            throw new InvalidDataException("Book data cannot be empty.");
        }
        try {
            FileReader reader = new FileReader("books.txt");
            String allData = "";
            int character;
            while ((character = reader.read()) != -1) {
                allData = allData + (char) character;
            }
            reader.close();
            String[] books = allData.split("\n");
            String newFile = "";
            boolean found = false;
            for (String book : books) {
                if (book.startsWith(id + ",")) {
                    newFile = newFile + newData + "\n";
                    found = true;
                } else if (!book.isEmpty()) {
                    newFile = newFile + book + "\n";
                }
            }
            FileWriter writer = new FileWriter("books.txt");
            writer.write(newFile);
            writer.close();
            if (found) {
                System.out.println("Book updated successfully.");
            } else {
                System.out.println("Book not found.");
            }
        } catch (IOException e) {
            System.out.println("Error updating book.");
        }
    }
    public void deleteBook(int id) {
        try {
            FileReader reader = new FileReader("books.txt");
            String allData = "";
            int character;
            while ((character = reader.read()) != -1) {
                allData = allData + (char) character;
            }
            reader.close();
            String[] books = allData.split("\n");
            String newFile = "";
            boolean found = false;
            for (String book : books) {
                if (book.startsWith(id + ",")) {
                    found = true;
                } else if (!book.isEmpty()) {
                    newFile = newFile + book + "\n";
                }
            }
            FileWriter writer = new FileWriter("books.txt");
            writer.write(newFile);
            writer.close();
            if (found) {
                System.out.println("Book deleted successfully.");
            } else {
                System.out.println("Book not found.");
            }
        } catch (IOException e) {
            System.out.println("Error deleting book.");
        }
    }
    public boolean updateMember(int id, String newData) throws InvalidDataException {
        if (newData.isEmpty()) {
            throw new InvalidDataException("Member data cannot be empty.");
        }
        try {
            FileReader reader = new FileReader("members.txt");
            String allData = "";
            int character;
            while ((character = reader.read()) != -1) {
                allData = allData + (char) character;
            }
            reader.close();
            String[] members = allData.split("\n");
            String newFile = "";
            boolean found = false;
            for (String member : members) {
                if (member.startsWith(id + ",") && !found) {
                    newFile = newFile + newData + "\n";
                    found = true;
                } else if (!member.isEmpty()) {
                    newFile = newFile + member + "\n";
                }
            }
            FileWriter writer = new FileWriter("members.txt");
            writer.write(newFile);
            writer.close();
            if (found) {
                System.out.println("Member updated successfully.");
                return true;
            } else {
                System.out.println("Member not found.");
                return false;
            }
        } catch (IOException e) {
            System.out.println("Error updating member.");
            return false;
        }
    }
    public boolean deleteMember(int id) {
        try {
            FileReader reader = new FileReader("members.txt");
            String allData = "";
            int character;
            while ((character = reader.read()) != -1) {
                allData = allData + (char) character;
            }
            reader.close();
            String[] members = allData.split("\n");
            String newFile = "";
            boolean found = false;
            for (String member : members) {
                if (member.startsWith(id + ",") && !found) {
                    found = true;
                } else if (!member.isEmpty()) {
                    newFile = newFile + member + "\n";
                }
            }
            FileWriter writer = new FileWriter("members.txt");
            writer.write(newFile);
            writer.close();
            if (found) {
                System.out.println("Member deleted successfully.");
                return true;
            } else {
                System.out.println("Member not found.");
                return false;
            }
        } catch (IOException e) {
            System.out.println("Error deleting member.");
            return false;
        }
    }
}