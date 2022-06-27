package javaclass;

public class NumberClass {
    public static void main(String[] args) {
        Integer integer = 10;
        Long longValue = integer.longValue();

        // string to number primitf
        String angka = "10";
        int intangkaPrimitif = Integer.parseInt(angka);

        // string to number non primitf
        Integer intangkanonPrimitif = Integer.valueOf(angka);
        System.out.println(intangkaPrimitif);
        System.out.println(intangkanonPrimitif);
    }
}
