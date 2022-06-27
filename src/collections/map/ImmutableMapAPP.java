package collections.map;

import java.util.Map;

public class ImmutableMapAPP {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("firstname", "lastname");
        map.put("middle", "wow");
    }
}
