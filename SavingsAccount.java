import bank.*;

public class SavingsAccount implements Account {
    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("SavingsAccount: Deposited " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("SavingsAccount: Withdrawn " + amount);
        } else {
            System.out.println("SavingsAccount: Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}
