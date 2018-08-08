package BankSystem;

public class HerThread implements Runnable {
	Account account;
	
	public HerThread(Account a) {
		// TODO Auto-generated constructor stub
		account = a;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		account.enquire();
	}

}
