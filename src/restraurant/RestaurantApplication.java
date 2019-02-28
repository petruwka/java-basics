package restraurant;

import people.*;
import people.student.Student;

import java.util.Objects;

import static java.util.Objects.isNull;

public class RestaurantApplication {

    public static void main(String[] args) {
        Student s = new Student();
        Restaurant restaurant = new Restaurant();

        Order order1 = new Order("Ice cream", 2);
        Order order2 = new Order("tiramisu", 2);
        order2.setDish("Ice cream");

        //

        Table table1 = new Table(new Order[] {order1, order2});
        restaurant.addTableOrder(table1, 2);
        restaurant.printTables();

//        Class aClass = table1.getClass();
//        System.out.println(aClass);

        // equals
        // hashcode
        // toString

        boolean b = order1 == order2;
        System.out.println("equal by == " + b);


        if (Objects.equals(order1, order2)) {
            System.out.println("orders are equal");
        } else {
            System.out.println("different orders");
        }

        System.out.println("Order 1: " + order1);

        Person p1 = new Person("Joe", "D");
        Person p2 = new Client("Client", "G", 32);

        if (p2 instanceof Client) {
            System.out.println("p2 is client");
        } else {
            System.out.println("p2 is not client");
        }


    }
}
