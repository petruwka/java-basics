package list;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeApplication {

    public static void main(String[] args) {
        // Stack - LIFO - last-in first-out
        Deque deque = new ArrayDeque();

        deque.push(1);
        deque.push(2);
        deque.push(3);

        // 1,2,3

        System.out.println(deque);
        // 3,2,1

        System.out.println("pop: " + deque.pop());
        System.out.println(deque);
        System.out.println("pop: " + deque.pop());
        System.out.println("pop: " + deque.pop());


    }
}
