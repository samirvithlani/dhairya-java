package interface1;

//interface is class , but interface is fully abstract class..
//in interface all methods are by default abstarct
interface State {

	public void tax();

}

interface Country {

	public void grant();
}

public class City implements State, Country {

	public void tax() {
		System.out.println("city tax method called...");
	}

	@Override
	public void grant() {

		System.out.println("grant called..");
	}

	public static void main(String[] args) {

		// State s = new State();
		// polymorephic
		State s = new City();
		Country c = new City();
		s.tax();
		c.grant();
		

	}

}
