package collections.iterable;

import oop.Person;
import oop.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class immutableSortedSet {

    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator());

        people.add(new Person("EKO", "Nasional"));
        people.add(new Person("Nasution", "Nuriha"));

        for (var o : people) {
            System.out.println(o.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
//        sortedSet.add(new Person("tika","a"));
    }
}
