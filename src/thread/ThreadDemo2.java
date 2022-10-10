package thread;

public class ThreadDemo2 implements Runnable {

	public static void main(String[] args) {

		
		//it is not thread..
		ThreadDemo2 t = new ThreadDemo2();
		
		Thread t1 = new Thread(t,"A");
		Thread t2 = new Thread(t, "B");
		
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		
		
		System.out.println(Thread.currentThread().getName() + " .. is running...");
		
	}
}
