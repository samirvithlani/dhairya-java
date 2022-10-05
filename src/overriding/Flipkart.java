package overriding;

class DTDC {

	public void courier() {
		System.out.println("DTDC COURIER METHOD CALLED...");
	}
}

public class Flipkart extends DTDC {

	public void courier() {

		// parent class
		super.courier();
		// System.out.println("Flipkart courier method called..");
	}

	public static void main(String[] args) {

		// polymorephic object...

		// Flipkart f = new Flipkart();
		DTDC f = new Flipkart();
		f.courier();
	}
}
