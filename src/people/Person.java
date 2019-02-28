package people;

import java.util.Objects;

// final for classes - prevent this class to be inherited by other class
public class Person extends AbstractPerson {
    // public
    // protected
    // default (absence of access modifier)
    // private

    private final String firstName;
    protected int age;
    private Address address;

    static private int count = 0;


    static final int ANOTHER_COUNTER = 0;

    public static int getCountOfPErsons() {
        return count;
    }

    public Person(String firstName, String lastName) {
        super(lastName);
        count++;
        this.firstName = firstName;
    }

    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName);
        this.age = age;
    }

    @Override
    public void printName() {
        System.out.println(firstName);
    }

    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public void printFullName(String greeting) {
        System.out.print(greeting + " ");
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return firstName != null ? firstName.equals(person.firstName) : person.firstName == null;
    }

    //
//    @Override
//    public boolean equals(Object obj) {
//        // 1. reflective: x.equals(x)
//        // 2. transitive: x,y,z; if x.equals(y) and y.equals(z) => x.equals(z)
//        // 3. symmetric: if x.equals(y) then y.equals(x)
//        // 4. consistent
//        // 5. null-safe
//
//        if (this == obj) {
//            return true;
//        }
//
//        if (obj == null) {
//            return false;
//        }
//
//        Class thisCLass = getClass();
//        Class thatClass = obj.getClass();
//
//        if (!thisCLass.equals(thatClass)) {
//            return false;
//        }
////        if (!(obj instanceof Person)) {
////            return false;
////        }
//        Person thatPerson = (Person) obj;
//        if (thatPerson.firstName.equals(this.firstName)
//                && thatPerson.lastName.equals(this.lastName)
//                && thatPerson.age == this.age) {
//            return true;
//        }
//        return false;
//    }
}
