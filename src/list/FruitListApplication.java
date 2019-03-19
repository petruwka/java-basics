package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FruitListApplication {

    public static void main(String[] args) {

        List<Fruit> fruits = new LinkedList();

//        fruits.add(5);
        fruits.add(new Fruit("orange"));
        fruits.add(new Fruit("apple"));
        fruits.add(new Fruit("banana"));
        fruits.add(new Fruit("peach"));

        System.out.println(fruits);

        System.out.println("contains apple: " + containsApple(fruits));
        System.out.println("first fruit: " + getFirst(fruits));

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        System.out.println("First integer: " + getFirst(integers));
    }

    private static boolean containsApple(List fruits) {
        return fruits.contains(new Fruit("apple"));
    }

    private static Fruit getFirst(List fruits) {
        Fruit fruit = (Fruit) fruits.get(0);
        return fruit;
    }

}
