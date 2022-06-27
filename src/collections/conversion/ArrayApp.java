package collections.conversion;

import java.util.Arrays;
import java.util.List;

public class ArrayApp {
    public static void main(String[] args) {
        List<String> names = List.of("Eko", "Kanedy", "wow");
        Object[] objects = names.toArray();
        String[] string = names.toArray(new String[]{});

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(string));
    }
}
