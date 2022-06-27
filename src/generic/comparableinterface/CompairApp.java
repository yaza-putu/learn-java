package generic.comparableinterface;

import java.util.Arrays;

public class CompairApp {
    public static void main(String[] args) {
        Person person[] = {
            new Person("yasa", "pidpd"),
            new Person("budi", "karangasem"),
            new Person("okta", "abang"),
        };

        Arrays.sort(person);
        System.out.println(Arrays.toString(person));
    }
}
