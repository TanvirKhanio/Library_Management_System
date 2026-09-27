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
    public void updateBook(int id, String newData) {

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

            for (String book : books) {

                if (book.startsWith(id + ",")) {
                    newFile = newFile + newData + "\n";
                } else if (!book.isEmpty()) {
                    newFile = newFile + book + "\n";
                }
            }

            FileWriter writer = new FileWriter("books.txt");
            writer.write(newFile);
            writer.close();

            System.out.println("Book updated successfully.");

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

            for (String book : books) {

                if (!book.startsWith(id + ",") && !book.isEmpty()) {
                    newFile = newFile + book + "\n";
                }
            }

            FileWriter writer = new FileWriter("books.txt");
            writer.write(newFile);
            writer.close();

            System.out.println("Book deleted successfully.");

        } catch (IOException e) {
            System.out.println("Error deleting book.");
        }
    }
    public void addMember(String data) {

        try {
            FileWriter writer = new FileWriter("members.txt", true);

            writer.write(data + "\n");

            writer.close();

            System.out.println("Member added successfully.");

        } catch (IOException e) {
            System.out.println("Error saving member.");
        }
    }
    public void showMembers() {

        try {
            FileReader reader = new FileReader("members.txt");

            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading members.");
        }
    }

    //implementing update
    public void updateMember(int id, String newData) {
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
            for (String member : members) {
                if (member.startsWith(id + ",")) {
                    newFile = newFile + newData + "\n";
                } else if (!member.isEmpty()) {
                    newFile = newFile + member + "\n";
                }
            }
            FileWriter writer = new FileWriter("members.txt");
            writer.write(newFile);
            writer.close();
            System.out.println("Member updated successfully.");
        } catch (IOException e) {
            System.out.println("Error updating member.");
        }
    }
    //implementing delete
    public void deleteMember(int id) {
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
            for (String member : members) {
                if (!member.startsWith(id + ",") && !member.isEmpty()) {
                    newFile = newFile + member + "\n";
                }
            }
            FileWriter writer = new FileWriter("members.txt");
            writer.write(newFile);
            writer.close();
            System.out.println("Member deleted successfully.");
        } catch (IOException e) {
            System.out.println("Error deleting member.");
        }
    }


}