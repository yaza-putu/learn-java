package collections.spliterator;

import java.util.List;
import java.util.Spliterator;

public class SpliteratorApp {

    public static void main(String[] args) {
        List<String> list = List.of("Eko", "Kurniawan", "Khanedy", "Programer", "Zaman", "Now");

        Spliterator<String> stringSpliterator1 = list.spliterator();
        Spliterator<String> stringSpliterator2 = stringSpliterator1.trySplit();


        System.out.println(stringSpliterator1.estimateSize());
        System.out.println(stringSpliterator2.estimateSize());
    }
}
