package lamda.utilFunction;

import java.util.function.Consumer;

public class ConsumerApp {
// untuk interface lamda banyak ada di java.util.function
    public static void main(String[] args) {
        Consumer<String> consumer = value -> System.out.println(value);

        consumer.accept("yasa");
    }
}
