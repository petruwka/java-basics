package maps;

import list.Fruit;
import people.Person;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class MapsApplication {

    public static void main(String[] args) {
//        NavigableMap<Fruit, Person> participants = new TreeMap<>();
        Map<Fruit, Person> participants = new HashMap<>();
        participants.put(new Fruit("apple"), new Person("John", "Smith"));
        participants.put(new Fruit("apple"), new Person("Paul", "Smith"));
        participants.put(new Fruit("orange"), new Person("Mike", "Smith"));
        participants.put(new Fruit("ananas"), new Person("Jessica", "Frade"));
        participants.put(new Fruit("blueberry"), new Person("Kate", "Blake"));

        System.out.println(participants);

        Fruit blueberry = new Fruit("blueberry");

        Person person4 = participants.get(blueberry);
        System.out.println(person4);


    }
}
