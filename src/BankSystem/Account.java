package BankSystem;

public class Account {	//the monitor

	int balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public synchronized void deposit() {
		//balance += deposit_amount;
		System.out.println("This is deposit");
	}
	
	public synchronized void withdraw() {
		//balance -= withdraw_amount;
		System.out.println("This is withdraw");
	}
	
	public synchronized void enquire() {
		System.out.println("This is balance: " + balance);
	}
}
