package oops;

interface Gov {

	// interface is fully abstacrt class
	// public abstract void tax
	// all variables in interfac are public final static

	// public final static int y=15;
	int x = 50;

	public void tax();
}

interface State {

	//public absract o=void grant
	public void grant();

}

public class Interfacedemo implements Gov,State {

	@Override
	public void tax() {

		System.out.println("tx called.,,");

	}

	public static void main(String[] args) {

		Gov g = new Interfacedemo();
		g.tax();
		System.out.println(Gov.x);
		State s = new Interfacedemo();
		s.grant();

	}

	@Override
	public void grant() {

		System.out.println("grant method called....");
		
	}

}
