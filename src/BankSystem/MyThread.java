package BankSystem;

public class MyThread implements Runnable{

	Account account;
	
	public MyThread(Account a) {
		// TODO Auto-generated constructor stub
		account = a;
	}

	public void run() {
		account.deposit();
	}
}
