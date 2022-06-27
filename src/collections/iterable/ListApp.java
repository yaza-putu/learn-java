package collections.iterable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(10);
//        List<String> strings = new LinkedList<>();
        strings.add("nasi");
        strings.add("padang");
        strings.set(1, "Padag aja");
        strings.add("Papi");
        strings.remove(2);

        for (var name : strings) {
            System.out.println(name);
        }
    }
}
