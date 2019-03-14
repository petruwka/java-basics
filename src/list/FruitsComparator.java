package list;

import java.util.Comparator;

public class FruitsComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        System.out.println("comparator: " + o1 + " " + o2);
        Fruit f1 = (Fruit) o1;
        Fruit f2 = (Fruit) o2;
        return f1.fruit.compareTo(f2.fruit);
    }
}
