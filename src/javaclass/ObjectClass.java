package javaclass;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class ObjectClass {
    public static void main(String[] args) {
        String name = "Wayan yasa";

        String upperCase = name.toUpperCase();

        System.out.println(name.length());

        System.out.println(name.startsWith("Wayan"));

        // many class in String Classes
        // string in java is immutable

        // string builder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Nama ");
        stringBuilder.append("saya ");
        stringBuilder.append("yasa");

        System.out.println(stringBuilder);

        // string joiner app
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        stringJoiner.add("yasa");
        stringJoiner.add("putu");

        System.out.println(stringJoiner.toString());

        // string tokenizer with lazy
        String value = "putu yasa";
        StringTokenizer stringTokenizer = new StringTokenizer(value, " ");

        while (stringTokenizer.hasMoreTokens()) {
            String result = stringTokenizer.nextToken();
            System.out.println(result);
        }


    }
}
