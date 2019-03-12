package bank;

public class BankApplication {
    public static void main(String[] args) {

        try {
            User user = new User(5);
            user.setName("Paul");

            BankAcoount bankAcoount = new BankAcoount();
            bankAcoount.deposit(150);

            BankAcoount bankAcoount2 = new BankAcoount();
            bankAcoount2.deposit(100);

            user.addBankAccount(bankAcoount);
            user.addBankAccount(bankAcoount2);

            user.printUserInfo();

            transfer(bankAcoount, bankAcoount2, 75);

            user.printUserInfo();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void transfer(BankAcoount from, BankAcoount to, double value) {
        from.withdraw(value);
        to.deposit(value);
    }
}
