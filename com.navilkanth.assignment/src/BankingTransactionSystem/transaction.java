package BankingTransactionSystem;

public class transaction {
	
	    private final double transactionFee = 10.0;

	    public final void performTransaction(Account account, double amount, String type) {
	        if (type.equalsIgnoreCase("deposit")) {
	            account.deposit(amount - transactionFee);
	        } else if (type.equalsIgnoreCase("withdraw")) {
	            account.withdraw(amount + transactionFee);
	        } else {
	            System.out.println("Invalid transaction type.");
	        }

	        System.out.println("Transaction complete. Fee charged: ₹" + transactionFee);
	    }

	    public double getTransactionFee() {
	        return transactionFee;
	    }
	}

