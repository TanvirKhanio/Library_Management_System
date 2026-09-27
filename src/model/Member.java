package model;

public class Member extends Person {

    public Member(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayInfo() {
        System.out.println(getId() + " " + getName());
    }
}