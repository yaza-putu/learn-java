package collections.iterable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImutableList {
    public static void main(String[] args) {
        // method 1
        List<String> one = Collections.singletonList("satu");
        //metode 2
        List<String> two = Collections.emptyList();
        // metode 3
        List<String> list = new ArrayList<>();
        Collections.unmodifiableList(list);
        // metode 4
        List<String> element = List.of("Advice", "mostirea");
    }
}
