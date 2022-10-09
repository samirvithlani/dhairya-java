package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		
		
		
		///int string
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("please enter age");
		int age = sc.nextInt();
		System.out.println(age);
		}catch (InputMismatchException e) {

			System.out.println("pls enter age in number only");
		}
		catch (Exception e) {
			
			System.out.println("excpetion");
		}
		
	}
}
