package thread;

class Print {

	public synchronized void printTable(int no) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(no + " * " + i + " =" + no * i);
		}
	}

}

class Thread1 extends Thread {

	Print p;

	public Thread1(Print p) {
		this.p = p;
	}

	@Override
	public void run() {

		p.printTable(100);
	}

}

class Thread2 extends Thread {

	Print p;

	public Thread2(Print p) {

		this.p = p;
	}

	public void run() {

		p.printTable(50);
	}
}

public class ThreadDemo5 {

	public static void main(String[] args) {

		Print p = new Print();

		Thread1 t1 = new Thread1(p);
		Thread2 t2 = new Thread2(p);

		t1.start();
		t2.start();

	}
}
