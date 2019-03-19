package generics;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StorageApplication {

    public static void main(String[] args) {
        Storage<String> storage1 = new Storage<String>(); // string storage
        Storage<Integer> storage2 = new Storage<>(); // integer storage

        addStorageValue(storage1, "Hello");
        addStorageValue(storage2, 45);
//        addStorageValue(storage2, "qwerty");

        System.out.println("storage1: " + storage1);
        System.out.println("storage2: " + storage2);

        String stringValue = storage1.getValue();

        System.out.println("obtained value: " + stringValue);
        Integer value2 = storage2.getValue();
        System.out.println("obtained value 2: " + value2);


        List<Number> numbers = new ArrayList<>();
        numbers.add((Integer) 6);
        numbers.add((Double) 6.5);

        Number number = numbers.get(1);
        System.out.println(number);

    }

    // raw type
    private static <T> void addStorageValue(Storage<T> storage, T value){
        storage.setValue(value);
//        storage.setValue("default");
    }




}
