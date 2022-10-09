package exception;

import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("please enter no1 ");
			int no1 = sc.nextInt();
			System.out.println("please enter no2 ");
			int no2 = sc.nextInt();
			int c = no1 / no2;
			System.out.println(c);
		}

		catch (ArithmeticException e) {

			System.out.println("Can not divide by zero");
		}
		finally {
		
			System.out.println("finally");
		}

	}
}
