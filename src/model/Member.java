package model;

public class Member extends Person {

    public Member(int id, String name) {
        super(id, name);
    }

    public void displayInfo() {
        System.out.println(id + " " + name);
    }
}