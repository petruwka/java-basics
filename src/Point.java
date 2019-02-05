public class Point {
    private int x;
    private int y;


    public Point() {
    }

    public Point(int xCoordinate, int yCoordinate) {
        x = xCoordinate;
        y = yCoordinate;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int newX, int newY) {
        if (newX < 0) {
            System.out.println("x is negative");
            return;
        }

        x = newX;
        y = newY;
    }
}
