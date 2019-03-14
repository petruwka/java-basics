package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListApplication {

    public static void main(String[] args) {
        List list = new LinkedList();

        System.out.println(list.size());

        list.add(1);
        list.add(3);
        list.add(5);
        // list.add(5);
        list.add(7);

        System.out.println(list.size());
        System.out.println(list);

        System.out.println("removing");
        System.out.println(list.remove(0));
        System.out.println(list.remove((Integer) 5));
        System.out.println(list.remove((Integer) 15));

        System.out.println(list);

    }

}
