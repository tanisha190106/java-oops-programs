import bank.*;

public class CurrentAccount implements Account {
    private double balance;

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("CurrentAccount: Deposited " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("CurrentAccount: Withdrawn " + amount);
        } else {
            System.out.println("CurrentAccount: Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}
