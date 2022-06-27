package collections.iterable;

import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("eko", "yasa", "nasution");

        for(var name : names) {
            System.out.println(name);
        }
    }
}
