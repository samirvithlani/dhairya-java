package Array;

import java.util.Scanner;

public class ArrayDemo1 {

	// array is a group of similar kind of data
	// 1d 2d,md
	public static void main(String[] args) {

		
		int a[] = new int[10];
		int b[] = {12,22,56};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 5 elements of an array");
		for(int i=0;i<5;i++) {
			
			a[i] = sc.nextInt();
		}
		
		System.out.println("ELEMENTS IN ARRAY ");
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("Value of b");
		for(int i=0;i<3;i++) {
			
			System.out.println(b[i]);
		}
	}
}
