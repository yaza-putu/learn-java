package oop.learinterface;

public interface Animal {
    public String jenis(String name);

    default String kaki(String name) {
        return "4";
    }
}
