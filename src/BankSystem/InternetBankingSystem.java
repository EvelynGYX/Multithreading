package BankSystem;

public class InternetBankingSystem {

	public InternetBankingSystem() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account accountObject = new Account();
		Thread t1 = new Thread(new MyThread(accountObject));
		Thread t2 = new Thread(new YourThread(accountObject));
		Thread t3 = new Thread(new HerThread(accountObject));
		t1.start();
		t2.start();
		t3.start();
	}

}
