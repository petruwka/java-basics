package java8;

import people.AbstractPerson;
import people.Client;
import people.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class Java8Application {

    public static void main(String[] args) {
        PersonService personService = new PersonService();

        Person p1 = new Person("Paul", "Smith", 15);
        Person p2 = new Person("Stefan", "Burns", 32);
        Person p4 = new Person("John_", "Burns", 45);
        Person p3 = new Person("Adriana", "White", 23);

        personService.addPerson(p1);
        personService.addPerson(p2);
        personService.addPerson(p3);
        personService.addPerson(p4);

        System.out.println(personService.getAdults());
        System.out.println(personService.getPersonsBySurname("Burns"));
        System.out.println(personService.getPersonsByName("John"));

        personService.getFirstJohn()
                .filter(Person::isPersonAdult)
                .map(AbstractPerson::getLastName)
                .ifPresent(lastname -> System.out.println("Adult John's lastname is:" + lastname));


//        Person firstJohn = personService.getFirstJohn();
//        if (firstJohn != null) {
//            String lastName = firstJohn.getLastName();
//            System.out.println(lastName);
//        } else {
//            System.out.println("we do not have John");
//        }

    }
}
