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
        return balance;
    }
}
