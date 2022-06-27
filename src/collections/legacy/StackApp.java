package collections.legacy;

import java.util.Stack;

public class StackApp {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("yasa");
        stack.push("putu");
        stack.push("wayan");

        for (var value = stack.pop(); value != null; value = stack.pop()) {
            System.out.println(value);
        }
    }
}
