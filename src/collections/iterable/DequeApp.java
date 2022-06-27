package collections.iterable;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        deque.offerFirst("Kurniawan");
        deque.offerFirst("Eko");
        deque.offerFirst("Kanedy");

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());

        // stack
        Deque<String> stack = new LinkedList<>();

        stack.offerLast("Kurniawan");
        stack.offerLast("Eko");
        stack.offerLast("Kanedy");

        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());
    }
}
