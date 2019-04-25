package java8;

import people.Person;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonService {
    private List<Person> persons = new LinkedList<>();
    private static String VAR = "hello";

    public Optional<Person> getFirstJohn() {

        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(0);
            //
        }

        for (Person p : persons) {
            if ("John".equals(p.getFirstName())) {
                return Optional.of(p);
            }
        }


        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person next = iterator.next();
            //
        }


        return Optional.empty();
    }

    public Optional<Person> getFirstJohnByStreams() {
        Stream<String> stream = persons.stream()
//                .peek(p -> System.out.println("peek:" + p))
//                .filter(Person::isPersonAdult)
//                .findFirst();
                .map(p -> p.getFirstName());

//        stream.forEach(System.out::println);
//        stream.findFirst();

        Map<String, Long> collected = persons
                .stream()
                .collect(Collectors.groupingBy(Person::getFirstName, Collectors.counting()));


        System.out.println("Collected stream grouping: " + collected);

        // 1st category: intermediate operations
        // map, filter, flatMap, peek, ....

        // 2nd category: terminal operations
        // count, forEach, collect, ...


        return persons.stream()
                .filter(p -> "John".equals(p.getFirstName()))
                .findFirst();

//        persons.stream().forEach(person -> System.out.println(person));

//        stream.forEach(new Consumer<Person>() {
//            @Override
//            public void accept(Person person) {
//                System.out.println(person);
//            }
//        });

//        return Optional.empty();
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public List<Person> getAdults() {
        return getByCondition(Person::isPersonAdult);

//        List<Person> adults = new ArrayList<>();
//        for (Person p : persons) {
//            if (p.getAge() >= 18) {
//                adults.add(p);
//            }
//        }
//        return adults;
    }

    private boolean isAdult(Person p) {
        return p.getAge() >= 18;
    }


    public List<Person> getPersonsBySurname(String surname) {
        Condition surnameCondition = p -> Objects.equals(p.getFirstName(), surname);
        return getByCondition(surnameCondition);

//        List<Person> result = new ArrayList<>();
//        for (Person p : persons) {
//            if (Objects.equals(p.getLastName(), surname)) {
//                result.add(p);
//            }
//        }
//        return result;
    }


    public List<Person> getPersonsByName(String name) {
        Condition nameCondition = p -> Objects.equals(p.getFirstName(), name);


//        Condition nameCondition = new Condition() {
//            @Override
//            public boolean test(Person p) {
//                return Objects.equals(p.getFirstName(), name);
//            }
//        };
        SurnameCondition s = new SurnameCondition(name);
        return getByCondition(nameCondition);
    }

    private List<Person> getByCondition(Condition condition) {
        List<Person> result = new ArrayList<>();
        for (Person p : persons) {
            if (condition.test(p)) {
                result.add(p);
            }
        }
        return result;
    }


    @FunctionalInterface
    public interface Condition {
        boolean test(Person p);
    }

    public static class AdultCondition implements Condition {
        @Override
        public boolean test(Person p) {
            return p.getAge() >= 18;
        }

        public String getOuterPrivate() {
            return VAR;
        }

    }

    public class SurnameCondition implements Condition {
        private String surname;

        public SurnameCondition(String surname) {
            this.surname = surname;
        }

        @Override
        public boolean test(Person p) {
            return Objects.equals(p.getLastName(), surname);
        }

        public List<Person> getOuterPersons() {
            return persons;
        }

    }


}
