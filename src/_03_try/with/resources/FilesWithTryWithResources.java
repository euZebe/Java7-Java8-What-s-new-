package _03_try.with.resources;

import java.io.IOException;
import java.io.InputStream;

public class FilesWithTryWithResources {

	public static void main(String[] args) {

		try (InputStream inputStream = ClassLoader.getSystemResourceAsStream("/bidule.txt");) {
			int content;
			while ((content = inputStream.read()) != 1) {
				// conver to char and display it
				System.out.print((char) content);
			}
		} catch (IOException e) {
			// deal with the exception
		}
	}
}
