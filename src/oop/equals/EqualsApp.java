package oop.equals;

public class EqualsApp {
    public static void main(String[] args) {
        EqualsOveride equals1 = new EqualsOveride();

        equals1.name = "nasi tumpeng";
        equals1.id = 1;

        EqualsOveride equals2 = new EqualsOveride();
        equals2.name = "nasi tumpeng";
        equals2.id = 1;

        System.out.println(equals1.equals(equals2));
    }
}
