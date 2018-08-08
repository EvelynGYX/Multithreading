package Simple_Threads;
public class ThreadEx1 {

	public ThreadEx1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadEx1 t = new MyThreadEx1();
		t.start();
		System.out.println("Main thread is running...");
	}

}
