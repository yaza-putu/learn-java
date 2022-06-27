package collections.map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHasMapApp {
    public static void main(String[] args) {
        // identity has map untuk membedakan key nya mengunakna ==

        Map<String, String> map = new IdentityHashMap<>();

        String key1 = "name.first";
        String name = "name";
        String dot = ".";
        String first = "first";

        String key2 = name + dot + first;

        map.put(key1, "eko");
        map.put(key2, "eko");

        System.out.println(map.size());

    }
}
