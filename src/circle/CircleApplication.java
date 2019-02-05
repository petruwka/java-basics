package circle;

import java.util.Scanner;

public class CircleApplication {
    public static void main(String[] args) {

        System.out.println("Please type circle radius");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        if (radius < 0) {
            System.out.println("Please provide positive value");
        } else {
            Circle circle = new Circle(radius);
            circle.calculateLength(radius);
            System.out.println("Circle lenght = " + circle.calculateLength(radius));
        }

    }
}
