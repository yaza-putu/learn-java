package oop.hidding;

public class Parent {
    String name;

    void doIt(String name) {
        this.name = name;
        System.out.println("this parent of " + this.name);
    }
}

class Child extends Parent {
    String name;
    void doIt(String name) {
        this.name = name;
        System.out.println("this child of " + this.name);
    }
}
