package oop.equals;

public class Equals {
    public static void main(String[] args) {

        int one = 1;
        int two = 1;

        String first = "yasa";
        first = first + "putu";

        System.out.println(first);

        String second = "yasaputu";
        String third =  "yasaputu";

        System.out.println(second);

        // false
        System.out.println(first == second);

        // true because optimize memory by java not ceate new location memory for same object
        System.out.println(third == second);

        // if object not be compaire with == , you can compair with equal class
        System.out.println(first.equals(second));
    }
}
