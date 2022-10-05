package file;

import java.io.FileWriter;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) {
	
		try {
		FileWriter fw = new FileWriter("demo.txt");
		fw.write("Hello this is my firsty file...");
		fw.close();
		
		}catch (IOException e) {
			// TODO: handle exception
		}
	
		
	}
}
