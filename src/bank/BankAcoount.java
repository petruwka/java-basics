package bank;

public class BankAcoount {

    private double balance;

    public void deposit(double deposit) {
        balance += deposit;
    }

    public void withdraw(double value) {
//        balance = balance - value;
        balance -= value;
    }

    public double getBalance() {
        try {
            validateBalance();
            return balance;
        } catch (IllegalStateException e) {
            return 0;
        }
    }

    private void validateBalance()  {
        if (balance < 0) {
            throw new IllegalStateException("balance negative");
        }
    }

}
