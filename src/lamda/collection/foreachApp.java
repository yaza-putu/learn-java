package lamda.collection;

import java.util.List;
import java.util.function.Consumer;

public class foreachApp {
    public static void main(String[] args) {
        List<String> list = List.of("yasa", "putu", "purnama");
        list.forEach(value -> System.out.println(value));
    }
}
