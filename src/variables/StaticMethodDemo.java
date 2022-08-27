package variables;

import java.util.Scanner;

public class StaticMethodDemo {
	
	//class name must sttarts with cap
	//variable must statrs with small joining lr cap
	//method must statrs with small and oining ltr cap
	
	public static void sum() {
		
		System.out.println("static method wioutt type without args/param");
	}
	public static long add(long a,long b) {
		
		return a + b;
	}
	
	public static void main(String[] args) {
		
		//static method is advaisable to call with class name..
		StaticMethodDemo.sum();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of x");
		long x = sc.nextLong();
		System.out.println("enter value of y");
		long y= sc.nextLong();
		
		long ans = StaticMethodDemo.add(x, y);
		System.out.println(ans);
		//StaticMethodDemo s1 = new StaticMethodDemo();
		//s1.sum();
	}

}
