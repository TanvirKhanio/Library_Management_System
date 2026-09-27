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


}