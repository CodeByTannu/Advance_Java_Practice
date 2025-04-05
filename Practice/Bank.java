package Practice;

public class Bank
{
	private double amount;     // instance variable to store the amount

	public Bank()
	{          // Parameterized constructor to initialize amount with 10000
		this.amount = 10000;
	}

	public void withdraw(double withdrawalAmount)
	{                        // Method to withdraw money from the account
		String message = withdrawalAmount <= amount ? "Withdraw successful" : "Insufficient funds"; // Check if
																									// withdrawal amount
																									// is less than or
																									// equal to current
																									// amount
		System.out.println(message);

		if (withdrawalAmount <= amount)
		{                         // Update amount only if withdrawal is successful
			amount -= withdrawalAmount;
		}
	}

	public void deposit(double depositAmount)
	{                             // Method to deposit money into the account
		amount += depositAmount;
	}

	public void displayBalance()
	{                                // Method to display total balance
		System.out.println("Total balance: " + amount);
	}

	public static void main(String[] args)
	{

		Bank mb = new Bank();                  // Create an instance of Bank
		mb.withdraw(2000);                     // Withdraw 2000 from the account
		mb.deposit(5000);                      // Deposit 5000 into the account
		mb.displayBalance();                   // Display total balance
	}
}
