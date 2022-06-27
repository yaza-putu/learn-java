package generic.comparatorinterface;

import generic.comparableinterface.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {
        Person person[] = {
                new Person("yasa", "pidpd"),
                new Person("budi", "karangasem"),
                new Person("okta", "abang"),
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(person, comparator);

        System.out.println(Arrays.toString(person));
    }
}
