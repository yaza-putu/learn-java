package oop.enumlear;

public class Enum2String {
    public static void main(String[] args) {
        // convert to string
        String levelStrig = Level.PREMIUM.name();
        // string to enum
        Level level = Level.valueOf("STANDARD");
        // get all enum
        Level[] values = Level.values();
    }

}
