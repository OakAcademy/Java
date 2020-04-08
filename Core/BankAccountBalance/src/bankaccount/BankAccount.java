package bankaccount;

public class BankAccount {
	
	private double balance;
	
	// Constructor
	public BankAccount () {
		balance = 0.0;
	}
	
	// deposit method
	public void deposit (double amount) {
		balance = balance + amount;
	}
	
	// withdraw method
	public void withdraw (double amount) throws InSufficientFundException {
		if (amount > balance) {
			throw new InSufficientFundException("Insufficient Balance. "
					+ "Withdraw process couldn't be completed.");
		}
		balance = balance - amount;
	}

	// getter method of balance
	public double getBalance() {
		return balance;
	}
	
}
