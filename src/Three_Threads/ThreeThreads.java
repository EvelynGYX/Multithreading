package Three_Threads;

public class ThreeThreads {

	public ThreeThreads() {
		// TODO Auto-generated constructor stub
	}
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A().start();
		new B().start();
		new C().start();
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A threadA = new A();
		B threadB = new B();
		C threadC = new C();
		threadC.setPriority(Thread.MAX_PRIORITY);
		threadB.setPriority(Thread.MIN_PRIORITY + 1);
		threadA.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Started Thread A");
		threadA.start();
		System.out.println("Started Thread B");
		threadB.start();
		System.out.println("Started Thread C");
		threadC.start();
		System.out.println("End of main thread");
	}
}
