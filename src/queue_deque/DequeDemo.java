package queue_deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
        System.out.println(deque);

        System.out.println("delete last el: " + deque.removeLast());
        System.out.println(deque);
        System.out.println("=============================================");

        Deque<Integer> deque1 = new ArrayDeque<>();
        deque1.addFirst(1);
        deque1.addFirst(2);
        deque1.addFirst(3);
        deque1.addFirst(4);
        System.out.println(deque1);

        System.out.println("delete last el: " + deque1.removeLast());
        System.out.println(deque1);
        System.out.println("=============================================");

        Deque<String> stack = new LinkedList();
        stack.push("s1");
        stack.push("s2");
        stack.push("s3");
        System.out.println(stack);
        System.out.println("pop: " + stack.pop());
        System.out.println(stack);

    }
}
