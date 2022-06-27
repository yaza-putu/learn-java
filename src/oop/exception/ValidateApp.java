package oop.exception;

public class ValidateApp {
    public static void main(String[] args) {
        String name = null;
        try {
            Validated.validate(name);
        } catch (ManualException e) {
            System.out.println(e.getMessage());
        }
        // or multiple catch
        try {
            Validated.validate(name);
        } catch (ManualException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        // finaly
        try {
            Validated.validate(name);
        } catch (ManualException | NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("always excecute");
        }
    }
}
