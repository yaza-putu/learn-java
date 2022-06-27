package oop.exception;

public class StackTraceElement {
    public static void main(String[] args) {
        String name = null;
        try {
            Validated.validate(name);
        } catch (ManualException |  RuntimeException e) {
           e.printStackTrace();
        }
    }
}
