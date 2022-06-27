package collections.iterable;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetApp {
    public static void main(String[] args) {
        // tidak berurut
//        Set<String> names = new HashSet<>();

        // berurut
        Set<String> names = new LinkedHashSet<>();
        names.add("Eko");
        names.add("Eko");
        names.add("kurniaawan");
        names.add("Kanedy");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
