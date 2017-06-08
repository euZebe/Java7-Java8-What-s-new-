package _03_try.with.resources;

import java.io.IOException;
import java.io.InputStream;

public class Files {

	public static void main(String[] args) {
		
		InputStream inputStream = null;
		try {	
			inputStream = Files.class.getResourceAsStream("bidule.txt");
			int content;
			while((content = inputStream.read()) != 1) {
				// conver to char and display it
				System.out.print((char) content);
			}
		} catch (IOException e) {
			// deal with the exception
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException closeException) {
				// deal with the exception
			}
		}
		
	}
}
