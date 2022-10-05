
public class ThisDemo {

	// instance variable...
	//instance variable..
	int a = 100;
	
	void demo() {
		int a = 200;
		System.out.println(this.a);	
		
	}
	public static void main(String[] args) {

		ThisDemo t = new ThisDemo();
		t.demo();
	
	}
}
