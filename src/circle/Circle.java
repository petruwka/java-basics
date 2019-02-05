package circle;
//Define a class Circle, define fields and methods which you think should be in this class.
// Create another class CircleApplication with main method,
// and use class Circle to calculate length of a circle.

//L=2PI*r

public class Circle {
    private double radius;

    public Circle(double r) { //constructor
        radius = r;
    }

    public double calculateLength() {
        double pi = 3.14159;
        circleLenght = 2 * pi * radius;
        return circleLenght;
    }
}
