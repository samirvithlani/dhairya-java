package overloading;

public class Amazone {

	public void search(float price) {
		System.out.println("search method with price param");
	}

	public void search(String name) {

		System.out.println("search method with name param");
	}

	public void search(int price, boolean avaialablty) {

		System.out.println("price with avaialablty ");
	}

	public void search(int qty) {

		System.out.println("search with qty");
	}

	public static void main(String[] args) {

		Amazone a = new Amazone();
		a.search(15);
		a.search("iphone14");
				
	}
}
