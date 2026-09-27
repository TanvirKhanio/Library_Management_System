package file;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    // implementation of Create of CRUD
    public void addBook(String data) {
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
}