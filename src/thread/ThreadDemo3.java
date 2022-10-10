package thread;

public class ThreadDemo3 extends Thread {

	public static void main(String[] args) {
		
		
		ThreadDemo3 t1 = new ThreadDemo3();
		ThreadDemo3 t2 = new ThreadDemo3();
		ThreadDemo3 t3 = new ThreadDemo3();
		
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		
	}
	
	@Override
	public void run() {

		for(int i=0;i<=10;i++) {
			
			System.out.println(Thread.currentThread().getName()+ " ..is running "+i);
		}
	}
}
