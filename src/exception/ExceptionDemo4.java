package exception;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		
		//compile time exception
		//class method exceptoin throw compile time
		
		try {
			FileWriter writer = new FileWriter("");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
