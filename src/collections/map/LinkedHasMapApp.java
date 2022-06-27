package collections.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHasMapApp {

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("first", "eko");
        map.put("last", "khanedy");
        map.put("middle", "kurniawan");

        Set<String> keys = map.keySet();

        for (var key : keys) {
            System.out.println(key);
        }
    }
}
