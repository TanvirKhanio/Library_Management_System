
package model;

public class Book {

    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println(id + " " + title + " " + author);
    }
}