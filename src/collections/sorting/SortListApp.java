package collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListApp {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("yasa");
        list.add("eko");
        list.add("purnama");

        Collections.sort(list);

        for (var value : list) {
            System.out.println(value);
        }
    }
}
