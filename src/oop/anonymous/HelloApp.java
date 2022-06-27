package oop.anonymous;

public class HelloApp {
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld() {
            @Override
            public void say() {
                // is anonimouse class
            }
        };
    }
}
