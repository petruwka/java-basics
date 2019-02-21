package bank;

public class User {

    private BankAcoount[] bankAccounts;
    private int accountLength = 0;
    private String name;

    public User(int numberOfAccounts) {
        this.bankAccounts = new BankAcoount[numberOfAccounts];
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBankAccount(BankAcoount bankAccount) {
        if (accountLength == 5) {
            return;
        }
        bankAccounts[accountLength] = bankAccount;
        accountLength++;
    }

    public void printUserInfo() {
        System.out.println("Name: " + this.name);
        for (int i = 0; i < accountLength; i++) {
            BankAcoount a = bankAccounts[i];
            System.out.println("account: " + a.getBalance());
        }
    }
}
