package entities;

public class Account {
	private String holder; //person who owns the account
	private int accountNumber;
	private double balance;
	
	public Account(String holder, int accountNumber) {
		this.holder = holder;
		this.accountNumber = accountNumber;
	}
	
	public Account(String holder, int accountNumber, double balance) {
		this.holder = holder;
		this.accountNumber = accountNumber;
		this.balance = balance; //the amount of money owed (or due) on an account
	}
	
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getDeposit() {
		return balance;
	}
	public void setDeposit(double balance) {
		this.balance = balance;
	}
	
	
	public void deposit(double deposit) {
		this.balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		this.balance -= (withdraw + 5);
	}
	
	public String toString() {
		return "Account: "
				+ this.accountNumber
				+ ", Holder: "
				+ this.holder
				+ ", Balance: $"
				+ String.format("%.2f", balance);
	}
}
