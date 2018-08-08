package Three_Threads;

public class A extends Thread{

	public A() {
		// TODO Auto-generated constructor stub
	}

	public void run() {
		System.out.println("Thread A started");
		for(int i=1; i<=5; i++) {
			System.out.println("\t From ThreadA: i = " + i);
		}
		System.out.println("Exit from A");
	}
}
