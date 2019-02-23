public class PointApplication {

    public static void main(String[] args) {
        Point point1 = new Point(1, 1);
//        Point point2 = new Point(10, 3);

        System.out.println(point1.getX());

        point1.move(5, 10);

        System.out.println(point1.getX());


//        Rectangle rectangle = new Rectangle(point1, point2);
//
//        int area = rectangle.calculateArea();
//
//        System.out.println(area);
    }
}
