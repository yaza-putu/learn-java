package collections.legacy;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();

        map.put("name", "yasa");
        map.put("address", "denpasar");

        for (var key : map.keySet()) {
            System.out.println(key);
        }
    }
}
