package oops;

abstract class Macdg{
	
	//can create abstarct method in abstract class
	
	//absaract method body can not be created...
	public abstract void burger();
	
	public void frenchFries() {
		
		System.out.println("french fries....");
	}
	
}

public class Macd extends Macdg {

	@Override
	public void burger() {
		
		System.out.println("macd burger called...");
	
	}
	
	public static void main(String[] args) {
		
		
		//abstract class object can not be created...
		
		//polymorephic object
		//Macdg m = new Macdg(); error
		//parent class method and child class memory
		Macdg m = new Macd();
		m.burger();
		m.frenchFries();
		
	}
}
