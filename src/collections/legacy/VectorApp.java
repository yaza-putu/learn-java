package collections.legacy;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        List<String> list = new Vector<>();
        list.add("main");
        list.add("won");

        for (var value : list) {
            System.out.println(value);
        }
    }
}
