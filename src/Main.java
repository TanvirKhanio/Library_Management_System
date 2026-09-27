import file.FileManager;
public class Main {
    public static void main(String[] args) {
        FileManager file = new FileManager();
        file.addBook("101, Java Programming, James Gosling");
        file.addBook("102, C Programming, Dennis Ritchie");
        System.out.println("\nAll Books:");
        file.showBooks();
    }
}