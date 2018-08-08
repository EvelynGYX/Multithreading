package BankSystem;

public class YourThread implements Runnable {
	Account account;
	
	public YourThread(Account a) {
		// TODO Auto-generated constructor stub
		account = a;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		account.withdraw();
	}

}
