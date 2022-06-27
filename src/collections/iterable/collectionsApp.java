package collections.iterable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class collectionsApp {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("putu yasa");
        names.addAll(List.of("junior", "programer"));


        for (var name : names) {
            System.out.println(name);
        }

        names.remove("putu yasa");
        names.removeAll(List.of("junior", "programer"));

    }
}
