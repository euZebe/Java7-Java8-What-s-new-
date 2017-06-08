package _04_java.io.file;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

public class MetadataWithJavaIOFile {
	
	public static void main(String[] args) {
		
		URL fileURL = ClassLoader.getSystemResource("bidule.txt");
		try {
			File file = new File(fileURL.toURI());
			
			// very few metadata is available
			System.out.println("is it a file ?\n\t=> "); // TODO
			System.out.println("is the file hidden ?\n\t=> "); // TODO
			
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
	}
}


























//System.out.println("is it a file ?\n\t=> " + file.isFile());
//System.out.println("is the file hidden ?\n\t=> " + file.isHidden());