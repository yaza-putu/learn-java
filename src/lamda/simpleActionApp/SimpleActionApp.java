package lamda.simpleActionApp;

import lamda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action(String name) {
                return name;
            }
        };

        // lambda expression
        SimpleAction simpleAction2 = (String name) -> {
            return name;
        };

        SimpleAction simpleAction3 = (String value) -> "Hello" + value;
        SimpleAction simpleAction4 = (value) -> "Hello" + value;
        SimpleAction simpleAction5 = value -> "Hello" + value;


        System.out.println(simpleAction1.action("yasa"));
        System.out.println(simpleAction2.action("yasa"));
    }
}
