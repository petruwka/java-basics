package shape;

import java.io.Serializable;

public class Circle extends Shape implements ShapeInterface, Serializable, Cloneable {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double calculateArea() {
        return pi * radius * radius;
    }
}
