package collections.iterable;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("EKO");

        Set<String> mutable = new HashSet<>();
        mutable.add("Eko");
        mutable.add("kurniawan");

        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("EKo", "Kurniawan");
    }
}
