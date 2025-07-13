package BankingTransactionSystem;

public class Checking extends Account {
    private double overdraftLimit = 1000;

    public Checking(String accountNumber, double initialDeposit) {
        super(accountNumber, initialDeposit);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Exceeds overdraft limit.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
