package Array;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {

		// 3 * 3 =9
		int a[][] = new int[3][3];

		System.out.println("please enter elements in array");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {

				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}
