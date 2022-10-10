package thread;

public class ThreadDemo1 extends Thread {

	// need to over ride
	@Override
	public void run() {

		// sleep
//		try {
//			System.out.println(Thread.currentThread().getName()+"  Thread is going  to sleep");
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		if (Thread.currentThread().getName().equals("A")) {

			// sleep method thrwoing check exception
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		for (int i = 1; i <= 10; i++) {
			// Thread.current --> name...
			System.out.println(Thread.currentThread().getName() + "..is running..." + i);
		}
	}

	public static void main(String[] args) {

		// thread creation
		ThreadDemo1 t1 = new ThreadDemo1();
		ThreadDemo1 t2 = new ThreadDemo1();

		// thread start..
		// it will call run method...
		t1.start();
		t2.start();
		// set name of threads..

		// set name of thread

		t1.setName("A");
		t2.setName("B");

	}
}
