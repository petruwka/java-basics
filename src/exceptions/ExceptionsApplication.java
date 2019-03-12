package exceptions;

public class ExceptionsApplication {

    public static void main(String[] args) {

        int a = 0;
        System.out.println(doubleNumber(6));
//        System.out.println(doubleNumber(0));
        try {
            a = doubleNumber(a);
        } catch (ArithmeticException | NullPointerException arithmeticException) {
            a = 10;
        } finally {

        }

        // work a = 10;



    }


    public static int doubleNumber(int a) throws ArithmeticException, NullPointerException {
        if (a == 0) {
            throw new NullPointerException("a is zero");
        }
        if (a < 0) {
            throw new ArithmeticException("a is negative");
        }

        return 2 * a;
    }

}
