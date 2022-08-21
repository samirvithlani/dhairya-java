//in 1 java file we can create 1 public class but n no of non public you can create...
//Scanner class 
//Header filess -->
//packages... all java class belongs to any specific package
//Scanner class belongs java.util.Scanner package..

import java.util.Scanner;

public class ScannerDemo
{
	
	public static void main(String[]args){
	
		int a;
		//float f;
		//how to create object of scanner class
		Scanner sc = new Scanner(System.in);

		System.out.println("please enter value of a");
		a = sc.nextInt();

		System.out.println("please enter value of f");
		float f = sc.nextFloat();

		System.out.println("please enter value of d");
		double d = sc.nextDouble();

		System.out.println("value of a = "+a);
		System.out.println("value of f = "+f);
		System.out.println("value of d = "+d);
		

	}

}