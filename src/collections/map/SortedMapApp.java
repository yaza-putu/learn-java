package collections.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {
        SortedMap<String, String> map = new TreeMap<>();
        map.put("name", "Eko");
        map.put("address", "denpasar");

        for (var key : map.keySet()) {
            System.out.println(key);
        }
    }
}
