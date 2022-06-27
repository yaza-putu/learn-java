package oop.learinterface;

public class Food implements Animal {

    @Override
    public String jenis(String name) {
        return name;
    }

    public String kaki(String name) {
        return "kaki is :" + name;
    }
}
