package collections.iterable;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Eko", "Kurniawan", "Khannedy", "Programer"));

//        names = names.descendingSet();
        names = names.headSet("Kurniawan", true);

        for(var name : names) {
            System.out.println(name);
        }
    }
}
