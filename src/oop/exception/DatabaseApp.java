package oop.exception;

public class DatabaseApp {
    public static void main(String[] args) {
        String host = null;
        connect(host);
    }

    public static void connect(String host) {
        if(host == null) {
            throw new Database("Failed connect");
        }
    }
}
