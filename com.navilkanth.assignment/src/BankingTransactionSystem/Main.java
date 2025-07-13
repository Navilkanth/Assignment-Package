package BankingTransactionSystem;

public class Main {
    public static void main(String[] args) {
        // Track total accounts
        Bank bank = new Bank();
        Bank anotherBank = new Bank();
        System.out.println("Total accounts: " + Bank.getTotalAccounts());

        // Create accounts
        Account savings = new Savings("SA1001", 5000);
        Account checking = new Checking("CA2001", 3000);

        // Print details
        savings.printDetails();
        checking.printDetails();

        // Transactions
        transaction transaction = new transaction();
        transaction.performTransaction(savings, 1000, "deposit");  // Deposits ₹990 after fee
        transaction.performTransaction(checking, 500, "withdraw"); // Withdraws ₹510 with fee

        // Updated balances
        System.out.println("Savings Balance: ₹" + savings.getBalance());
        System.out.println("Checking Balance: ₹" + checking.getBalance());
    }
}