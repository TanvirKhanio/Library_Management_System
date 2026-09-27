import file.FileManager;

public class Main {
    public static void main(String[] args) {
        FileManager file = new FileManager();
        System.out.println("Before Update:");
        file.showBooks();
        System.out.println("\nUpdating Book:");
        file.updateBook(101, "101, Advanced Java, James Gosling");
        System.out.println("\nAfter Update:");
        file.showBooks();
        System.out.println("\nDeleting Book:");
        file.deleteBook(102);
        System.out.println("\nAfter Delete:");
        file.showBooks();
    }
}