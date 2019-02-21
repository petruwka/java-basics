import people.Person;

public class Employee extends Person {
    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void printAge() {
        System.out.println("Age: " + age);
    }
}
