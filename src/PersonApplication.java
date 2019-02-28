import people.AbstractPerson;
import people.Client;
import people.Person;

public class PersonApplication {

    public static void main(String[] args) {
//        Person peter = new Person("Peter", "Black");

        AbstractPerson abstractPerson1 = new Person("Paul", "Smith");
        abstractPerson1.printName();

        Person p1 = new Client("Stefan", "Burns", 32);
        Person p2 = new Employee("employee", "surname");

        p2.printFullName("Hi!");


        printFullName(p1);
        printFullName(p2);
//        Client c1 = (Client) p2; // ClassCastException
//        printFullName(c1);

//        Person john = new Person("John", "Smith", 25);
//        printFullName(john);
//
        Client client1 = new Client("Steven", "Grey", 28);
        Person person1 = client1;

        printFullName((Person) client1);

        System.out.println(Person.getCountOfPErsons());

    }

    private static void printFullName(Person p) {
        // if p is a client
        if (p instanceof Client) {
            System.out.println("Hello Client");
        }

        System.out.println("printing person information");
        p.printFullName();
    }
}
