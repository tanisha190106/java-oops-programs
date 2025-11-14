import bank.*;

public class TestBank{
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1000);
        sa.deposit(500);
        sa.withdraw(200);
        System.out.println("SavingsAccount Balance = " + sa.getBalance());

        System.out.println("---------------------------");

        CurrentAccount ca = new CurrentAccount(2000);
        ca.deposit(300);
        ca.withdraw(500);
        System.out.println("CurrentAccount Balance = " + ca.getBalance());
    }
}
