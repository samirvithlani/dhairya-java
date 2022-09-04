package string;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1 = "java"; //
		String str = new String("javaa");
		System.out.println(s1);
		System.out.println(str);
		
		int len = s1.length();
		System.out.println(len);
		
		//s1 = s1.toUpperCase();
		System.out.println(s1);
		
		//equals
		boolean res = s1.equals(str);
		System.out.println(res);
		
		//single char...
		
		char c = s1.charAt(0);
		System.out.println(c);
		
		for(int i=0;i<s1.length();i++) {
			
			System.out.println(s1.charAt(i));
		}
		
	}
}
