package string;

/*
 * sb is a class that we can use for mutablity of string...
 * */
public class Stirngbuferdemo {

	public static void main(String[] args) {
		
		StringBuffer stringBuffer = new StringBuffer("java");
		stringBuffer.append("python");
		System.out.println(stringBuffer);
		stringBuffer.reverse();
		System.out.println(stringBuffer);
	}
}
