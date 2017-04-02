public class BankAccount

{
	//fields	
	double balance;
	
	
	//Constructors
	public BankAccount()
	{
		balance = 100;
	}
	
	public BankAccount(double b)
	{
		balance = b;
	}
	
	//Setters and Getters
	public void setBalance(double newBalance)
	{
		balance = newBalance;
	}
	
	public double getBalance()
	{
		return balance;
	}

	
	//Methods
	public void withdraw(double amount)
	{
		balance = balance - amount;
	}
	
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	
	public String toString()
	{
		return "The balance is " + balance;
	}
}