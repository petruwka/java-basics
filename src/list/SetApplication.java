package list;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetApplication {


    public static void main(String[] args) {

        Set fruits = new HashSet();

        fruits.add(new Fruit("orange"));
        fruits.add(new Fruit("apple"));
        fruits.add(new Fruit("banana"));
        fruits.add(new Fruit("peach"));

        fruits.add(new Fruit("orange"));

        System.out.println(fruits.size());
        System.out.println(fruits);


        TreeSet treeSetFruits = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                System.out.println("comparator: " + o1 + " " + o2);
                Fruit f1 = (Fruit) o1;
                Fruit f2 = (Fruit) o2;
                return f1.fruit.substring(1,2).compareTo(f2.fruit.substring(1,2));
            }
        });

//        TreeSet treeSetFruits = new TreeSet(new FruitsComparator());

        treeSetFruits.add(new Fruit("orange"));
        treeSetFruits.add(new Fruit("apple"));
        treeSetFruits.add(new Fruit("banana"));

        System.out.println(treeSetFruits);






    }

}
