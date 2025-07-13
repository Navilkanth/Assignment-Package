package BankingTransactionSystem;

public class Savings extends Account {
    public Savings(String accountNumber, double initialDeposit) {
        super(accountNumber, initialDeposit);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
