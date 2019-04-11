package java8;

import java8.PersonService.SurnameCondition;
import people.AbstractPerson;
import people.Client;
import people.Person;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Java8Application {

    public static void main(String[] args) {
        PersonService personService = new PersonService();

        SurnameCondition qwe = personService.new SurnameCondition("asd");
        System.out.println("Inner method call:" + qwe.getOuterPersons());

        PersonService.AdultCondition staticInnerInstance = new PersonService.AdultCondition();

        Person p1 = new Person("Paul", "Smith", 15);
        Person p2 = new Person("Stefan", "Burns", 32);
        Person p4 = new Person("John", "Burns", 15);
        Person p3 = new Person("Adriana", "White", 23);

        personService.addPerson(p1);
        personService.addPerson(p2);
        personService.addPerson(p3);
        personService.addPerson(p4);
        personService.addPerson(p4);
        personService.addPerson(p4);

        System.out.println("### streams");
        Optional<Person> firstJohnByStreams = personService.getFirstJohnByStreams();
        firstJohnByStreams.ifPresent(System.out::println);

        System.out.println("### streams end");

        System.out.println(personService.getAdults());
        System.out.println(personService.getPersonsBySurname("Burns"));
        System.out.println(personService.getPersonsByName("John"));

        Predicate<Person> isPersonAdult = Person::isPersonAdult;
        Predicate<Person> isNotAdult = isPersonAdult.negate();
        Function<Person, String> getLastName = AbstractPerson::getLastName;

        personService.getFirstJohn()
                .filter(isNotAdult)
                .map(getLastName.andThen(s -> "John's lastname " + s))
                .ifPresent(lastname -> System.out.println("Adult John's lastname is:" + lastname));

//        Optional;
//        OptionalDouble;
//        OptionalLong;
//        OptionalInt;

        int i = 0;
        OptionalInt optionalInt = OptionalInt.of(i);



//        Person firstJohn = personService.getFirstJohn();
//        if (firstJohn != null) {
//            String lastName = firstJohn.getLastName();
//            System.out.println(lastName);
//        } else {
//            System.out.println("we do not have John");
//        }

    }
}
