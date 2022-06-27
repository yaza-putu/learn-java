package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("name", "eko");
        map.put("address", "dps");
        map.put("gender", "famale");

       Set<Map.Entry<String, String>> entris = map.entrySet();
       for (var entry : entris) {
           System.out.println(entry.getKey() + ":" + entry.getValue());
       }

    }
}
