package variables;

public class MethodDemo {

	// 2 type of methods are there..
	// pre define method user define method....
	// non static and static method..
	// with return type with arg
	// with return type without arg
	// without return type without arg
	// with return type with arg

	public void sum() {

		System.out.println("non static without return type with args");
	}

	public int add(int a, int b) {

		System.out.println("non static method with return type with args...");

		// return a + b;
		int c = a + b;
		// return 100;
		return c;
	}

	public float div() {

		return 100 / 10.25f;
	}

	public static void main(String[] args) {

		// need to create an object of class...
		// m1 is an object..
		MethodDemo m1 = new MethodDemo();
		m1.sum();

		int x = m1.add(150, 250);
		System.out.println("ans = " + x);
		
		float f = m1.div();
		System.out.println(f);

	}
}
