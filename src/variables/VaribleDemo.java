package variables;

//static and non static
//local variable and instance variable
//final variable
public class VaribleDemo {

	//instance variable intilizalizion is not compulsary..
	//non static
	//instance non static variable can not use inside static method..
	//instancr tatic variable can be used inside static as well as non static method..
	//non static variable can be used inside only non static method..
	//final satic instance variable must be inilized
	
	int x;
	static int y;
	final int p =100;
	static final int ab=150;
	
	
	
	void sum() {
		//local variable...
		//local variable can not declare as static
		//static int b; error
		//local variable must be intilized before use...
		//final variable can not re inlized...
		int a=15;
		
		System.out.println(a);
		//x = 150; error
		
	}
	
	//instance //class level varibale..
	public static void main(String[] args) {
	
		System.out.println(y);
		//System.out.println(x);
	}
}
