package list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApplication {

    public static void main(String[] args) {
        // FIFO - first-in-first-out

        // offer -> adds elemwents to the tail
        // poll -> gets and removes from the head
        // peek -> gets from head

        // add -> adds elemwents to the tail or throw exception
        // remove -> gets and removes from the head or throw exception
        // element -> gets from head or throw exception

        Queue queue = new LinkedList();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println(queue);

        System.out.println("remove: " + queue.remove());
        System.out.println("remove: " + queue.remove());
        System.out.println("element: " + queue.element());
        System.out.println("remove: " + queue.remove());
        System.out.println("element: " + queue.element());
        System.out.println(queue);


    }
}
