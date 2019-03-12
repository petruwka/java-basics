package linkedlist;

public class LinkedList {

    private Node head;

    public void add(Object value) {
        Node node = new Node(value, null);
        // TODO: find the tail of the list
        if (head == null) {
            head = node;
            return;
        }

        Node tail = head;
        while (tail.getNext() != null) {
            tail = tail.getNext();
        }

        tail.setNext(node);
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(5);

        System.out.println(linkedList);

    }
}
