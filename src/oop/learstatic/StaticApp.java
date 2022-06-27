package oop.learstatic;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Static.APPLICATION);

        int total = Static.sum(1,2,3,5);
        System.out.println(total);

        System.out.println(Static.PROCESSOR);
    }
}
