package wrapperclass;
/*
 * boxing  --> wrap
 * unboxing  -> wrpped original
 * autoboxing -->automatic casting to primitive to wrapper type
 *int     Integer
 *float   Float
 *double  Double
 *long
 * */
public class WrapperDemo1 {

	
	public static void main(String[] args) {
		
		//primitive data wrapper class
		int a =100;
		Integer i = Integer.valueOf(a); //boxing...
		System.out.println(i);
		//autoboxing
		Integer j = a;  // autoboxing...
		System.out.println(j);
		
		//unboxing...
		Integer x = new Integer(100);
		int x1 = x.intValue(); //unboxing...
		System.out.println(x1);
		
	}
	
}
