import model.Book;
import model.Member;

public class Main {

    public static void main(String[] args) {

        Book book = new Book(252, "Java Programming", "James Gosling");
        book.displayInfo();

        Member member = new Member(1, "Sharna");
        member.displayInfo();
    }
}