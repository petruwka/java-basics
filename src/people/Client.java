package people;

public final class Client extends Person {

    static int count = 1000;

    public Client(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public int getDiscount() {
        if (age > 60) {
            return 15;
        } else if (age < 18) {
            return 10;
        }
        return 5;
    }

    @Override
    public void printFullName() {
        System.out.println("running from Client");
        System.out.println("Discount: " + this.getDiscount());
        super.printFullName();
    }
}
