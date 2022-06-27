package javaclass;

import java.util.Scanner;

public class ScanerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan input : ");
        String name = scanner.nextLine();
        System.out.println(name);
    }
}
