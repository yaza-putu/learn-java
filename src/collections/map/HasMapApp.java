package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HasMapApp {
    public static void main(String[] args) {
        // has map menggunakan pembeda key dengan equals
        Map<String, String> map = new HashMap<>();
        map.put("first", "Putu");
        map.put("second", "yasa");

        System.out.println(map.get("first"));
    }
}
