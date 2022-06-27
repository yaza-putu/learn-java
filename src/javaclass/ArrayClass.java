package javaclass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] name = {0,3,4,1,3};
        Arrays.sort(name);

        System.out.println(Arrays.binarySearch(name, 4));

    }
}
