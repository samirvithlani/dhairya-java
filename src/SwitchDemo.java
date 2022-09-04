import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		int no1 = 100, no2 = 200;
		System.out.println("entr your choic ");
		Scanner sc = new Scanner(System.in);
		;
		System.out.println("enter 1 for add");
		System.out.println("enter 2 for sub");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			int c = no1 + no2;
			System.out.println("sum = " + c);
			break;
		case 2:
			c = no1 - no2;
			System.out.println("sum = " + c);
			break;

		default:
			break;
		}
	}
}
