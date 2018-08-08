package Simple_Threads;
public class ThreadEx2 {

	public ThreadEx2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new MyThreadEx2());
		t.start();
		System.out.println("Main thread is running...");
	}

}
