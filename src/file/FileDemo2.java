package file;

import java.io.FileReader;

public class FileDemo2 {

	public static void main(String[] args) {
		
		try {
			
			FileReader reader = new FileReader("demo.txt");
			int c;
			while((c =reader.read())!=-1) {
				
				System.out.print((char)c);
			}
			reader.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
