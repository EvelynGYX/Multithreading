package Three_Threads;

public class C extends Thread{

	public C() {
		// TODO Cuto-generated constructor stub
	}

	public void run() {
		System.out.println("Thread C started");
		for(int i=1; i<=5; i++) {
			System.out.println("\t From ThreadC: i = " + i);
		}
		System.out.println("Exit from C");
	}
}