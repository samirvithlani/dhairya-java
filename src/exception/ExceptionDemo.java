package exception;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			
		System.out.println("enter no 1");
		int no1 = sc.nextInt();
		System.out.println("enter no 2");
		int no2 = sc.nextInt();

		int c = no1 / no2;
		System.out.println(c);
		
		}catch (ArithmeticException e) {
			
			System.out.println("can not divide by zero..");
		}
	

	}
}
