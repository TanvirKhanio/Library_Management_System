import file.FileManager;
import exception.InvalidDataException;

public class Main {

    public static void main(String[] args) {

        FileManager file = new FileManager();

        try {

            file.addBook("103, Python Programming, Guido");

            file.addMember("3, Karim");

        } catch (InvalidDataException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}