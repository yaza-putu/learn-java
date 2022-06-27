package collections.map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapApp {

    public static enum level{
        FREE, STANDARD, PREMIUM, VIP
    }

    public static void main(String[] args) {
        Map<level, String> map = new EnumMap<level, String>(level.class);

        map.put(level.FREE, "Eko");
        map.put(level.STANDARD, "Kurniawan");

        for (var key: map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
