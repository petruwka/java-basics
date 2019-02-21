import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.ShapeInterface;

public class ShapeApplication {

    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(2, 4);
        printArea(circle);
        printArea(rectangle);

//        ShapeInterface.print();
    }

    static void printArea(ShapeInterface shape) {
        System.out.println(shape.calculateArea());;
    }

}
