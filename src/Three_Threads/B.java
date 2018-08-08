package Three_Threads;

public class B extends Thread{

	public B() {
		// TODO Buto-generated constructor stub
	}

	public void run() {
		System.out.println("Thread B started");
		for(int i=1; i<=5; i++) {
			System.out.println("\t From ThreadB: i = " + i);
		}
		System.out.println("Exit from B");
	}
}