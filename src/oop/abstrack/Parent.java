package oop.abstrack;

public abstract class Parent {
    String name;

    String sayHello(String name) {
        this.name = name;
        return name;
    }

    public abstract String kontrak(String kontrak);
}
